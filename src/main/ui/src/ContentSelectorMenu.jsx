import React, { useState, } from "react";
import DisplayContent from "./DisplayContent";

export default function ContentSelectorMenu(props) {

    const [contentType, setContentType] = useState("About")
    
    const setContent = (param) => {
        setContentType(param);
    }


    return(
        <div className="content-menu-selector">
            <button onClick={() => setContent("Menu")}> Menu's </button>
            <button onClick={() => setContent("How To")}> How To's </button>
            <button onClick={() => setContent("About Us")}> About Us </button>
            <div className="display-content">
                <DisplayContent contentType={contentType}/>
            </div>
        </div>
    );
}