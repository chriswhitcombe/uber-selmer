(ns uber-selmer.core
  (:use [selmer.parser])
  (:gen-class))

(defn -main
  [& args]
  (println (render-file "index.html" {:name "Yogthos"})))
