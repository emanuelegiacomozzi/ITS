{/*
    /function foto(){
    alert
}
*/}




function Card(titolo,img,imgStyle,descr, isVisit) {  //oppure functions Card(props)
    //const img = props.img     // props.img
    //const imgStyle = props.imgStyle    //props.imgStyle
    //const titolo = props.titolo       //props.titolo
    //const descr = props.descr       //props.descr

    //oppure
    // return(
    //     <div>
    //         <img src= {img} style={imgStyle} ></img> 
    //         <div>
    //         </div>
    //         <h2>{titolo}</h2>
    //         <p>{descr}</p>
    //         {isVisist ? <span><b>Visitato</b></span>:<span>Non Visitato</span>}
    //     </div>

        

    // )

    if (isVisit) {

    return(
        <div>
            <img src= {img} style={imgStyle} ></img> 
            <div>
            </div>
            <h2>{titolo}</h2>
            <p>{descr}</p>
            <span><b>Visitato</b></span>
        </div>

        

    )
    }
    return(
        <div>
            <img src= {img} style={imgStyle} ></img> 
            <div>
            </div>
            <h2>{titolo}</h2>
            <p>{descr}</p>
            <span><b>Non Visitato</b></span>
        </div>

        

    )
    }

export default Card;