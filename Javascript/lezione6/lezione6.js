//fetch()  è una funzione del browser che torna una promise
//Codice produttore

//http .... protocollo
//request / response .... utenti
let getPosts = async () => {
    try {
        let response = await fetch('https://jsonplaceholder.typicode.com/posts');
        let data = await response.json();
        let posts = document.getElementById("post");

        // Genero i post con un bottone per ogni post
        posts.innerHTML = data.slice(0, 10) // Mostro solo i primi 10 post
            .map(post => `
                <div id="post-${post.id}">
                    <p><strong>${post.title}:</strong></p>
                    <p>${post.body}</p>
                    <button class="comment-button" data-post-id="${post.id}">
                        <span class="text">Mostra Commenti</span>
                    </button>
                    <div class="comments-container"></div> <!-- Contenitore per i commenti -->
                    <p>------------------------------------</p>
                </div>
                <br>
            `)
            .join("");

        // Aggiungo un event listener a ogni bottone generato
        document.querySelectorAll(".comment-button").forEach(button => {
            button.addEventListener("click", async function () {
                let postId = this.getAttribute("data-post-id"); // Ottengo l'ID del post dal bottone
                await getComments(postId); // Passo l'ID del post alla funzione getComments
            });
        });

    } catch (error) {
        console.log(error);
    }
};

let getComments = async (postId) => {
    try {
        let response = await fetch(`https://jsonplaceholder.typicode.com/comments?postId=${postId}`);
        let data = await response.json();

        // Seleziono il contenitore dei commenti relativo al post
        let commentsContainer = document.querySelector(`#post-${postId} .comments-container`);

        // Converto i commenti in una lista HTML
        commentsContainer.innerHTML = data // Mostro i commenti relativi al post
            .map(comment => `
                <div class="notification">
                <div class="notiglow"></div>
                <div class="notiborderglow"></div>
                    <p class="notititle"><strong>${comment.name}:</strong></p>
                    <p class="notibody">${comment.body}</p>
                    <br>
                </div>
            `)
            .join("");

    } catch (error) {
        console.log(error);
    }
};

getPosts();

