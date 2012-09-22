(ns four-clojure-answers.problem-086)

(def answer
  (fn [n]
    (letfn [(sum-squares-digits [n]
              (->> n
                digits
                (map #(* % %))
                (reduce +)))
            (digits [n]
              (->> n
                str
                (map str)
                (map #(Integer/valueOf %))))]
      (loop [history #{} sum (sum-squares-digits n)]
        (cond (history sum) false
              (= 1 sum) true
              :else (recur (conj history sum)
                           (sum-squares-digits sum)))))))
