(ns four-clojure-answers.problem-067)

(def answer
  (fn [n]
    (take n
      (map first
           (iterate (fn [[m & more]]
                      (filter #(not= 0 (rem % m)) more))
                    (iterate inc 2))))))
