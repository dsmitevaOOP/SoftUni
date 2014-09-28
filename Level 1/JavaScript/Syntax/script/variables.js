function variablesTypes(name, age, isMale, arr) {
    console.log("My name: " + name + " //type is " + typeof(name));
    console.log("My age: " + age + " //type is " + typeof(age).toString());
    console.log("I am male: " + isMale + " //type is " + typeof(isMale).toString());
    console.log("My favourite foods are: ");
    for (var i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
}

variablesTypes('Pesho', 22, true, ['fries', 'banana', 'cake']);

