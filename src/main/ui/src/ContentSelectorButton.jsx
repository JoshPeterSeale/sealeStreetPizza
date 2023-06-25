import React, { useState, useEffect } from "react";

export default function ContentSelectorButton(props) {
    const [content, setContent] = useState("About")

    var settingContent = () => {
        setContent("Content");
    }

    return(
        <div className="content-selector-menu">
            <button onClick={() => settingContent(props.contentType)}>{props.contentType} </button>
        </div>
    );
}