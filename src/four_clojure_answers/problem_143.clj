(ns four-clojure-answers.problem-143)

(def answer
  (comp (partial reduce +)
        (partial map *)))
