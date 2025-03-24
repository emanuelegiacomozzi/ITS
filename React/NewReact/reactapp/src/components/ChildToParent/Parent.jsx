//import React, 
import {useState} from 'react';
import Child from './Child';

function Parent(){
    const [message, setMessage]= useState('');

    const handleMessage = (childMessage) => {
        setMessage(childMessage);
    };

    return(
        <div>
            <h1>Messaggio dal child: {message}</h1>
            <Child onMessage={handleMessage}/>
        </div>
    );
};
export default Parent;