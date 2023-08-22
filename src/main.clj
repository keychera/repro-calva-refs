(ns main)

(defn do-something []
  (println "I am doing it!"))

(defn -main [& _]
  (do-something)
  (do-something))
