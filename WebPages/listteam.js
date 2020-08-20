fetch("http://localhost:8701/Team/ListAll", {
  method: "GET",
})
  .then(function (response) {
    if (response.status !== 200) {
      console.log(
        "Looks like there was a problem. Status Code: " + response.status
      );
      return;
    }
    // Examine the text in the response
    response.json().then(function (data) {
      console.log(data);
      for (let i = 0; i < data.length; i++) {
        console.log("ID", data[i].teamid);
        console.log("Name", data[i].teamname);
        console.log("Side", data[i].teamside);

        let row = `<tr><th scope="row">${data[i].id}</th>
        <td>${data[i].teamname}</td>
        <td>${data[i].teamside}</td>
        <td><a href="http://localhost:8701/Team/remove/${data[i].id}">delete</a></td>
        </tr>`;

        document.getElementById("charList").innerHTML += row;
      }
    });
  })
  .catch(function (err) {
    console.log("Fetch Error :-s", err);
  });




document.querySelector("#addCharacter").addEventListener("submit", function (e) {
  e.preventDefault();
  let x = document.querySelector("#addCharacter").elements;

  let teamname = x["nameinput"].value;
  let teamside = x["sideinput"].value;

  console.log(teamname);
  console.log(teamside);

  const data = {
    "teamname": teamname,
    "teamside": teamside,
  };

  console.log(data);

  fetch("http://localhost:8701/Team/create", {
    method: "POST",
    mode: "cors",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(data),
  })
    .then((response) => response)
    .then(function (data) {
      console.log("Request succeeded with JSON response", data);
    })
    .catch(function (error) {
      console.log("Request failed", error);
    }); 
});

  fetfetch("http://localhost:8701/Team/update/${id}", {
    method: "POST",
    mode: "cors",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(data),
  })
    .then((response) => response)
    .then(function (data) {
      console.log("Request succeeded with JSON response", data);
    })
    .catch(function (error) {
      console.log("Request failed", error);
    }); 