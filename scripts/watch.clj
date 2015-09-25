(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'fakecc.core
   :output-to "out/fakecc.js"
   :output-dir "out"})
