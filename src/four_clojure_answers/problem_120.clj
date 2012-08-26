(ns four-clojure-answers.problem-120)

(def answer-a
  (letfn [(smaller-than-sum-square-digits? [n]
            (< n (sum-square-digits n 0)))
          (sum-square-digits [n sum]
            (if (zero? n)
              sum
              (recur (quot n 10)
                     (+ sum (square (rem n 10))))))
          (square [n]
            (* n n))]
    (comp
      count
      (partial filter smaller-than-sum-square-digits?))))

(def answer-b
  (letfn [(smaller-than-sum-square-digits? [n]
            (< n (sum-square-digits n)))
          (sum-square-digits [n]
            (->> n
              str
              (re-seq #".")
              (map #(Integer/valueOf %))
              (map #(* % %))
              (reduce +)))]
    (comp
      count
      (partial filter smaller-than-sum-square-digits?))))
