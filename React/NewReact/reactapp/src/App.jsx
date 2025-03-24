//import { useState } from 'react'
//import reactLogo from './assets/react.svg'
//import viteLogo from '/vite.svg'
import './App.css'
import './components/Card'
//import Card from './components/Card'
import TodoList from './components/Stato/Todolist'
import UserProfile from './components/Stato/UserProfile'
import Parent from './components/ChildToParent/Parent'
import Navbar from './components/Navbar'

// function alertClick(){
//   alert("Ciaoooo");
// }

// function handleChange(e){
//   console.log(e)
// }

// function handleSubmit(e){
//   e.preventDefault() //fai il submit eevita ricaricamento pagina
//   console.log(e)
// }

function App() {
  //const [count, setCount] = useState(0)
  // const images=[
  //   { id:0,
  //     name:"Elefante tandem psichico da guerra",
  //     descr: "Creatura che esaudisce tutti i desideri",
  //     img:"https://i1.sndcdn.com/artworks-000581211308-8ghlm9-t500x500.jpg",
  //     isVisit:true,
  //     imgStyle:{height: "300px",borderRadius:"150px"}
  //   },
  //   { id:1,
  //     name:"Re Ghiaccio",
  //     descr: "Un vecchio bastardo" ,
  //     img: "https://pbs.twimg.com/profile_images/907398318560628736/idesYLMl_400x400.jpg",
  //     isVisit:false,
  //     imgStyle:{height: "300px",borderRadius:"150px"}
  //   }
  // ]

  return (
    <>
      {/* <Card isVisit= {true} titolo="Elefante tandem psichico da guerra" img = "https://i1.sndcdn.com/artworks-000581211308-8ghlm9-t500x500.jpg" descr = "Creatura che esaudisce tutti i desideri" imgStyle={{height: "300px",borderRadius:"150px"}}></Card> 
      <Card isVisit= {false} titolo="Re Ghiaccio" img="https://pbs.twimg.com/profile_images/907398318560628736/idesYLMl_400x400.jpg" descr="Un vecchio bastardo" imgStyle={{height: "300px",borderRadius:"150px"}} ></Card>
      
      {images.map((image) => (
        <Card key={image.id}
        titolo={image.name}
        img={image.img}
        descr={image.descr}
        isVisit={image.isVisit}
        imgStyle={image.imgStyle}>
        </Card>
        ))}
      
      {images.filter((image) => image.isVisit).map((image) => (
        <Card key ={image.id}
        titolo={image.name}
        img={image.img}
        descr={image.descr}
        isVisit={image.isVisit}
        imgStyle={image.imgStyle}>
        </Card>
      ))} */}
      <fieldset>
      <TodoList></TodoList>
      </fieldset>
      <br></br>
      <fieldset>
      <UserProfile></UserProfile>
      </fieldset>
      <br></br>
      <fieldset>
      <Parent></Parent>
      </fieldset>
      <fieldset>
      <Navbar></Navbar>
      </fieldset>
        
      
      {/* <div>
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1> */}
      <div className="card">
        {/* <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <button onClick={(alertClick)}>
          alert
        </button>
        <input type='text' onChange={handleChange}></input>
        <form onSubmit={handleSubmit}>
          <button type='submit'>Clicca qui</button>
        </form> 
        
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>*/}
      </div>
      {/*}
       <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p> */}
    </>
  )
}

export default App
