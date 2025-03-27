let callback1 = ()=>{
    console.log("sono nella callback 1");
}

let callback2 = ()=>{
    console.log("sono nella callback 2");
}

let job1 = () =>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(callback1());
        }, 2000);
    });
}

let job2 = () =>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(callback2());
        }, 1000);
    });
}

let promise = job1();

promise.then(()=>{
    return job2();
}).then(()=>{
    return job2()
}).then(()=>{
    return job2();
});