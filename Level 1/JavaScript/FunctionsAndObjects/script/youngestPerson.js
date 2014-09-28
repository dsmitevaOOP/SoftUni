function findYoungestPerson(persons) {
    var maxAge = 200;
    var person;

    for(var i = 0; i < persons.length; i++) {
        if(persons[i].age < maxAge) {
            maxAge = persons[i].age;
            person = i;
        }
    }

    console.log("The youngest person is " + persons[person].firstname + ' ' + persons[person].lastname);
}

var persons = [
    { firstname : 'George', lastname: 'Kolev', age: 32},
    { firstname : 'Bay', lastname: 'Ivan', age: 81},
    { firstname : 'Baba', lastname: 'Ginka', age: 40}]


findYoungestPerson(persons);
