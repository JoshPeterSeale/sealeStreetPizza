import React from "react";
import { useQuery, gql } from "@apollo/client";
import { useEffect } from "react";

const GET_MENU_ITEMS = gql`
    query {
      getPizzas{
        id
        name
        ingredients
      }
    }
`;

export default function MenuItemsList() {
    const { error, loading, data } = useQuery(GET_MENU_ITEMS);
    console.log(error, loading, data);
    
    if(loading) return <div>spinner</div>
    if(error) return <div>something went wrong</div>
 
    return (
        <div>
            {data.getPizzas.map((pizza) => {
                return (
                    <div> 
                        <h2>{pizza.name}</h2>
                        <h2>{pizza.ingredients}</h2>
                    </div>    
                );
            })}
        </div>
    );
}