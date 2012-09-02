(ns four-clojure-answers.problem-075)

(def answer
  (fn [n]
    (letfn [(coprime? [a b]
              (= 1 (gcd a b)))
            (gcd [a b]
              (if (zero? b)
                a
                (recur b (rem a b))))]
      (count (filter (partial coprime? n)
                     (range 1 (inc n)))))))
