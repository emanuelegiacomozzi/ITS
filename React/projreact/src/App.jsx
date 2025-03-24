import { useState } from 'react'
import './App.css'
import { Link } from 'react-router-dom'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Squadra from "./components/Squadra"
import Trofei from "./components/Trofei"
import Kit from "./components/Kit"
import Partite from "./components/Partite"
import BufferedRouter from './components/BufferedRouter';





function App() {

  return (
    <>
      <h1>Pagina ufficiale della F.C. Orfeo</h1>
      <Router>
      <div className="team-table">
      <Routes>
          <Route path="/" element={<BufferedRouter />} />
            <Route path="/squadra" element={<Squadra />} />
            <Route path="/trofei" element={<Trofei />} />
            <Route path="/kit" element={<Kit />} />
            <Route path="/partite" element={<Partite />} />
      </Routes>
      </div>
      </Router>
    </>
  )
}

export default App;
