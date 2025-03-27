import './Navbar.css'
import Link from './Link'
const x = 1; //definizione costante
const img = "vite"

const imgStyle = {
    height: x < 10? "200px": "500px",
    borderRadius: "90px"
}

//le variabili,costanti si stampano così {x}
//<nav>{x > 100000? "sono in alto!!!" : "sono in basso!!!"}</nav>  
//<img src={`/${img}.svg`} alt=""></img>  in alternativa nella dichiarazione const img = "./vite.svg"
//<img style={{height: "200px"}}src={`/${img}.svg`} alt=""></img>
//<img style={imgStyle}src={`/${img}.svg`}></img>

function Navbar() {
    return(
        <>
        <div className='box rounded rotated'>CIAOOOOO</div>
        <nav>{x}</nav>  
        <img className="bordoArrotondato" style = {imgStyle} src={`/${img}.svg`}></img>
        <ul>
           <li><Link></Link></li>
           <li><Link></Link></li>
           <li><Link></Link></li>
           <li><Link></Link></li>
           <li><Link></Link></li>
           <li><Link></Link></li>
           
        </ul>
        </>

    )
}

export default Navbar