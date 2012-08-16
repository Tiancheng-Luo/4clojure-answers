(ns four-clojure-answers.problem-042)

(def answer
  (fn [n]
    (reduce * (range 1 (inc n)))))
