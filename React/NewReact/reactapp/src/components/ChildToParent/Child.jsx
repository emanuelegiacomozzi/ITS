//import React from 'react';

function Child({onMessage}){
    const sendMessageToParent = () => {
        onMessage('Ciao dal componente child!');
    };

    return (
        <div>
            <button onClick={sendMessageToParent}>Invia il messaggio al Parent</button>
        </div>
    );
};
export default Child;