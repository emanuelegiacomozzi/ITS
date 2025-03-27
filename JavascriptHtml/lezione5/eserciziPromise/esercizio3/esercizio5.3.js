

let job1 = () =>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("result of job 1");
        }, 1000);
    });
}


let job2 = () =>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("result of job 2");
        }, 1000);
    });
}



job1().then((x)=>{
    console.log(x);
    return "hello world";
}).then((x)=>{
    console.log(x);
    return job2();
}).then((x)=>{
    console.log(x);
    })


