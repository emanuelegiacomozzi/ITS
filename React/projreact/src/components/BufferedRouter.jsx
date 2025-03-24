import { Link, Outlet } from "react-router-dom";


function BufferedRouter(){
    return(
    <>
      <nav>
      <table border="3" style={{ height:'440px', width: '200%', borderCollapse: 'collapse', backgroundColor: 'white' }}>
        <thead>
          <tr>
            <th><Link to="/squadra">Squadra</Link></th>
            <th><Link to="/trofei">Trofei</Link></th>
            <th><Link to="/kit">Kit da gioco</Link></th>
            <th><Link to="/partite">Partite</Link></th>
          </tr>
          <tr style={{ height: '400px'}}></tr>
        </thead>
      </table>
      </nav>
      <div className="page-content">
        <Outlet/>
      </div>
      </>
    )
}
export default BufferedRouter;