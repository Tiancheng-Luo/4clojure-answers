(ns four-clojure-answers.problem-103)

(def answer
  (fn [n s]
    (letfn [(power-set [s]
              (reduce (fn [ps x]
                        (into ps (map #(conj % x) ps)))
                      #{#{}} s))]
      (->> s
        power-set
        (filter #(= n (count %)))
        set))))
