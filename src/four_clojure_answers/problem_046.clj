(ns four-clojure-answers.problem-046)

(def answer
  (fn [f]
    (comp (partial apply f) reverse list)))
