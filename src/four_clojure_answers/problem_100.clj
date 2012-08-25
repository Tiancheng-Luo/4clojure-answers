(ns four-clojure-answers.problem-100)

(def answer
  (fn [n & nums]
    (first
      (filter
        (fn [m] (every? #(zero? (rem m %)) nums))
        (iterate #(+ % n) n)))))
