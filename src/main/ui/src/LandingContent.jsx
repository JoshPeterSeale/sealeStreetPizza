import logo from './header-logo.PNG'
import './LandingContent.css'

export default function landingContent(props) {
    return(
        <div className='content'>
            <div class='description'>
                <h1> 
                    Pizza is what we do! 
                </h1>
                <h3>
                    Handmade, Neapolitan inspired pizza, using great ingredients and made with passion and love!
                </h3>
            </div> {/*
            <div class='signature-dish'>
                <img src={logo} className="Landing-logo" alt="logo" />
                <h3> 
                    Introducing our new weekly special...
                </h3>
            </div>
    */}
        </div>
    );
}
