import logo from './header-logo.PNG'

export default function Header(props) {
    return(
        <div class="grid-container">
            <div class="grid-item-1">
                <header>
                    <h1> {props.title} </h1>
                </header>
            </div>
            <div class="grid-item-2">
                <img src={logo} className="Header-logo" alt="logo" />
            </div>
        </div>
    );
}