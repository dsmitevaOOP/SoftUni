function isPrime(value) {
    if (value < 2) return false;

    var q = Math.floor(Math.sqrt (value));

    for (var i = 2; i <= q; i++)
    {
        if (value % i == 0)
        {
            console.log(false);
            return false;
        }
    }

    console.log(true);
    return true;
}

isPrime(7);
isPrime(254);
isPrime(587);
isPrime(651);
isPrime(322);
