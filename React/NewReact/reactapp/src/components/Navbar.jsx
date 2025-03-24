import { Link } from "react-router-dom";

function Navbar(){

    return(
        <>
            <div>
                <nav>
                    <ul>
                        <li>
                            <Link to="/">Card</Link>
                        </li>
                        <li>
                            <Link to="/todolist">Todo</Link>
                        </li>
                        <li>
                            <Link to="/profile">User Profile</Link>
                        </li>
                    </ul>
                </nav>
            </div>
        </>
    )
}

export default Navbar;