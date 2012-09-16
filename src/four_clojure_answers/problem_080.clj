(ns four-clojure-answers.problem-080)

(def answer
  (fn [n]
    (letfn [(divisors [n]
              (filter #(zero? (rem n %)) (range 1 n)))]
      (= n (reduce + (divisors n))))))
