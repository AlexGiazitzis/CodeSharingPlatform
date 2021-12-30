function send() {
    const object = {
        "code": document.getElementById("code_snippet").value,
        "time": document.getElementById("time_restriction").value,
        "views": document.getElementById("views_restriction").value
    };

    const json = JSON.stringify(object);

    const xhr = new XMLHttpRequest();
    xhr.open("POST", '/api/code/new', false)
    xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
    xhr.send(json);
    if (xhr.status === 200) {
        let resp = JSON.parse(xhr.response);
        window.location.assign(window.location.origin + "/code/" + resp.id);
    }
}