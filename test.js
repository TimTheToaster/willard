let amount = 20000
const payment = 500
const apr = 1.1

const monthlyInterest = Math.pow(apr, 1/12)
let totalPaid = 0
let totalMonths = 0
while(amount > payment){
    amount -= payment
    totalPaid += payment
    amount *= monthlyInterest
    totalMonths++
}
totalPaid += amount
totalMonths++

console.log(totalPaid)
console.log(totalMonths)