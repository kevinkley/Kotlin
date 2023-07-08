(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    root.kotlin_Javascript = factory(typeof kotlin_Javascript === 'undefined' ? {} : kotlin_Javascript);
}(this, function (_) {
  'use strict';
  //region block: pre-declaration
  //endregion
  function main() {
    var aumento = 10;
  }
  main();
  return _;
}));

//# sourceMappingURL=kotlin_Javascript.js.map
