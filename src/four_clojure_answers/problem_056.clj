(ns four-clojure-answers.problem-056)

(def answer
  (fn [coll]
    (reduce (fn [r x]
              (if (some #{x} r)
                r
                (conj r x)))
            [] coll)))
