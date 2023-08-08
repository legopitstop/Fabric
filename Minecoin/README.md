# [<](../README.md) Minecoin

![alt](icon.png)

Get FAKE minecoins to buy and trade!

## Mod Data

| Key         | Value     |
|-------------|-----------|
| supported   | `yes`     |
| version     | `1.0.0 `  |
| mc_version  | `1.20.1`  |
| client_side | `required`|
| server_side | `required`|

## LINKS
- [Download](DOWNLOAD)
- [Wiki Page](https://github.com/legopitstop/Fabric/wiki/TEMPLATE)
- [License](https://legopitstop.weebly.com/license.html)
- [Bug Report](https://github.com/legopitstop/Fabric/issues)

## Commands
### User

- `/balance` - Returns your current balance
- `/withdraw <amount>` - Account to coin
- `/deposit [<amount>]` - Coin to account

### Operator
These are commands that can only be ran using functions, command blocks, or players who are operators.

- `/coin get <targets>` - Returns the targets balance
- `/coin set <targets> <amount>` - Set the targets balance. Returns new bal
- `/coin remove <targets> [<amount>]` - Remove from balance. Returns new bal
- `/coin add <targets> [<amount>]` - Add to balance. Returns new bal
- `/coin withdraw <targets> [<amount>]` - Account to coin. Returns new bal
- `/coin deposit <targets> [<amount>]` - Coin to account. Returns new bal
- `/execute store result coin <targets> run ...` - Store balance