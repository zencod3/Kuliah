// Home.js
import React from 'react';
import Navbar from '../components/navbar';
import Hero from '../components/hero';
import Footer from '../components/footer';

function Home() {
    return (
        <div>
            <Navbar />
            <Hero title="HomePage"/>
            <Footer />
        </div>
    );
}

export default Home;
