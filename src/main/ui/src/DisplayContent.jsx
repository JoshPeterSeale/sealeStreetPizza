import DisplayMenu from "./menu/DisplayMenu";
import DisplayAbout from "./DisplayAbout";
import DisplayHowTo from "./DisplayHowTo";

export default function DisplayContent(props) {

    return(
        <div className="display-content">
            <p> Render {props.contentType} here </p>
            {props.contentType === "Menu" &&
                <DisplayMenu></DisplayMenu>}
            {props.contentType === "About" &&
                <DisplayAbout></DisplayAbout>}
            {props.contentType === "How To" &&
                <DisplayHowTo></DisplayHowTo>}
        </div>
    );      

}