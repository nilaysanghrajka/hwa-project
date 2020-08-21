fetch("http://localhost:8701/Characters/ListAll", {
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
        console.log("ID", data[i].id);
        console.log("Name", data[i].name);
        console.log("Alter", data[i].alterEgo);
        console.log("Location", data[i].location);
        console.log("Occupation", data[i].occupation);
        console.log("Side", data[i].side);
        console.log("Universe", data[i].universe);

        let row = `<tr><th scope="row">${data[i].id}</th>
        <td>${data[i].name}</td>
        <td>${data[i].alterEgo}</td>
        <td>${data[i].location}</td>
        <td>${data[i].occupation}</td>
        <td>${data[i].side}</td>
        <td>${data[i].universe}</td>
        <td><a href="http://localhost:8701/Characters/remove/${data[i].id}">delete</a></td>
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

  let name = x["nameinput"].value;
  let alterEgo = x["altinput"].value;
  let location = x["locinput"].value;
  let occupation = x["occinput"].value;
  let side = x["sideinput"].value;
  let universe = x["uniinput"].value;
  
  console.log(name);
  console.log(alterEgo);
  console.log(location);
  console.log(occupation);
  console.log(side);
  console.log(universe);

  const data = {
    "name": name,
    "alterEgo": alterEgo,
    "location": location,
    "occupation": occupation,
    "side": side,
    "universe": universe,
  };

  console.log(data);

  fetch("http://localhost:8701/Characters/create", {
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
    window.location.reload(true);
});

  fetfetch("http://localhost:8701/Characters/update/${id}", {
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