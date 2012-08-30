(ns four-clojure-answers.problem-058)

(def answer
  (fn [& fs]
    (reduce
      (fn [g f]
        (fn [& xs] (g (apply f xs))))
      identity fs)))
