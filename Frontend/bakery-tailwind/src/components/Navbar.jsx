import Logo from '../assets/logo_navbar.png';
import { NavLink } from 'react-router-dom';

const Navbar = () => {
    return (
        <header className="relative">
            <nav className="absolute top-0 left-0 w-full flex items-center px-8 py-4 z-20">

                <div className="flex items-center space-x-4">
                    <img
                        src={Logo}
                        alt="Logo"
                        className="
                            h-35 w-auto
                            transition-all duration-300 ease-in-out
                            hover:scale-110
                            hover:drop-shadow-[0_0_1px_#f59e0b]
                        "
                    />
                </div>

                <ul className="flex space-x-8 ml-20 text-3xl">

                    <li>
                        <NavLink
                            to="/"
                            className={({ isActive }) =>
                                isActive
                                    ? "text-amber-300 font-extrabold"
                                    : "text-white font-extrabold hover:text-amber-300"
                            }
                        >
                            Inicio
                        </NavLink>
                    </li>

                    <li>
                        <NavLink
                            to="/productos"
                            className={({ isActive }) =>
                                isActive
                                    ? "text-amber-300 font-extrabold"
                                    : "text-white font-extrabold hover:text-amber-300"
                            }
                        >
                            Productos
                        </NavLink>
                    </li>

                    <li>
                        <NavLink
                            to="/nosotros"
                            className={({ isActive }) =>
                                isActive
                                    ? "text-amber-300 font-extrabold"
                                    : "text-white font-extrabold hover:text-amber-300"
                            }
                        >
                            Nosotros
                        </NavLink>
                    </li>

                </ul>
            </nav>
        </header>
    );
};

export default Navbar;