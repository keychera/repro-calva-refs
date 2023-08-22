# `cmd` + `click` not working

issue on

    macOS Monterey v 12.6.5
    Calva version used: v2.0.387
    clojure-lsp version used: 2023.08.06-00.28.06
    clj-kondo version used: 2023.07.14-SNAPSHOT

## behaviour

in main.clj

- `cmd` + `click` the `do-something` definition
    - references tab shows up

<br/>

- jack in with 
    ```clojure
    {:main-opts ["-m" "nrepl.cmdline"]}
    ```
    - `cmd` + `click` references tab still shows up
    
<br/>

- jack in with 
    ```clojure
    {:main-opts ["-m" "nrepl.cmdline" "--interactive" "--color"
                "--middleware" "[cider.nrepl/cider-middleware"]}
    ```

  - `cmd` + `click` references tab does not work
