(ns four-clojure-answers.problem-074)

(def answer
  (fn [s]
    (letfn [(perfect-square? [n]
              (let [sqrt (Math/sqrt n)]
                (== sqrt (int sqrt))))]
      (->> s
        (re-seq #"\d+")
        (map #(Integer/valueOf %))
        (filter perfect-square?)
        (clojure.string/join ",")))))
