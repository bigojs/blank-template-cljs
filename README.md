## Bigojs Clojure Starter project
### Compile project
In windows: 
```bash
java -cp "cljs.jar;src" cljs.main --target node --output-to main.js -c bigo-starter.core
```

In Linux/MacOs
```bash
clj --main cljs.main --compile bigo-starter.core --repl
```
### Run
```bash
npm start
```