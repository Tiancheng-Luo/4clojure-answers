(ns four-clojure-answers.problem-128)

(def answer
  (fn [[s r]]
    {:suit ({\S :spade \H :heart \D :diamond \C :club} s)
     :rank ((zipmap "23456789TJQKA" (range)) r)}))
