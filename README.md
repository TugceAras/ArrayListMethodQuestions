# <p align="center"> ArrayList Method Questions </p>
- This is the second homework given by UpSchool.

## Language Used 👇
- Kotlin

## Questions 👇
### 1)
- Create an ArrayList with 5 names.
- Ask the user to enter 3 names, separated by commas.
- Split this entered 3-name String using commas and convert it to a list
- Check if this list is plentiful.
- If it is not empty, add it to the 5-name list you created and print the final version to the console.

### 2)
``` kotlin
val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
```
- Sort the list by letters first, using the names list above.
- Request 1 name from the user.
- Check if this name is in the names list.
- Search for this name in the list, if any, and print all letters on the console, capitalized and reversed.

### 3)
  ``` kotlin
  data class Student(val name: String, val age: Int, val school: String)  
  
  val students = arrayListOf(  
    Student("Ahmet", 20, "Üniversite A"),  
    Student("Ayşe", 27, "Üniversite B"),  
    Student("Mehmet", 22, "Üniversite C"),  
    Student("Fatma", 28, "Üniversite A"),  
    Student("Ali", 29, "Üniversite B"),  
    Student("Feyza", 24, "Üniversite A"),  
    Student("Berkay", 22, "Üniversite B"),  
    Student("Caner", 26, "Üniversite A")  
  )
  ```
- First, print the name of the student with the oldest and the smallest age and which index he is in on the console.
- Filter the ones whose school value is University A in the list.
- Print the list returned from the filtering process to the console one after the other as those over 25 and under.

### 4)
``` kotlin
data class CoinResponse(val name: String, val coinId: String, val hashingAlgorithm: String, val description: String, val image: String, val currentPrice: Float, val priceChangePercentage24h: Float)

data class CoinUI(val name: String, val coinId: String, val description: String, val image: String)

val coinList = arrayListOf(
    CoinResponse(
        name = "Bitcoin",
        coinId = "BTC",
        hashingAlgorithm = "SHA-256",
        description = "Bitcoin is a decentralized digital currency, without a central bank or single administrator.",
        image = "https://example.com/bitcoin.png",
        currentPrice = 34789.21,
        priceChangePercentage24h = -2.34
    ),
    CoinResponse(
        name = "Ethereum",
        coinId = "ETH",
        hashingAlgorithm = "Ethash",
        description = "Ethereum is an open-source, blockchain-based platform that enables developers to build and deploy smart contracts.",
        image = "https://example.com/ethereum.png",
        currentPrice = 2110.45,
        priceChangePercentage24h = 0.78
    ),
    CoinResponse(
        name = "Litecoin",
        coinId = "LTC",
        hashingAlgorithm = "Scrypt",
        description = "Litecoin is a peer-to-peer cryptocurrency that enables instant, near-zero cost payments to anyone in the world.",
        image = "https://example.com/litecoin.png",
        currentPrice = 129.57,
        priceChangePercentage24h = -1.12
    ),
    CoinResponse(
        name = "Ripple",
        coinId = "XRP",
        hashingAlgorithm = null,
        description = "Ripple is a digital payment protocol and cryptocurrency that is designed to facilitate fast, low-cost international money transfers.",
        image = "https://example.com/ripple.png",
        currentPrice = 0.5483,
        priceChangePercentage24h = 1.45
    )
)
```
- Above is an ArrayList with type CoinResponse.
- Convert this ArrayList to a list of type CoinUI and print it to console.

### 5)
``` kotlin
data class Workers(val name: String, val salary: Double)

val workers = arrayListOf(
    Workers("Ahmet Yılmaz", 15000.0),
    Workers("Ayşe Kaya", 32000.0),
    Workers("Mehmet Demir", 29000.0),
    Workers("Fatma Şahin", 18500.0)
)
```
- Give each employee a 35% raise using the workers list above.
- Shuffle the list and sort by salary value from smallest to largest.
- Print the highest and lowest salary areas to the console.
- Calculate the average salary and print it on the console.
