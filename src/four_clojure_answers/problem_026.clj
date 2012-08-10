(ns four-clojure-answers.problem-026)

(def answer
  (fn [n]
    (->> [0 1]
      (iterate (fn [[a b]] [b (+ a b)]))
      (map second)
      (take n))))
