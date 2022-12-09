export class AsyncCalls{
    ajaxCall(_url,_method){
        return new Promise((resolve,reject)=>{
            const xhr= new XMLHttpRequest();
            xhr.open(_method,_url);
            xhr.onload=()=>resolve(xhr.response);
            xhr.onerror=()=>reject(xhr.statusText);
            xhr.send();
        });
    }
}