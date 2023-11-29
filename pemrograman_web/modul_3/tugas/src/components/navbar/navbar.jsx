import logo from '../../assets/logo-ilab.png';
import React from 'react';
import { Link } from 'react-router-dom';
import './navbar.css';

function Navbar() {
    return (
        <nav>
            <div className="left-items">
                <img src={logo} alt="logo" />
            </div>
            <div className="center-item">
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/about">About</Link>
                    </li>
                    <li>
                        <Link to="/contact">Contact</Link>
                    </li>
                </ul>
            </div>
            <div className="right-item">
                <button>Button</button>
            </div>
        </nav>
    );
}

export default Navbar;
