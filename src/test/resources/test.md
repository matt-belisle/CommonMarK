[![Build Status](https://travis-ci.org/angular/angular.svg?branch=master)](https://travis-ci.org/angular/angular)
[![CircleCI](https://circleci.com/gh/angular/angular/tree/master.svg?style=shield)](https://circleci.com/gh/angular/angular/tree/master)
[![BrowserStack Status](https://www.browserstack.com/automate/badge.svg?badge_key=LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)](https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)
[![Join the chat at https://gitter.im/angular/angular](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/angular/angular?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![npm version](https://badge.fury.io/js/%40angular%2Fcore.svg)](https://www.npmjs.com/@angular/core)


# Angular

Angular is a development platform for building mobile and desktop web applications using Typescript/JavaScript and other languages.

## Quickstart

[Get started in 5 minutes][quickstart].


## Changelog

[Learn about the latest improvements][changelog]. 


## Want to help?

Want to file a bug, contribute some code, or improve documentation? Excellent! Read up on our
guidelines for [contributing][contributing] and then check out one of our issues in the [hotlist: community-help](https://github.com/angular/angular/labels/hotlist%3A%20community-help).

[browserstack]: https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06
[contributing]: https://github.com/angular/angular/blob/master/CONTRIBUTING.md
[quickstart]: https://angular.io/guide/quickstart
[changelog]: https://github.com/angular/angular/blob/master/CHANGELOG.md
[ng]: https://angular.io
# aurelia-framework

[![npm Version](https://img.shields.io/npm/v/aurelia-framework.svg)](https://www.npmjs.com/package/aurelia-framework)
[![ZenHub](https://raw.githubusercontent.com/ZenHubIO/support/master/zenhub-badge.png)](https://zenhub.io)
[![Join the chat at https://gitter.im/aurelia/discuss](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/aurelia/discuss?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![CircleCI](https://circleci.com/gh/aurelia/framework.svg?style=shield)](https://circleci.com/gh/aurelia/framework)

This library is part of the [Aurelia](http://www.aurelia.io/) platform and contains the aurelia framework which brings together all the required core aurelia libraries into a ready-to-go application-building platform.

> To keep up to date on [Aurelia](http://www.aurelia.io/), please visit and subscribe to [the official blog](http://blog.aurelia.io/) and [our email list](http://eepurl.com/ces50j). We also invite you to [follow us on twitter](https://twitter.com/aureliaeffect). If you have questions look around our [Discourse forums](https://discourse.aurelia.io/), chat in our [community on Gitter](https://gitter.im/aurelia/discuss) or use [stack overflow](http://stackoverflow.com/search?q=aurelia). Documentation can be found [in our developer hub](http://aurelia.io/docs). If you would like to have deeper insight into our development process, please install the [ZenHub](https://zenhub.io) Chrome or Firefox Extension and visit any of our repository's boards.

## Documentation

You can read the documentation for the aurelia framework [here](http://aurelia.io/docs). If you would like to help improve this documentation, the source for many of the docs can be found in the doc folder within this repository. Other docs, not related to the general framework, but directed at specific libraries, can be found in the doc folder of those libraries.

## Platform Support

This library can be used in the **browser** only.

## Building The Code

To build the code, follow these steps.

1. Ensure that [NodeJS](http://nodejs.org/) is installed. This provides the platform on which the build tooling runs.
2. From the project folder, execute the following command:

  ```shell
  npm install
  ```
3. Ensure that [Gulp](http://gulpjs.com/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g gulp
  ```
4. To build the code, you can now run:

  ```shell
  gulp build
  ```
5. You will find the compiled code in the `dist` folder, available in three module formats: AMD, CommonJS and ES6.

6. See `gulpfile.js` for other tasks related to generating the docs and linting.

## Running The Tests

To run the unit tests, first ensure that you have followed the steps above in order to install all dependencies and successfully build the library. Once you have done that, proceed with these additional steps:

1. Ensure that the [Karma](http://karma-runner.github.io/) CLI is installed. If you need to install it, use the following command:

  ```shell
  npm install -g karma-cli
  ```
2. Ensure that [jspm](http://jspm.io/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g jspm
  ```
3. Install the client-side dependencies with jspm:

  ```shell
  jspm install
  ```

4. You can now run the tests with this command:

  ```shell
  karma start
  ```
dojo
====

This is the foundation package for the Dojo 1 Toolkit.  While still being maintained, new development is primarily focused on modern Dojo.

Checkout the [Dojo framework website](https://dojo.io/) or if you want a more detailed technical status and overview, checkout the [`Dojo roadmap`](https://dojo.io/community/).

This package is sometimes
referred to as the “core”, it contains the most generally applicable sub-packages
and modules. The dojo package covers a wide range of functionality like Ajax, DOM
manipulation, class-type programming, events, promises, data stores,
drag-and-drop and internationalization libraries.

Installing
----------

Installation instructions are available at
[dojotoolkit.org/download](<http://dojotoolkit.org/download/>).

Getting Started
---------------

If you are starting out with Dojo, the following resources are available to you:

-   [Tutorials](<http://dojotoolkit.org/documentation/>)

-   [Reference Guide](<http://dojotoolkit.org/reference-guide/>)

-   [API Documentation](<http://dojotoolkit.org/api/>)

-   [Community Forum](<http://dojotoolkit.org/community/>)

What to Use Dojo For and When to Use It
---------------------------------------

The following is a brief sampling of some of the areas where Dojo may prove to
be the right tool for your next project:

-   For keeping your code fast and maintainable, Dojo offers an asynchronous
    module definition (AMD) loader -- encapsulating pieces of code into useful
    units, loading small JavaScript files only when they are needed, and loading
    files separately even when they are dependent on one another.

-   When you want to easily extend existing classes, share functionality among a
    number of classes, and maximize code reuse, Dojo provides class-like
    inheritance and “mixins.”

-   For creating advanced and customizable user interfaces out of refined,
    efficient, and modular pieces, Dojo’s Dijit framework offers several dozen
    enterprise-ready widgets -- including buttons, textboxes, form widgets with
    built-in validation, layout elements, and much more -- along with themes to
    lend them a consistent look. All of this is available for mobile
    environments as well.

-   For working with advanced vector graphics, Dojo’s GFX API can render
    graphics in a wide variety of formats, with support for seamless
    manipulation (skewing, rotating, resizing), gradients, responding to mouse
    events, and more.

-   The `dojox/charting` library supports powerful data visualization and
    dynamic charting, including a variety of 2D plots and animated charting
    elements.

-   When you need feature-rich, lightweight, and mobile-friendly grids/tables,
    Dojo offers the `dgrid` widget, along with customizable default themes and
    accompanying features such as in-cell editing, row/cell selection, column
    resizing/reordering, keyboard handling, pagination, and more.

-   Dojo is the officially supported framework for the ArcGIS API for
    JavaScript, one of the most widely used enterprise-grade APIs for web
    mapping and spatial analysis -- learning to use Dojo will open doors to
    creating richer web mapping applications using that API.

License and Copyright
---------------------

The Dojo Toolkit (including this package) is dual licensed under BSD 3-Clause
and AFL. For more information on the license please see the [License
Information](<http://dojotoolkit.org/license>). The Dojo Toolkit is Copyright
(c) 2005-2018, JS Foundation. All rights reserved.
<p align="center">
  <a href="https://emberjs.com"><img width="300" src="https://raw.githubusercontent.com/emberjs/website/master/source/images/brand/ember_Ember-Light.png"></a>
</p>

<p align="center">
  <a href="http://travis-ci.org/emberjs/ember.js"><img src="https://secure.travis-ci.org/emberjs/ember.js.svg?branch=master" alt="Build Status"></a>
  <a href="https://codeclimate.com/github/emberjs/ember.js"><img src="https://codeclimate.com/github/emberjs/ember.js.svg" alt="Code Climate"></a>
  <a href="https://discord.gg/zT3asNS"><img src="https://img.shields.io/discord/480462759797063690.svg?logo=discord" alt="Discord Community Server"></a>
</p>

Ember.js is a JavaScript framework that greatly reduces the time, effort and resources needed
to build any web application. It is focused on making you, the developer, as productive as possible by doing all the common, repetitive, yet essential, tasks involved in most web development projects.

Ember.js also provides access to the most advanced features of JavaScript, HTML and the Browser giving you everything you need to create your next killer web app.

- [Website](https://emberjs.com)
- [Guides](https://guides.emberjs.com)
- [API](https://emberjs.com/api)
- [Community](https://emberjs.com/community)
- [Blog](https://emberjs.com/blog)
- [Builds](https://emberjs.com/builds)

# Contribution

See [CONTRIBUTING.md](https://github.com/emberjs/ember.js/blob/master/CONTRIBUTING.md)

---

Cross-browser testing provided by:

<a href="http://browserstack.com"><img height="70" src="https://p3.zdusercontent.com/attachment/1015988/PWfFdN71Aung2evRkIVQuKJpE?token=eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0..aUrNFb8clSXsFwgw5BUTcg.IJr5piuCen7PmSSBHSrOnqM9K5YZfxX3lvbp-5LCqoKOi4CjjgdA419iqjofs0nLtm26FMURvZ8JRTuKB4iHer6lGu5f8dXHtIkYAHjP5fXDWkl044Yg2mSdrhF6uPy62GdlBYoYxwvgkNrac8nN_In8GY-qOC7bYmlZyJT7tsTZUTYbNMQiXS86YA5LgdCEWzWreMvc3C6cvZtVXIrcVgpkroIhvsTQPm4vQA-Uq6iCbTPA4oX5cpEtMtrlg4jYBnnAE4BTw5UwU_dY83ep5g.7wpc1IKv0rSRGsvqCG_q3g" alt="BrowserStack"></a>
# [React](https://reactjs.org/) &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/facebook/react/blob/master/LICENSE) [![npm version](https://img.shields.io/npm/v/react.svg?style=flat)](https://www.npmjs.com/package/react) [![Coverage Status](https://img.shields.io/coveralls/facebook/react/master.svg?style=flat)](https://coveralls.io/github/facebook/react?branch=master) [![CircleCI Status](https://circleci.com/gh/facebook/react.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/facebook/react) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://reactjs.org/docs/how-to-contribute.html#your-first-pull-request)

React is a JavaScript library for building user interfaces.

* **Declarative:** React makes it painless to create interactive UIs. Design simple views for each state in your application, and React will efficiently update and render just the right components when your data changes. Declarative views make your code more predictable, simpler to understand, and easier to debug.
* **Component-Based:** Build encapsulated components that manage their own state, then compose them to make complex UIs. Since component logic is written in JavaScript instead of templates, you can easily pass rich data through your app and keep state out of the DOM.
* **Learn Once, Write Anywhere:** We don't make assumptions about the rest of your technology stack, so you can develop new features in React without rewriting existing code. React can also render on the server using Node and power mobile apps using [React Native](https://facebook.github.io/react-native/).

[Learn how to use React in your own project](https://reactjs.org/docs/getting-started.html).

## Installation

React has been designed for gradual adoption from the start, and **you can use as little or as much React as you need**:

* Use [Online Playgrounds](https://reactjs.org/docs/getting-started.html#online-playgrounds) to get a taste of React.
* [Add React to a Website](https://reactjs.org/docs/add-react-to-a-website.html) as a `<script>` tag in one minute.
* [Create a New React App](https://reactjs.org/docs/create-a-new-react-app.html) if you're looking for a powerful JavaScript toolchain.

You can use React as a `<script>` tag from a [CDN](https://reactjs.org/docs/cdn-links.html), or as a `react` package on [npm](https://www.npmjs.com/).

## Documentation

You can find the React documentation [on the website](https://reactjs.org/docs).  

Check out the [Getting Started](https://reactjs.org/docs/getting-started.html) page for a quick overview.

The documentation is divided into several sections:

* [Tutorial](https://reactjs.org/tutorial/tutorial.html)
* [Main Concepts](https://reactjs.org/docs/hello-world.html)
* [Advanced Guides](https://reactjs.org/docs/jsx-in-depth.html)
* [API Reference](https://reactjs.org/docs/react-api.html)
* [Where to Get Support](https://reactjs.org/community/support.html)
* [Contributing Guide](https://reactjs.org/docs/how-to-contribute.html)

You can improve it by sending pull requests to [this repository](https://github.com/reactjs/reactjs.org).

## Examples

We have several examples [on the website](https://reactjs.org/). Here is the first one to get you started:

```jsx
class HelloMessage extends React.Component {
  render() {
    return <div>Hello {this.props.name}</div>;
  }
}

ReactDOM.render(
  <HelloMessage name="Taylor" />,
  document.getElementById('container')
);
```

This example will render "Hello Taylor" into a container on the page.

You'll notice that we used an HTML-like syntax; [we call it JSX](https://reactjs.org/docs/introducing-jsx.html). JSX is not required to use React, but it makes code more readable, and writing it feels like writing HTML. If you're using React as a `<script>` tag, read [this section](https://reactjs.org/docs/add-react-to-a-website.html#optional-try-react-with-jsx) on integrating JSX; otherwise, the [recommended JavaScript toolchains](https://reactjs.org/docs/create-a-new-react-app.html) handle it automatically.

## Contributing

The main purpose of this repository is to continue to evolve React core, making it faster and easier to use. Development of React happens in the open on GitHub, and we are grateful to the community for contributing bugfixes and improvements. Read below to learn how you can take part in improving React.

### [Code of Conduct](https://code.facebook.com/codeofconduct)

Facebook has adopted a Code of Conduct that we expect project participants to adhere to. Please read [the full text](https://code.facebook.com/codeofconduct) so that you can understand what actions will and will not be tolerated.

### [Contributing Guide](https://reactjs.org/contributing/how-to-contribute.html)

Read our [contributing guide](https://reactjs.org/contributing/how-to-contribute.html) to learn about our development process, how to propose bugfixes and improvements, and how to build and test your changes to React.

### Good First Issues

To help you get your feet wet and get you familiar with our contribution process, we have a list of [good first issues](https://github.com/facebook/react/labels/good%20first%20issue) that contain bugs which have a relatively limited scope. This is a great place to get started.

### License

React is [MIT licensed](./LICENSE).
     ____                     __      __
    /\  _`\                  /\ \    /\ \                                   __
    \ \ \ \ \     __      ___\ \ \/'\\ \ \____    ___     ___      __      /\_\    ____
     \ \  _ <'  /'__`\   /'___\ \ , < \ \ '__`\  / __`\ /' _ `\  /'__`\    \/\ \  /',__\
      \ \ \ \ \/\ \ \.\_/\ \__/\ \ \\`\\ \ \ \ \/\ \ \ \/\ \/\ \/\  __/  __ \ \ \/\__, `\
       \ \____/\ \__/.\_\ \____\\ \_\ \_\ \_,__/\ \____/\ \_\ \_\ \____\/\_\_\ \ \/\____/
        \/___/  \/__/\/_/\/____/ \/_/\/_/\/___/  \/___/  \/_/\/_/\/____/\/_/\ \_\ \/___/
                                                                           \ \____/
                                                                            \/___/
    (_'_______________________________________________________________________________'_)
    (_.———————————————————————————————————————————————————————————————————————————————._)


Backbone supplies structure to JavaScript-heavy applications by providing models with key-value binding and custom events, collections with a rich API of enumerable functions, views with declarative event handling, and connects it all to your existing application over a RESTful JSON interface.

For Docs, License, Tests, pre-packed downloads, and everything else, really, see:
http://backbonejs.org

To suggest a feature or report a bug:
https://github.com/jashkenas/backbone/issues

For questions on working with Backbone or general discussions:
https://groups.google.com/forum/#!forum/backbonejs,
http://stackoverflow.com/questions/tagged/backbone.js, or
https://gitter.im/jashkenas/backbone

Backbone is an open-sourced component of DocumentCloud:
https://github.com/documentcloud

Many thanks to our contributors:
https://github.com/jashkenas/backbone/graphs/contributors

Special thanks to Robert Kieffer for the original philosophy behind Backbone.
https://github.com/broofa
# Hyperapp

[![Travis CI](https://img.shields.io/travis/jorgebucaran/hyperapp/master.svg)](https://travis-ci.org/jorgebucaran/hyperapp)
[![Codecov](https://img.shields.io/codecov/c/github/jorgebucaran/hyperapp/master.svg)](https://codecov.io/gh/jorgebucaran/hyperapp)
[![npm](https://img.shields.io/npm/v/hyperapp.svg)](https://www.npmjs.org/package/hyperapp)
[![Slack](https://hyperappjs.herokuapp.com/badge.svg)](https://hyperappjs.herokuapp.com "Join us")

Hyperapp is a JavaScript micro-framework for building web applications.

> :wave: [**Hyperapp 2.0**](https://github.com/jorgebucaran/hyperapp/pull/726) is coming out soon! Try it from the [V2](https://github.com/jorgebucaran/hyperapp/tree/V2) branch right now and be sure to follow [@HyperappJS](https://twitter.com/hyperappjs) for all the Hyperapp news & updates.

- **Minimal** — We have aggressively minimized the concepts you need to understand to be productive while remaining on par with what other frameworks can do.
- **Pragmatic** — Hyperapp holds firm on the functional programming front when managing your state, but takes a pragmatic approach to allow for side effects, asynchronous actions, and DOM manipulations.
- **Standalone** — Do more with less. Hyperapp combines state management with a virtual DOM engine that supports keyed updates & lifecycle events — all with no dependencies.

## Getting Started

Our first example is a counter that can be incremented or decremented. Go ahead and [try it online](https://codepen.io/hyperapp/pen/zNxZLP/left/?editors=0010).

```jsx
import { h, app } from "hyperapp"

const state = {
  count: 0
}

const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}

const view = (state, actions) => (
  <div>
    <h1>{state.count}</h1>
    <button onclick={() => actions.down(1)}>-</button>
    <button onclick={() => actions.up(1)}>+</button>
  </div>
)

app(state, actions, view, document.body)
```

Hyperapp consists of a two-function API. <samp>hyperapp.h</samp> returns a new [virtual DOM](#view) node tree and <samp>hyperapp.app</samp> [mounts](#mounting) a new application in the specified DOM element. Without an element, it's possible to use Hyperapp "headless", which can be useful when unit testing your program.

This example assumes you are using a JavaScript compiler like [Babel](https://babeljs.io) or [TypeScript](https://www.typescriptlang.org) and a module bundler like [Parcel](https://parceljs.org), [Webpack](https://webpack.js.org), etc. If you are using JSX, all you need to do is install the JSX [transform plugin](https://babeljs.io/docs/en/babel-plugin-transform-react-jsx) and add the pragma option to your <samp>.babelrc</samp> file.

```json
{
  "plugins": [["@babel/plugin-transform-react-jsx", { "pragma": "h" }]]
}
```

JSX is a language syntax extension that lets you write HTML tags interspersed with JavaScript. Because browsers don't understand JSX, we use a compiler to transform it into <samp>hyperapp.h</samp> function calls under the hood.

```jsx
const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

Note that JSX is not required for building applications with Hyperapp. You can use <samp>hyperapp.h</samp> directly and without a compilation step as shown above. Other alternatives to JSX include [@hyperapp/html](https://github.com/hyperapp/html), [hyperx](https://github.com/substack/hyperx), [t7](https://github.com/trueadm/t7) and [ijk](https://github.com/lukejacksonn/ijk).

## Installation

Install with npm or Yarn.

<pre>
npm i <a href=https://www.npmjs.com/package/hyperapp>hyperapp</a>
</pre>

Then with a module bundler like [Rollup](https://rollupjs.org) or [Webpack](https://webpack.js.org), use as you would anything else.

```js
import { h, app } from "hyperapp"
```

If you don't want to set up a build environment, you can download Hyperapp from a CDN like [unpkg.com](https://unpkg.com/hyperapp) and it will be globally available through the <samp>window.hyperapp</samp> object. We support all ES5-compliant browsers, including Internet Explorer 10 and above.

```html
<script src="https://unpkg.com/hyperapp"></script>
```

## Overview

Hyperapp applications consist of three interconnected parts: the [state](#state), [view](#view), and [actions](#actions).

Once initialized, your application executes in a continuous loop, taking in actions from users or from external events, updating the state, and representing changes in the view through a virtual DOM model. Think of an action as a signal that notifies Hyperapp to update the state and schedule the next view to redraw. After processing an action, the new state is presented back to the user.

### State

The state is a plain JavaScript object that describes your entire program. It consists of all the dynamic data that is moved around in the application during its execution. The state cannot be mutated once it is created. We must use actions to update it.

```js
const state = {
  count: 0
}
```

Like any JavaScript object, the state can be a nested tree of objects. We refer to nested objects in the state as partial state. A single state tree does not conflict with modularity — see [Nested Actions](#nested-actions) to find out how to update deeply nested objects and split your state and actions.

```js
const state = {
  top: {
    count: 0
  },
  bottom: {
    count: 0
  }
}
```

Because Hyperapp performs a shallow merge when updating your state, the top-level state must be a plain JavaScript object, other than this, you can use any type, including arrays, ES6 [Maps](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map), [Sets](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set), [Immutable.js](https://facebook.github.io/immutable-js/) structures, etc.

#### Local State

Hyperapp does not have the concept of local state. Instead, components are pure functions that return a virtual DOM representation of the global state.

### Actions

The only way to change the state is via actions. An action is a unary function (accepts a single argument) expecting a payload. The payload can be anything you want to pass into the action.

To update the state, an action must return a partial state object. The new state will be the result of a shallow merge between this object and the current state. Under the hood, Hyperapp wires every function in your actions to automatically redraw the view on state changes.

```js
const actions = {
  setValue: value => ({ value })
}
```

Instead of returning a partial state object directly, an action can return a function that takes the current state and actions as arguments and returns a partial state object.

```js
const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}
```

State updates are always immutable. Do not mutate the state object argument within an action and return it — the results are not what you expect (e.g., the view will not be redrawn).

Immutability enables time-travel debugging, helps prevent introducing hard-to-track-down bugs by making state changes more predictable, and allows cheap memoization of components using shallow equality <samp>===</samp> checks.

#### Asynchronous Actions

Actions used for side effects (writing to databases, sending a request to a server, etc.) don't need to have a return value. You may call an action from within another action or callback function. Actions which return a Promise, <samp>undefined</samp> or <samp>null</samp> will not trigger redraws or update the state.

```js
const actions = {
  upLater: value => (state, actions) => {
    setTimeout(actions.up, 1000, value)
  },
  up: value => state => ({ count: state.count + value })
}
```

An action can be an <samp>[async](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function)</samp> function. Because <samp>async</samp> functions return a Promise, and not a partial state object, you need to call another action in order to update the state.

```js
const actions = {
  upLater: () => async (state, actions) => {
    await new Promise(done => setTimeout(done, 1000))
    actions.up(10)
  },
  up: value => state => ({ count: state.count + value })
}
```

#### Nested Actions

Actions can be nested inside namespaces. Updating deeply nested state is as easy as declaring actions inside an object in the same path as the part of the state you want to update.

```jsx
const state = {
  counter: {
    count: 0
  }
}

const actions = {
  counter: {
    down: value => state => ({ count: state.count - value }),
    up: value => state => ({ count: state.count + value })
  }
}
```

#### Interoperability

The <samp>app</samp> function returns a copy of your actions where every function is wired to changes in the state. Exposing this object to the outside world can be useful to operate your application from another program or framework, subscribe to global events, listen to mouse and keyboard input, etc.

To see this in action, modify the example from [Getting Started](#getting-started) to save the wired actions to a variable and try using them. You should see the counter update accordingly.

```jsx
const main = app(state, actions, view, document.body)

setInterval(main.up, 250, 1)
setInterval(main.down, 500, 1)
```

Because state updates are always immutable, returning a reference to the current state will not schedule a view redraw.

```jsx
const actions = {
  getState: () => state => state
}
```

### View

Every time your application state changes, the view function is called so that you can specify how you want the DOM to look based on the new state. The view returns your specification in the form of a plain JavaScript object known as a virtual DOM and Hyperapp takes care of updating the actual DOM to match it.

```js
import { h } from "hyperapp"

export const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

A virtual DOM is a description of what a DOM should look like using a tree of nested JavaScript objects known as virtual nodes. Think of it as a lightweight representation of the DOM. In the example, the view function returns an object like this.

```jsx
{
  nodeName: "div",
  attributes: {},
  children: [
    {
      nodeName: "h1",
      attributes: {},
      children: [0]
    },
    {
      nodeName: "button",
      attributes: { ... },
      children: ["-"]
    },
    {
      nodeName:   "button",
      attributes: { ... },
      children: ["+"]
    }
  ]
}
```

The virtual DOM model allows us to write code as if the entire document is thrown away and rebuilt on each change, while we only update what actually changed. We try to do this in the least number of steps possible, by comparing the new virtual DOM against the previous one. This leads to high efficiency, since typically only a small percentage of nodes need to change, and changing real DOM nodes is costly compared to recalculating the virtual DOM.

It may seem wasteful to throw away the old virtual DOM and re-create it entirely on every update — not to mention the fact that at any one time, Hyperapp is keeping two virtual DOM trees in memory, but as it turns out, browsers can create hundreds of thousands of objects very quickly. On the other hand, modifying the DOM is several orders of magnitude more expensive.

### Mounting

To mount your application on a page, we need a DOM element. This element is referred to as the application container. Applications built with Hyperapp always have a single container.

```jsx
app(state, actions, view, container)
```

Hyperapp will also attempt to reuse existing elements inside the container enabling SEO optimization and improving your sites time-to-interactive. The process consists of serving a fully rendered page together with your application. Then instead of throwing away the existing content, we'll turn your DOM nodes into an interactive application out of the box.

This is how we can recycle server-rendered content out the counter example from before. See [Getting Started](#getting-started) for the application code.

```html
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <script defer src="bundle.js"></script>
</head>

<body>
  <div>
    <h1>0</h1>
    <button>-</button>
    <button>+</button>
  </div>
</body>
</html>
```

### Components

A component is a pure function that returns a virtual node. Unlike the view function, components are not wired to your application state or actions. Components are dumb, reusable blocks of code that encapsulate markup, styles, and behaviors that belong together.

Here's a taste of how to use components in your application. The application is a typical To-Do manager. Go ahead and [try it online here](https://codepen.io/hyperapp/pen/zNxRLy).

```jsx
import { h } from "hyperapp"

const TodoItem = ({ id, value, done, toggle }) => (
  <li
    class={done && "done"}
    onclick={() =>
      toggle({
        value: done,
        id: id
      })
    }
  >
    {value}
  </li>
)

export const view = (state, actions) => (
  <div>
    <h1>Todo</h1>
    <ul>
      {state.todos.map(({ id, value, done }) => (
        <TodoItem id={id} value={value} done={done} toggle={actions.toggle} />
      ))}
    </ul>
  </div>
)
```

If you don't know all the attributes that you want to place in a component ahead of time, you can use the [spread syntax](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_operator). Note that Hyperapp components can return an array of elements as in the following example. This technique lets you group a list of children without adding extra nodes to the DOM.

```jsx
const TodoList = ({ todos, toggle }) =>
  todos.map(todo => <TodoItem {...todo} toggle={toggle} />)
```

#### Lazy Components

Components can only receive attributes and children from their parent component. Similarly to the top-level view function, lazy components are passed your application global state and actions. To create a lazy component, return a view function from a regular component.

```jsx
import { h } from "hyperapp"

export const Up = ({ by }) => (state, actions) => (
  <button onclick={() => actions.up(by)}>+ {by}</button>
)

export const Down = ({ by }) => (state, actions) => (
  <button onclick={() => actions.down(by)}>- {by}</button>
)

export const Double = () => (state, actions) => (
  <button onclick={() => actions.up(state.count)}>+ {state.count}</button>
)

export const view = (state, actions) => (
  <main>
    <h1>{state.count}</h1>
    <Up by={2} />
    <Down by={1} />
    <Double />
  </main>
)
```

#### Handling Component State

Suppose you have a list of questions with answers that are collapsed initially. A flag `answerIsOpen` is used to determine if a question's answer is open.

Since there is no concept of local state in Hyperapp, the global state is always updated rather than an individual component's state.

To update a single question's state, the entire `questions` array will be mapped to a new array where the `answerIsOpen` property will be toggled if the question matches the one belonging to the component.

[View the example online](https://codepen.io/anon/pen/ZogRYP).

#### Children Composition

Components receive their children elements via the second argument, allowing you and other components to pass arbitrary children down to them.

```jsx
const Box = ({ color }, children) => (
  <div class={`box box-${color}`}>{children}</div>
)

const HelloBox = ({ name }) => (
  <Box color="green">
    <h1 class="title">Hello, {name}!</h1>
  </Box>
)
```

## Supported Attributes

Supported attributes include [HTML attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes), [SVG attributes](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute), [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events), [Lifecycle Events](#lifecycle-events), and [Keys](#keys). Note that non-standard HTML attribute names are not supported, <samp>onclick</samp> and <samp>class</samp> are valid, but <samp>onClick</samp> or <samp>className</samp> are not.

### Styles

The <samp>style</samp> attribute expects a plain object rather than a string as in HTML.
Each declaration consists of a style name property written in <samp>camelCase</samp> and a value. CSS variables are supported too.

Individual style properties will be diffed and mapped against <samp>[HTMLElement.style](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style)</samp> property members of the DOM element - you should therefore use the JavaScript style object [property names](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference), e.g. <samp>backgroundColor</samp> rather than <samp>background-color</samp>.

```jsx
import { h } from "hyperapp"

export const Jumbotron = ({ text }) => (
  <div
    style={{
      color: "white",
      fontSize: "32px",
      textAlign: center,
      backgroundImage: `url(${imgUrl})`
    }}
  >
    {text}
  </div>
)
```

### Lifecycle Events

You can be notified when elements managed by the virtual DOM are created, updated or removed via lifecycle events. Use them for animation, data fetching, wrapping third-party libraries, cleaning up resources, etc.

Note that lifecycle events are attached to virtual DOM nodes, not to components. Consider adding a key to ensure that the event is attached to a specific DOM element, rather than a recycled one.

#### oncreate

This event is fired after the element is created and attached to the DOM. Use it to manipulate the DOM node directly, make a network request, create a slide/fade in animation, etc.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    oncreate={element => element.focus()}
  />
)
```

#### onupdate

This event is fired every time we update the element attributes. Use <samp>oldAttributes</samp> inside the event handler to check if any attributes changed or not.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    onupdate={(element, oldAttributes) => {
      if (oldAttributes.placeholder !== placeholder) {
        // Handle changes here!
      }
    }}
  />
)
```

#### onremove

This event is fired before the element is removed from the DOM. Use it to create slide/fade out animations. Call <samp>done</samp> inside the function to remove the element. This event is not called in its child elements.

```jsx
import { h } from "hyperapp"

export const MessageWithFadeout = ({ title }) => (
  <div onremove={(element, done) => fadeout(element).then(done)}>
    <h1>{title}</h1>
  </div>
)
```

#### ondestroy

This event is fired after the element has been removed from the DOM, either directly or as a result of a parent being removed. Use it for invalidating timers, canceling a network request, removing global events listeners, etc.

```jsx
import { h } from "hyperapp"

export const Camera = ({ onerror }) => (
  <video
    poster="loading.png"
    oncreate={element => {
      navigator.mediaDevices
        .getUserMedia({ video: true })
        .then(stream => (element.srcObject = stream))
        .catch(onerror)
    }}
    ondestroy={element => element.srcObject.getTracks()[0].stop()}
  />
)
```

### Keys

Keys help identify nodes every time we update the DOM. By setting the <samp>key</samp> property on a virtual node, you declare that the node should correspond to a particular DOM element. This allows us to re-order the element into its new position, if the position changed, rather than risk destroying it.

```jsx
import { h } from "hyperapp"

export const ImageGallery = ({ images }) =>
  images.map(({ hash, url, description }) => (
    <li key={hash}>
      <img src={url} alt={description} />
    </li>
  ))
```

Keys must be unique among sibling nodes. Don't use an array index as the key, if the index also specifies the order of siblings. If the position and number of items in a list are fixed, it will make no difference, but if the list is dynamic, the key will change every time the tree is rebuilt.

```jsx
import { h } from "hyperapp"

export const PlayerList = ({ players }) =>
  players
    .slice()
    .sort((player, nextPlayer) => nextPlayer.score - player.score)
    .map(player => (
      <li key={player.username} class={player.isAlive ? "alive" : "dead"}>
        <PlayerProfile {...player} />
      </li>
    ))
```

#### Top-Level Nodes

Keys are not registered on the top-level node of your view. If you are toggling the top-level view, and you must use keys, wrap them in an unchanging node.

## Links

- [Slack](https://hyperappjs.herokuapp.com)
- [Twitter](https://twitter.com/hyperappJS)
- [Examples](https://codepen.io/search/pens/?q=hyperapp)
- [/r/hyperapp](https://www.reddit.com/r/hyperapp)

## License

Hyperapp is MIT licensed. See [LICENSE](LICENSE.md).
# Knockout

**Knockout** is a JavaScript [MVVM](http://en.wikipedia.org/wiki/Model_View_ViewModel) (a modern variant of MVC) library that makes it easier to create rich, desktop-like user interfaces with JavaScript and HTML. It uses *observers* to make your UI automatically stay in sync with an underlying data model, along with a powerful and extensible set of *declarative bindings* to enable productive development.

## Getting started

[![Join the chat at https://gitter.im/knockout/knockout](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/knockout/knockout?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

**Totally new to Knockout?** The most fun place to start is the [online interactive tutorials](http://learn.knockoutjs.com/).

For more details, see

 * Documentation on [the project's website](http://knockoutjs.com/documentation/introduction.html)
 * Online examples at [http://knockoutjs.com/examples/](http://knockoutjs.com/examples/)

## Downloading Knockout

You can [download released versions of Knockout](http://knockoutjs.com/downloads/) from the project's website.

For Node.js developers, Knockout is also available from [npm](https://npmjs.org/) - just run `npm install knockout`.

## Building Knockout from sources

If you prefer to build the library yourself:

1. **Clone the repo from GitHub**

   ```sh
   git clone https://github.com/knockout/knockout.git
   cd knockout
   ```

2. **Acquire build dependencies.**

   Make sure you have [Node.js](http://nodejs.org/) installed on your workstation. This is only needed to _build_ Knockout from sources. Knockout itself has no dependency on Node.js once it is built (it works with any server technology or none). Now run:

   ```sh
   npm install -g grunt-cli
   npm install
   ```

   The first `npm` command sets up the popular [Grunt](http://gruntjs.com/) build tool. You might need to run this command with `sudo` if you're on Linux or Mac OS X, or in an Administrator command prompt on Windows. The second `npm` command fetches the remaining build dependencies.

3. **Run the build tool**

   ```sh
   grunt
   ```
   Now you'll find the built files in `build/output/`.

## Running the tests

If you have [phantomjs](http://phantomjs.org/download.html) installed, then the `grunt` script will automatically run the specification suite and report its results.

Or, if you want to run the specs in a browser (e.g., for debugging), simply open `spec/runner.html` in your browser.

## License

MIT license - [http://www.opensource.org/licenses/mit-license.php](http://www.opensource.org/licenses/mit-license.php)
<p align="center">
    <a href="http://markojs.com/"><img src="https://raw.githubusercontent.com/marko-js/branding/master/marko-logo-medium-cropped.png" alt="Marko logo" width="300" /></a><br /><br />
</p>

Marko is a friendly (and fast!) UI library that makes building web apps fun.
Learn more on [markojs.com](http://markojs.com/), and even [Try Marko Online!](http://markojs.com/try-online/)

[![Build Status](https://travis-ci.org/marko-js/marko.svg?branch=master)](https://travis-ci.org/marko-js/marko)
[![Coverage Status](https://codecov.io/gh/marko-js/marko/branch/master/graph/badge.svg)](https://codecov.io/gh/marko-js/marko)
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/marko-js/marko)
[![NPM](https://img.shields.io/npm/v/marko.svg)](https://www.npmjs.com/package/marko)
[![Downloads](https://img.shields.io/npm/dm/marko.svg)](http://npm-stat.com/charts.html?package=marko)

# Get Involved

- **Contributing**: Pull requests are welcome!
  - Read [`CONTRIBUTING.md`](.github/CONTRIBUTING.md) and check out our [bite-sized](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Adifficulty%3Abite-sized) and [help-wanted](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Astatus%3Ahelp-wanted) issues
  - Submit github issues for any feature enhancements, bugs or documentation problems
- **Support**: Join our [gitter chat](https://gitter.im/marko-js/marko) to ask questions to get support from the maintainers and other Marko developers
  - Questions/comments can also be posted as [github issues](https://github.com/marko-js/marko/issues)
- **Discuss**: Tweet using the `#MarkoJS` hashtag and follow [@MarkoDevTeam](https://twitter.com/MarkoDevTeam)

# Installation

```bash
npm install marko --save
```

# Examples

Marko provides an elegant and readable syntax for both single-file components
and components broken into separate files. There are plenty of examples to play
with on [Marko's Try-Online](http://markojs.com/try-online/). Additional
[component documentation](http://markojs.com/docs/components/) can be found on
the Marko.js website.

## Single file

The following single-file component renders a button and a counter with the
number of times the button has been clicked. [Try this example now!](http://markojs.com/try-online/?file=%2Fcomponents%2Fcomponents%2Fclick-count%2Findex.marko)

**click-count.marko**

```marko
class {
    onCreate() {
        this.state = { count:0 };
    }
    increment() {
        this.state.count++;
    }
}

style {
    .count {
        color:#09c;
        font-size:3em;
    }
    .example-button {
        font-size:1em;
        padding:0.5em;
    }
}

<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

## Multi-file

The same component as above split into an `index.marko` template file,
`component.js` containing your component logic, and `style.css` containing your
component style:

**index.marko**

```marko
<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

**component.js**

```js
module.exports = {
  onCreate() {
    this.state = { count: 0 };
  },
  increment() {
    this.state.count++;
  }
};
```

**style.css**

```css
.count {
  color: #09c;
  font-size: 3em;
}
.example-button {
  font-size: 1em;
  padding: 0.5em;
}
```

## Concise Syntax

Marko also support a beautiful concise syntax as an alternative to the HTML
syntax. Find out more about the [concise syntax here](http://markojs.com/docs/concise/).

```marko
<!-- Marko HTML syntax -->
<ul>
    <li for(color in ['a', 'b', 'c'])>
        ${color}
    </li>
</ul>
```

```marko
// Marko concise syntax
ul
    li for(color in ['a', 'b', 'c'])
        -- ${color}
```

# Changelog

See [CHANGELOG.md](CHANGELOG.md)

# Maintainers

- [Patrick Steele-Idem](https://github.com/patrick-steele-idem) (Twitter: [@psteeleidem](http://twitter.com/psteeleidem))
- [Michael Rawlings](https://github.com/mlrawlings) (Twitter: [@mlrawlings](https://twitter.com/mlrawlings))
- [Phillip Gates-Idem](https://github.com/philidem/) (Twitter: [@philidem](https://twitter.com/philidem))
- [Austin Kelleher](https://github.com/austinkelleher) (Twitter: [@AustinKelleher](https://twitter.com/AustinKelleher))
- [Dylan Piercey](https://github.com/dylanpiercey) (Twitter: [@dylan_piercey](https://twitter.com/dylan_piercey))
- [Martin Aberer](https://github.com/tindli) (Twitter: [@metaCoffee](https://twitter.com/metaCoffee))

# Code of Conduct

This project adheres to the [eBay Code of Conduct](http://ebay.github.io/codeofconduct).
By participating in this project you agree to abide by its terms.

# License

MIT
# Matreshka.js 2 [![npm version](https://badge.fury.io/js/matreshka.svg)](https://badge.fury.io/js/matreshka) [![Build Status](https://travis-ci.org/matreshkajs/matreshka.svg)](https://travis-ci.org/matreshkajs/matreshka) [![Coverage Status](https://coveralls.io/repos/github/matreshkajs/matreshka/badge.svg?branch=master)](https://coveralls.io/github/matreshkajs/matreshka?branch=master) [![Join the chat at https://gitter.im/finom/matreshka](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/matreshkajs/matreshka)

[![Matreshka Website](http://matreshka.io/img/mk5-logo_full-vert.svg)](http://matreshka.io)

> Matreshka.js is a simple JavaScript framework for single page applications creation. It fills the gap between a junior and a senior because of simple and intuitive API based on JavaScript classes and accessors. Everything you need to get started is your JavaScript knowledge.

## Features
- Reactive API which allows to solve hard and confusing problems easily
- High robustness of developed apps
- The ability to refactor legacy applications without rewriting them from scratch
- Only couple of hours is needed to master the framework because of an absence of complex concepts

**[Download](https://github.com/matreshkajs/matreshka/tree/gh-pages)**

**Install via NPM**
```
npm install --save matreshka
```

-----------------------------------

## Resources
- [The website](http://matreshka.io)
- [Examples and tutorials](https://github.com/matreshkajs/examples-and-tutorials)
- [Release History](https://github.com/matreshkajs/matreshka/releases)
- [JSDoc files](https://github.com/matreshkajs/matreshka.io/tree/master/doc)
- [Twitter (automatically reports about new versions)](https://twitter.com/matreshkajs)
- [Support the project on Patreon](https://www.patreon.com/finom)

**License:** [MIT License](https://raw.github.com/finom/matreshka/master/LICENSE)



<a href="https://www.browserstack.com/" target="_blank">
    <img src="http://matreshka.io/img/logos/browserstack.svg" height="30" valign="middle">
</a> is provided a sponsored access to their testing platform
# Introduction

- [What is Mithril?](#what-is-mithril)
- [Getting started](#getting-started)
- [Hello world](#hello-world)
- [DOM elements](#dom-elements)
- [Components](#components)
- [Routing](#routing)
- [XHR](#xhr)

---

### What is Mithril?

Mithril is a modern client-side Javascript framework for building Single Page Applications.  
It's small (< 8kb gzip), fast and provides routing and XHR utilities out of the box.

<div style="display:flex;margin:0 0 30px;">
	<div style="width:50%;">
		<h5>Download size</h5>
		<small>Mithril (8kb)</small>
		<div style="animation:grow 0.08s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:4%;"></div>
		<small style="color:#aaa;">Vue + Vue-Router + Vuex + fetch (40kb)</small>
		<div style="animation:grow 0.4s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:20%"></div>
		<small style="color:#aaa;">React + React-Router + Redux + fetch (64kb)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:32%"></div>
		<small style="color:#aaa;">Angular (135kb)</small>
		<div style="animation:grow 1.35s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:68%"></div>
	</div>
	<div style="width:50%;">
		<h5>Performance</h5>
		<small>Mithril (6.4ms)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:24%;"></div>
		<small style="color:#aaa;">Vue (9.8ms)</small>
		<div style="animation:grow 0.98s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:40%"></div>
		<small style="color:#aaa;">React (12.1ms)</small>
		<div style="animation:grow 1.21s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:48%"></div>
		<small style="color:#aaa;">Angular (11.5ms)</small>
		<div style="animation:grow 1.15s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:44%"></div>
	</div>
</div>

Mithril is used by companies like Vimeo and Nike, and open source platforms like Lichess.

If you are an experienced developer and want to know how Mithril compares to other frameworks, see the [framework comparison](http://mithril.js.org/framework-comparison.html) page.

Mithril supports browsers all the way back to IE9, no polyfills required.

---

### Getting started

The easiest way to try out Mithril is to include it from a CDN, and follow this tutorial. It'll cover the majority of the API surface (including routing and XHR) but it'll only take 10 minutes.

Let's create an HTML file to follow along:

```markup
<body>
	<script src="//unpkg.com/mithril/mithril.js"></script>
	<script>
	var root = document.body

	// your code goes here!
	</script>
</body>
```

---

### Hello world

Let's start as small as we can: render some text on screen. Copy the code below into your file (and by copy, I mean type it out - you'll learn better)

```javascript
var root = document.body

m.render(root, "Hello world")
```

Now, let's change the text to something else. Add this line of code under the previous one:

```javascript
m.render(root, "My first app")
```

As you can see, you use the same code to both create and update HTML. Mithril automatically figures out the most efficient way of updating the text, rather than blindly recreating it from scratch.

---

### DOM elements

Let's wrap our text in an `<h1>` tag.

```javascript
m.render(root, m("h1", "My first app"))
```

The `m()` function can be used to describe any HTML structure you want. So if you need to add a class to the `<h1>`:

```javascript
m("h1", {class: "title"}, "My first app")
```

If you want to have multiple elements:

```javascript
[
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
]
```

And so on:

```javascript
m("main", [
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
])
```

Note: If you prefer `<html>` syntax, [it's possible to use it via a Babel plugin](http://mithril.js.org/jsx.html).

```jsx
// HTML syntax via Babel's JSX plugin
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

---

### Components

A Mithril component is just an object with a `view` function. Here's the code above as a component:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", "A button"),
		])
	}
}
```

To activate the component, we use `m.mount`.

```javascript
m.mount(root, Hello)
```

As you would expect, doing so creates this markup:

```markup
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

The `m.mount` function is similar to `m.render`, but instead of rendering some HTML only once, it activates Mithril's auto-redrawing system. To understand what that means, let's add some events:

```javascript
var count = 0 // added a variable

var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			// changed the next line
			m("button", {onclick: function() {count++}}, count + " clicks"),
		])
	}
}

m.mount(root, Hello)
```

We defined an `onclick` event on the button, which increments a variable `count` (which was declared at the top). We are now also rendering the value of that variable in the button label.

You can now update the label of the button by clicking the button. Since we used `m.mount`, you don't need to manually call `m.render` to apply the changes in the `count` variable to the HTML; Mithril does it for you.

If you're wondering about performance, it turns out Mithril is very fast at rendering updates, because it only touches the parts of the DOM it absolutely needs to. So in our example above, when you click the button, the text in it is the only part of the DOM Mithril actually updates.

---

### Routing

Routing just means going from one screen to another in an application with several screens.

Let's add a splash page that appears before our click counter. First we create a component for it:

```javascript
var Splash = {
	view: function() {
		return m("a", {href: "#!/hello"}, "Enter!")
	}
}
```

As you can see, this component simply renders a link to `#!/hello`. The `#!` part is known as a hashbang, and it's a common convention used in Single Page Applications to indicate that the stuff after it (the `/hello` part) is a route path.

Now that we going to have more than one screen, we use `m.route` instead of `m.mount`.

```javascript
m.route(root, "/splash", {
	"/splash": Splash,
	"/hello": Hello,
})
```

The `m.route` function still has the same auto-redrawing functionality that `m.mount` does, and it also enables URL awareness; in other words, it lets Mithril know what to do when it sees a `#!` in the URL.

The `"/splash"` right after `root` means that's the default route, i.e. if the hashbang in the URL doesn't point to one of the defined routes (`/splash` and `/hello`, in our case), then Mithril redirects to the default route. So if you open the page in a browser and your URL is `http://localhost`, then you get redirected to `http://localhost/#!/splash`.

Also, as you would expect, clicking on the link on the splash page takes you to the click counter screen we created earlier. Notice that now your URL will point to `http://localhost/#!/hello`. You can navigate back and forth to the splash page using the browser's back and next button.

---

### XHR

Basically, XHR is just a way to talk to a server.

Let's change our click counter to make it save data on a server. For the server, we'll use [REM](http://rem-rest-api.herokuapp.com), a mock REST API designed for toy apps like this tutorial.

First we create a function that calls `m.request`. The `url` specifies an endpoint that represents a resource, the `method` specifies the type of action we're taking (typically the `PUT` method [upserts](https://en.wiktionary.org/wiki/upsert)), `data` is the payload that we're sending to the endpoint and `withCredentials` means to enable cookies (a requirement for the REM API to work)

```javascript
var count = 0
var increment = function() {
	m.request({
		method: "PUT",
		url: "//rem-rest-api.herokuapp.com/api/tutorial/1",
		data: {count: count + 1},
		withCredentials: true,
	})
	.then(function(data) {
		count = parseInt(data.count)
	})
}
```

Calling the increment function [upserts](https://en.wiktionary.org/wiki/upsert) an object `{count: 1}` to the `/api/tutorial/1` endpoint. This endpoint returns an object with the same `count` value that was sent to it. Notice that the `count` variable is only updated after the request completes, and it's updated with the response value from the server now.

Let's replace the event handler in the component to call the `increment` function instead of incrementing the `count` variable directly:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", {onclick: increment}, count + " clicks"),
		])
	}
}
```

Clicking the button should now update the count.

---

We covered how to create and update HTML, how to create components, routes for a Single Page Application, and interacted with a server via XHR.

This should be enough to get you started writing the frontend for a real application. Now that you are comfortable with the basics of the Mithril API, [be sure to check out the simple application tutorial](http://mithril.js.org/simple-application.html), which walks you through building a realistic application.
 NuclearJS

[![Build Status](https://travis-ci.org/optimizely/nuclear-js.svg?branch=master)](https://travis-ci.org/optimizely/nuclear-js)
[![Coverage Status](https://coveralls.io/repos/optimizely/nuclear-js/badge.svg?branch=master)](https://coveralls.io/r/optimizely/nuclear-js?branch=master)
[![Join the chat at https://gitter.im/optimizely/nuclear-js](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/optimizely/nuclear-js?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Sauce Test Status](https://saucelabs.com/browser-matrix/nuclearjs.svg)](https://saucelabs.com/u/nuclearjs)

Traditional Flux architecture built with ImmutableJS data structures.

## Documentation

[https://optimizely.github.io/nuclear-js/](https://optimizely.github.io/nuclear-js/)

## Design Philosophy

- **Simple Over Easy** - The purpose of NuclearJS isn't to write the most expressive TodoMVC anyone's ever seen.  The goal of NuclearJS is to provide a way to model data that is easy to reason about and decouple at very large scale.

- **Immutable** - A means for less defensive programming, more predictability and better performance.

- **Functional** - The framework should be implemented functionally wherever appropriate.  This reduces incidental complexity and pairs well with Immutability.

- **Smallest Amount of State Possible** - Using NuclearJS should encourage the modeling of your application state in the most minimal way possible.

- **Decoupled** - A NuclearJS system should be able to function without any sort of UI or frontend.  It should be backend/frontend agnostic and be able to run on a NodeJS server.

## Installation

NuclearJS can be downloaded from [npm](https://www.npmjs.com/).

```
npm install nuclear-js
```

## Examples

- [Shopping Cart Example](./examples/shopping-cart) - Provides a general overview of basic NuclearJS concepts: actions, stores and getters with ReactJS.
- [Flux Chat Example](./examples/flux-chat) - A classic Facebook flux chat example written in NuclearJS.
- [Rest API Example](./examples/rest-api) - Shows how to deal with fetching data from an API using NuclearJS conventions.
- [Hot reloadable stores](./examples/hot-reloading) - Shows how to setup stores to be hot reloadable using webpack hot module replacement.

## How NuclearJS differs from other Flux implementations

1.  All app state is in a singular immutable map, like [Om](https://github.com/omcljs/om).  In development you can see your entire application state at every point in time thanks to awesome debugging tools built into NuclearJS.

2.  State is not spread out through stores, instead stores are a declarative way of describing some top-level domain of your app state. For each key in the app state map a store declares the initial state of that key and how that piece of the app state reacts over time to actions dispatched on the flux system.

3.  Stores are not reference-able nor have any `getX` methods on them.  Instead NuclearJS uses a functional lens concept called **getters**. In fact, the use of getters obviates the need for any store to know about another store, eliminating the confusing `store.waitsFor` method found in other flux implementations.

4.  NuclearJS is insanely efficient - change detection granularity is infinitesimal, you can even observe computed state where several pieces of the state map are combined together and run through a transform function.  NuclearJS is smart enough to know when the value of any computed changes and only call its observer if and only if its value changed in a way that is orders of magnitude more efficient than traditional dirty checking.  It does this by leveraging ImmutableJS data structure and using a `state1 !== state2` reference comparison which runs in constant time.

5.  Automatic data observation / rendering -- automatic re-rendering is built in for React in the form of a very lightweight mixin.  It is also easily possible to build the same functionality for any UI framework such as VueJS, AngularJS and even Backbone.

6.  NuclearJS is not a side-project, it's used as the default Flux implementation that powers all of Optimizely.  It is well tested and will continue to be maintained for the foreseeable future. Our current codebase has over dozens of stores, actions and getters, we even share our prescribed method of large scale code organization and testing strategies.

## Performance

Getters are only calculated whenever their dependencies change. So if the dependency is a keypath then it will only recalculate when that path in the app state map has changed (which can be done as a simple `state.getIn(keyPath) !== oldState.getIn(keyPath)` which is an `O(log32(n))` operation. The other case is when a getter is dependent on other getters. Since every getter is a pure function, NuclearJS will only recompute the getter if the values of its dependencies change.

## API Documentation

[API Documentation](https://optimizely.github.io/nuclear-js/docs/07-api.html)

## For Smaller Applications

NuclearJS was designed first and foremost for large scale production codebases.  For a much more lightweight Flux implementation that shares many of the same ideas and design principles check out [Microcosm](https://github.com/vigetlabs/microcosm).

## Contributing

Contributions are welcome, especially with the documentation website and examples.  See [CONTRIBUTING.md](./CONTRIBUTING.md).
# Polymer

[![Build Status](https://travis-ci.org/Polymer/polymer.svg?branch=master)](https://travis-ci.org/Polymer/polymer)
[![Published on npm](https://img.shields.io/npm/v/@polymer/polymer.svg)](https://www.npmjs.com/package/@polymer/polymer)
[![Published on webcomponents.org](https://img.shields.io/badge/webcomponents.org-published-blue.svg)](https://www.webcomponents.org/element/@polymer/polymer)

> ℹ️ Note: This is the current stable version of the Polymer library.  At Google I/O 2018 we announced a new Web Component base class, [`LitElement`](https://github.com/Polymer/lit-element), as a successor to the `PolymerElement` base class in this library.
>
> If you're starting a new project, we recommend that you consider using LitElement instead.
>
> If you have a project you've built with an earlier version of the Polymer library, we recommend that you [migrate](#about-polymer-30) to 3.0 for best compatibility with the JavaScript ecosystem. Thanks to the interoperability of Web Components, elements built with Polymer 3.0 and LitElement can be mixed and matched in the same app, so once you have updated your project to Polymer 3.0, you can migrate to LitElement incrementally, one element at a time.  See our blog post on the [Polymer Project roadmap](https://www.polymer-project.org/blog/2018-05-02-roadmap-update.html) for more information.

Polymer lets you build encapsulated, reusable [Web Components](https://www.webcomponents.org/introduction) that work just like standard HTML elements, to use in building web applications.  Using a Web Component built with Polymer is as simple as importing its definition then using it like any other HTML element:

```html
<!-- Import a component -->
<script src="https://unpkg.com/@polymer/paper-checkbox@next/paper-checkbox.js?module" type="module" ></script>

<!-- Use it like any other HTML element -->
<paper-checkbox>Web Components!</paper-checkbox>
```

Web Components are now implemented natively on Safari and Chrome (~70% of installed browsers), and run well on Firefox, Edge, and IE11 using [polyfills](https://github.com/webcomponents/webcomponentsjs).  Read more [below](#overview).

## Getting started

 * The easiest way to try out Polymer is to use one of these online tools:

    * Runs in all [supported](#supported-browsers) browsers: [StackBlitz](https://stackblitz.com/edit/polymer-element-example?file=index.js), [Glitch](https://glitch.com/edit/#!/polymer-element-example?path=index.html)

    * Runs in browsers with [JavaScript Modules](https://caniuse.com/#search=modules): [JSBin](https://jsbin.com/wuxejiz/edit?html,output),
 [CodePen](https://codepen.io/kevinpschaaf/pen/BxdErp?editors=1000).

 * You can also save [this HTML file](https://gist.githubusercontent.com/kevinpschaaf/8a5acbea7b25d2bb5e82eeea2b105669/raw/c3a86872f07603e2d0ddae736687e52a5c8c499f/index.html) to a local file and run it in any browser that supports [JavaScript Modules]((https://caniuse.com/#search=modules)).

 * When you're ready to use Polymer in a project, install it via [npm](https://www.npmjs.com/). To run the project in the browser,
 a module-compatible toolchain is required. We recommend installing the [Polymer CLI](https://github.com/Polymer/tools/tree/master/packages/cli) to and using its development server as follows.

    1. Add Polymer to your project:

        ```npm i @polymer/polymer```

    1. Create an element by extending PolymerElement and calling `customElements.define` with your class (see the examples below).

    1. Install the Polymer CLI:

        ```npm i -g polymer-cli```

    1. Run the development server and open a browser pointing to its URL:

        ```polymer serve --npm```

    > Polymer 3.0 is published on [npm](https://www.npmjs.com/package/@polymer/polymer) using JavaScript Modules.
    This means it can take advantage of the standard native JavaScript module loader available in all current major browsers.
    >
    > However, since Polymer uses npm conventions to reference dependencies by name, a light transform to rewrite specifiers to URLs is required to run in the browser. The polymer-cli's development server `polymer serve`, as well as `polymer build` (for building an optimized app for deployment)  automatically handles this transform.

    Tools like [webpack](https://webpack.js.org/) and [Rollup](https://rollupjs.org/) can also be used to serve and/or bundle Polymer elements.


## Minimal Example

  1. Create a class that extends `PolymerElement`.
  1. Implement a static `properties` getter that describes the element's public property/attribute API
  (these automatically become observed attributes).
  1. Then implement a `template` getter that returns an `HTMLTemplateElement` describing the element's rendering, including encapsulated styling and any property bindings.

```html
  <script src="node_modules/@webcomponents/webcomponents-loader.js"></script>
  <script type="module">
    import {PolymerElement, html} from '@polymer/polymer';

    class MyElement extends PolymerElement {
      static get properties() { return { mood: String }}
      static get template() {
        return html`
          <style> .mood { color: green; } </style>
          Web Components are <span class="mood">[[mood]]</span>!
        `;
      }
    }

    customElements.define('my-element', MyElement);
  </script>

  <my-element mood="happy"></my-element>
```

## Overview

Web components are an incredibly powerful new set of primitives baked into the web platform, and open up a whole new world of possibility when it comes to componentizing front-end code and easily creating powerful, immersive, app-like experiences on the web.

Polymer is a lightweight library built on top of the web standards-based [Web Components](http://webcomponents.org/introduction) APIs, and makes it easier to build your very own custom HTML elements. Creating reusable custom elements - and using elements built by others - can make building complex web applications easier and more efficient.

By being based on the Web Components APIs built in the browser (or [polyfilled](https://github.com/webcomponents/webcomponentsjs) where needed), elements built with Polymer are:

* Built from the platform up
* Self-contained
* Re-usable
* Interoperable across frameworks

Among many ways to leverage custom elements, they can be particularly useful for building reusable UI components. Instead of continually re-building a specific navigation bar or button in different frameworks and for different projects, you can define this element once using Polymer, and then reuse it throughout your project or in any future project.

Polymer provides a declarative syntax to easily create your own custom elements, using all standard web technologies - define the structure of the element with HTML, style it with CSS, and add interactions to the element with JavaScript.

Polymer also provides optional two-way data-binding, meaning:

1. When properties in the model for an element get updated, the element can update itself in response.
2. When the element is updated internally, the changes can be propagated back to the model.

Polymer is designed to be flexible, lightweight, and close to the web platform - the library doesn't invent complex new abstractions and magic, but uses the best features of the web platform in straightforward ways to simply sugar the creation of custom elements.

## About Polymer 3.0

Polymer 3.0 is now released to stable, and introduces a major change to how Polymer is distributed: from HTML Imports on Bower, to JS modules on npm.  Otherwise, the API is almost entirely backward compatible with Polymer 2.0 (the only changes are removing APIs related to HTML Imports like `importHref`, and converting Polymer's API to be module-based rather than globals-based).

Migrating to Polymer 3.0 by hand is mostly mechanical:
* Components should be defined in JS modules instead of in HTML
* Templates should be encoded in JS modules using a `static get template()` getter on PolymerElement subclasses using the `html` tagged template literal function (which parses `HTMLTemplateElement`s out of strings in JS) rather than using `<template>` elements in a `<dom-module>`
* All dependencies should be imported JS module imports rather than HTML Imports.

However, the [`polymer-modulizer`](https://github.com/Polymer/polymer-modulizer) tool automates the vast majority of this migration work.  Please see details on that repo for automated conversion of Polymer 2.0 apps and elements to Polymer 3.0.

👀 **Looking for Polymer v2.x?** Please see the [the v2 branch](https://github.com/Polymer/polymer/tree/2.x).

👀 **Looking for Polymer v1.x?** Please see the [the v1 branch](https://github.com/Polymer/polymer/tree/1.x).

## Contributing

The Polymer team loves contributions from the community! Take a look at our [contributing guide](CONTRIBUTING.md) for more information on how to contribute.  Please file issues on the Polymer issue tracker following the issue template and contributing guide [issues](https://github.com/Polymer/polymer/issues/new).

## Communicating with the Polymer team

Beyond GitHub, we try to have a variety of different lines of communication available:

* [Blog](https://blog.polymer-project.org/)
* [Twitter](https://twitter.com/polymer)
* [Google+ community](https://plus.google.com/communities/115626364525706131031)
* [Mailing list](https://groups.google.com/forum/#!forum/polymer-dev)
* [Slack channel](https://bit.ly/polymerslack)

# License

The Polymer library uses a BSD-like license that is available [here](./LICENSE.txt)

[![Riot logo](https://riot.js.org/img/logo/riot480x.png)](https://riot.js.org)


## Simple and elegant component-based UI library

[![Build Status][travis-image]][travis-url]
[![MIT License][license-image]][license-url]
[![Riot Forum][riot-forum-image]][riot-forum-url]
[![Join the chat at https://gitter.im/riot/riot][gitter-image]][gitter-url]
[![Join the chat (ja) at https://riot-jp-slackin.herokuapp.com/][slack-ja-image]][slack-ja-url]
[![OpenCollective Backers][backer-badge]][backer-url] [![OpenCollective Sponsors][sponsor-badge]][sponsor-url]

[![NPM version][npm-version-image]][npm-url]
[![NPM downloads][npm-downloads-image]][npm-url]
[![jsDelivr Hits][jsdelivr-image]][jsdelivr-url]
[![Coverage Status][coverage-image]][coverage-url]
![Riot Size][lib-size]
[![Code Quality][codeclimate-image]][codeclimate-url]

[![Sauce Test Status][saucelabs-image]][saucelabs-url]

### Framework Size Comparison

| Framework                                      | Version         | Minified Size (gzip) |
|------------------------------------------------|-----------------|----------------------|
| @angular/core + Polyfills                      | 6.0.9           | 141.79kb             |
| Ember                                          | 2.18.2          | 121.84kb             |
| Polymer + Web Components Polyfill Lite         | 1.8.0           | 66.3kb               |
| React + Map and Set Polyfills                  | 16.4.0          | 41.60kb              |
| Web Components Polyfill                        | 0.7.24          | 33.68kb              |
| Vue                                            | 2.5.17          | 31.65kb              |
| __Riot__                                       | 3.12.0          | 10.80kb              |
| Inferno                                        | 5.4.2           | 7.79kb               |
| Preact                                         | 8.3.1           | 3.48kb               |

The above comparison includes polyfills to support old browsers like IE9 that in Riot.js are supported by default

### Browsers support

Riot is supported by all modern browsers and it does not require any additional polyfill

- IE 9+
- Edge
- Chrome
- Safari 7+
- Firefox
- Safari iOS
- Android

### Custom tags • Concise syntax • Simple API • Tiny Size

Riot brings custom tags to all modern browsers. Think React + Polymer but with enjoyable syntax and a small learning curve.

#### Tag definition

``` javascript
<timer>

  <p>Seconds Elapsed: { time }</p>

  this.time = opts.start || 0

  tick() {
    this.update({ time: ++this.time })
  }

  var timer = setInterval(this.tick, 1000)

  this.on('unmount', function() {
    clearInterval(timer)
  })

</timer>
```

[Open this example on Plunker](http://riot.js.org/examples/plunker/?app=timer)

#### Mounting

``` javascript
riot.mount('timer', { start: 0 })
```

#### Nesting

Custom tags lets you build complex views with HTML.

``` html
<timetable>
  <timer start="0"></timer>
  <timer start="10"></timer>
  <timer start="20"></timer>
</timetable>
```

HTML syntax is the de facto language on the web and it's designed for building user interfaces. The syntax is explicit, nesting is inherent to the language and attributes offer a clean way to provide options for custom tags.


### Expressions Bindings
- Absolutely the smallest possible amount of DOM updates and reflows.
- One way data flow: updates and unmounts are propagated downwards from parent to children.
- Expressions are pre-compiled and cached for high performance.
- Lifecycle events for more control.


### Close to standards
- No proprietary event system.
- Event normalization.
- The rendered DOM can be freely manipulated with other tools.
- No extra HTML root elements or `data-` attributes.
- Plays well with any frontend framework.


### Use your dearest language and tools
- Create tags with CoffeeScript, Jade, LiveScript, Typescript, ES6 or [any pre-processor](http://riot.js.org/guide/compiler/#pre-processors) you want.
- Integrate with NPM, CommonJS, AMD, Bower or Component
- Develop with [Gulp](https://github.com/e-jigsaw/gulp-riot), [Grunt](https://github.com/ariesjia/grunt-riot), [Wintersmith](https://github.com/collingreen/wintersmith-riot), [webpack*](https://github.com/riot/tag-loader), [Rollup*](https://github.com/riot/rollup-plugin-riot), [Browserify*](https://github.com/riot/riotify), [Babel*](https://github.com/riot/babel-preset-es2015-riot) or Bublé
- Test with [Karma*](https://github.com/riot/karma-riot), Mocha or whatever you like

*Note*: `*` officially maintained

### CDN hosting
- [jsDelivr](http://www.jsdelivr.com/projects/riot)
- [cdnjs](https://cdnjs.com/libraries/riot)


### Concise syntax
- Power shortcuts: `class={ enabled: is_enabled, hidden: hasErrors() }`.
- No extra brain load such as `render`, `state`, or `constructor`.
- Interpolation: `Add #{ items.length + 1 }` or `class="item { selected: flag }"`
- Compact ES6 method syntax.

### Demos
- [**Riot Examples** - Community's Official](https://github.com/riot/examples)
- [**Riot Animore** - Official Tags Animations Library](https://github.com/riot/animore)
- [Riot Todo MVC](http://todomvc.com/examples/riotjs/)
- [Hackernews reader](http://git.io/riot-hn)
- [Vuejs examples by Riotjs](https://github.com/txchen/feplay/tree/gh-pages/riot_vue)
- [Flux-like ES6 Todo](https://github.com/srackham/riot-todo)
- [Timer](http://jsfiddle.net/gnumanth/h9kuozp5/)
- [Another flux demo comparable to React ones](http://txchen.github.io/feplay/riot_flux)
- [Various experiments](http://richardbondi.net/programming/riot)
- [Isomorphic application](https://github.com/Avnerus/riot-isomorphic)
- [Isomorphic proof of concept](https://github.com/PabloSichert/isomorphic-proof-of-concept)
- [flux-riot todo](http://mingliangfeng.me/flux-riot)
- [Another Riot Todo MVC](http://nippur72.github.io/riotjs-todomvc/#/)
- [Cheft isomorphic by express](https://github.com/cheft/cheft)
- [electron-riot - Riot in an electron application](https://github.com/mike-ward/electron-riot)
- [An express, riot, jade, webpack simple boilerplate](https://github.com/revington/frontend-boilerplate)
- [Riot.js vs React.js comparison of a simple comment box](https://github.com/vitogit/riot.js-vs-react.js-comment-box)
- [Riot Seed project - webpack, routing, ava tests, dispatcher](https://github.com/continuata/riot-seed)
- [Riot-Redux League Table example](https://github.com/drewmiley/PoolLeague)
- [Riot vs React vs Ractive Counters using Redux store](https://github.com/drewmiley/ractive-react-riot-redux-counters-example)

### Books
- [Building Apps with Riot](https://bleedingedgepress.com/building-apps-with-riot/)

### Tutorials
- [Building Apps with Riot, ES6 and Webpack](http://blog.srackham.com/posts/riot-es6-webpack-apps/)
- [Building Apps with Riot, Babel, RiotControl and Webpack](https://github.com/txchen/feplay/tree/gh-pages/riot_webpack)
- [Building tabs with Riot](http://robertwpearce.com/blog/riotjs-example.html)
- [The "React tutorial" for Riot](https://juriansluiman.nl/article/154/the-react-tutorial-for-riot)
- [How to package "tag libraries" in Riot](https://github.com/ivan-saorin/riot-tutorial-tags-pack-app)
- [Another React tutorial with Riot](https://github.com/viliamjr/commentsTuto)
- [Riot Custom Tag by Example](http://www.triplet.fi/blog/riot-custom-tag-by-example/)
- [Riot Compiler Explained](http://www.triplet.fi/blog/riot-compiler-explained/)
- [Adding compiled Riot tags to your Gulp + Browserify build](http://www.triplet.fi/blog/adding_compiled_riot_tags_to_your_gulp_browserify_build/)
- [The anatomy of a tag - a primer tutorial](http://www.marcusoft.net/2015/12/riotjs-anatomy-of-a-tag.html)
- [Using TDD with Riot+mocha+chai](http://vitomd.com/blog/coding/tutorial_tdd_riot_mocha/)
- [The Basics - from ground up to connected tag-networks](http://happy-css.com/lessons/riotjs/)
- [Hello Riot.js : a quick tutorial about this awesome lib](http://vitomd.com/blog/coding/hello-riot-js-quick-tutorial-about-this-awesome-lib/)

### Video Tutorials
- [Introduction](https://www.youtube.com/watch?v=al87U6NgRTc)
- [Loops, Events and Callbacks](https://www.youtube.com/watch?v=T-ZV9dv93sw)
- [Server Rendering with Node & Express](http://youtu.be/6ww1UXGJzcs)
- [Riot And Webpack Setup](https://youtu.be/UgdZbT-KPpY)
- [Riot and Redux - Part 1](https://youtu.be/Y6vpKAGT2-8)
- [Riot and Redux - Part 2](https://youtu.be/DgM03bvgCYc)
- [Riot and Redux - Part 3](https://youtu.be/QuwnbuneAzM)
- [Riot and Redux - Part 4](https://youtu.be/qc6bjtu7KG0)
- [Riot and Redux - Part 5](https://youtu.be/M4BNsRMatVY)
- [Riot and Redux - Part 6](https://youtu.be/jr8KDpwtRsk)


### Libraries / Frameworks
- [Flux- like event controller for Riot](https://github.com/jimsparkman/RiotControl)
- [flux-riot framework](https://github.com/mingliangfeng/flux-riot)
- [Cheftjs - chinese framework for Riot](https://github.com/cheft/cheftjs)
- [Veronica - flux adaption for Riot](https://www.npmjs.com/package/veronica-x)
- [Minimal Flux dispatcher pattern](https://gist.github.com/continuata/c605846751c09a5e94d12ae8c91cbf05)
- [riot-format: a format library for riotjs, like angular $filter](https://github.com/joylei/riot-format)
- [riot-view-router: a simple state based router mixin](https://github.com/neetjn/riot-view-router)
- [riotx - Centralized State Management for riot.js](https://github.com/cam-inc/riotx)
- [storybook for riot.js components <sup>alpha</sup>](https://github.com/storybooks/storybook/tree/master/app/riot)

### Components
- [Material UI](http://kysonic.github.io/riot-mui/)
- [RiotGear Components](https://riotgear.js.org)
- [RiotGear Router](http://riotgear.js.org/components/router/)
- [Riot Bootstrap](http://cognitom.github.io/riot-bootstrap/)
- [iToolkit](https://github.com/BE-FE/iToolkit)
- [Riot Routehandler](https://github.com/crisward/riot-routehandler)-[(Demo)](http://codepen.io/crisward/pen/xwGJpM?editors=101)
- [Riot Flipcard](https://github.com/crisward/riot-flipcard) - [(Demo)](https://crisward.github.io/riot-flipcard/)
- [Riot Grid](https://github.com/crisward/riot-grid) - [(Demo)](http://codepen.io/crisward/pen/rxepMX?editors=101)
- [Riot Grid2](https://github.com/crisward/riot-grid2) - [(Demo)](http://crisward.github.io/riot-grid2/)
- [Riot Subtag](https://github.com/crisward/riot-subtag) - faster than lots of if's
- [ESLint Riot Plugin](https://github.com/txchen/eslint-plugin-riot)
- [riot-animate](https://github.com/sartaj/riot-animate)
- [Nest UI](https://github.com/fengzilong/Nest) - [(Demo)](https://fengzilong.github.io/Nest/)
- [rGrid](https://github.com/limodou/rgrid) - [(Demo)](https://limodou.github.io/rgrid/examples.html)
- [typewriter](https://github.com/amitguptagwl/web-snippets/tree/master/riotjs-components/typewriter) - [(Demo)](http://amitkumargupta.work)

### Resources
- [create-riot-app](https://github.com/alexstep/create-riot-app-ejected) dev environment
- [Riot + AngularJS](https://github.com/lucasbrigida/angular-riot)
- [Module loader for WebPack](https://www.npmjs.com/package/riotjs-loader)
- [Riot + Meteor]( https://atmospherejs.com/baysao/riotjs)
- [Riot Snake Game](http://cdn.rawgit.com/atian25/blog/master/assets/riot-snake.html)
- [Riot Tag Syntax Checker](http://cognitom.github.io/riot-checker/)
- [Riot 文档中译版](https://github.com/Centaur/riotjs_doc_cn) :cn:
- [Riot + Wintersmith](https://github.com/collingreen/wintersmith-riot)
- [Riot precompiler plugin for lineman](https://github.com/Power-Inside/lineman-riot)
- [Riot Startkit - Flux inspired skeleton app + WebPack + PostCSS](https://github.com/wbkd/riotjs-startkit)
- [Yeoman generator - Generator riot mobile](https://www.npmjs.com/package/generator-riot-mobile)
- [Yeoman generator - Generator riot element](https://www.npmjs.com/package/generator-riot-element)
- [Riot for TypeScript](https://github.com/nippur72/RiotTS)
- [Riot loader plugin for RequireJS](https://github.com/amenadiel/requirejs-riot)
- [Riot loader plugin for JSPM/SystemJS](https://github.com/amenadiel/systemjs-riot)
- [RiotJS Style Guide](https://github.com/voorhoede/riotjs-style-guide)
- [Riot Cheatsheet](http://martinmuzatko.github.io/riot-cheatsheet/)

### Performance
- **Riot vs React performance:** [(Riot version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-riot-vs-vanilla) vs [(React version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-react-vs-vanilla)

### Miscellaneous
- [Q&A with RiotJS author Tero Piirainen](http://www.triplet.fi/blog/q-and-a-with-riotjs-author-tero-piirainen/)
- [riot-detector (Chrome Extension)](https://chrome.google.com/webstore/detail/riot-detector/cnnmjeggdmicjojlnjghdgkdlijiobke)

### Editors / Editor Plugins (Syntax highlighting, autcompletion, etc...)
- [riot (Atom Package)](https://atom.io/packages/riot)
- [language-riot-tag (Atom Package)](https://github.com/dekimasoon/language-riot-tag)
  - Based on Vue's official Sublime Text highlighter
  - Note: Designed for html, not jade.
- [sublime-tag (Sublime Text)](https://github.com/crisward/sublime-tag)
- [riot-tag (Visual Studio)](https://github.com/crisward/riot-tag)
- [web-mode (Emacs)](http://web-mode.org)
  - See how to configure [#1967](https://github.com/riot/riot/issues/1967)

### How to contribute

If you are reading this it's already a good sign and we are thankful for it! We try our best working as much as we could on riot but your help is always appreciated.

If you want to contribute to riot helping us maintaining the project please check first the list of [our open issues](https://github.com/riot/riot/issues) to understand whether there is a task where you could help.

Riot is mainly developed on UNIX systems so you will be able to run all the commands necessary to build and test the library using our [Makefile](Makefile). If you are on a Microsoft machine it could be harder to set up you development environment properly.

Following the steps below you should be able to properly submit your patch to the project

#### 1) Clone the repo and browse to the riot folder

```shell
$ git clone git@github.com:riot/riot.git && cd riot
```
#### 2) Set up your git branch

```shell
$ git checkout -b feature/my-awesome-patch
```

#### 3) Install the npm dependencies

```shell
$ npm i
```

#### 4) Build and test riot using the Makefile

```shell
# To build and test riot
$ make riot

# To build without testing
$ make raw

# To build anytime you change a src file
$ make watch

# To bench riot
$ make perf
```

#### 5) Pull request only against the `dev` branch making sure you have read [our pull request template](.github/PULL_REQUEST_TEMPLATE.md)

#### 6) Be patient


### Credits

Riot is made with :heart: by many smart people from all over the world. Thanks to all the contributors<br>
It's actively maintained by:
<table>
  <tbody>
    <tr>
      <td valign="top">
        <img width="125" height="125" src="https://github.com/GianlucaGuarini.png?s=125?s=125">
        <br>
        <a href="https://github.com/GianlucaGuarini">Gianluca Guarini</a>
      </td>
     </tr>
  </tbody>
</table>

## Official Website

http://riot.js.org

## Backers

Support us with a monthly donation and help us continue our activities. [Become a backer][support-url]

[![Backers][backers-image]][support-url]

## Sponsors

Become a sponsor to get your logo on our README. [Become a sponsor][support-url]

[![Sponsors][sponsors-image]][support-url]

## Thanks

Special thanks to Browserstack for their support

<a href='https://www.browserstack.com/'>
  <img width='70px' src="https://cdn.worldvectorlogo.com/logos/browserstack.svg" alt="browser stack">
</a>

[travis-image]:https://img.shields.io/travis/riot/riot.svg?style=flat-square
[travis-url]:https://travis-ci.org/riot/riot

[license-image]:http://img.shields.io/badge/license-MIT-000000.svg?style=flat-square
[license-url]:LICENSE.txt

[npm-version-image]:http://img.shields.io/npm/v/riot.svg?style=flat-square
[npm-downloads-image]:http://img.shields.io/npm/dm/riot.svg?style=flat-square
[npm-url]:https://npmjs.org/package/riot

[riot-forum-image]:https://img.shields.io/badge/muut-JOIN_FORUM%E2%86%92-ff0044.svg?style=flat-square
[riot-forum-url]:http://riot.js.org/forum/

[coverage-image]:https://img.shields.io/coveralls/riot/riot/dev.svg?style=flat-square
[coverage-url]:https://coveralls.io/r/riot/riot?branch=dev

[saucelabs-image]:https://saucelabs.com/browser-matrix/testsriotjs.svg?1
[saucelabs-url]:https://saucelabs.com/u/testsriotjs

[gitter-image]:https://img.shields.io/badge/GITTER-JOIN_CHAT_%E2%86%92-1dce73.svg?style=flat-square
[gitter-url]:https://gitter.im/riot/riot?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge

[slack-ja-image]:https://img.shields.io/badge/SLACK_(ja)-JOIN_CHAT_%E2%86%92-551a8b.svg?style=flat-square
[slack-ja-url]:https://riot-jp-slackin.herokuapp.com/

[codeclimate-image]:https://api.codeclimate.com/v1/badges/b81ddf3c77e8189876da/maintainability
[codeclimate-url]:https://codeclimate.com/github/riot/riot

[donations-campaign-url]:https://pledgie.com/campaigns/31139
[donations-campaign-image]:https://pledgie.com/campaigns/31139.png?skin_name=chrome

[jsdelivr-image]: https://data.jsdelivr.com/v1/package/npm/riot/badge
[jsdelivr-url]: https://www.jsdelivr.com/package/npm/riot


[backer-url]: #backers
[backer-badge]: https://opencollective.com/riot/backers/badge.svg?color=blue
[sponsor-url]: #sponsors
[sponsor-badge]: https://opencollective.com/riot/sponsors/badge.svg?color=blue

[support-url]: https://opencollective.com/riot#support

[lib-size]: http://img.badgesize.io/https://unpkg.com/riot/riot.min.js?compression=gzip

[backers-image]: https://opencollective.com/riot/backers.svg
[sponsors-image]: https://opencollective.com/riot/sponsors.svg
# Spine
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/spine/spine?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://secure.travis-ci.org/spine/spine.svg)](http://travis-ci.org/spine/spine)

Spine is a lightweight MVC library for building JavaScript web applications. Spine gives you structure and then gets out of your way, allowing you to concentrate on the fun stuff: building awesome web applications.

Spine is opinionated in its approach to web application architecture and design. Spine's architecture complements patterns such as de-coupled components and CommonJS modules, markedly helping with code quality and maintainability.

The library is written in [CoffeeScript](http://coffeescript.org), and though it doesn't necessarily require CoffeeScript to develop applications - you can use whichever language you're most familiar with or prefer - the documentation and some associated tools like [Hem](https://github.com/spine/hem) and [spine.app](https://github.com/spine/spine.app) cater to those who prefer CoffeeScript's syntax.

## Learn it

Documentation is often incomplete or just lies waiting to happen. Approachable source code reduces knowledge dependencies. This is an area where Spine really excells compared to other MVC frameworks. Spine is tiny; the core library comes in at less than 700 lines of CoffeeScript code. It is written in such a way to prefer readability over terseness or clever tricks, and it is small enough that within a rather small timeframe you can understand how all the pieces work together. Expertise is achievable within days or weeks rather than months or years. For these reasons, remaining lightweight and simple is fundamental to Spine.

For documentation, usage, and examples, see: [spinejs.com](http://spinejs.com)

The test suite can also occasionally provide additional useful examples, especially if you are looking for non-coffeescript examples.

# Contributing

## Reporting issues

To file a bug report, please visit the [GitHub issues page](https://github.com/spine/spine/issues).  It's great if you can attach code (test cases and fixes for bugs, and test cases and a proposed implementation for features), but reproducible bug reports are also welcome. 

For support or help with using spine please use the [Spine Google Group](https://groups.google.com/forum/#!forum/spinejs) and/or StackOverflow rather than opening an issue on Github. If you post in those places you are more likely to get more people to chime in, and others can benefit from it more readily.

## Cloning master and running the test suite

To get started contributing to Spine, first clone the repository and make sure you can run the test suite.  If you're not familiar with Git, visit the [Git homepage](http://git-scm.com) to download Git for your platform.

First, clone the repository:

```
$ git clone git://github.com/spine/spine.git
$ cd spine
```

Next, You will need node and npm to pull in the testing libraries. Once you're all set with those then from within the Spine repo directory run 

```
$ npm install .
```

This should bring in [Jasmine](http://jasmine.github.io/), Coffeescript, and a minimalist local server for running the tests a browser. You can also simply open `test/index.html` in a browser to run the [Jasmine](http://jasmine.github.io/) test suite for spine core.  If you see all the tests passing, you're ready to contribute! A known issue is that some of the routing tests will fail if you are simply using a `file://` protocol in the browser. This has to do with browser security. You can avoid this by running the local server, `$ npm start`. Alternatively you can use a server like Apache or Nginx to serve the test files to the browser. 

If you have [phantom.js](http://phantomjs.org/) available then a script is included to make running tests even slicker!

```
$ npm test
```

## Contributing to the Spine documentation

Perhaps the easiest way to get started with contributing is through the docs.  If you find typos, bugs, or omissions in the docs, please submit a pull request to fix.  The Spine website [spinejs.com](http://spinejs.com), which is the primary documentation, is a very simple rails app [spine.site](https://github.com/spine/spine.site). You don't need to know Rails or Ruby to contribute. The vast majority of it is in Markdown

## Contributing to the Spine code

This recommended contribution process is based on the [Ruby on Rails contribution guide](http://edgeguides.rubyonrails.org/contributing_to_ruby_on_rails.html#contributing-to-the-rails-code).  In general, please include tests with new features or bugfixes, work in a feature branch until you're ready to submit or discuss your code, then fork the repository, push to your fork, and issue a pull request.

### CoffeeScript

When submitting a pull request for code, please submit in CoffeeScript. Building the effected js files is required for testing sake, but submitting those js files is optional.

Assuming you have Node.js and npm already installed then proceed by installing local dev dependencies:

```
$ npm install .
```

Then use the provided build scripts to compile your CoffeeScript files:

```
$ cake build
$ cake watch
```

These tasks use a locally installed copy of CoffeeScript to ensure all contributors use the same version of the compiler.

### Git

Let's say I'm going to submit a patch to add someFeatureFix:

```
$ git checkout dev
```

Feature branches should start from `dev` **not** `master`. If you branch off of, or do builds on the master branch you will get CoffeeScript source map files, which are cool, but tend to ruin automatic merges with git.

```
$ git checkout -b someFeatureFix
$ vim test/...
  # (...add tests...)
$ cake watch
  # (...this should recompile and changes you make in your CoffeeScript...)

-- figure out what spine module your changes belong in
$ vim src/spine.coffee
or
$ vim src/[otherSpineComponent].coffee
  # (...add the feature/fix...)
$ open test/index.html
  # (...make sure tests run for each component that was changed...)
  # (...test in other browsers with various jquery versions if you feel like there is risk... )
$ git commit -m "Add Some Feature Fix"
```

Then, [fork the Spine repository](https://github.com/spine/spine/fork), and push your branch to your fork:

```
$ git remote add <your user name> git@github.com:<your user name>/spine.git
$ git push <your user name> someFeatureFix
```

Finally, issue a pull request from inside the GitHub interface to the `dev` branch of spine, and your contribution is ready for consideration, discussion, and (hopefully) merging in!
# ![TodoMVC](media/logo.png)

> Helping you select an MV\* framework

### [Website](http://todomvc.com)&nbsp;&nbsp;&nbsp;&nbsp;[Blog](http://blog.tastejs.com)&nbsp;&nbsp;&nbsp;&nbsp;[TasteJS](http://tastejs.com)

[![Build Status](https://travis-ci.org/tastejs/todomvc.svg)](https://travis-ci.org/tastejs/todomvc)
[![Cypress.io tests](https://img.shields.io/badge/cypress.io-tests-green.svg?style=flat-square)](https://dashboard.cypress.io/#/projects/n4ynap/runs)

Developers these days are spoiled with choice when it comes to selecting an MV\* framework for structuring and organizing JavaScript web apps.

Backbone, Ember, AngularJS... the list of new and stable solutions goes on and on, but just how do you decide on which to use in a sea of so many options?

To help solve this problem, we created TodoMVC - a project which offers the same Todo application implemented using MV* concepts in most of the popular JavaScript MV\* frameworks of today.


## Team

TodoMVC would not be possible without a strong team of [contributors](https://github.com/tastejs/todomvc/contributors) helping push the project forward each day. Additionally, we have a core project team composed of:

#### [Addy Osmani](https://github.com/addyosmani) - Founder/Lead

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/96270e4c3e5e9806cf7245475c00b275.png?s=40">
  Addy is a Software Engineer at Google who originally created TodoMVC. He oversees the project direction, maintenance and organizes the planning and development efforts of the team.

#### [Sindre Sorhus](https://github.com/sindresorhus) - Lead Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9.png?s=40">
Sindre is a Web Developer who leads core development, quality control and application design for the project. His engineering contributions have helped us ensure consistency and best practices are enforced wherever possible. Sindre also leads up development of the TodoMVC application spec.

#### [Pascal Hartig](https://github.com/passy) - Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/be451fcdbf0e5ff07f23ed16cb5c90a3.png?s=40">
Pascal is a Software Engineer at Twitter with a deep passion for consistency. He watches pull requests and helps developers getting their contributions integrated with TodoMVC.

#### [Stephen Sawchuk](https://github.com/stephenplusplus) - Developer

<img align="left" width="40" height="40" src="https://avatars3.githubusercontent.com/u/723048?v=2&s=40">
Stephen is a Front-end Engineer at Quicken Loans that cares about improving the maintainability and developer experience of open-source projects. His recent contributions include helping us move all apps over to using Bower and implementing the new information bar.

#### [Colin Eberhardt](https://github.com/colineberhardt) - Developer

<img align="left" width="40" height="40" src="https://secure.gravatar.com/avatar/73bba00b41ff1c9ecc3ee29487bace7d?s=40">
Colin is a software consultant at Scott Logic who is passionate about all software - from JavaScript to Java, and C# to Objective-C. His recent contribution to the project has been a fully automated test suite.

#### [Sam Saccone](https://github.com/samccone) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/userimage/602125/f2f1d93164ec62b527f0398c65b2d1f3.jpg?size=40">
Sam is a Software Engineer at Google who is driven by an endless desire to create, solve problems, and improve developers' lives.

#### [Arthur Verschaeve](https://github.com/arthurvr) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/avatar/e34daab0d2e344219adb5234198269c5?size=40">
Arthur is an open-source fanboy from Belgium. He is passionate about developer tooling and all things JavaScript.

#### [Fady Samir Sadek](https://github.com/FadySamirSadek) - Developer

<img align="left" width="40" height="40" src="https://avatars2.githubusercontent.com/u/7483806?s=40&u=99b3958687789735c12cf736332361a06b951355&v=4">
Fady is a front-end developer who loves all things JavaScript and enjoys solving real world problems using the web platform and helping other developers do the same. He currently leads maintenance of the project and ensures that the project is friendly for new contributors and upcoming developers.

#### [Gianni Chiappetta](https://github.com/gf3) - Logo designer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/4b0209ae3652cc5a7d53545e759fbe39.png?s=40">
Gianni is a programmer and designer currently working as the Chief Rigger at MetaLab.

## Disclaimer

<img align="right" width="230" height="230" src="media/icon-small.png">

TodoMVC has been called many things including the 'Speed-dating' and 'Rosetta Stone' of MV\* frameworks. Whilst we hope that this project can offer assistance in deciding what frameworks are worth spending more time looking at, remember that the Todo application offers a limited view of a framework's potential capability.

It is meant to be used as a gateway to reviewing how a basic application using a framework may be structured, and we heavily recommend investing time researching a solution in more depth before opting to use it.

Also, please keep in mind that TodoMVC is not the perfect way to compare the size of different frameworks. We intentionally use the unminified versions to make reading the source code easier.


## Getting Involved

Whilst we enjoy implementing and improving existing Todo apps, we're always interested in speaking to framework authors (and users) wishing to share Todo app implementations in their framework/solution of choice.

Check out our [contribution docs](contributing.md) for more info.


## License

Everything in this repo is MIT License unless otherwise specified.

[MIT](license.md) © Addy Osmani, Sindre Sorhus, Pascal Hartig, Stephen Sawchuk.
<p align="center"><a href="https://vuejs.org" target="_blank"><img width="100"src="https://vuejs.org/images/logo.png"></a></p>

<p align="center">
  <a href="https://circleci.com/gh/vuejs/vue/tree/dev"><img src="https://img.shields.io/circleci/project/vuejs/vue/dev.svg" alt="Build Status"></a>
  <a href="https://codecov.io/github/vuejs/vue?branch=dev"><img src="https://img.shields.io/codecov/c/github/vuejs/vue/dev.svg" alt="Coverage Status"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/dm/vue.svg" alt="Downloads"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/v/vue.svg" alt="Version"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/l/vue.svg" alt="License"></a>
  <a href="https://chat.vuejs.org/"><img src="https://img.shields.io/badge/chat-on%20discord-7289da.svg" alt="Chat">
  <br>
  <a href="https://saucelabs.com/u/vuejs"><img src="https://saucelabs.com/browser-matrix/vuejs.svg" alt="Sauce Test Status"></a>
</p>

<h2 align="center">Supporting Vue.js</h2>

Vue.js is an MIT-licensed open source project. It's an independent project with its ongoing development made possible entirely thanks to the support by these awesome [backers](https://github.com/vuejs/vue/blob/dev/BACKERS.md). If you'd like to join them, please consider:

- [Become a backer or sponsor on Patreon](https://www.patreon.com/evanyou).
- [Become a backer or sponsor on OpenCollective](https://opencollective.com/vuejs).

#### What's the difference between Patreon and OpenCollective?

Funds donated via Patreon goes directly to support Evan You's full-time work on Vue.js. Funds donated via OpenCollective are managed with transparent expenses and will be used for compensating work and expenses by core team members or sponsoring community events. Your name/logo will receive proper recognition and exposure by donating on either platform.

<h3 align="center">Sponsors via Patreon</h3>

<h4 align="center">Platinum</h4>

<p align="center">
  <a href="https://stdlib.com">
    <img width="240px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/stdlib.png">
  </a>
  <br><br>
  <a href="https://xiaozhuanlan.com">
    <img width="160px" src="https://raw.githubusercontent.com/vuejs/cn.vuejs.org/master/themes/vue/source/images/xiaozhuanlan.png">
  </a>
</p>

<h4 align="center">Gold</h4>

<table>
  <tbody>
    <tr>
      <td align="center" valign="middle">
        <a href="https://deepstreamhub.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/deepstream.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://jsfiddle.net/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/jsfiddle.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://laravel.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/laravel.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://chaitin.cn/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/chaitin.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://htmlburger.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/htmlburger.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://starter.someline.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/someline.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="http://monterail.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/monterail.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.2mhost.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/2mhost.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://vuejsjob.com/?ref=vuejs" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/vuejobs.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://leanpub.com/vuejs2" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tmvuejs2.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://component.io/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/component_io.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.v2ex.com/t/379389" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/v2exer.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="https://www.xfive.co/" target="_blank">
          <img width="80px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/xfive.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://www.frontenddevelopermeetups.com/" target="_blank">
          <img width="160px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/frontend-meetups.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://onsen.io/vue/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/onsen-ui.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://tooltwist.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tooltwist.png">
        </a>
      </td>
    </tr>
  </tbody>
</table>

<h3 align="center">Sponsors via OpenCollective</h3>

<h4 align="center">Platinum</h4>

<a href="https://opencollective.com/vuejs/platinumsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/platinumsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/1/avatar.svg"></a>

<h4 align="center">Gold</h4>

<a href="https://opencollective.com/vuejs/goldsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/bronzesponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/bronzesponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/2/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/2/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/3/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/3/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/4/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/4
  /avatar.svg"></a>

---

## Introduction

Vue (pronounced `/vjuː/`, like view) is a **progressive framework** for building user interfaces. It is designed from the ground up to be incrementally adoptable, and can easily scale between a library and a framework depending on different use cases. It consists of an approachable core library that focuses on the view layer only, and an ecosystem of supporting libraries that helps you tackle complexity in large Single-Page Applications.

#### Browser Compatibility

Vue.js supports all browsers that are [ES5-compliant](http://kangax.github.io/compat-table/es5/) (IE8 and below are not supported).

## Ecosystem

| Project | Status | Description |
|---------|--------|-------------|
| [vue-router]          | [![vue-router-status]][vue-router-package] | Single-page application routing |
| [vuex]                | [![vuex-status]][vuex-package] | Large-scale state management |
| [vue-cli]             | [![vue-cli-status]][vue-cli-package] | Project scaffolding |
| [vue-loader]          | [![vue-loader-status]][vue-loader-package] | Single File Component (`*.vue` file) loader for webpack |
| [vue-server-renderer] | [![vue-server-renderer-status]][vue-server-renderer-package] | Server-side rendering support |
| [vue-class-component] | [![vue-class-component-status]][vue-class-component-package] | TypeScript decorator for a class-based API |
| [vue-rx]              | [![vue-rx-status]][vue-rx-package] | RxJS integration |
| [vue-devtools]        | [![vue-devtools-status]][vue-devtools-package] | Browser DevTools extension |

[vue-router]: https://github.com/vuejs/vue-router
[vuex]: https://github.com/vuejs/vuex
[vue-cli]: https://github.com/vuejs/vue-cli
[vue-loader]: https://github.com/vuejs/vue-loader
[vue-server-renderer]: https://github.com/vuejs/vue/tree/dev/packages/vue-server-renderer
[vue-class-component]: https://github.com/vuejs/vue-class-component
[vue-rx]: https://github.com/vuejs/vue-rx
[vue-devtools]:  https://github.com/vuejs/vue-devtools

[vue-router-status]: https://img.shields.io/npm/v/vue-router.svg
[vuex-status]: https://img.shields.io/npm/v/vuex.svg
[vue-cli-status]: https://img.shields.io/npm/v/vue-cli.svg
[vue-loader-status]: https://img.shields.io/npm/v/vue-loader.svg
[vue-server-renderer-status]: https://img.shields.io/npm/v/vue-server-renderer.svg
[vue-class-component-status]: https://img.shields.io/npm/v/vue-class-component.svg
[vue-rx-status]: https://img.shields.io/npm/v/vue-rx.svg
[vue-devtools-status]: https://img.shields.io/chrome-web-store/v/nhdogjmejiglipccpnnnanhbledajbpd.svg

[vue-router-package]: https://npmjs.com/package/vue-router
[vuex-package]: https://npmjs.com/package/vuex
[vue-cli-package]: https://npmjs.com/package/vue-cli
[vue-loader-package]: https://npmjs.com/package/vue-loader
[vue-server-renderer-package]: https://npmjs.com/package/vue-server-renderer
[vue-class-component-package]: https://npmjs.com/package/vue-class-component
[vue-rx-package]: https://npmjs.com/package/vue-rx
[vue-devtools-package]: https://chrome.google.com/webstore/detail/vuejs-devtools/nhdogjmejiglipccpnnnanhbledajbpd

## Documentation

To check out live examples and docs, visit [vuejs.org](https://vuejs.org).

## Questions

For questions and support please use the [the official forum](http://forum.vuejs.org) or [community chat](https://chat.vuejs.org/). The issue list of this repo is **exclusively** for bug reports and feature requests.

## Issues

Please make sure to read the [Issue Reporting Checklist](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md#issue-reporting-guidelines) before opening an issue. Issues not conforming to the guidelines may be closed immediately.

## Changelog

Detailed changes for each release are documented in the [release notes](https://github.com/vuejs/vue/releases).

## Stay In Touch

- [Twitter](https://twitter.com/vuejs)
- [Blog](https://medium.com/the-vue-point)
- [Job Board](https://vuejobs.com/?ref=vuejs)

## Contribution

Please make sure to read the [Contributing Guide](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md) before making a pull request. If you have a Vue-related project/component/tool, add it with a pull-request to [this curated list](https://github.com/vuejs/awesome-vue)!

Thank you to all the people who already contributed to Vue!

<a href="https://github.com/vuejs/vue/graphs/contributors"><img src="https://opencollective.com/vuejs/contributors.svg?width=890" /></a>


## License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2013-present, Yuxi (Evan) You
[![Build Status](https://travis-ci.org/angular/angular.svg?branch=master)](https://travis-ci.org/angular/angular)
[![CircleCI](https://circleci.com/gh/angular/angular/tree/master.svg?style=shield)](https://circleci.com/gh/angular/angular/tree/master)
[![BrowserStack Status](https://www.browserstack.com/automate/badge.svg?badge_key=LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)](https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)
[![Join the chat at https://gitter.im/angular/angular](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/angular/angular?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![npm version](https://badge.fury.io/js/%40angular%2Fcore.svg)](https://www.npmjs.com/@angular/core)


# Angular

Angular is a development platform for building mobile and desktop web applications using Typescript/JavaScript and other languages.

## Quickstart

[Get started in 5 minutes][quickstart].


## Changelog

[Learn about the latest improvements][changelog]. 


## Want to help?

Want to file a bug, contribute some code, or improve documentation? Excellent! Read up on our
guidelines for [contributing][contributing] and then check out one of our issues in the [hotlist: community-help](https://github.com/angular/angular/labels/hotlist%3A%20community-help).

[browserstack]: https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06
[contributing]: https://github.com/angular/angular/blob/master/CONTRIBUTING.md
[quickstart]: https://angular.io/guide/quickstart
[changelog]: https://github.com/angular/angular/blob/master/CHANGELOG.md
[ng]: https://angular.io
# aurelia-framework

[![npm Version](https://img.shields.io/npm/v/aurelia-framework.svg)](https://www.npmjs.com/package/aurelia-framework)
[![ZenHub](https://raw.githubusercontent.com/ZenHubIO/support/master/zenhub-badge.png)](https://zenhub.io)
[![Join the chat at https://gitter.im/aurelia/discuss](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/aurelia/discuss?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![CircleCI](https://circleci.com/gh/aurelia/framework.svg?style=shield)](https://circleci.com/gh/aurelia/framework)

This library is part of the [Aurelia](http://www.aurelia.io/) platform and contains the aurelia framework which brings together all the required core aurelia libraries into a ready-to-go application-building platform.

> To keep up to date on [Aurelia](http://www.aurelia.io/), please visit and subscribe to [the official blog](http://blog.aurelia.io/) and [our email list](http://eepurl.com/ces50j). We also invite you to [follow us on twitter](https://twitter.com/aureliaeffect). If you have questions look around our [Discourse forums](https://discourse.aurelia.io/), chat in our [community on Gitter](https://gitter.im/aurelia/discuss) or use [stack overflow](http://stackoverflow.com/search?q=aurelia). Documentation can be found [in our developer hub](http://aurelia.io/docs). If you would like to have deeper insight into our development process, please install the [ZenHub](https://zenhub.io) Chrome or Firefox Extension and visit any of our repository's boards.

## Documentation

You can read the documentation for the aurelia framework [here](http://aurelia.io/docs). If you would like to help improve this documentation, the source for many of the docs can be found in the doc folder within this repository. Other docs, not related to the general framework, but directed at specific libraries, can be found in the doc folder of those libraries.

## Platform Support

This library can be used in the **browser** only.

## Building The Code

To build the code, follow these steps.

1. Ensure that [NodeJS](http://nodejs.org/) is installed. This provides the platform on which the build tooling runs.
2. From the project folder, execute the following command:

  ```shell
  npm install
  ```
3. Ensure that [Gulp](http://gulpjs.com/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g gulp
  ```
4. To build the code, you can now run:

  ```shell
  gulp build
  ```
5. You will find the compiled code in the `dist` folder, available in three module formats: AMD, CommonJS and ES6.

6. See `gulpfile.js` for other tasks related to generating the docs and linting.

## Running The Tests

To run the unit tests, first ensure that you have followed the steps above in order to install all dependencies and successfully build the library. Once you have done that, proceed with these additional steps:

1. Ensure that the [Karma](http://karma-runner.github.io/) CLI is installed. If you need to install it, use the following command:

  ```shell
  npm install -g karma-cli
  ```
2. Ensure that [jspm](http://jspm.io/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g jspm
  ```
3. Install the client-side dependencies with jspm:

  ```shell
  jspm install
  ```

4. You can now run the tests with this command:

  ```shell
  karma start
  ```
dojo
====

This is the foundation package for the Dojo 1 Toolkit.  While still being maintained, new development is primarily focused on modern Dojo.

Checkout the [Dojo framework website](https://dojo.io/) or if you want a more detailed technical status and overview, checkout the [`Dojo roadmap`](https://dojo.io/community/).

This package is sometimes
referred to as the “core”, it contains the most generally applicable sub-packages
and modules. The dojo package covers a wide range of functionality like Ajax, DOM
manipulation, class-type programming, events, promises, data stores,
drag-and-drop and internationalization libraries.

Installing
----------

Installation instructions are available at
[dojotoolkit.org/download](<http://dojotoolkit.org/download/>).

Getting Started
---------------

If you are starting out with Dojo, the following resources are available to you:

-   [Tutorials](<http://dojotoolkit.org/documentation/>)

-   [Reference Guide](<http://dojotoolkit.org/reference-guide/>)

-   [API Documentation](<http://dojotoolkit.org/api/>)

-   [Community Forum](<http://dojotoolkit.org/community/>)

What to Use Dojo For and When to Use It
---------------------------------------

The following is a brief sampling of some of the areas where Dojo may prove to
be the right tool for your next project:

-   For keeping your code fast and maintainable, Dojo offers an asynchronous
    module definition (AMD) loader -- encapsulating pieces of code into useful
    units, loading small JavaScript files only when they are needed, and loading
    files separately even when they are dependent on one another.

-   When you want to easily extend existing classes, share functionality among a
    number of classes, and maximize code reuse, Dojo provides class-like
    inheritance and “mixins.”

-   For creating advanced and customizable user interfaces out of refined,
    efficient, and modular pieces, Dojo’s Dijit framework offers several dozen
    enterprise-ready widgets -- including buttons, textboxes, form widgets with
    built-in validation, layout elements, and much more -- along with themes to
    lend them a consistent look. All of this is available for mobile
    environments as well.

-   For working with advanced vector graphics, Dojo’s GFX API can render
    graphics in a wide variety of formats, with support for seamless
    manipulation (skewing, rotating, resizing), gradients, responding to mouse
    events, and more.

-   The `dojox/charting` library supports powerful data visualization and
    dynamic charting, including a variety of 2D plots and animated charting
    elements.

-   When you need feature-rich, lightweight, and mobile-friendly grids/tables,
    Dojo offers the `dgrid` widget, along with customizable default themes and
    accompanying features such as in-cell editing, row/cell selection, column
    resizing/reordering, keyboard handling, pagination, and more.

-   Dojo is the officially supported framework for the ArcGIS API for
    JavaScript, one of the most widely used enterprise-grade APIs for web
    mapping and spatial analysis -- learning to use Dojo will open doors to
    creating richer web mapping applications using that API.

License and Copyright
---------------------

The Dojo Toolkit (including this package) is dual licensed under BSD 3-Clause
and AFL. For more information on the license please see the [License
Information](<http://dojotoolkit.org/license>). The Dojo Toolkit is Copyright
(c) 2005-2018, JS Foundation. All rights reserved.
<p align="center">
  <a href="https://emberjs.com"><img width="300" src="https://raw.githubusercontent.com/emberjs/website/master/source/images/brand/ember_Ember-Light.png"></a>
</p>

<p align="center">
  <a href="http://travis-ci.org/emberjs/ember.js"><img src="https://secure.travis-ci.org/emberjs/ember.js.svg?branch=master" alt="Build Status"></a>
  <a href="https://codeclimate.com/github/emberjs/ember.js"><img src="https://codeclimate.com/github/emberjs/ember.js.svg" alt="Code Climate"></a>
  <a href="https://discord.gg/zT3asNS"><img src="https://img.shields.io/discord/480462759797063690.svg?logo=discord" alt="Discord Community Server"></a>
</p>

Ember.js is a JavaScript framework that greatly reduces the time, effort and resources needed
to build any web application. It is focused on making you, the developer, as productive as possible by doing all the common, repetitive, yet essential, tasks involved in most web development projects.

Ember.js also provides access to the most advanced features of JavaScript, HTML and the Browser giving you everything you need to create your next killer web app.

- [Website](https://emberjs.com)
- [Guides](https://guides.emberjs.com)
- [API](https://emberjs.com/api)
- [Community](https://emberjs.com/community)
- [Blog](https://emberjs.com/blog)
- [Builds](https://emberjs.com/builds)

# Contribution

See [CONTRIBUTING.md](https://github.com/emberjs/ember.js/blob/master/CONTRIBUTING.md)

---

Cross-browser testing provided by:

<a href="http://browserstack.com"><img height="70" src="https://p3.zdusercontent.com/attachment/1015988/PWfFdN71Aung2evRkIVQuKJpE?token=eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0..aUrNFb8clSXsFwgw5BUTcg.IJr5piuCen7PmSSBHSrOnqM9K5YZfxX3lvbp-5LCqoKOi4CjjgdA419iqjofs0nLtm26FMURvZ8JRTuKB4iHer6lGu5f8dXHtIkYAHjP5fXDWkl044Yg2mSdrhF6uPy62GdlBYoYxwvgkNrac8nN_In8GY-qOC7bYmlZyJT7tsTZUTYbNMQiXS86YA5LgdCEWzWreMvc3C6cvZtVXIrcVgpkroIhvsTQPm4vQA-Uq6iCbTPA4oX5cpEtMtrlg4jYBnnAE4BTw5UwU_dY83ep5g.7wpc1IKv0rSRGsvqCG_q3g" alt="BrowserStack"></a>
# [React](https://reactjs.org/) &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/facebook/react/blob/master/LICENSE) [![npm version](https://img.shields.io/npm/v/react.svg?style=flat)](https://www.npmjs.com/package/react) [![Coverage Status](https://img.shields.io/coveralls/facebook/react/master.svg?style=flat)](https://coveralls.io/github/facebook/react?branch=master) [![CircleCI Status](https://circleci.com/gh/facebook/react.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/facebook/react) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://reactjs.org/docs/how-to-contribute.html#your-first-pull-request)

React is a JavaScript library for building user interfaces.

* **Declarative:** React makes it painless to create interactive UIs. Design simple views for each state in your application, and React will efficiently update and render just the right components when your data changes. Declarative views make your code more predictable, simpler to understand, and easier to debug.
* **Component-Based:** Build encapsulated components that manage their own state, then compose them to make complex UIs. Since component logic is written in JavaScript instead of templates, you can easily pass rich data through your app and keep state out of the DOM.
* **Learn Once, Write Anywhere:** We don't make assumptions about the rest of your technology stack, so you can develop new features in React without rewriting existing code. React can also render on the server using Node and power mobile apps using [React Native](https://facebook.github.io/react-native/).

[Learn how to use React in your own project](https://reactjs.org/docs/getting-started.html).

## Installation

React has been designed for gradual adoption from the start, and **you can use as little or as much React as you need**:

* Use [Online Playgrounds](https://reactjs.org/docs/getting-started.html#online-playgrounds) to get a taste of React.
* [Add React to a Website](https://reactjs.org/docs/add-react-to-a-website.html) as a `<script>` tag in one minute.
* [Create a New React App](https://reactjs.org/docs/create-a-new-react-app.html) if you're looking for a powerful JavaScript toolchain.

You can use React as a `<script>` tag from a [CDN](https://reactjs.org/docs/cdn-links.html), or as a `react` package on [npm](https://www.npmjs.com/).

## Documentation

You can find the React documentation [on the website](https://reactjs.org/docs).  

Check out the [Getting Started](https://reactjs.org/docs/getting-started.html) page for a quick overview.

The documentation is divided into several sections:

* [Tutorial](https://reactjs.org/tutorial/tutorial.html)
* [Main Concepts](https://reactjs.org/docs/hello-world.html)
* [Advanced Guides](https://reactjs.org/docs/jsx-in-depth.html)
* [API Reference](https://reactjs.org/docs/react-api.html)
* [Where to Get Support](https://reactjs.org/community/support.html)
* [Contributing Guide](https://reactjs.org/docs/how-to-contribute.html)

You can improve it by sending pull requests to [this repository](https://github.com/reactjs/reactjs.org).

## Examples

We have several examples [on the website](https://reactjs.org/). Here is the first one to get you started:

```jsx
class HelloMessage extends React.Component {
  render() {
    return <div>Hello {this.props.name}</div>;
  }
}

ReactDOM.render(
  <HelloMessage name="Taylor" />,
  document.getElementById('container')
);
```

This example will render "Hello Taylor" into a container on the page.

You'll notice that we used an HTML-like syntax; [we call it JSX](https://reactjs.org/docs/introducing-jsx.html). JSX is not required to use React, but it makes code more readable, and writing it feels like writing HTML. If you're using React as a `<script>` tag, read [this section](https://reactjs.org/docs/add-react-to-a-website.html#optional-try-react-with-jsx) on integrating JSX; otherwise, the [recommended JavaScript toolchains](https://reactjs.org/docs/create-a-new-react-app.html) handle it automatically.

## Contributing

The main purpose of this repository is to continue to evolve React core, making it faster and easier to use. Development of React happens in the open on GitHub, and we are grateful to the community for contributing bugfixes and improvements. Read below to learn how you can take part in improving React.

### [Code of Conduct](https://code.facebook.com/codeofconduct)

Facebook has adopted a Code of Conduct that we expect project participants to adhere to. Please read [the full text](https://code.facebook.com/codeofconduct) so that you can understand what actions will and will not be tolerated.

### [Contributing Guide](https://reactjs.org/contributing/how-to-contribute.html)

Read our [contributing guide](https://reactjs.org/contributing/how-to-contribute.html) to learn about our development process, how to propose bugfixes and improvements, and how to build and test your changes to React.

### Good First Issues

To help you get your feet wet and get you familiar with our contribution process, we have a list of [good first issues](https://github.com/facebook/react/labels/good%20first%20issue) that contain bugs which have a relatively limited scope. This is a great place to get started.

### License

React is [MIT licensed](./LICENSE).
     ____                     __      __
    /\  _`\                  /\ \    /\ \                                   __
    \ \ \ \ \     __      ___\ \ \/'\\ \ \____    ___     ___      __      /\_\    ____
     \ \  _ <'  /'__`\   /'___\ \ , < \ \ '__`\  / __`\ /' _ `\  /'__`\    \/\ \  /',__\
      \ \ \ \ \/\ \ \.\_/\ \__/\ \ \\`\\ \ \ \ \/\ \ \ \/\ \/\ \/\  __/  __ \ \ \/\__, `\
       \ \____/\ \__/.\_\ \____\\ \_\ \_\ \_,__/\ \____/\ \_\ \_\ \____\/\_\_\ \ \/\____/
        \/___/  \/__/\/_/\/____/ \/_/\/_/\/___/  \/___/  \/_/\/_/\/____/\/_/\ \_\ \/___/
                                                                           \ \____/
                                                                            \/___/
    (_'_______________________________________________________________________________'_)
    (_.———————————————————————————————————————————————————————————————————————————————._)


Backbone supplies structure to JavaScript-heavy applications by providing models with key-value binding and custom events, collections with a rich API of enumerable functions, views with declarative event handling, and connects it all to your existing application over a RESTful JSON interface.

For Docs, License, Tests, pre-packed downloads, and everything else, really, see:
http://backbonejs.org

To suggest a feature or report a bug:
https://github.com/jashkenas/backbone/issues

For questions on working with Backbone or general discussions:
https://groups.google.com/forum/#!forum/backbonejs,
http://stackoverflow.com/questions/tagged/backbone.js, or
https://gitter.im/jashkenas/backbone

Backbone is an open-sourced component of DocumentCloud:
https://github.com/documentcloud

Many thanks to our contributors:
https://github.com/jashkenas/backbone/graphs/contributors

Special thanks to Robert Kieffer for the original philosophy behind Backbone.
https://github.com/broofa
# Hyperapp

[![Travis CI](https://img.shields.io/travis/jorgebucaran/hyperapp/master.svg)](https://travis-ci.org/jorgebucaran/hyperapp)
[![Codecov](https://img.shields.io/codecov/c/github/jorgebucaran/hyperapp/master.svg)](https://codecov.io/gh/jorgebucaran/hyperapp)
[![npm](https://img.shields.io/npm/v/hyperapp.svg)](https://www.npmjs.org/package/hyperapp)
[![Slack](https://hyperappjs.herokuapp.com/badge.svg)](https://hyperappjs.herokuapp.com "Join us")

Hyperapp is a JavaScript micro-framework for building web applications.

> :wave: [**Hyperapp 2.0**](https://github.com/jorgebucaran/hyperapp/pull/726) is coming out soon! Try it from the [V2](https://github.com/jorgebucaran/hyperapp/tree/V2) branch right now and be sure to follow [@HyperappJS](https://twitter.com/hyperappjs) for all the Hyperapp news & updates.

- **Minimal** — We have aggressively minimized the concepts you need to understand to be productive while remaining on par with what other frameworks can do.
- **Pragmatic** — Hyperapp holds firm on the functional programming front when managing your state, but takes a pragmatic approach to allow for side effects, asynchronous actions, and DOM manipulations.
- **Standalone** — Do more with less. Hyperapp combines state management with a virtual DOM engine that supports keyed updates & lifecycle events — all with no dependencies.

## Getting Started

Our first example is a counter that can be incremented or decremented. Go ahead and [try it online](https://codepen.io/hyperapp/pen/zNxZLP/left/?editors=0010).

```jsx
import { h, app } from "hyperapp"

const state = {
  count: 0
}

const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}

const view = (state, actions) => (
  <div>
    <h1>{state.count}</h1>
    <button onclick={() => actions.down(1)}>-</button>
    <button onclick={() => actions.up(1)}>+</button>
  </div>
)

app(state, actions, view, document.body)
```

Hyperapp consists of a two-function API. <samp>hyperapp.h</samp> returns a new [virtual DOM](#view) node tree and <samp>hyperapp.app</samp> [mounts](#mounting) a new application in the specified DOM element. Without an element, it's possible to use Hyperapp "headless", which can be useful when unit testing your program.

This example assumes you are using a JavaScript compiler like [Babel](https://babeljs.io) or [TypeScript](https://www.typescriptlang.org) and a module bundler like [Parcel](https://parceljs.org), [Webpack](https://webpack.js.org), etc. If you are using JSX, all you need to do is install the JSX [transform plugin](https://babeljs.io/docs/en/babel-plugin-transform-react-jsx) and add the pragma option to your <samp>.babelrc</samp> file.

```json
{
  "plugins": [["@babel/plugin-transform-react-jsx", { "pragma": "h" }]]
}
```

JSX is a language syntax extension that lets you write HTML tags interspersed with JavaScript. Because browsers don't understand JSX, we use a compiler to transform it into <samp>hyperapp.h</samp> function calls under the hood.

```jsx
const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

Note that JSX is not required for building applications with Hyperapp. You can use <samp>hyperapp.h</samp> directly and without a compilation step as shown above. Other alternatives to JSX include [@hyperapp/html](https://github.com/hyperapp/html), [hyperx](https://github.com/substack/hyperx), [t7](https://github.com/trueadm/t7) and [ijk](https://github.com/lukejacksonn/ijk).

## Installation

Install with npm or Yarn.

<pre>
npm i <a href=https://www.npmjs.com/package/hyperapp>hyperapp</a>
</pre>

Then with a module bundler like [Rollup](https://rollupjs.org) or [Webpack](https://webpack.js.org), use as you would anything else.

```js
import { h, app } from "hyperapp"
```

If you don't want to set up a build environment, you can download Hyperapp from a CDN like [unpkg.com](https://unpkg.com/hyperapp) and it will be globally available through the <samp>window.hyperapp</samp> object. We support all ES5-compliant browsers, including Internet Explorer 10 and above.

```html
<script src="https://unpkg.com/hyperapp"></script>
```

## Overview

Hyperapp applications consist of three interconnected parts: the [state](#state), [view](#view), and [actions](#actions).

Once initialized, your application executes in a continuous loop, taking in actions from users or from external events, updating the state, and representing changes in the view through a virtual DOM model. Think of an action as a signal that notifies Hyperapp to update the state and schedule the next view to redraw. After processing an action, the new state is presented back to the user.

### State

The state is a plain JavaScript object that describes your entire program. It consists of all the dynamic data that is moved around in the application during its execution. The state cannot be mutated once it is created. We must use actions to update it.

```js
const state = {
  count: 0
}
```

Like any JavaScript object, the state can be a nested tree of objects. We refer to nested objects in the state as partial state. A single state tree does not conflict with modularity — see [Nested Actions](#nested-actions) to find out how to update deeply nested objects and split your state and actions.

```js
const state = {
  top: {
    count: 0
  },
  bottom: {
    count: 0
  }
}
```

Because Hyperapp performs a shallow merge when updating your state, the top-level state must be a plain JavaScript object, other than this, you can use any type, including arrays, ES6 [Maps](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map), [Sets](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set), [Immutable.js](https://facebook.github.io/immutable-js/) structures, etc.

#### Local State

Hyperapp does not have the concept of local state. Instead, components are pure functions that return a virtual DOM representation of the global state.

### Actions

The only way to change the state is via actions. An action is a unary function (accepts a single argument) expecting a payload. The payload can be anything you want to pass into the action.

To update the state, an action must return a partial state object. The new state will be the result of a shallow merge between this object and the current state. Under the hood, Hyperapp wires every function in your actions to automatically redraw the view on state changes.

```js
const actions = {
  setValue: value => ({ value })
}
```

Instead of returning a partial state object directly, an action can return a function that takes the current state and actions as arguments and returns a partial state object.

```js
const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}
```

State updates are always immutable. Do not mutate the state object argument within an action and return it — the results are not what you expect (e.g., the view will not be redrawn).

Immutability enables time-travel debugging, helps prevent introducing hard-to-track-down bugs by making state changes more predictable, and allows cheap memoization of components using shallow equality <samp>===</samp> checks.

#### Asynchronous Actions

Actions used for side effects (writing to databases, sending a request to a server, etc.) don't need to have a return value. You may call an action from within another action or callback function. Actions which return a Promise, <samp>undefined</samp> or <samp>null</samp> will not trigger redraws or update the state.

```js
const actions = {
  upLater: value => (state, actions) => {
    setTimeout(actions.up, 1000, value)
  },
  up: value => state => ({ count: state.count + value })
}
```

An action can be an <samp>[async](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function)</samp> function. Because <samp>async</samp> functions return a Promise, and not a partial state object, you need to call another action in order to update the state.

```js
const actions = {
  upLater: () => async (state, actions) => {
    await new Promise(done => setTimeout(done, 1000))
    actions.up(10)
  },
  up: value => state => ({ count: state.count + value })
}
```

#### Nested Actions

Actions can be nested inside namespaces. Updating deeply nested state is as easy as declaring actions inside an object in the same path as the part of the state you want to update.

```jsx
const state = {
  counter: {
    count: 0
  }
}

const actions = {
  counter: {
    down: value => state => ({ count: state.count - value }),
    up: value => state => ({ count: state.count + value })
  }
}
```

#### Interoperability

The <samp>app</samp> function returns a copy of your actions where every function is wired to changes in the state. Exposing this object to the outside world can be useful to operate your application from another program or framework, subscribe to global events, listen to mouse and keyboard input, etc.

To see this in action, modify the example from [Getting Started](#getting-started) to save the wired actions to a variable and try using them. You should see the counter update accordingly.

```jsx
const main = app(state, actions, view, document.body)

setInterval(main.up, 250, 1)
setInterval(main.down, 500, 1)
```

Because state updates are always immutable, returning a reference to the current state will not schedule a view redraw.

```jsx
const actions = {
  getState: () => state => state
}
```

### View

Every time your application state changes, the view function is called so that you can specify how you want the DOM to look based on the new state. The view returns your specification in the form of a plain JavaScript object known as a virtual DOM and Hyperapp takes care of updating the actual DOM to match it.

```js
import { h } from "hyperapp"

export const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

A virtual DOM is a description of what a DOM should look like using a tree of nested JavaScript objects known as virtual nodes. Think of it as a lightweight representation of the DOM. In the example, the view function returns an object like this.

```jsx
{
  nodeName: "div",
  attributes: {},
  children: [
    {
      nodeName: "h1",
      attributes: {},
      children: [0]
    },
    {
      nodeName: "button",
      attributes: { ... },
      children: ["-"]
    },
    {
      nodeName:   "button",
      attributes: { ... },
      children: ["+"]
    }
  ]
}
```

The virtual DOM model allows us to write code as if the entire document is thrown away and rebuilt on each change, while we only update what actually changed. We try to do this in the least number of steps possible, by comparing the new virtual DOM against the previous one. This leads to high efficiency, since typically only a small percentage of nodes need to change, and changing real DOM nodes is costly compared to recalculating the virtual DOM.

It may seem wasteful to throw away the old virtual DOM and re-create it entirely on every update — not to mention the fact that at any one time, Hyperapp is keeping two virtual DOM trees in memory, but as it turns out, browsers can create hundreds of thousands of objects very quickly. On the other hand, modifying the DOM is several orders of magnitude more expensive.

### Mounting

To mount your application on a page, we need a DOM element. This element is referred to as the application container. Applications built with Hyperapp always have a single container.

```jsx
app(state, actions, view, container)
```

Hyperapp will also attempt to reuse existing elements inside the container enabling SEO optimization and improving your sites time-to-interactive. The process consists of serving a fully rendered page together with your application. Then instead of throwing away the existing content, we'll turn your DOM nodes into an interactive application out of the box.

This is how we can recycle server-rendered content out the counter example from before. See [Getting Started](#getting-started) for the application code.

```html
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <script defer src="bundle.js"></script>
</head>

<body>
  <div>
    <h1>0</h1>
    <button>-</button>
    <button>+</button>
  </div>
</body>
</html>
```

### Components

A component is a pure function that returns a virtual node. Unlike the view function, components are not wired to your application state or actions. Components are dumb, reusable blocks of code that encapsulate markup, styles, and behaviors that belong together.

Here's a taste of how to use components in your application. The application is a typical To-Do manager. Go ahead and [try it online here](https://codepen.io/hyperapp/pen/zNxRLy).

```jsx
import { h } from "hyperapp"

const TodoItem = ({ id, value, done, toggle }) => (
  <li
    class={done && "done"}
    onclick={() =>
      toggle({
        value: done,
        id: id
      })
    }
  >
    {value}
  </li>
)

export const view = (state, actions) => (
  <div>
    <h1>Todo</h1>
    <ul>
      {state.todos.map(({ id, value, done }) => (
        <TodoItem id={id} value={value} done={done} toggle={actions.toggle} />
      ))}
    </ul>
  </div>
)
```

If you don't know all the attributes that you want to place in a component ahead of time, you can use the [spread syntax](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_operator). Note that Hyperapp components can return an array of elements as in the following example. This technique lets you group a list of children without adding extra nodes to the DOM.

```jsx
const TodoList = ({ todos, toggle }) =>
  todos.map(todo => <TodoItem {...todo} toggle={toggle} />)
```

#### Lazy Components

Components can only receive attributes and children from their parent component. Similarly to the top-level view function, lazy components are passed your application global state and actions. To create a lazy component, return a view function from a regular component.

```jsx
import { h } from "hyperapp"

export const Up = ({ by }) => (state, actions) => (
  <button onclick={() => actions.up(by)}>+ {by}</button>
)

export const Down = ({ by }) => (state, actions) => (
  <button onclick={() => actions.down(by)}>- {by}</button>
)

export const Double = () => (state, actions) => (
  <button onclick={() => actions.up(state.count)}>+ {state.count}</button>
)

export const view = (state, actions) => (
  <main>
    <h1>{state.count}</h1>
    <Up by={2} />
    <Down by={1} />
    <Double />
  </main>
)
```

#### Handling Component State

Suppose you have a list of questions with answers that are collapsed initially. A flag `answerIsOpen` is used to determine if a question's answer is open.

Since there is no concept of local state in Hyperapp, the global state is always updated rather than an individual component's state.

To update a single question's state, the entire `questions` array will be mapped to a new array where the `answerIsOpen` property will be toggled if the question matches the one belonging to the component.

[View the example online](https://codepen.io/anon/pen/ZogRYP).

#### Children Composition

Components receive their children elements via the second argument, allowing you and other components to pass arbitrary children down to them.

```jsx
const Box = ({ color }, children) => (
  <div class={`box box-${color}`}>{children}</div>
)

const HelloBox = ({ name }) => (
  <Box color="green">
    <h1 class="title">Hello, {name}!</h1>
  </Box>
)
```

## Supported Attributes

Supported attributes include [HTML attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes), [SVG attributes](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute), [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events), [Lifecycle Events](#lifecycle-events), and [Keys](#keys). Note that non-standard HTML attribute names are not supported, <samp>onclick</samp> and <samp>class</samp> are valid, but <samp>onClick</samp> or <samp>className</samp> are not.

### Styles

The <samp>style</samp> attribute expects a plain object rather than a string as in HTML.
Each declaration consists of a style name property written in <samp>camelCase</samp> and a value. CSS variables are supported too.

Individual style properties will be diffed and mapped against <samp>[HTMLElement.style](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style)</samp> property members of the DOM element - you should therefore use the JavaScript style object [property names](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference), e.g. <samp>backgroundColor</samp> rather than <samp>background-color</samp>.

```jsx
import { h } from "hyperapp"

export const Jumbotron = ({ text }) => (
  <div
    style={{
      color: "white",
      fontSize: "32px",
      textAlign: center,
      backgroundImage: `url(${imgUrl})`
    }}
  >
    {text}
  </div>
)
```

### Lifecycle Events

You can be notified when elements managed by the virtual DOM are created, updated or removed via lifecycle events. Use them for animation, data fetching, wrapping third-party libraries, cleaning up resources, etc.

Note that lifecycle events are attached to virtual DOM nodes, not to components. Consider adding a key to ensure that the event is attached to a specific DOM element, rather than a recycled one.

#### oncreate

This event is fired after the element is created and attached to the DOM. Use it to manipulate the DOM node directly, make a network request, create a slide/fade in animation, etc.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    oncreate={element => element.focus()}
  />
)
```

#### onupdate

This event is fired every time we update the element attributes. Use <samp>oldAttributes</samp> inside the event handler to check if any attributes changed or not.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    onupdate={(element, oldAttributes) => {
      if (oldAttributes.placeholder !== placeholder) {
        // Handle changes here!
      }
    }}
  />
)
```

#### onremove

This event is fired before the element is removed from the DOM. Use it to create slide/fade out animations. Call <samp>done</samp> inside the function to remove the element. This event is not called in its child elements.

```jsx
import { h } from "hyperapp"

export const MessageWithFadeout = ({ title }) => (
  <div onremove={(element, done) => fadeout(element).then(done)}>
    <h1>{title}</h1>
  </div>
)
```

#### ondestroy

This event is fired after the element has been removed from the DOM, either directly or as a result of a parent being removed. Use it for invalidating timers, canceling a network request, removing global events listeners, etc.

```jsx
import { h } from "hyperapp"

export const Camera = ({ onerror }) => (
  <video
    poster="loading.png"
    oncreate={element => {
      navigator.mediaDevices
        .getUserMedia({ video: true })
        .then(stream => (element.srcObject = stream))
        .catch(onerror)
    }}
    ondestroy={element => element.srcObject.getTracks()[0].stop()}
  />
)
```

### Keys

Keys help identify nodes every time we update the DOM. By setting the <samp>key</samp> property on a virtual node, you declare that the node should correspond to a particular DOM element. This allows us to re-order the element into its new position, if the position changed, rather than risk destroying it.

```jsx
import { h } from "hyperapp"

export const ImageGallery = ({ images }) =>
  images.map(({ hash, url, description }) => (
    <li key={hash}>
      <img src={url} alt={description} />
    </li>
  ))
```

Keys must be unique among sibling nodes. Don't use an array index as the key, if the index also specifies the order of siblings. If the position and number of items in a list are fixed, it will make no difference, but if the list is dynamic, the key will change every time the tree is rebuilt.

```jsx
import { h } from "hyperapp"

export const PlayerList = ({ players }) =>
  players
    .slice()
    .sort((player, nextPlayer) => nextPlayer.score - player.score)
    .map(player => (
      <li key={player.username} class={player.isAlive ? "alive" : "dead"}>
        <PlayerProfile {...player} />
      </li>
    ))
```

#### Top-Level Nodes

Keys are not registered on the top-level node of your view. If you are toggling the top-level view, and you must use keys, wrap them in an unchanging node.

## Links

- [Slack](https://hyperappjs.herokuapp.com)
- [Twitter](https://twitter.com/hyperappJS)
- [Examples](https://codepen.io/search/pens/?q=hyperapp)
- [/r/hyperapp](https://www.reddit.com/r/hyperapp)

## License

Hyperapp is MIT licensed. See [LICENSE](LICENSE.md).
# Knockout

**Knockout** is a JavaScript [MVVM](http://en.wikipedia.org/wiki/Model_View_ViewModel) (a modern variant of MVC) library that makes it easier to create rich, desktop-like user interfaces with JavaScript and HTML. It uses *observers* to make your UI automatically stay in sync with an underlying data model, along with a powerful and extensible set of *declarative bindings* to enable productive development.

## Getting started

[![Join the chat at https://gitter.im/knockout/knockout](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/knockout/knockout?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

**Totally new to Knockout?** The most fun place to start is the [online interactive tutorials](http://learn.knockoutjs.com/).

For more details, see

 * Documentation on [the project's website](http://knockoutjs.com/documentation/introduction.html)
 * Online examples at [http://knockoutjs.com/examples/](http://knockoutjs.com/examples/)

## Downloading Knockout

You can [download released versions of Knockout](http://knockoutjs.com/downloads/) from the project's website.

For Node.js developers, Knockout is also available from [npm](https://npmjs.org/) - just run `npm install knockout`.

## Building Knockout from sources

If you prefer to build the library yourself:

1. **Clone the repo from GitHub**

   ```sh
   git clone https://github.com/knockout/knockout.git
   cd knockout
   ```

2. **Acquire build dependencies.**

   Make sure you have [Node.js](http://nodejs.org/) installed on your workstation. This is only needed to _build_ Knockout from sources. Knockout itself has no dependency on Node.js once it is built (it works with any server technology or none). Now run:

   ```sh
   npm install -g grunt-cli
   npm install
   ```

   The first `npm` command sets up the popular [Grunt](http://gruntjs.com/) build tool. You might need to run this command with `sudo` if you're on Linux or Mac OS X, or in an Administrator command prompt on Windows. The second `npm` command fetches the remaining build dependencies.

3. **Run the build tool**

   ```sh
   grunt
   ```
   Now you'll find the built files in `build/output/`.

## Running the tests

If you have [phantomjs](http://phantomjs.org/download.html) installed, then the `grunt` script will automatically run the specification suite and report its results.

Or, if you want to run the specs in a browser (e.g., for debugging), simply open `spec/runner.html` in your browser.

## License

MIT license - [http://www.opensource.org/licenses/mit-license.php](http://www.opensource.org/licenses/mit-license.php)
<p align="center">
    <a href="http://markojs.com/"><img src="https://raw.githubusercontent.com/marko-js/branding/master/marko-logo-medium-cropped.png" alt="Marko logo" width="300" /></a><br /><br />
</p>

Marko is a friendly (and fast!) UI library that makes building web apps fun.
Learn more on [markojs.com](http://markojs.com/), and even [Try Marko Online!](http://markojs.com/try-online/)

[![Build Status](https://travis-ci.org/marko-js/marko.svg?branch=master)](https://travis-ci.org/marko-js/marko)
[![Coverage Status](https://codecov.io/gh/marko-js/marko/branch/master/graph/badge.svg)](https://codecov.io/gh/marko-js/marko)
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/marko-js/marko)
[![NPM](https://img.shields.io/npm/v/marko.svg)](https://www.npmjs.com/package/marko)
[![Downloads](https://img.shields.io/npm/dm/marko.svg)](http://npm-stat.com/charts.html?package=marko)

# Get Involved

- **Contributing**: Pull requests are welcome!
  - Read [`CONTRIBUTING.md`](.github/CONTRIBUTING.md) and check out our [bite-sized](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Adifficulty%3Abite-sized) and [help-wanted](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Astatus%3Ahelp-wanted) issues
  - Submit github issues for any feature enhancements, bugs or documentation problems
- **Support**: Join our [gitter chat](https://gitter.im/marko-js/marko) to ask questions to get support from the maintainers and other Marko developers
  - Questions/comments can also be posted as [github issues](https://github.com/marko-js/marko/issues)
- **Discuss**: Tweet using the `#MarkoJS` hashtag and follow [@MarkoDevTeam](https://twitter.com/MarkoDevTeam)

# Installation

```bash
npm install marko --save
```

# Examples

Marko provides an elegant and readable syntax for both single-file components
and components broken into separate files. There are plenty of examples to play
with on [Marko's Try-Online](http://markojs.com/try-online/). Additional
[component documentation](http://markojs.com/docs/components/) can be found on
the Marko.js website.

## Single file

The following single-file component renders a button and a counter with the
number of times the button has been clicked. [Try this example now!](http://markojs.com/try-online/?file=%2Fcomponents%2Fcomponents%2Fclick-count%2Findex.marko)

**click-count.marko**

```marko
class {
    onCreate() {
        this.state = { count:0 };
    }
    increment() {
        this.state.count++;
    }
}

style {
    .count {
        color:#09c;
        font-size:3em;
    }
    .example-button {
        font-size:1em;
        padding:0.5em;
    }
}

<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

## Multi-file

The same component as above split into an `index.marko` template file,
`component.js` containing your component logic, and `style.css` containing your
component style:

**index.marko**

```marko
<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

**component.js**

```js
module.exports = {
  onCreate() {
    this.state = { count: 0 };
  },
  increment() {
    this.state.count++;
  }
};
```

**style.css**

```css
.count {
  color: #09c;
  font-size: 3em;
}
.example-button {
  font-size: 1em;
  padding: 0.5em;
}
```

## Concise Syntax

Marko also support a beautiful concise syntax as an alternative to the HTML
syntax. Find out more about the [concise syntax here](http://markojs.com/docs/concise/).

```marko
<!-- Marko HTML syntax -->
<ul>
    <li for(color in ['a', 'b', 'c'])>
        ${color}
    </li>
</ul>
```

```marko
// Marko concise syntax
ul
    li for(color in ['a', 'b', 'c'])
        -- ${color}
```

# Changelog

See [CHANGELOG.md](CHANGELOG.md)

# Maintainers

- [Patrick Steele-Idem](https://github.com/patrick-steele-idem) (Twitter: [@psteeleidem](http://twitter.com/psteeleidem))
- [Michael Rawlings](https://github.com/mlrawlings) (Twitter: [@mlrawlings](https://twitter.com/mlrawlings))
- [Phillip Gates-Idem](https://github.com/philidem/) (Twitter: [@philidem](https://twitter.com/philidem))
- [Austin Kelleher](https://github.com/austinkelleher) (Twitter: [@AustinKelleher](https://twitter.com/AustinKelleher))
- [Dylan Piercey](https://github.com/dylanpiercey) (Twitter: [@dylan_piercey](https://twitter.com/dylan_piercey))
- [Martin Aberer](https://github.com/tindli) (Twitter: [@metaCoffee](https://twitter.com/metaCoffee))

# Code of Conduct

This project adheres to the [eBay Code of Conduct](http://ebay.github.io/codeofconduct).
By participating in this project you agree to abide by its terms.

# License

MIT
# Matreshka.js 2 [![npm version](https://badge.fury.io/js/matreshka.svg)](https://badge.fury.io/js/matreshka) [![Build Status](https://travis-ci.org/matreshkajs/matreshka.svg)](https://travis-ci.org/matreshkajs/matreshka) [![Coverage Status](https://coveralls.io/repos/github/matreshkajs/matreshka/badge.svg?branch=master)](https://coveralls.io/github/matreshkajs/matreshka?branch=master) [![Join the chat at https://gitter.im/finom/matreshka](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/matreshkajs/matreshka)

[![Matreshka Website](http://matreshka.io/img/mk5-logo_full-vert.svg)](http://matreshka.io)

> Matreshka.js is a simple JavaScript framework for single page applications creation. It fills the gap between a junior and a senior because of simple and intuitive API based on JavaScript classes and accessors. Everything you need to get started is your JavaScript knowledge.

## Features
- Reactive API which allows to solve hard and confusing problems easily
- High robustness of developed apps
- The ability to refactor legacy applications without rewriting them from scratch
- Only couple of hours is needed to master the framework because of an absence of complex concepts

**[Download](https://github.com/matreshkajs/matreshka/tree/gh-pages)**

**Install via NPM**
```
npm install --save matreshka
```

-----------------------------------

## Resources
- [The website](http://matreshka.io)
- [Examples and tutorials](https://github.com/matreshkajs/examples-and-tutorials)
- [Release History](https://github.com/matreshkajs/matreshka/releases)
- [JSDoc files](https://github.com/matreshkajs/matreshka.io/tree/master/doc)
- [Twitter (automatically reports about new versions)](https://twitter.com/matreshkajs)
- [Support the project on Patreon](https://www.patreon.com/finom)

**License:** [MIT License](https://raw.github.com/finom/matreshka/master/LICENSE)



<a href="https://www.browserstack.com/" target="_blank">
    <img src="http://matreshka.io/img/logos/browserstack.svg" height="30" valign="middle">
</a> is provided a sponsored access to their testing platform
# Introduction

- [What is Mithril?](#what-is-mithril)
- [Getting started](#getting-started)
- [Hello world](#hello-world)
- [DOM elements](#dom-elements)
- [Components](#components)
- [Routing](#routing)
- [XHR](#xhr)

---

### What is Mithril?

Mithril is a modern client-side Javascript framework for building Single Page Applications.  
It's small (< 8kb gzip), fast and provides routing and XHR utilities out of the box.

<div style="display:flex;margin:0 0 30px;">
	<div style="width:50%;">
		<h5>Download size</h5>
		<small>Mithril (8kb)</small>
		<div style="animation:grow 0.08s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:4%;"></div>
		<small style="color:#aaa;">Vue + Vue-Router + Vuex + fetch (40kb)</small>
		<div style="animation:grow 0.4s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:20%"></div>
		<small style="color:#aaa;">React + React-Router + Redux + fetch (64kb)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:32%"></div>
		<small style="color:#aaa;">Angular (135kb)</small>
		<div style="animation:grow 1.35s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:68%"></div>
	</div>
	<div style="width:50%;">
		<h5>Performance</h5>
		<small>Mithril (6.4ms)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:24%;"></div>
		<small style="color:#aaa;">Vue (9.8ms)</small>
		<div style="animation:grow 0.98s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:40%"></div>
		<small style="color:#aaa;">React (12.1ms)</small>
		<div style="animation:grow 1.21s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:48%"></div>
		<small style="color:#aaa;">Angular (11.5ms)</small>
		<div style="animation:grow 1.15s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:44%"></div>
	</div>
</div>

Mithril is used by companies like Vimeo and Nike, and open source platforms like Lichess.

If you are an experienced developer and want to know how Mithril compares to other frameworks, see the [framework comparison](http://mithril.js.org/framework-comparison.html) page.

Mithril supports browsers all the way back to IE9, no polyfills required.

---

### Getting started

The easiest way to try out Mithril is to include it from a CDN, and follow this tutorial. It'll cover the majority of the API surface (including routing and XHR) but it'll only take 10 minutes.

Let's create an HTML file to follow along:

```markup
<body>
	<script src="//unpkg.com/mithril/mithril.js"></script>
	<script>
	var root = document.body

	// your code goes here!
	</script>
</body>
```

---

### Hello world

Let's start as small as we can: render some text on screen. Copy the code below into your file (and by copy, I mean type it out - you'll learn better)

```javascript
var root = document.body

m.render(root, "Hello world")
```

Now, let's change the text to something else. Add this line of code under the previous one:

```javascript
m.render(root, "My first app")
```

As you can see, you use the same code to both create and update HTML. Mithril automatically figures out the most efficient way of updating the text, rather than blindly recreating it from scratch.

---

### DOM elements

Let's wrap our text in an `<h1>` tag.

```javascript
m.render(root, m("h1", "My first app"))
```

The `m()` function can be used to describe any HTML structure you want. So if you need to add a class to the `<h1>`:

```javascript
m("h1", {class: "title"}, "My first app")
```

If you want to have multiple elements:

```javascript
[
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
]
```

And so on:

```javascript
m("main", [
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
])
```

Note: If you prefer `<html>` syntax, [it's possible to use it via a Babel plugin](http://mithril.js.org/jsx.html).

```jsx
// HTML syntax via Babel's JSX plugin
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

---

### Components

A Mithril component is just an object with a `view` function. Here's the code above as a component:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", "A button"),
		])
	}
}
```

To activate the component, we use `m.mount`.

```javascript
m.mount(root, Hello)
```

As you would expect, doing so creates this markup:

```markup
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

The `m.mount` function is similar to `m.render`, but instead of rendering some HTML only once, it activates Mithril's auto-redrawing system. To understand what that means, let's add some events:

```javascript
var count = 0 // added a variable

var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			// changed the next line
			m("button", {onclick: function() {count++}}, count + " clicks"),
		])
	}
}

m.mount(root, Hello)
```

We defined an `onclick` event on the button, which increments a variable `count` (which was declared at the top). We are now also rendering the value of that variable in the button label.

You can now update the label of the button by clicking the button. Since we used `m.mount`, you don't need to manually call `m.render` to apply the changes in the `count` variable to the HTML; Mithril does it for you.

If you're wondering about performance, it turns out Mithril is very fast at rendering updates, because it only touches the parts of the DOM it absolutely needs to. So in our example above, when you click the button, the text in it is the only part of the DOM Mithril actually updates.

---

### Routing

Routing just means going from one screen to another in an application with several screens.

Let's add a splash page that appears before our click counter. First we create a component for it:

```javascript
var Splash = {
	view: function() {
		return m("a", {href: "#!/hello"}, "Enter!")
	}
}
```

As you can see, this component simply renders a link to `#!/hello`. The `#!` part is known as a hashbang, and it's a common convention used in Single Page Applications to indicate that the stuff after it (the `/hello` part) is a route path.

Now that we going to have more than one screen, we use `m.route` instead of `m.mount`.

```javascript
m.route(root, "/splash", {
	"/splash": Splash,
	"/hello": Hello,
})
```

The `m.route` function still has the same auto-redrawing functionality that `m.mount` does, and it also enables URL awareness; in other words, it lets Mithril know what to do when it sees a `#!` in the URL.

The `"/splash"` right after `root` means that's the default route, i.e. if the hashbang in the URL doesn't point to one of the defined routes (`/splash` and `/hello`, in our case), then Mithril redirects to the default route. So if you open the page in a browser and your URL is `http://localhost`, then you get redirected to `http://localhost/#!/splash`.

Also, as you would expect, clicking on the link on the splash page takes you to the click counter screen we created earlier. Notice that now your URL will point to `http://localhost/#!/hello`. You can navigate back and forth to the splash page using the browser's back and next button.

---

### XHR

Basically, XHR is just a way to talk to a server.

Let's change our click counter to make it save data on a server. For the server, we'll use [REM](http://rem-rest-api.herokuapp.com), a mock REST API designed for toy apps like this tutorial.

First we create a function that calls `m.request`. The `url` specifies an endpoint that represents a resource, the `method` specifies the type of action we're taking (typically the `PUT` method [upserts](https://en.wiktionary.org/wiki/upsert)), `data` is the payload that we're sending to the endpoint and `withCredentials` means to enable cookies (a requirement for the REM API to work)

```javascript
var count = 0
var increment = function() {
	m.request({
		method: "PUT",
		url: "//rem-rest-api.herokuapp.com/api/tutorial/1",
		data: {count: count + 1},
		withCredentials: true,
	})
	.then(function(data) {
		count = parseInt(data.count)
	})
}
```

Calling the increment function [upserts](https://en.wiktionary.org/wiki/upsert) an object `{count: 1}` to the `/api/tutorial/1` endpoint. This endpoint returns an object with the same `count` value that was sent to it. Notice that the `count` variable is only updated after the request completes, and it's updated with the response value from the server now.

Let's replace the event handler in the component to call the `increment` function instead of incrementing the `count` variable directly:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", {onclick: increment}, count + " clicks"),
		])
	}
}
```

Clicking the button should now update the count.

---

We covered how to create and update HTML, how to create components, routes for a Single Page Application, and interacted with a server via XHR.

This should be enough to get you started writing the frontend for a real application. Now that you are comfortable with the basics of the Mithril API, [be sure to check out the simple application tutorial](http://mithril.js.org/simple-application.html), which walks you through building a realistic application.
 NuclearJS

[![Build Status](https://travis-ci.org/optimizely/nuclear-js.svg?branch=master)](https://travis-ci.org/optimizely/nuclear-js)
[![Coverage Status](https://coveralls.io/repos/optimizely/nuclear-js/badge.svg?branch=master)](https://coveralls.io/r/optimizely/nuclear-js?branch=master)
[![Join the chat at https://gitter.im/optimizely/nuclear-js](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/optimizely/nuclear-js?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Sauce Test Status](https://saucelabs.com/browser-matrix/nuclearjs.svg)](https://saucelabs.com/u/nuclearjs)

Traditional Flux architecture built with ImmutableJS data structures.

## Documentation

[https://optimizely.github.io/nuclear-js/](https://optimizely.github.io/nuclear-js/)

## Design Philosophy

- **Simple Over Easy** - The purpose of NuclearJS isn't to write the most expressive TodoMVC anyone's ever seen.  The goal of NuclearJS is to provide a way to model data that is easy to reason about and decouple at very large scale.

- **Immutable** - A means for less defensive programming, more predictability and better performance.

- **Functional** - The framework should be implemented functionally wherever appropriate.  This reduces incidental complexity and pairs well with Immutability.

- **Smallest Amount of State Possible** - Using NuclearJS should encourage the modeling of your application state in the most minimal way possible.

- **Decoupled** - A NuclearJS system should be able to function without any sort of UI or frontend.  It should be backend/frontend agnostic and be able to run on a NodeJS server.

## Installation

NuclearJS can be downloaded from [npm](https://www.npmjs.com/).

```
npm install nuclear-js
```

## Examples

- [Shopping Cart Example](./examples/shopping-cart) - Provides a general overview of basic NuclearJS concepts: actions, stores and getters with ReactJS.
- [Flux Chat Example](./examples/flux-chat) - A classic Facebook flux chat example written in NuclearJS.
- [Rest API Example](./examples/rest-api) - Shows how to deal with fetching data from an API using NuclearJS conventions.
- [Hot reloadable stores](./examples/hot-reloading) - Shows how to setup stores to be hot reloadable using webpack hot module replacement.

## How NuclearJS differs from other Flux implementations

1.  All app state is in a singular immutable map, like [Om](https://github.com/omcljs/om).  In development you can see your entire application state at every point in time thanks to awesome debugging tools built into NuclearJS.

2.  State is not spread out through stores, instead stores are a declarative way of describing some top-level domain of your app state. For each key in the app state map a store declares the initial state of that key and how that piece of the app state reacts over time to actions dispatched on the flux system.

3.  Stores are not reference-able nor have any `getX` methods on them.  Instead NuclearJS uses a functional lens concept called **getters**. In fact, the use of getters obviates the need for any store to know about another store, eliminating the confusing `store.waitsFor` method found in other flux implementations.

4.  NuclearJS is insanely efficient - change detection granularity is infinitesimal, you can even observe computed state where several pieces of the state map are combined together and run through a transform function.  NuclearJS is smart enough to know when the value of any computed changes and only call its observer if and only if its value changed in a way that is orders of magnitude more efficient than traditional dirty checking.  It does this by leveraging ImmutableJS data structure and using a `state1 !== state2` reference comparison which runs in constant time.

5.  Automatic data observation / rendering -- automatic re-rendering is built in for React in the form of a very lightweight mixin.  It is also easily possible to build the same functionality for any UI framework such as VueJS, AngularJS and even Backbone.

6.  NuclearJS is not a side-project, it's used as the default Flux implementation that powers all of Optimizely.  It is well tested and will continue to be maintained for the foreseeable future. Our current codebase has over dozens of stores, actions and getters, we even share our prescribed method of large scale code organization and testing strategies.

## Performance

Getters are only calculated whenever their dependencies change. So if the dependency is a keypath then it will only recalculate when that path in the app state map has changed (which can be done as a simple `state.getIn(keyPath) !== oldState.getIn(keyPath)` which is an `O(log32(n))` operation. The other case is when a getter is dependent on other getters. Since every getter is a pure function, NuclearJS will only recompute the getter if the values of its dependencies change.

## API Documentation

[API Documentation](https://optimizely.github.io/nuclear-js/docs/07-api.html)

## For Smaller Applications

NuclearJS was designed first and foremost for large scale production codebases.  For a much more lightweight Flux implementation that shares many of the same ideas and design principles check out [Microcosm](https://github.com/vigetlabs/microcosm).

## Contributing

Contributions are welcome, especially with the documentation website and examples.  See [CONTRIBUTING.md](./CONTRIBUTING.md).
# Polymer

[![Build Status](https://travis-ci.org/Polymer/polymer.svg?branch=master)](https://travis-ci.org/Polymer/polymer)
[![Published on npm](https://img.shields.io/npm/v/@polymer/polymer.svg)](https://www.npmjs.com/package/@polymer/polymer)
[![Published on webcomponents.org](https://img.shields.io/badge/webcomponents.org-published-blue.svg)](https://www.webcomponents.org/element/@polymer/polymer)

> ℹ️ Note: This is the current stable version of the Polymer library.  At Google I/O 2018 we announced a new Web Component base class, [`LitElement`](https://github.com/Polymer/lit-element), as a successor to the `PolymerElement` base class in this library.
>
> If you're starting a new project, we recommend that you consider using LitElement instead.
>
> If you have a project you've built with an earlier version of the Polymer library, we recommend that you [migrate](#about-polymer-30) to 3.0 for best compatibility with the JavaScript ecosystem. Thanks to the interoperability of Web Components, elements built with Polymer 3.0 and LitElement can be mixed and matched in the same app, so once you have updated your project to Polymer 3.0, you can migrate to LitElement incrementally, one element at a time.  See our blog post on the [Polymer Project roadmap](https://www.polymer-project.org/blog/2018-05-02-roadmap-update.html) for more information.

Polymer lets you build encapsulated, reusable [Web Components](https://www.webcomponents.org/introduction) that work just like standard HTML elements, to use in building web applications.  Using a Web Component built with Polymer is as simple as importing its definition then using it like any other HTML element:

```html
<!-- Import a component -->
<script src="https://unpkg.com/@polymer/paper-checkbox@next/paper-checkbox.js?module" type="module" ></script>

<!-- Use it like any other HTML element -->
<paper-checkbox>Web Components!</paper-checkbox>
```

Web Components are now implemented natively on Safari and Chrome (~70% of installed browsers), and run well on Firefox, Edge, and IE11 using [polyfills](https://github.com/webcomponents/webcomponentsjs).  Read more [below](#overview).

## Getting started

 * The easiest way to try out Polymer is to use one of these online tools:

    * Runs in all [supported](#supported-browsers) browsers: [StackBlitz](https://stackblitz.com/edit/polymer-element-example?file=index.js), [Glitch](https://glitch.com/edit/#!/polymer-element-example?path=index.html)

    * Runs in browsers with [JavaScript Modules](https://caniuse.com/#search=modules): [JSBin](https://jsbin.com/wuxejiz/edit?html,output),
 [CodePen](https://codepen.io/kevinpschaaf/pen/BxdErp?editors=1000).

 * You can also save [this HTML file](https://gist.githubusercontent.com/kevinpschaaf/8a5acbea7b25d2bb5e82eeea2b105669/raw/c3a86872f07603e2d0ddae736687e52a5c8c499f/index.html) to a local file and run it in any browser that supports [JavaScript Modules]((https://caniuse.com/#search=modules)).

 * When you're ready to use Polymer in a project, install it via [npm](https://www.npmjs.com/). To run the project in the browser,
 a module-compatible toolchain is required. We recommend installing the [Polymer CLI](https://github.com/Polymer/tools/tree/master/packages/cli) to and using its development server as follows.

    1. Add Polymer to your project:

        ```npm i @polymer/polymer```

    1. Create an element by extending PolymerElement and calling `customElements.define` with your class (see the examples below).

    1. Install the Polymer CLI:

        ```npm i -g polymer-cli```

    1. Run the development server and open a browser pointing to its URL:

        ```polymer serve --npm```

    > Polymer 3.0 is published on [npm](https://www.npmjs.com/package/@polymer/polymer) using JavaScript Modules.
    This means it can take advantage of the standard native JavaScript module loader available in all current major browsers.
    >
    > However, since Polymer uses npm conventions to reference dependencies by name, a light transform to rewrite specifiers to URLs is required to run in the browser. The polymer-cli's development server `polymer serve`, as well as `polymer build` (for building an optimized app for deployment)  automatically handles this transform.

    Tools like [webpack](https://webpack.js.org/) and [Rollup](https://rollupjs.org/) can also be used to serve and/or bundle Polymer elements.


## Minimal Example

  1. Create a class that extends `PolymerElement`.
  1. Implement a static `properties` getter that describes the element's public property/attribute API
  (these automatically become observed attributes).
  1. Then implement a `template` getter that returns an `HTMLTemplateElement` describing the element's rendering, including encapsulated styling and any property bindings.

```html
  <script src="node_modules/@webcomponents/webcomponents-loader.js"></script>
  <script type="module">
    import {PolymerElement, html} from '@polymer/polymer';

    class MyElement extends PolymerElement {
      static get properties() { return { mood: String }}
      static get template() {
        return html`
          <style> .mood { color: green; } </style>
          Web Components are <span class="mood">[[mood]]</span>!
        `;
      }
    }

    customElements.define('my-element', MyElement);
  </script>

  <my-element mood="happy"></my-element>
```

## Overview

Web components are an incredibly powerful new set of primitives baked into the web platform, and open up a whole new world of possibility when it comes to componentizing front-end code and easily creating powerful, immersive, app-like experiences on the web.

Polymer is a lightweight library built on top of the web standards-based [Web Components](http://webcomponents.org/introduction) APIs, and makes it easier to build your very own custom HTML elements. Creating reusable custom elements - and using elements built by others - can make building complex web applications easier and more efficient.

By being based on the Web Components APIs built in the browser (or [polyfilled](https://github.com/webcomponents/webcomponentsjs) where needed), elements built with Polymer are:

* Built from the platform up
* Self-contained
* Re-usable
* Interoperable across frameworks

Among many ways to leverage custom elements, they can be particularly useful for building reusable UI components. Instead of continually re-building a specific navigation bar or button in different frameworks and for different projects, you can define this element once using Polymer, and then reuse it throughout your project or in any future project.

Polymer provides a declarative syntax to easily create your own custom elements, using all standard web technologies - define the structure of the element with HTML, style it with CSS, and add interactions to the element with JavaScript.

Polymer also provides optional two-way data-binding, meaning:

1. When properties in the model for an element get updated, the element can update itself in response.
2. When the element is updated internally, the changes can be propagated back to the model.

Polymer is designed to be flexible, lightweight, and close to the web platform - the library doesn't invent complex new abstractions and magic, but uses the best features of the web platform in straightforward ways to simply sugar the creation of custom elements.

## About Polymer 3.0

Polymer 3.0 is now released to stable, and introduces a major change to how Polymer is distributed: from HTML Imports on Bower, to JS modules on npm.  Otherwise, the API is almost entirely backward compatible with Polymer 2.0 (the only changes are removing APIs related to HTML Imports like `importHref`, and converting Polymer's API to be module-based rather than globals-based).

Migrating to Polymer 3.0 by hand is mostly mechanical:
* Components should be defined in JS modules instead of in HTML
* Templates should be encoded in JS modules using a `static get template()` getter on PolymerElement subclasses using the `html` tagged template literal function (which parses `HTMLTemplateElement`s out of strings in JS) rather than using `<template>` elements in a `<dom-module>`
* All dependencies should be imported JS module imports rather than HTML Imports.

However, the [`polymer-modulizer`](https://github.com/Polymer/polymer-modulizer) tool automates the vast majority of this migration work.  Please see details on that repo for automated conversion of Polymer 2.0 apps and elements to Polymer 3.0.

👀 **Looking for Polymer v2.x?** Please see the [the v2 branch](https://github.com/Polymer/polymer/tree/2.x).

👀 **Looking for Polymer v1.x?** Please see the [the v1 branch](https://github.com/Polymer/polymer/tree/1.x).

## Contributing

The Polymer team loves contributions from the community! Take a look at our [contributing guide](CONTRIBUTING.md) for more information on how to contribute.  Please file issues on the Polymer issue tracker following the issue template and contributing guide [issues](https://github.com/Polymer/polymer/issues/new).

## Communicating with the Polymer team

Beyond GitHub, we try to have a variety of different lines of communication available:

* [Blog](https://blog.polymer-project.org/)
* [Twitter](https://twitter.com/polymer)
* [Google+ community](https://plus.google.com/communities/115626364525706131031)
* [Mailing list](https://groups.google.com/forum/#!forum/polymer-dev)
* [Slack channel](https://bit.ly/polymerslack)

# License

The Polymer library uses a BSD-like license that is available [here](./LICENSE.txt)

[![Riot logo](https://riot.js.org/img/logo/riot480x.png)](https://riot.js.org)


## Simple and elegant component-based UI library

[![Build Status][travis-image]][travis-url]
[![MIT License][license-image]][license-url]
[![Riot Forum][riot-forum-image]][riot-forum-url]
[![Join the chat at https://gitter.im/riot/riot][gitter-image]][gitter-url]
[![Join the chat (ja) at https://riot-jp-slackin.herokuapp.com/][slack-ja-image]][slack-ja-url]
[![OpenCollective Backers][backer-badge]][backer-url] [![OpenCollective Sponsors][sponsor-badge]][sponsor-url]

[![NPM version][npm-version-image]][npm-url]
[![NPM downloads][npm-downloads-image]][npm-url]
[![jsDelivr Hits][jsdelivr-image]][jsdelivr-url]
[![Coverage Status][coverage-image]][coverage-url]
![Riot Size][lib-size]
[![Code Quality][codeclimate-image]][codeclimate-url]

[![Sauce Test Status][saucelabs-image]][saucelabs-url]

### Framework Size Comparison

| Framework                                      | Version         | Minified Size (gzip) |
|------------------------------------------------|-----------------|----------------------|
| @angular/core + Polyfills                      | 6.0.9           | 141.79kb             |
| Ember                                          | 2.18.2          | 121.84kb             |
| Polymer + Web Components Polyfill Lite         | 1.8.0           | 66.3kb               |
| React + Map and Set Polyfills                  | 16.4.0          | 41.60kb              |
| Web Components Polyfill                        | 0.7.24          | 33.68kb              |
| Vue                                            | 2.5.17          | 31.65kb              |
| __Riot__                                       | 3.12.0          | 10.80kb              |
| Inferno                                        | 5.4.2           | 7.79kb               |
| Preact                                         | 8.3.1           | 3.48kb               |

The above comparison includes polyfills to support old browsers like IE9 that in Riot.js are supported by default

### Browsers support

Riot is supported by all modern browsers and it does not require any additional polyfill

- IE 9+
- Edge
- Chrome
- Safari 7+
- Firefox
- Safari iOS
- Android

### Custom tags • Concise syntax • Simple API • Tiny Size

Riot brings custom tags to all modern browsers. Think React + Polymer but with enjoyable syntax and a small learning curve.

#### Tag definition

``` javascript
<timer>

  <p>Seconds Elapsed: { time }</p>

  this.time = opts.start || 0

  tick() {
    this.update({ time: ++this.time })
  }

  var timer = setInterval(this.tick, 1000)

  this.on('unmount', function() {
    clearInterval(timer)
  })

</timer>
```

[Open this example on Plunker](http://riot.js.org/examples/plunker/?app=timer)

#### Mounting

``` javascript
riot.mount('timer', { start: 0 })
```

#### Nesting

Custom tags lets you build complex views with HTML.

``` html
<timetable>
  <timer start="0"></timer>
  <timer start="10"></timer>
  <timer start="20"></timer>
</timetable>
```

HTML syntax is the de facto language on the web and it's designed for building user interfaces. The syntax is explicit, nesting is inherent to the language and attributes offer a clean way to provide options for custom tags.


### Expressions Bindings
- Absolutely the smallest possible amount of DOM updates and reflows.
- One way data flow: updates and unmounts are propagated downwards from parent to children.
- Expressions are pre-compiled and cached for high performance.
- Lifecycle events for more control.


### Close to standards
- No proprietary event system.
- Event normalization.
- The rendered DOM can be freely manipulated with other tools.
- No extra HTML root elements or `data-` attributes.
- Plays well with any frontend framework.


### Use your dearest language and tools
- Create tags with CoffeeScript, Jade, LiveScript, Typescript, ES6 or [any pre-processor](http://riot.js.org/guide/compiler/#pre-processors) you want.
- Integrate with NPM, CommonJS, AMD, Bower or Component
- Develop with [Gulp](https://github.com/e-jigsaw/gulp-riot), [Grunt](https://github.com/ariesjia/grunt-riot), [Wintersmith](https://github.com/collingreen/wintersmith-riot), [webpack*](https://github.com/riot/tag-loader), [Rollup*](https://github.com/riot/rollup-plugin-riot), [Browserify*](https://github.com/riot/riotify), [Babel*](https://github.com/riot/babel-preset-es2015-riot) or Bublé
- Test with [Karma*](https://github.com/riot/karma-riot), Mocha or whatever you like

*Note*: `*` officially maintained

### CDN hosting
- [jsDelivr](http://www.jsdelivr.com/projects/riot)
- [cdnjs](https://cdnjs.com/libraries/riot)


### Concise syntax
- Power shortcuts: `class={ enabled: is_enabled, hidden: hasErrors() }`.
- No extra brain load such as `render`, `state`, or `constructor`.
- Interpolation: `Add #{ items.length + 1 }` or `class="item { selected: flag }"`
- Compact ES6 method syntax.

### Demos
- [**Riot Examples** - Community's Official](https://github.com/riot/examples)
- [**Riot Animore** - Official Tags Animations Library](https://github.com/riot/animore)
- [Riot Todo MVC](http://todomvc.com/examples/riotjs/)
- [Hackernews reader](http://git.io/riot-hn)
- [Vuejs examples by Riotjs](https://github.com/txchen/feplay/tree/gh-pages/riot_vue)
- [Flux-like ES6 Todo](https://github.com/srackham/riot-todo)
- [Timer](http://jsfiddle.net/gnumanth/h9kuozp5/)
- [Another flux demo comparable to React ones](http://txchen.github.io/feplay/riot_flux)
- [Various experiments](http://richardbondi.net/programming/riot)
- [Isomorphic application](https://github.com/Avnerus/riot-isomorphic)
- [Isomorphic proof of concept](https://github.com/PabloSichert/isomorphic-proof-of-concept)
- [flux-riot todo](http://mingliangfeng.me/flux-riot)
- [Another Riot Todo MVC](http://nippur72.github.io/riotjs-todomvc/#/)
- [Cheft isomorphic by express](https://github.com/cheft/cheft)
- [electron-riot - Riot in an electron application](https://github.com/mike-ward/electron-riot)
- [An express, riot, jade, webpack simple boilerplate](https://github.com/revington/frontend-boilerplate)
- [Riot.js vs React.js comparison of a simple comment box](https://github.com/vitogit/riot.js-vs-react.js-comment-box)
- [Riot Seed project - webpack, routing, ava tests, dispatcher](https://github.com/continuata/riot-seed)
- [Riot-Redux League Table example](https://github.com/drewmiley/PoolLeague)
- [Riot vs React vs Ractive Counters using Redux store](https://github.com/drewmiley/ractive-react-riot-redux-counters-example)

### Books
- [Building Apps with Riot](https://bleedingedgepress.com/building-apps-with-riot/)

### Tutorials
- [Building Apps with Riot, ES6 and Webpack](http://blog.srackham.com/posts/riot-es6-webpack-apps/)
- [Building Apps with Riot, Babel, RiotControl and Webpack](https://github.com/txchen/feplay/tree/gh-pages/riot_webpack)
- [Building tabs with Riot](http://robertwpearce.com/blog/riotjs-example.html)
- [The "React tutorial" for Riot](https://juriansluiman.nl/article/154/the-react-tutorial-for-riot)
- [How to package "tag libraries" in Riot](https://github.com/ivan-saorin/riot-tutorial-tags-pack-app)
- [Another React tutorial with Riot](https://github.com/viliamjr/commentsTuto)
- [Riot Custom Tag by Example](http://www.triplet.fi/blog/riot-custom-tag-by-example/)
- [Riot Compiler Explained](http://www.triplet.fi/blog/riot-compiler-explained/)
- [Adding compiled Riot tags to your Gulp + Browserify build](http://www.triplet.fi/blog/adding_compiled_riot_tags_to_your_gulp_browserify_build/)
- [The anatomy of a tag - a primer tutorial](http://www.marcusoft.net/2015/12/riotjs-anatomy-of-a-tag.html)
- [Using TDD with Riot+mocha+chai](http://vitomd.com/blog/coding/tutorial_tdd_riot_mocha/)
- [The Basics - from ground up to connected tag-networks](http://happy-css.com/lessons/riotjs/)
- [Hello Riot.js : a quick tutorial about this awesome lib](http://vitomd.com/blog/coding/hello-riot-js-quick-tutorial-about-this-awesome-lib/)

### Video Tutorials
- [Introduction](https://www.youtube.com/watch?v=al87U6NgRTc)
- [Loops, Events and Callbacks](https://www.youtube.com/watch?v=T-ZV9dv93sw)
- [Server Rendering with Node & Express](http://youtu.be/6ww1UXGJzcs)
- [Riot And Webpack Setup](https://youtu.be/UgdZbT-KPpY)
- [Riot and Redux - Part 1](https://youtu.be/Y6vpKAGT2-8)
- [Riot and Redux - Part 2](https://youtu.be/DgM03bvgCYc)
- [Riot and Redux - Part 3](https://youtu.be/QuwnbuneAzM)
- [Riot and Redux - Part 4](https://youtu.be/qc6bjtu7KG0)
- [Riot and Redux - Part 5](https://youtu.be/M4BNsRMatVY)
- [Riot and Redux - Part 6](https://youtu.be/jr8KDpwtRsk)


### Libraries / Frameworks
- [Flux- like event controller for Riot](https://github.com/jimsparkman/RiotControl)
- [flux-riot framework](https://github.com/mingliangfeng/flux-riot)
- [Cheftjs - chinese framework for Riot](https://github.com/cheft/cheftjs)
- [Veronica - flux adaption for Riot](https://www.npmjs.com/package/veronica-x)
- [Minimal Flux dispatcher pattern](https://gist.github.com/continuata/c605846751c09a5e94d12ae8c91cbf05)
- [riot-format: a format library for riotjs, like angular $filter](https://github.com/joylei/riot-format)
- [riot-view-router: a simple state based router mixin](https://github.com/neetjn/riot-view-router)
- [riotx - Centralized State Management for riot.js](https://github.com/cam-inc/riotx)
- [storybook for riot.js components <sup>alpha</sup>](https://github.com/storybooks/storybook/tree/master/app/riot)

### Components
- [Material UI](http://kysonic.github.io/riot-mui/)
- [RiotGear Components](https://riotgear.js.org)
- [RiotGear Router](http://riotgear.js.org/components/router/)
- [Riot Bootstrap](http://cognitom.github.io/riot-bootstrap/)
- [iToolkit](https://github.com/BE-FE/iToolkit)
- [Riot Routehandler](https://github.com/crisward/riot-routehandler)-[(Demo)](http://codepen.io/crisward/pen/xwGJpM?editors=101)
- [Riot Flipcard](https://github.com/crisward/riot-flipcard) - [(Demo)](https://crisward.github.io/riot-flipcard/)
- [Riot Grid](https://github.com/crisward/riot-grid) - [(Demo)](http://codepen.io/crisward/pen/rxepMX?editors=101)
- [Riot Grid2](https://github.com/crisward/riot-grid2) - [(Demo)](http://crisward.github.io/riot-grid2/)
- [Riot Subtag](https://github.com/crisward/riot-subtag) - faster than lots of if's
- [ESLint Riot Plugin](https://github.com/txchen/eslint-plugin-riot)
- [riot-animate](https://github.com/sartaj/riot-animate)
- [Nest UI](https://github.com/fengzilong/Nest) - [(Demo)](https://fengzilong.github.io/Nest/)
- [rGrid](https://github.com/limodou/rgrid) - [(Demo)](https://limodou.github.io/rgrid/examples.html)
- [typewriter](https://github.com/amitguptagwl/web-snippets/tree/master/riotjs-components/typewriter) - [(Demo)](http://amitkumargupta.work)

### Resources
- [create-riot-app](https://github.com/alexstep/create-riot-app-ejected) dev environment
- [Riot + AngularJS](https://github.com/lucasbrigida/angular-riot)
- [Module loader for WebPack](https://www.npmjs.com/package/riotjs-loader)
- [Riot + Meteor]( https://atmospherejs.com/baysao/riotjs)
- [Riot Snake Game](http://cdn.rawgit.com/atian25/blog/master/assets/riot-snake.html)
- [Riot Tag Syntax Checker](http://cognitom.github.io/riot-checker/)
- [Riot 文档中译版](https://github.com/Centaur/riotjs_doc_cn) :cn:
- [Riot + Wintersmith](https://github.com/collingreen/wintersmith-riot)
- [Riot precompiler plugin for lineman](https://github.com/Power-Inside/lineman-riot)
- [Riot Startkit - Flux inspired skeleton app + WebPack + PostCSS](https://github.com/wbkd/riotjs-startkit)
- [Yeoman generator - Generator riot mobile](https://www.npmjs.com/package/generator-riot-mobile)
- [Yeoman generator - Generator riot element](https://www.npmjs.com/package/generator-riot-element)
- [Riot for TypeScript](https://github.com/nippur72/RiotTS)
- [Riot loader plugin for RequireJS](https://github.com/amenadiel/requirejs-riot)
- [Riot loader plugin for JSPM/SystemJS](https://github.com/amenadiel/systemjs-riot)
- [RiotJS Style Guide](https://github.com/voorhoede/riotjs-style-guide)
- [Riot Cheatsheet](http://martinmuzatko.github.io/riot-cheatsheet/)

### Performance
- **Riot vs React performance:** [(Riot version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-riot-vs-vanilla) vs [(React version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-react-vs-vanilla)

### Miscellaneous
- [Q&A with RiotJS author Tero Piirainen](http://www.triplet.fi/blog/q-and-a-with-riotjs-author-tero-piirainen/)
- [riot-detector (Chrome Extension)](https://chrome.google.com/webstore/detail/riot-detector/cnnmjeggdmicjojlnjghdgkdlijiobke)

### Editors / Editor Plugins (Syntax highlighting, autcompletion, etc...)
- [riot (Atom Package)](https://atom.io/packages/riot)
- [language-riot-tag (Atom Package)](https://github.com/dekimasoon/language-riot-tag)
  - Based on Vue's official Sublime Text highlighter
  - Note: Designed for html, not jade.
- [sublime-tag (Sublime Text)](https://github.com/crisward/sublime-tag)
- [riot-tag (Visual Studio)](https://github.com/crisward/riot-tag)
- [web-mode (Emacs)](http://web-mode.org)
  - See how to configure [#1967](https://github.com/riot/riot/issues/1967)

### How to contribute

If you are reading this it's already a good sign and we are thankful for it! We try our best working as much as we could on riot but your help is always appreciated.

If you want to contribute to riot helping us maintaining the project please check first the list of [our open issues](https://github.com/riot/riot/issues) to understand whether there is a task where you could help.

Riot is mainly developed on UNIX systems so you will be able to run all the commands necessary to build and test the library using our [Makefile](Makefile). If you are on a Microsoft machine it could be harder to set up you development environment properly.

Following the steps below you should be able to properly submit your patch to the project

#### 1) Clone the repo and browse to the riot folder

```shell
$ git clone git@github.com:riot/riot.git && cd riot
```
#### 2) Set up your git branch

```shell
$ git checkout -b feature/my-awesome-patch
```

#### 3) Install the npm dependencies

```shell
$ npm i
```

#### 4) Build and test riot using the Makefile

```shell
# To build and test riot
$ make riot

# To build without testing
$ make raw

# To build anytime you change a src file
$ make watch

# To bench riot
$ make perf
```

#### 5) Pull request only against the `dev` branch making sure you have read [our pull request template](.github/PULL_REQUEST_TEMPLATE.md)

#### 6) Be patient


### Credits

Riot is made with :heart: by many smart people from all over the world. Thanks to all the contributors<br>
It's actively maintained by:
<table>
  <tbody>
    <tr>
      <td valign="top">
        <img width="125" height="125" src="https://github.com/GianlucaGuarini.png?s=125?s=125">
        <br>
        <a href="https://github.com/GianlucaGuarini">Gianluca Guarini</a>
      </td>
     </tr>
  </tbody>
</table>

## Official Website

http://riot.js.org

## Backers

Support us with a monthly donation and help us continue our activities. [Become a backer][support-url]

[![Backers][backers-image]][support-url]

## Sponsors

Become a sponsor to get your logo on our README. [Become a sponsor][support-url]

[![Sponsors][sponsors-image]][support-url]

## Thanks

Special thanks to Browserstack for their support

<a href='https://www.browserstack.com/'>
  <img width='70px' src="https://cdn.worldvectorlogo.com/logos/browserstack.svg" alt="browser stack">
</a>

[travis-image]:https://img.shields.io/travis/riot/riot.svg?style=flat-square
[travis-url]:https://travis-ci.org/riot/riot

[license-image]:http://img.shields.io/badge/license-MIT-000000.svg?style=flat-square
[license-url]:LICENSE.txt

[npm-version-image]:http://img.shields.io/npm/v/riot.svg?style=flat-square
[npm-downloads-image]:http://img.shields.io/npm/dm/riot.svg?style=flat-square
[npm-url]:https://npmjs.org/package/riot

[riot-forum-image]:https://img.shields.io/badge/muut-JOIN_FORUM%E2%86%92-ff0044.svg?style=flat-square
[riot-forum-url]:http://riot.js.org/forum/

[coverage-image]:https://img.shields.io/coveralls/riot/riot/dev.svg?style=flat-square
[coverage-url]:https://coveralls.io/r/riot/riot?branch=dev

[saucelabs-image]:https://saucelabs.com/browser-matrix/testsriotjs.svg?1
[saucelabs-url]:https://saucelabs.com/u/testsriotjs

[gitter-image]:https://img.shields.io/badge/GITTER-JOIN_CHAT_%E2%86%92-1dce73.svg?style=flat-square
[gitter-url]:https://gitter.im/riot/riot?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge

[slack-ja-image]:https://img.shields.io/badge/SLACK_(ja)-JOIN_CHAT_%E2%86%92-551a8b.svg?style=flat-square
[slack-ja-url]:https://riot-jp-slackin.herokuapp.com/

[codeclimate-image]:https://api.codeclimate.com/v1/badges/b81ddf3c77e8189876da/maintainability
[codeclimate-url]:https://codeclimate.com/github/riot/riot

[donations-campaign-url]:https://pledgie.com/campaigns/31139
[donations-campaign-image]:https://pledgie.com/campaigns/31139.png?skin_name=chrome

[jsdelivr-image]: https://data.jsdelivr.com/v1/package/npm/riot/badge
[jsdelivr-url]: https://www.jsdelivr.com/package/npm/riot


[backer-url]: #backers
[backer-badge]: https://opencollective.com/riot/backers/badge.svg?color=blue
[sponsor-url]: #sponsors
[sponsor-badge]: https://opencollective.com/riot/sponsors/badge.svg?color=blue

[support-url]: https://opencollective.com/riot#support

[lib-size]: http://img.badgesize.io/https://unpkg.com/riot/riot.min.js?compression=gzip

[backers-image]: https://opencollective.com/riot/backers.svg
[sponsors-image]: https://opencollective.com/riot/sponsors.svg
# Spine
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/spine/spine?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://secure.travis-ci.org/spine/spine.svg)](http://travis-ci.org/spine/spine)

Spine is a lightweight MVC library for building JavaScript web applications. Spine gives you structure and then gets out of your way, allowing you to concentrate on the fun stuff: building awesome web applications.

Spine is opinionated in its approach to web application architecture and design. Spine's architecture complements patterns such as de-coupled components and CommonJS modules, markedly helping with code quality and maintainability.

The library is written in [CoffeeScript](http://coffeescript.org), and though it doesn't necessarily require CoffeeScript to develop applications - you can use whichever language you're most familiar with or prefer - the documentation and some associated tools like [Hem](https://github.com/spine/hem) and [spine.app](https://github.com/spine/spine.app) cater to those who prefer CoffeeScript's syntax.

## Learn it

Documentation is often incomplete or just lies waiting to happen. Approachable source code reduces knowledge dependencies. This is an area where Spine really excells compared to other MVC frameworks. Spine is tiny; the core library comes in at less than 700 lines of CoffeeScript code. It is written in such a way to prefer readability over terseness or clever tricks, and it is small enough that within a rather small timeframe you can understand how all the pieces work together. Expertise is achievable within days or weeks rather than months or years. For these reasons, remaining lightweight and simple is fundamental to Spine.

For documentation, usage, and examples, see: [spinejs.com](http://spinejs.com)

The test suite can also occasionally provide additional useful examples, especially if you are looking for non-coffeescript examples.

# Contributing

## Reporting issues

To file a bug report, please visit the [GitHub issues page](https://github.com/spine/spine/issues).  It's great if you can attach code (test cases and fixes for bugs, and test cases and a proposed implementation for features), but reproducible bug reports are also welcome. 

For support or help with using spine please use the [Spine Google Group](https://groups.google.com/forum/#!forum/spinejs) and/or StackOverflow rather than opening an issue on Github. If you post in those places you are more likely to get more people to chime in, and others can benefit from it more readily.

## Cloning master and running the test suite

To get started contributing to Spine, first clone the repository and make sure you can run the test suite.  If you're not familiar with Git, visit the [Git homepage](http://git-scm.com) to download Git for your platform.

First, clone the repository:

```
$ git clone git://github.com/spine/spine.git
$ cd spine
```

Next, You will need node and npm to pull in the testing libraries. Once you're all set with those then from within the Spine repo directory run 

```
$ npm install .
```

This should bring in [Jasmine](http://jasmine.github.io/), Coffeescript, and a minimalist local server for running the tests a browser. You can also simply open `test/index.html` in a browser to run the [Jasmine](http://jasmine.github.io/) test suite for spine core.  If you see all the tests passing, you're ready to contribute! A known issue is that some of the routing tests will fail if you are simply using a `file://` protocol in the browser. This has to do with browser security. You can avoid this by running the local server, `$ npm start`. Alternatively you can use a server like Apache or Nginx to serve the test files to the browser. 

If you have [phantom.js](http://phantomjs.org/) available then a script is included to make running tests even slicker!

```
$ npm test
```

## Contributing to the Spine documentation

Perhaps the easiest way to get started with contributing is through the docs.  If you find typos, bugs, or omissions in the docs, please submit a pull request to fix.  The Spine website [spinejs.com](http://spinejs.com), which is the primary documentation, is a very simple rails app [spine.site](https://github.com/spine/spine.site). You don't need to know Rails or Ruby to contribute. The vast majority of it is in Markdown

## Contributing to the Spine code

This recommended contribution process is based on the [Ruby on Rails contribution guide](http://edgeguides.rubyonrails.org/contributing_to_ruby_on_rails.html#contributing-to-the-rails-code).  In general, please include tests with new features or bugfixes, work in a feature branch until you're ready to submit or discuss your code, then fork the repository, push to your fork, and issue a pull request.

### CoffeeScript

When submitting a pull request for code, please submit in CoffeeScript. Building the effected js files is required for testing sake, but submitting those js files is optional.

Assuming you have Node.js and npm already installed then proceed by installing local dev dependencies:

```
$ npm install .
```

Then use the provided build scripts to compile your CoffeeScript files:

```
$ cake build
$ cake watch
```

These tasks use a locally installed copy of CoffeeScript to ensure all contributors use the same version of the compiler.

### Git

Let's say I'm going to submit a patch to add someFeatureFix:

```
$ git checkout dev
```

Feature branches should start from `dev` **not** `master`. If you branch off of, or do builds on the master branch you will get CoffeeScript source map files, which are cool, but tend to ruin automatic merges with git.

```
$ git checkout -b someFeatureFix
$ vim test/...
  # (...add tests...)
$ cake watch
  # (...this should recompile and changes you make in your CoffeeScript...)

-- figure out what spine module your changes belong in
$ vim src/spine.coffee
or
$ vim src/[otherSpineComponent].coffee
  # (...add the feature/fix...)
$ open test/index.html
  # (...make sure tests run for each component that was changed...)
  # (...test in other browsers with various jquery versions if you feel like there is risk... )
$ git commit -m "Add Some Feature Fix"
```

Then, [fork the Spine repository](https://github.com/spine/spine/fork), and push your branch to your fork:

```
$ git remote add <your user name> git@github.com:<your user name>/spine.git
$ git push <your user name> someFeatureFix
```

Finally, issue a pull request from inside the GitHub interface to the `dev` branch of spine, and your contribution is ready for consideration, discussion, and (hopefully) merging in!
# ![TodoMVC](media/logo.png)

> Helping you select an MV\* framework

### [Website](http://todomvc.com)&nbsp;&nbsp;&nbsp;&nbsp;[Blog](http://blog.tastejs.com)&nbsp;&nbsp;&nbsp;&nbsp;[TasteJS](http://tastejs.com)

[![Build Status](https://travis-ci.org/tastejs/todomvc.svg)](https://travis-ci.org/tastejs/todomvc)
[![Cypress.io tests](https://img.shields.io/badge/cypress.io-tests-green.svg?style=flat-square)](https://dashboard.cypress.io/#/projects/n4ynap/runs)

Developers these days are spoiled with choice when it comes to selecting an MV\* framework for structuring and organizing JavaScript web apps.

Backbone, Ember, AngularJS... the list of new and stable solutions goes on and on, but just how do you decide on which to use in a sea of so many options?

To help solve this problem, we created TodoMVC - a project which offers the same Todo application implemented using MV* concepts in most of the popular JavaScript MV\* frameworks of today.


## Team

TodoMVC would not be possible without a strong team of [contributors](https://github.com/tastejs/todomvc/contributors) helping push the project forward each day. Additionally, we have a core project team composed of:

#### [Addy Osmani](https://github.com/addyosmani) - Founder/Lead

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/96270e4c3e5e9806cf7245475c00b275.png?s=40">
  Addy is a Software Engineer at Google who originally created TodoMVC. He oversees the project direction, maintenance and organizes the planning and development efforts of the team.

#### [Sindre Sorhus](https://github.com/sindresorhus) - Lead Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9.png?s=40">
Sindre is a Web Developer who leads core development, quality control and application design for the project. His engineering contributions have helped us ensure consistency and best practices are enforced wherever possible. Sindre also leads up development of the TodoMVC application spec.

#### [Pascal Hartig](https://github.com/passy) - Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/be451fcdbf0e5ff07f23ed16cb5c90a3.png?s=40">
Pascal is a Software Engineer at Twitter with a deep passion for consistency. He watches pull requests and helps developers getting their contributions integrated with TodoMVC.

#### [Stephen Sawchuk](https://github.com/stephenplusplus) - Developer

<img align="left" width="40" height="40" src="https://avatars3.githubusercontent.com/u/723048?v=2&s=40">
Stephen is a Front-end Engineer at Quicken Loans that cares about improving the maintainability and developer experience of open-source projects. His recent contributions include helping us move all apps over to using Bower and implementing the new information bar.

#### [Colin Eberhardt](https://github.com/colineberhardt) - Developer

<img align="left" width="40" height="40" src="https://secure.gravatar.com/avatar/73bba00b41ff1c9ecc3ee29487bace7d?s=40">
Colin is a software consultant at Scott Logic who is passionate about all software - from JavaScript to Java, and C# to Objective-C. His recent contribution to the project has been a fully automated test suite.

#### [Sam Saccone](https://github.com/samccone) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/userimage/602125/f2f1d93164ec62b527f0398c65b2d1f3.jpg?size=40">
Sam is a Software Engineer at Google who is driven by an endless desire to create, solve problems, and improve developers' lives.

#### [Arthur Verschaeve](https://github.com/arthurvr) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/avatar/e34daab0d2e344219adb5234198269c5?size=40">
Arthur is an open-source fanboy from Belgium. He is passionate about developer tooling and all things JavaScript.

#### [Fady Samir Sadek](https://github.com/FadySamirSadek) - Developer

<img align="left" width="40" height="40" src="https://avatars2.githubusercontent.com/u/7483806?s=40&u=99b3958687789735c12cf736332361a06b951355&v=4">
Fady is a front-end developer who loves all things JavaScript and enjoys solving real world problems using the web platform and helping other developers do the same. He currently leads maintenance of the project and ensures that the project is friendly for new contributors and upcoming developers.

#### [Gianni Chiappetta](https://github.com/gf3) - Logo designer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/4b0209ae3652cc5a7d53545e759fbe39.png?s=40">
Gianni is a programmer and designer currently working as the Chief Rigger at MetaLab.

## Disclaimer

<img align="right" width="230" height="230" src="media/icon-small.png">

TodoMVC has been called many things including the 'Speed-dating' and 'Rosetta Stone' of MV\* frameworks. Whilst we hope that this project can offer assistance in deciding what frameworks are worth spending more time looking at, remember that the Todo application offers a limited view of a framework's potential capability.

It is meant to be used as a gateway to reviewing how a basic application using a framework may be structured, and we heavily recommend investing time researching a solution in more depth before opting to use it.

Also, please keep in mind that TodoMVC is not the perfect way to compare the size of different frameworks. We intentionally use the unminified versions to make reading the source code easier.


## Getting Involved

Whilst we enjoy implementing and improving existing Todo apps, we're always interested in speaking to framework authors (and users) wishing to share Todo app implementations in their framework/solution of choice.

Check out our [contribution docs](contributing.md) for more info.


## License

Everything in this repo is MIT License unless otherwise specified.

[MIT](license.md) © Addy Osmani, Sindre Sorhus, Pascal Hartig, Stephen Sawchuk.
<p align="center"><a href="https://vuejs.org" target="_blank"><img width="100"src="https://vuejs.org/images/logo.png"></a></p>

<p align="center">
  <a href="https://circleci.com/gh/vuejs/vue/tree/dev"><img src="https://img.shields.io/circleci/project/vuejs/vue/dev.svg" alt="Build Status"></a>
  <a href="https://codecov.io/github/vuejs/vue?branch=dev"><img src="https://img.shields.io/codecov/c/github/vuejs/vue/dev.svg" alt="Coverage Status"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/dm/vue.svg" alt="Downloads"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/v/vue.svg" alt="Version"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/l/vue.svg" alt="License"></a>
  <a href="https://chat.vuejs.org/"><img src="https://img.shields.io/badge/chat-on%20discord-7289da.svg" alt="Chat">
  <br>
  <a href="https://saucelabs.com/u/vuejs"><img src="https://saucelabs.com/browser-matrix/vuejs.svg" alt="Sauce Test Status"></a>
</p>

<h2 align="center">Supporting Vue.js</h2>

Vue.js is an MIT-licensed open source project. It's an independent project with its ongoing development made possible entirely thanks to the support by these awesome [backers](https://github.com/vuejs/vue/blob/dev/BACKERS.md). If you'd like to join them, please consider:

- [Become a backer or sponsor on Patreon](https://www.patreon.com/evanyou).
- [Become a backer or sponsor on OpenCollective](https://opencollective.com/vuejs).

#### What's the difference between Patreon and OpenCollective?

Funds donated via Patreon goes directly to support Evan You's full-time work on Vue.js. Funds donated via OpenCollective are managed with transparent expenses and will be used for compensating work and expenses by core team members or sponsoring community events. Your name/logo will receive proper recognition and exposure by donating on either platform.

<h3 align="center">Sponsors via Patreon</h3>

<h4 align="center">Platinum</h4>

<p align="center">
  <a href="https://stdlib.com">
    <img width="240px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/stdlib.png">
  </a>
  <br><br>
  <a href="https://xiaozhuanlan.com">
    <img width="160px" src="https://raw.githubusercontent.com/vuejs/cn.vuejs.org/master/themes/vue/source/images/xiaozhuanlan.png">
  </a>
</p>

<h4 align="center">Gold</h4>

<table>
  <tbody>
    <tr>
      <td align="center" valign="middle">
        <a href="https://deepstreamhub.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/deepstream.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://jsfiddle.net/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/jsfiddle.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://laravel.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/laravel.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://chaitin.cn/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/chaitin.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://htmlburger.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/htmlburger.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://starter.someline.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/someline.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="http://monterail.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/monterail.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.2mhost.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/2mhost.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://vuejsjob.com/?ref=vuejs" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/vuejobs.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://leanpub.com/vuejs2" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tmvuejs2.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://component.io/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/component_io.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.v2ex.com/t/379389" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/v2exer.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="https://www.xfive.co/" target="_blank">
          <img width="80px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/xfive.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://www.frontenddevelopermeetups.com/" target="_blank">
          <img width="160px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/frontend-meetups.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://onsen.io/vue/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/onsen-ui.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://tooltwist.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tooltwist.png">
        </a>
      </td>
    </tr>
  </tbody>
</table>

<h3 align="center">Sponsors via OpenCollective</h3>

<h4 align="center">Platinum</h4>

<a href="https://opencollective.com/vuejs/platinumsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/platinumsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/1/avatar.svg"></a>

<h4 align="center">Gold</h4>

<a href="https://opencollective.com/vuejs/goldsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/bronzesponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/bronzesponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/2/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/2/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/3/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/3/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/4/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/4
  /avatar.svg"></a>

---

## Introduction

Vue (pronounced `/vjuː/`, like view) is a **progressive framework** for building user interfaces. It is designed from the ground up to be incrementally adoptable, and can easily scale between a library and a framework depending on different use cases. It consists of an approachable core library that focuses on the view layer only, and an ecosystem of supporting libraries that helps you tackle complexity in large Single-Page Applications.

#### Browser Compatibility

Vue.js supports all browsers that are [ES5-compliant](http://kangax.github.io/compat-table/es5/) (IE8 and below are not supported).

## Ecosystem

| Project | Status | Description |
|---------|--------|-------------|
| [vue-router]          | [![vue-router-status]][vue-router-package] | Single-page application routing |
| [vuex]                | [![vuex-status]][vuex-package] | Large-scale state management |
| [vue-cli]             | [![vue-cli-status]][vue-cli-package] | Project scaffolding |
| [vue-loader]          | [![vue-loader-status]][vue-loader-package] | Single File Component (`*.vue` file) loader for webpack |
| [vue-server-renderer] | [![vue-server-renderer-status]][vue-server-renderer-package] | Server-side rendering support |
| [vue-class-component] | [![vue-class-component-status]][vue-class-component-package] | TypeScript decorator for a class-based API |
| [vue-rx]              | [![vue-rx-status]][vue-rx-package] | RxJS integration |
| [vue-devtools]        | [![vue-devtools-status]][vue-devtools-package] | Browser DevTools extension |

[vue-router]: https://github.com/vuejs/vue-router
[vuex]: https://github.com/vuejs/vuex
[vue-cli]: https://github.com/vuejs/vue-cli
[vue-loader]: https://github.com/vuejs/vue-loader
[vue-server-renderer]: https://github.com/vuejs/vue/tree/dev/packages/vue-server-renderer
[vue-class-component]: https://github.com/vuejs/vue-class-component
[vue-rx]: https://github.com/vuejs/vue-rx
[vue-devtools]:  https://github.com/vuejs/vue-devtools

[vue-router-status]: https://img.shields.io/npm/v/vue-router.svg
[vuex-status]: https://img.shields.io/npm/v/vuex.svg
[vue-cli-status]: https://img.shields.io/npm/v/vue-cli.svg
[vue-loader-status]: https://img.shields.io/npm/v/vue-loader.svg
[vue-server-renderer-status]: https://img.shields.io/npm/v/vue-server-renderer.svg
[vue-class-component-status]: https://img.shields.io/npm/v/vue-class-component.svg
[vue-rx-status]: https://img.shields.io/npm/v/vue-rx.svg
[vue-devtools-status]: https://img.shields.io/chrome-web-store/v/nhdogjmejiglipccpnnnanhbledajbpd.svg

[vue-router-package]: https://npmjs.com/package/vue-router
[vuex-package]: https://npmjs.com/package/vuex
[vue-cli-package]: https://npmjs.com/package/vue-cli
[vue-loader-package]: https://npmjs.com/package/vue-loader
[vue-server-renderer-package]: https://npmjs.com/package/vue-server-renderer
[vue-class-component-package]: https://npmjs.com/package/vue-class-component
[vue-rx-package]: https://npmjs.com/package/vue-rx
[vue-devtools-package]: https://chrome.google.com/webstore/detail/vuejs-devtools/nhdogjmejiglipccpnnnanhbledajbpd

## Documentation

To check out live examples and docs, visit [vuejs.org](https://vuejs.org).

## Questions

For questions and support please use the [the official forum](http://forum.vuejs.org) or [community chat](https://chat.vuejs.org/). The issue list of this repo is **exclusively** for bug reports and feature requests.

## Issues

Please make sure to read the [Issue Reporting Checklist](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md#issue-reporting-guidelines) before opening an issue. Issues not conforming to the guidelines may be closed immediately.

## Changelog

Detailed changes for each release are documented in the [release notes](https://github.com/vuejs/vue/releases).

## Stay In Touch

- [Twitter](https://twitter.com/vuejs)
- [Blog](https://medium.com/the-vue-point)
- [Job Board](https://vuejobs.com/?ref=vuejs)

## Contribution

Please make sure to read the [Contributing Guide](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md) before making a pull request. If you have a Vue-related project/component/tool, add it with a pull-request to [this curated list](https://github.com/vuejs/awesome-vue)!

Thank you to all the people who already contributed to Vue!

<a href="https://github.com/vuejs/vue/graphs/contributors"><img src="https://opencollective.com/vuejs/contributors.svg?width=890" /></a>


## License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2013-present, Yuxi (Evan) You
[![Build Status](https://travis-ci.org/angular/angular.svg?branch=master)](https://travis-ci.org/angular/angular)
[![CircleCI](https://circleci.com/gh/angular/angular/tree/master.svg?style=shield)](https://circleci.com/gh/angular/angular/tree/master)
[![BrowserStack Status](https://www.browserstack.com/automate/badge.svg?badge_key=LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)](https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)
[![Join the chat at https://gitter.im/angular/angular](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/angular/angular?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![npm version](https://badge.fury.io/js/%40angular%2Fcore.svg)](https://www.npmjs.com/@angular/core)


# Angular

Angular is a development platform for building mobile and desktop web applications using Typescript/JavaScript and other languages.

## Quickstart

[Get started in 5 minutes][quickstart].


## Changelog

[Learn about the latest improvements][changelog]. 


## Want to help?

Want to file a bug, contribute some code, or improve documentation? Excellent! Read up on our
guidelines for [contributing][contributing] and then check out one of our issues in the [hotlist: community-help](https://github.com/angular/angular/labels/hotlist%3A%20community-help).

[browserstack]: https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06
[contributing]: https://github.com/angular/angular/blob/master/CONTRIBUTING.md
[quickstart]: https://angular.io/guide/quickstart
[changelog]: https://github.com/angular/angular/blob/master/CHANGELOG.md
[ng]: https://angular.io
# aurelia-framework

[![npm Version](https://img.shields.io/npm/v/aurelia-framework.svg)](https://www.npmjs.com/package/aurelia-framework)
[![ZenHub](https://raw.githubusercontent.com/ZenHubIO/support/master/zenhub-badge.png)](https://zenhub.io)
[![Join the chat at https://gitter.im/aurelia/discuss](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/aurelia/discuss?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![CircleCI](https://circleci.com/gh/aurelia/framework.svg?style=shield)](https://circleci.com/gh/aurelia/framework)

This library is part of the [Aurelia](http://www.aurelia.io/) platform and contains the aurelia framework which brings together all the required core aurelia libraries into a ready-to-go application-building platform.

> To keep up to date on [Aurelia](http://www.aurelia.io/), please visit and subscribe to [the official blog](http://blog.aurelia.io/) and [our email list](http://eepurl.com/ces50j). We also invite you to [follow us on twitter](https://twitter.com/aureliaeffect). If you have questions look around our [Discourse forums](https://discourse.aurelia.io/), chat in our [community on Gitter](https://gitter.im/aurelia/discuss) or use [stack overflow](http://stackoverflow.com/search?q=aurelia). Documentation can be found [in our developer hub](http://aurelia.io/docs). If you would like to have deeper insight into our development process, please install the [ZenHub](https://zenhub.io) Chrome or Firefox Extension and visit any of our repository's boards.

## Documentation

You can read the documentation for the aurelia framework [here](http://aurelia.io/docs). If you would like to help improve this documentation, the source for many of the docs can be found in the doc folder within this repository. Other docs, not related to the general framework, but directed at specific libraries, can be found in the doc folder of those libraries.

## Platform Support

This library can be used in the **browser** only.

## Building The Code

To build the code, follow these steps.

1. Ensure that [NodeJS](http://nodejs.org/) is installed. This provides the platform on which the build tooling runs.
2. From the project folder, execute the following command:

  ```shell
  npm install
  ```
3. Ensure that [Gulp](http://gulpjs.com/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g gulp
  ```
4. To build the code, you can now run:

  ```shell
  gulp build
  ```
5. You will find the compiled code in the `dist` folder, available in three module formats: AMD, CommonJS and ES6.

6. See `gulpfile.js` for other tasks related to generating the docs and linting.

## Running The Tests

To run the unit tests, first ensure that you have followed the steps above in order to install all dependencies and successfully build the library. Once you have done that, proceed with these additional steps:

1. Ensure that the [Karma](http://karma-runner.github.io/) CLI is installed. If you need to install it, use the following command:

  ```shell
  npm install -g karma-cli
  ```
2. Ensure that [jspm](http://jspm.io/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g jspm
  ```
3. Install the client-side dependencies with jspm:

  ```shell
  jspm install
  ```

4. You can now run the tests with this command:

  ```shell
  karma start
  ```
dojo
====

This is the foundation package for the Dojo 1 Toolkit.  While still being maintained, new development is primarily focused on modern Dojo.

Checkout the [Dojo framework website](https://dojo.io/) or if you want a more detailed technical status and overview, checkout the [`Dojo roadmap`](https://dojo.io/community/).

This package is sometimes
referred to as the “core”, it contains the most generally applicable sub-packages
and modules. The dojo package covers a wide range of functionality like Ajax, DOM
manipulation, class-type programming, events, promises, data stores,
drag-and-drop and internationalization libraries.

Installing
----------

Installation instructions are available at
[dojotoolkit.org/download](<http://dojotoolkit.org/download/>).

Getting Started
---------------

If you are starting out with Dojo, the following resources are available to you:

-   [Tutorials](<http://dojotoolkit.org/documentation/>)

-   [Reference Guide](<http://dojotoolkit.org/reference-guide/>)

-   [API Documentation](<http://dojotoolkit.org/api/>)

-   [Community Forum](<http://dojotoolkit.org/community/>)

What to Use Dojo For and When to Use It
---------------------------------------

The following is a brief sampling of some of the areas where Dojo may prove to
be the right tool for your next project:

-   For keeping your code fast and maintainable, Dojo offers an asynchronous
    module definition (AMD) loader -- encapsulating pieces of code into useful
    units, loading small JavaScript files only when they are needed, and loading
    files separately even when they are dependent on one another.

-   When you want to easily extend existing classes, share functionality among a
    number of classes, and maximize code reuse, Dojo provides class-like
    inheritance and “mixins.”

-   For creating advanced and customizable user interfaces out of refined,
    efficient, and modular pieces, Dojo’s Dijit framework offers several dozen
    enterprise-ready widgets -- including buttons, textboxes, form widgets with
    built-in validation, layout elements, and much more -- along with themes to
    lend them a consistent look. All of this is available for mobile
    environments as well.

-   For working with advanced vector graphics, Dojo’s GFX API can render
    graphics in a wide variety of formats, with support for seamless
    manipulation (skewing, rotating, resizing), gradients, responding to mouse
    events, and more.

-   The `dojox/charting` library supports powerful data visualization and
    dynamic charting, including a variety of 2D plots and animated charting
    elements.

-   When you need feature-rich, lightweight, and mobile-friendly grids/tables,
    Dojo offers the `dgrid` widget, along with customizable default themes and
    accompanying features such as in-cell editing, row/cell selection, column
    resizing/reordering, keyboard handling, pagination, and more.

-   Dojo is the officially supported framework for the ArcGIS API for
    JavaScript, one of the most widely used enterprise-grade APIs for web
    mapping and spatial analysis -- learning to use Dojo will open doors to
    creating richer web mapping applications using that API.

License and Copyright
---------------------

The Dojo Toolkit (including this package) is dual licensed under BSD 3-Clause
and AFL. For more information on the license please see the [License
Information](<http://dojotoolkit.org/license>). The Dojo Toolkit is Copyright
(c) 2005-2018, JS Foundation. All rights reserved.
<p align="center">
  <a href="https://emberjs.com"><img width="300" src="https://raw.githubusercontent.com/emberjs/website/master/source/images/brand/ember_Ember-Light.png"></a>
</p>

<p align="center">
  <a href="http://travis-ci.org/emberjs/ember.js"><img src="https://secure.travis-ci.org/emberjs/ember.js.svg?branch=master" alt="Build Status"></a>
  <a href="https://codeclimate.com/github/emberjs/ember.js"><img src="https://codeclimate.com/github/emberjs/ember.js.svg" alt="Code Climate"></a>
  <a href="https://discord.gg/zT3asNS"><img src="https://img.shields.io/discord/480462759797063690.svg?logo=discord" alt="Discord Community Server"></a>
</p>

Ember.js is a JavaScript framework that greatly reduces the time, effort and resources needed
to build any web application. It is focused on making you, the developer, as productive as possible by doing all the common, repetitive, yet essential, tasks involved in most web development projects.

Ember.js also provides access to the most advanced features of JavaScript, HTML and the Browser giving you everything you need to create your next killer web app.

- [Website](https://emberjs.com)
- [Guides](https://guides.emberjs.com)
- [API](https://emberjs.com/api)
- [Community](https://emberjs.com/community)
- [Blog](https://emberjs.com/blog)
- [Builds](https://emberjs.com/builds)

# Contribution

See [CONTRIBUTING.md](https://github.com/emberjs/ember.js/blob/master/CONTRIBUTING.md)

---

Cross-browser testing provided by:

<a href="http://browserstack.com"><img height="70" src="https://p3.zdusercontent.com/attachment/1015988/PWfFdN71Aung2evRkIVQuKJpE?token=eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0..aUrNFb8clSXsFwgw5BUTcg.IJr5piuCen7PmSSBHSrOnqM9K5YZfxX3lvbp-5LCqoKOi4CjjgdA419iqjofs0nLtm26FMURvZ8JRTuKB4iHer6lGu5f8dXHtIkYAHjP5fXDWkl044Yg2mSdrhF6uPy62GdlBYoYxwvgkNrac8nN_In8GY-qOC7bYmlZyJT7tsTZUTYbNMQiXS86YA5LgdCEWzWreMvc3C6cvZtVXIrcVgpkroIhvsTQPm4vQA-Uq6iCbTPA4oX5cpEtMtrlg4jYBnnAE4BTw5UwU_dY83ep5g.7wpc1IKv0rSRGsvqCG_q3g" alt="BrowserStack"></a>
# [React](https://reactjs.org/) &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/facebook/react/blob/master/LICENSE) [![npm version](https://img.shields.io/npm/v/react.svg?style=flat)](https://www.npmjs.com/package/react) [![Coverage Status](https://img.shields.io/coveralls/facebook/react/master.svg?style=flat)](https://coveralls.io/github/facebook/react?branch=master) [![CircleCI Status](https://circleci.com/gh/facebook/react.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/facebook/react) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://reactjs.org/docs/how-to-contribute.html#your-first-pull-request)

React is a JavaScript library for building user interfaces.

* **Declarative:** React makes it painless to create interactive UIs. Design simple views for each state in your application, and React will efficiently update and render just the right components when your data changes. Declarative views make your code more predictable, simpler to understand, and easier to debug.
* **Component-Based:** Build encapsulated components that manage their own state, then compose them to make complex UIs. Since component logic is written in JavaScript instead of templates, you can easily pass rich data through your app and keep state out of the DOM.
* **Learn Once, Write Anywhere:** We don't make assumptions about the rest of your technology stack, so you can develop new features in React without rewriting existing code. React can also render on the server using Node and power mobile apps using [React Native](https://facebook.github.io/react-native/).

[Learn how to use React in your own project](https://reactjs.org/docs/getting-started.html).

## Installation

React has been designed for gradual adoption from the start, and **you can use as little or as much React as you need**:

* Use [Online Playgrounds](https://reactjs.org/docs/getting-started.html#online-playgrounds) to get a taste of React.
* [Add React to a Website](https://reactjs.org/docs/add-react-to-a-website.html) as a `<script>` tag in one minute.
* [Create a New React App](https://reactjs.org/docs/create-a-new-react-app.html) if you're looking for a powerful JavaScript toolchain.

You can use React as a `<script>` tag from a [CDN](https://reactjs.org/docs/cdn-links.html), or as a `react` package on [npm](https://www.npmjs.com/).

## Documentation

You can find the React documentation [on the website](https://reactjs.org/docs).  

Check out the [Getting Started](https://reactjs.org/docs/getting-started.html) page for a quick overview.

The documentation is divided into several sections:

* [Tutorial](https://reactjs.org/tutorial/tutorial.html)
* [Main Concepts](https://reactjs.org/docs/hello-world.html)
* [Advanced Guides](https://reactjs.org/docs/jsx-in-depth.html)
* [API Reference](https://reactjs.org/docs/react-api.html)
* [Where to Get Support](https://reactjs.org/community/support.html)
* [Contributing Guide](https://reactjs.org/docs/how-to-contribute.html)

You can improve it by sending pull requests to [this repository](https://github.com/reactjs/reactjs.org).

## Examples

We have several examples [on the website](https://reactjs.org/). Here is the first one to get you started:

```jsx
class HelloMessage extends React.Component {
  render() {
    return <div>Hello {this.props.name}</div>;
  }
}

ReactDOM.render(
  <HelloMessage name="Taylor" />,
  document.getElementById('container')
);
```

This example will render "Hello Taylor" into a container on the page.

You'll notice that we used an HTML-like syntax; [we call it JSX](https://reactjs.org/docs/introducing-jsx.html). JSX is not required to use React, but it makes code more readable, and writing it feels like writing HTML. If you're using React as a `<script>` tag, read [this section](https://reactjs.org/docs/add-react-to-a-website.html#optional-try-react-with-jsx) on integrating JSX; otherwise, the [recommended JavaScript toolchains](https://reactjs.org/docs/create-a-new-react-app.html) handle it automatically.

## Contributing

The main purpose of this repository is to continue to evolve React core, making it faster and easier to use. Development of React happens in the open on GitHub, and we are grateful to the community for contributing bugfixes and improvements. Read below to learn how you can take part in improving React.

### [Code of Conduct](https://code.facebook.com/codeofconduct)

Facebook has adopted a Code of Conduct that we expect project participants to adhere to. Please read [the full text](https://code.facebook.com/codeofconduct) so that you can understand what actions will and will not be tolerated.

### [Contributing Guide](https://reactjs.org/contributing/how-to-contribute.html)

Read our [contributing guide](https://reactjs.org/contributing/how-to-contribute.html) to learn about our development process, how to propose bugfixes and improvements, and how to build and test your changes to React.

### Good First Issues

To help you get your feet wet and get you familiar with our contribution process, we have a list of [good first issues](https://github.com/facebook/react/labels/good%20first%20issue) that contain bugs which have a relatively limited scope. This is a great place to get started.

### License

React is [MIT licensed](./LICENSE).
     ____                     __      __
    /\  _`\                  /\ \    /\ \                                   __
    \ \ \ \ \     __      ___\ \ \/'\\ \ \____    ___     ___      __      /\_\    ____
     \ \  _ <'  /'__`\   /'___\ \ , < \ \ '__`\  / __`\ /' _ `\  /'__`\    \/\ \  /',__\
      \ \ \ \ \/\ \ \.\_/\ \__/\ \ \\`\\ \ \ \ \/\ \ \ \/\ \/\ \/\  __/  __ \ \ \/\__, `\
       \ \____/\ \__/.\_\ \____\\ \_\ \_\ \_,__/\ \____/\ \_\ \_\ \____\/\_\_\ \ \/\____/
        \/___/  \/__/\/_/\/____/ \/_/\/_/\/___/  \/___/  \/_/\/_/\/____/\/_/\ \_\ \/___/
                                                                           \ \____/
                                                                            \/___/
    (_'_______________________________________________________________________________'_)
    (_.———————————————————————————————————————————————————————————————————————————————._)


Backbone supplies structure to JavaScript-heavy applications by providing models with key-value binding and custom events, collections with a rich API of enumerable functions, views with declarative event handling, and connects it all to your existing application over a RESTful JSON interface.

For Docs, License, Tests, pre-packed downloads, and everything else, really, see:
http://backbonejs.org

To suggest a feature or report a bug:
https://github.com/jashkenas/backbone/issues

For questions on working with Backbone or general discussions:
https://groups.google.com/forum/#!forum/backbonejs,
http://stackoverflow.com/questions/tagged/backbone.js, or
https://gitter.im/jashkenas/backbone

Backbone is an open-sourced component of DocumentCloud:
https://github.com/documentcloud

Many thanks to our contributors:
https://github.com/jashkenas/backbone/graphs/contributors

Special thanks to Robert Kieffer for the original philosophy behind Backbone.
https://github.com/broofa
# Hyperapp

[![Travis CI](https://img.shields.io/travis/jorgebucaran/hyperapp/master.svg)](https://travis-ci.org/jorgebucaran/hyperapp)
[![Codecov](https://img.shields.io/codecov/c/github/jorgebucaran/hyperapp/master.svg)](https://codecov.io/gh/jorgebucaran/hyperapp)
[![npm](https://img.shields.io/npm/v/hyperapp.svg)](https://www.npmjs.org/package/hyperapp)
[![Slack](https://hyperappjs.herokuapp.com/badge.svg)](https://hyperappjs.herokuapp.com "Join us")

Hyperapp is a JavaScript micro-framework for building web applications.

> :wave: [**Hyperapp 2.0**](https://github.com/jorgebucaran/hyperapp/pull/726) is coming out soon! Try it from the [V2](https://github.com/jorgebucaran/hyperapp/tree/V2) branch right now and be sure to follow [@HyperappJS](https://twitter.com/hyperappjs) for all the Hyperapp news & updates.

- **Minimal** — We have aggressively minimized the concepts you need to understand to be productive while remaining on par with what other frameworks can do.
- **Pragmatic** — Hyperapp holds firm on the functional programming front when managing your state, but takes a pragmatic approach to allow for side effects, asynchronous actions, and DOM manipulations.
- **Standalone** — Do more with less. Hyperapp combines state management with a virtual DOM engine that supports keyed updates & lifecycle events — all with no dependencies.

## Getting Started

Our first example is a counter that can be incremented or decremented. Go ahead and [try it online](https://codepen.io/hyperapp/pen/zNxZLP/left/?editors=0010).

```jsx
import { h, app } from "hyperapp"

const state = {
  count: 0
}

const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}

const view = (state, actions) => (
  <div>
    <h1>{state.count}</h1>
    <button onclick={() => actions.down(1)}>-</button>
    <button onclick={() => actions.up(1)}>+</button>
  </div>
)

app(state, actions, view, document.body)
```

Hyperapp consists of a two-function API. <samp>hyperapp.h</samp> returns a new [virtual DOM](#view) node tree and <samp>hyperapp.app</samp> [mounts](#mounting) a new application in the specified DOM element. Without an element, it's possible to use Hyperapp "headless", which can be useful when unit testing your program.

This example assumes you are using a JavaScript compiler like [Babel](https://babeljs.io) or [TypeScript](https://www.typescriptlang.org) and a module bundler like [Parcel](https://parceljs.org), [Webpack](https://webpack.js.org), etc. If you are using JSX, all you need to do is install the JSX [transform plugin](https://babeljs.io/docs/en/babel-plugin-transform-react-jsx) and add the pragma option to your <samp>.babelrc</samp> file.

```json
{
  "plugins": [["@babel/plugin-transform-react-jsx", { "pragma": "h" }]]
}
```

JSX is a language syntax extension that lets you write HTML tags interspersed with JavaScript. Because browsers don't understand JSX, we use a compiler to transform it into <samp>hyperapp.h</samp> function calls under the hood.

```jsx
const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

Note that JSX is not required for building applications with Hyperapp. You can use <samp>hyperapp.h</samp> directly and without a compilation step as shown above. Other alternatives to JSX include [@hyperapp/html](https://github.com/hyperapp/html), [hyperx](https://github.com/substack/hyperx), [t7](https://github.com/trueadm/t7) and [ijk](https://github.com/lukejacksonn/ijk).

## Installation

Install with npm or Yarn.

<pre>
npm i <a href=https://www.npmjs.com/package/hyperapp>hyperapp</a>
</pre>

Then with a module bundler like [Rollup](https://rollupjs.org) or [Webpack](https://webpack.js.org), use as you would anything else.

```js
import { h, app } from "hyperapp"
```

If you don't want to set up a build environment, you can download Hyperapp from a CDN like [unpkg.com](https://unpkg.com/hyperapp) and it will be globally available through the <samp>window.hyperapp</samp> object. We support all ES5-compliant browsers, including Internet Explorer 10 and above.

```html
<script src="https://unpkg.com/hyperapp"></script>
```

## Overview

Hyperapp applications consist of three interconnected parts: the [state](#state), [view](#view), and [actions](#actions).

Once initialized, your application executes in a continuous loop, taking in actions from users or from external events, updating the state, and representing changes in the view through a virtual DOM model. Think of an action as a signal that notifies Hyperapp to update the state and schedule the next view to redraw. After processing an action, the new state is presented back to the user.

### State

The state is a plain JavaScript object that describes your entire program. It consists of all the dynamic data that is moved around in the application during its execution. The state cannot be mutated once it is created. We must use actions to update it.

```js
const state = {
  count: 0
}
```

Like any JavaScript object, the state can be a nested tree of objects. We refer to nested objects in the state as partial state. A single state tree does not conflict with modularity — see [Nested Actions](#nested-actions) to find out how to update deeply nested objects and split your state and actions.

```js
const state = {
  top: {
    count: 0
  },
  bottom: {
    count: 0
  }
}
```

Because Hyperapp performs a shallow merge when updating your state, the top-level state must be a plain JavaScript object, other than this, you can use any type, including arrays, ES6 [Maps](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map), [Sets](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set), [Immutable.js](https://facebook.github.io/immutable-js/) structures, etc.

#### Local State

Hyperapp does not have the concept of local state. Instead, components are pure functions that return a virtual DOM representation of the global state.

### Actions

The only way to change the state is via actions. An action is a unary function (accepts a single argument) expecting a payload. The payload can be anything you want to pass into the action.

To update the state, an action must return a partial state object. The new state will be the result of a shallow merge between this object and the current state. Under the hood, Hyperapp wires every function in your actions to automatically redraw the view on state changes.

```js
const actions = {
  setValue: value => ({ value })
}
```

Instead of returning a partial state object directly, an action can return a function that takes the current state and actions as arguments and returns a partial state object.

```js
const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}
```

State updates are always immutable. Do not mutate the state object argument within an action and return it — the results are not what you expect (e.g., the view will not be redrawn).

Immutability enables time-travel debugging, helps prevent introducing hard-to-track-down bugs by making state changes more predictable, and allows cheap memoization of components using shallow equality <samp>===</samp> checks.

#### Asynchronous Actions

Actions used for side effects (writing to databases, sending a request to a server, etc.) don't need to have a return value. You may call an action from within another action or callback function. Actions which return a Promise, <samp>undefined</samp> or <samp>null</samp> will not trigger redraws or update the state.

```js
const actions = {
  upLater: value => (state, actions) => {
    setTimeout(actions.up, 1000, value)
  },
  up: value => state => ({ count: state.count + value })
}
```

An action can be an <samp>[async](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function)</samp> function. Because <samp>async</samp> functions return a Promise, and not a partial state object, you need to call another action in order to update the state.

```js
const actions = {
  upLater: () => async (state, actions) => {
    await new Promise(done => setTimeout(done, 1000))
    actions.up(10)
  },
  up: value => state => ({ count: state.count + value })
}
```

#### Nested Actions

Actions can be nested inside namespaces. Updating deeply nested state is as easy as declaring actions inside an object in the same path as the part of the state you want to update.

```jsx
const state = {
  counter: {
    count: 0
  }
}

const actions = {
  counter: {
    down: value => state => ({ count: state.count - value }),
    up: value => state => ({ count: state.count + value })
  }
}
```

#### Interoperability

The <samp>app</samp> function returns a copy of your actions where every function is wired to changes in the state. Exposing this object to the outside world can be useful to operate your application from another program or framework, subscribe to global events, listen to mouse and keyboard input, etc.

To see this in action, modify the example from [Getting Started](#getting-started) to save the wired actions to a variable and try using them. You should see the counter update accordingly.

```jsx
const main = app(state, actions, view, document.body)

setInterval(main.up, 250, 1)
setInterval(main.down, 500, 1)
```

Because state updates are always immutable, returning a reference to the current state will not schedule a view redraw.

```jsx
const actions = {
  getState: () => state => state
}
```

### View

Every time your application state changes, the view function is called so that you can specify how you want the DOM to look based on the new state. The view returns your specification in the form of a plain JavaScript object known as a virtual DOM and Hyperapp takes care of updating the actual DOM to match it.

```js
import { h } from "hyperapp"

export const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

A virtual DOM is a description of what a DOM should look like using a tree of nested JavaScript objects known as virtual nodes. Think of it as a lightweight representation of the DOM. In the example, the view function returns an object like this.

```jsx
{
  nodeName: "div",
  attributes: {},
  children: [
    {
      nodeName: "h1",
      attributes: {},
      children: [0]
    },
    {
      nodeName: "button",
      attributes: { ... },
      children: ["-"]
    },
    {
      nodeName:   "button",
      attributes: { ... },
      children: ["+"]
    }
  ]
}
```

The virtual DOM model allows us to write code as if the entire document is thrown away and rebuilt on each change, while we only update what actually changed. We try to do this in the least number of steps possible, by comparing the new virtual DOM against the previous one. This leads to high efficiency, since typically only a small percentage of nodes need to change, and changing real DOM nodes is costly compared to recalculating the virtual DOM.

It may seem wasteful to throw away the old virtual DOM and re-create it entirely on every update — not to mention the fact that at any one time, Hyperapp is keeping two virtual DOM trees in memory, but as it turns out, browsers can create hundreds of thousands of objects very quickly. On the other hand, modifying the DOM is several orders of magnitude more expensive.

### Mounting

To mount your application on a page, we need a DOM element. This element is referred to as the application container. Applications built with Hyperapp always have a single container.

```jsx
app(state, actions, view, container)
```

Hyperapp will also attempt to reuse existing elements inside the container enabling SEO optimization and improving your sites time-to-interactive. The process consists of serving a fully rendered page together with your application. Then instead of throwing away the existing content, we'll turn your DOM nodes into an interactive application out of the box.

This is how we can recycle server-rendered content out the counter example from before. See [Getting Started](#getting-started) for the application code.

```html
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <script defer src="bundle.js"></script>
</head>

<body>
  <div>
    <h1>0</h1>
    <button>-</button>
    <button>+</button>
  </div>
</body>
</html>
```

### Components

A component is a pure function that returns a virtual node. Unlike the view function, components are not wired to your application state or actions. Components are dumb, reusable blocks of code that encapsulate markup, styles, and behaviors that belong together.

Here's a taste of how to use components in your application. The application is a typical To-Do manager. Go ahead and [try it online here](https://codepen.io/hyperapp/pen/zNxRLy).

```jsx
import { h } from "hyperapp"

const TodoItem = ({ id, value, done, toggle }) => (
  <li
    class={done && "done"}
    onclick={() =>
      toggle({
        value: done,
        id: id
      })
    }
  >
    {value}
  </li>
)

export const view = (state, actions) => (
  <div>
    <h1>Todo</h1>
    <ul>
      {state.todos.map(({ id, value, done }) => (
        <TodoItem id={id} value={value} done={done} toggle={actions.toggle} />
      ))}
    </ul>
  </div>
)
```

If you don't know all the attributes that you want to place in a component ahead of time, you can use the [spread syntax](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_operator). Note that Hyperapp components can return an array of elements as in the following example. This technique lets you group a list of children without adding extra nodes to the DOM.

```jsx
const TodoList = ({ todos, toggle }) =>
  todos.map(todo => <TodoItem {...todo} toggle={toggle} />)
```

#### Lazy Components

Components can only receive attributes and children from their parent component. Similarly to the top-level view function, lazy components are passed your application global state and actions. To create a lazy component, return a view function from a regular component.

```jsx
import { h } from "hyperapp"

export const Up = ({ by }) => (state, actions) => (
  <button onclick={() => actions.up(by)}>+ {by}</button>
)

export const Down = ({ by }) => (state, actions) => (
  <button onclick={() => actions.down(by)}>- {by}</button>
)

export const Double = () => (state, actions) => (
  <button onclick={() => actions.up(state.count)}>+ {state.count}</button>
)

export const view = (state, actions) => (
  <main>
    <h1>{state.count}</h1>
    <Up by={2} />
    <Down by={1} />
    <Double />
  </main>
)
```

#### Handling Component State

Suppose you have a list of questions with answers that are collapsed initially. A flag `answerIsOpen` is used to determine if a question's answer is open.

Since there is no concept of local state in Hyperapp, the global state is always updated rather than an individual component's state.

To update a single question's state, the entire `questions` array will be mapped to a new array where the `answerIsOpen` property will be toggled if the question matches the one belonging to the component.

[View the example online](https://codepen.io/anon/pen/ZogRYP).

#### Children Composition

Components receive their children elements via the second argument, allowing you and other components to pass arbitrary children down to them.

```jsx
const Box = ({ color }, children) => (
  <div class={`box box-${color}`}>{children}</div>
)

const HelloBox = ({ name }) => (
  <Box color="green">
    <h1 class="title">Hello, {name}!</h1>
  </Box>
)
```

## Supported Attributes

Supported attributes include [HTML attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes), [SVG attributes](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute), [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events), [Lifecycle Events](#lifecycle-events), and [Keys](#keys). Note that non-standard HTML attribute names are not supported, <samp>onclick</samp> and <samp>class</samp> are valid, but <samp>onClick</samp> or <samp>className</samp> are not.

### Styles

The <samp>style</samp> attribute expects a plain object rather than a string as in HTML.
Each declaration consists of a style name property written in <samp>camelCase</samp> and a value. CSS variables are supported too.

Individual style properties will be diffed and mapped against <samp>[HTMLElement.style](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style)</samp> property members of the DOM element - you should therefore use the JavaScript style object [property names](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference), e.g. <samp>backgroundColor</samp> rather than <samp>background-color</samp>.

```jsx
import { h } from "hyperapp"

export const Jumbotron = ({ text }) => (
  <div
    style={{
      color: "white",
      fontSize: "32px",
      textAlign: center,
      backgroundImage: `url(${imgUrl})`
    }}
  >
    {text}
  </div>
)
```

### Lifecycle Events

You can be notified when elements managed by the virtual DOM are created, updated or removed via lifecycle events. Use them for animation, data fetching, wrapping third-party libraries, cleaning up resources, etc.

Note that lifecycle events are attached to virtual DOM nodes, not to components. Consider adding a key to ensure that the event is attached to a specific DOM element, rather than a recycled one.

#### oncreate

This event is fired after the element is created and attached to the DOM. Use it to manipulate the DOM node directly, make a network request, create a slide/fade in animation, etc.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    oncreate={element => element.focus()}
  />
)
```

#### onupdate

This event is fired every time we update the element attributes. Use <samp>oldAttributes</samp> inside the event handler to check if any attributes changed or not.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    onupdate={(element, oldAttributes) => {
      if (oldAttributes.placeholder !== placeholder) {
        // Handle changes here!
      }
    }}
  />
)
```

#### onremove

This event is fired before the element is removed from the DOM. Use it to create slide/fade out animations. Call <samp>done</samp> inside the function to remove the element. This event is not called in its child elements.

```jsx
import { h } from "hyperapp"

export const MessageWithFadeout = ({ title }) => (
  <div onremove={(element, done) => fadeout(element).then(done)}>
    <h1>{title}</h1>
  </div>
)
```

#### ondestroy

This event is fired after the element has been removed from the DOM, either directly or as a result of a parent being removed. Use it for invalidating timers, canceling a network request, removing global events listeners, etc.

```jsx
import { h } from "hyperapp"

export const Camera = ({ onerror }) => (
  <video
    poster="loading.png"
    oncreate={element => {
      navigator.mediaDevices
        .getUserMedia({ video: true })
        .then(stream => (element.srcObject = stream))
        .catch(onerror)
    }}
    ondestroy={element => element.srcObject.getTracks()[0].stop()}
  />
)
```

### Keys

Keys help identify nodes every time we update the DOM. By setting the <samp>key</samp> property on a virtual node, you declare that the node should correspond to a particular DOM element. This allows us to re-order the element into its new position, if the position changed, rather than risk destroying it.

```jsx
import { h } from "hyperapp"

export const ImageGallery = ({ images }) =>
  images.map(({ hash, url, description }) => (
    <li key={hash}>
      <img src={url} alt={description} />
    </li>
  ))
```

Keys must be unique among sibling nodes. Don't use an array index as the key, if the index also specifies the order of siblings. If the position and number of items in a list are fixed, it will make no difference, but if the list is dynamic, the key will change every time the tree is rebuilt.

```jsx
import { h } from "hyperapp"

export const PlayerList = ({ players }) =>
  players
    .slice()
    .sort((player, nextPlayer) => nextPlayer.score - player.score)
    .map(player => (
      <li key={player.username} class={player.isAlive ? "alive" : "dead"}>
        <PlayerProfile {...player} />
      </li>
    ))
```

#### Top-Level Nodes

Keys are not registered on the top-level node of your view. If you are toggling the top-level view, and you must use keys, wrap them in an unchanging node.

## Links

- [Slack](https://hyperappjs.herokuapp.com)
- [Twitter](https://twitter.com/hyperappJS)
- [Examples](https://codepen.io/search/pens/?q=hyperapp)
- [/r/hyperapp](https://www.reddit.com/r/hyperapp)

## License

Hyperapp is MIT licensed. See [LICENSE](LICENSE.md).
# Knockout

**Knockout** is a JavaScript [MVVM](http://en.wikipedia.org/wiki/Model_View_ViewModel) (a modern variant of MVC) library that makes it easier to create rich, desktop-like user interfaces with JavaScript and HTML. It uses *observers* to make your UI automatically stay in sync with an underlying data model, along with a powerful and extensible set of *declarative bindings* to enable productive development.

## Getting started

[![Join the chat at https://gitter.im/knockout/knockout](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/knockout/knockout?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

**Totally new to Knockout?** The most fun place to start is the [online interactive tutorials](http://learn.knockoutjs.com/).

For more details, see

 * Documentation on [the project's website](http://knockoutjs.com/documentation/introduction.html)
 * Online examples at [http://knockoutjs.com/examples/](http://knockoutjs.com/examples/)

## Downloading Knockout

You can [download released versions of Knockout](http://knockoutjs.com/downloads/) from the project's website.

For Node.js developers, Knockout is also available from [npm](https://npmjs.org/) - just run `npm install knockout`.

## Building Knockout from sources

If you prefer to build the library yourself:

1. **Clone the repo from GitHub**

   ```sh
   git clone https://github.com/knockout/knockout.git
   cd knockout
   ```

2. **Acquire build dependencies.**

   Make sure you have [Node.js](http://nodejs.org/) installed on your workstation. This is only needed to _build_ Knockout from sources. Knockout itself has no dependency on Node.js once it is built (it works with any server technology or none). Now run:

   ```sh
   npm install -g grunt-cli
   npm install
   ```

   The first `npm` command sets up the popular [Grunt](http://gruntjs.com/) build tool. You might need to run this command with `sudo` if you're on Linux or Mac OS X, or in an Administrator command prompt on Windows. The second `npm` command fetches the remaining build dependencies.

3. **Run the build tool**

   ```sh
   grunt
   ```
   Now you'll find the built files in `build/output/`.

## Running the tests

If you have [phantomjs](http://phantomjs.org/download.html) installed, then the `grunt` script will automatically run the specification suite and report its results.

Or, if you want to run the specs in a browser (e.g., for debugging), simply open `spec/runner.html` in your browser.

## License

MIT license - [http://www.opensource.org/licenses/mit-license.php](http://www.opensource.org/licenses/mit-license.php)
<p align="center">
    <a href="http://markojs.com/"><img src="https://raw.githubusercontent.com/marko-js/branding/master/marko-logo-medium-cropped.png" alt="Marko logo" width="300" /></a><br /><br />
</p>

Marko is a friendly (and fast!) UI library that makes building web apps fun.
Learn more on [markojs.com](http://markojs.com/), and even [Try Marko Online!](http://markojs.com/try-online/)

[![Build Status](https://travis-ci.org/marko-js/marko.svg?branch=master)](https://travis-ci.org/marko-js/marko)
[![Coverage Status](https://codecov.io/gh/marko-js/marko/branch/master/graph/badge.svg)](https://codecov.io/gh/marko-js/marko)
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/marko-js/marko)
[![NPM](https://img.shields.io/npm/v/marko.svg)](https://www.npmjs.com/package/marko)
[![Downloads](https://img.shields.io/npm/dm/marko.svg)](http://npm-stat.com/charts.html?package=marko)

# Get Involved

- **Contributing**: Pull requests are welcome!
  - Read [`CONTRIBUTING.md`](.github/CONTRIBUTING.md) and check out our [bite-sized](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Adifficulty%3Abite-sized) and [help-wanted](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Astatus%3Ahelp-wanted) issues
  - Submit github issues for any feature enhancements, bugs or documentation problems
- **Support**: Join our [gitter chat](https://gitter.im/marko-js/marko) to ask questions to get support from the maintainers and other Marko developers
  - Questions/comments can also be posted as [github issues](https://github.com/marko-js/marko/issues)
- **Discuss**: Tweet using the `#MarkoJS` hashtag and follow [@MarkoDevTeam](https://twitter.com/MarkoDevTeam)

# Installation

```bash
npm install marko --save
```

# Examples

Marko provides an elegant and readable syntax for both single-file components
and components broken into separate files. There are plenty of examples to play
with on [Marko's Try-Online](http://markojs.com/try-online/). Additional
[component documentation](http://markojs.com/docs/components/) can be found on
the Marko.js website.

## Single file

The following single-file component renders a button and a counter with the
number of times the button has been clicked. [Try this example now!](http://markojs.com/try-online/?file=%2Fcomponents%2Fcomponents%2Fclick-count%2Findex.marko)

**click-count.marko**

```marko
class {
    onCreate() {
        this.state = { count:0 };
    }
    increment() {
        this.state.count++;
    }
}

style {
    .count {
        color:#09c;
        font-size:3em;
    }
    .example-button {
        font-size:1em;
        padding:0.5em;
    }
}

<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

## Multi-file

The same component as above split into an `index.marko` template file,
`component.js` containing your component logic, and `style.css` containing your
component style:

**index.marko**

```marko
<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

**component.js**

```js
module.exports = {
  onCreate() {
    this.state = { count: 0 };
  },
  increment() {
    this.state.count++;
  }
};
```

**style.css**

```css
.count {
  color: #09c;
  font-size: 3em;
}
.example-button {
  font-size: 1em;
  padding: 0.5em;
}
```

## Concise Syntax

Marko also support a beautiful concise syntax as an alternative to the HTML
syntax. Find out more about the [concise syntax here](http://markojs.com/docs/concise/).

```marko
<!-- Marko HTML syntax -->
<ul>
    <li for(color in ['a', 'b', 'c'])>
        ${color}
    </li>
</ul>
```

```marko
// Marko concise syntax
ul
    li for(color in ['a', 'b', 'c'])
        -- ${color}
```

# Changelog

See [CHANGELOG.md](CHANGELOG.md)

# Maintainers

- [Patrick Steele-Idem](https://github.com/patrick-steele-idem) (Twitter: [@psteeleidem](http://twitter.com/psteeleidem))
- [Michael Rawlings](https://github.com/mlrawlings) (Twitter: [@mlrawlings](https://twitter.com/mlrawlings))
- [Phillip Gates-Idem](https://github.com/philidem/) (Twitter: [@philidem](https://twitter.com/philidem))
- [Austin Kelleher](https://github.com/austinkelleher) (Twitter: [@AustinKelleher](https://twitter.com/AustinKelleher))
- [Dylan Piercey](https://github.com/dylanpiercey) (Twitter: [@dylan_piercey](https://twitter.com/dylan_piercey))
- [Martin Aberer](https://github.com/tindli) (Twitter: [@metaCoffee](https://twitter.com/metaCoffee))

# Code of Conduct

This project adheres to the [eBay Code of Conduct](http://ebay.github.io/codeofconduct).
By participating in this project you agree to abide by its terms.

# License

MIT
# Matreshka.js 2 [![npm version](https://badge.fury.io/js/matreshka.svg)](https://badge.fury.io/js/matreshka) [![Build Status](https://travis-ci.org/matreshkajs/matreshka.svg)](https://travis-ci.org/matreshkajs/matreshka) [![Coverage Status](https://coveralls.io/repos/github/matreshkajs/matreshka/badge.svg?branch=master)](https://coveralls.io/github/matreshkajs/matreshka?branch=master) [![Join the chat at https://gitter.im/finom/matreshka](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/matreshkajs/matreshka)

[![Matreshka Website](http://matreshka.io/img/mk5-logo_full-vert.svg)](http://matreshka.io)

> Matreshka.js is a simple JavaScript framework for single page applications creation. It fills the gap between a junior and a senior because of simple and intuitive API based on JavaScript classes and accessors. Everything you need to get started is your JavaScript knowledge.

## Features
- Reactive API which allows to solve hard and confusing problems easily
- High robustness of developed apps
- The ability to refactor legacy applications without rewriting them from scratch
- Only couple of hours is needed to master the framework because of an absence of complex concepts

**[Download](https://github.com/matreshkajs/matreshka/tree/gh-pages)**

**Install via NPM**
```
npm install --save matreshka
```

-----------------------------------

## Resources
- [The website](http://matreshka.io)
- [Examples and tutorials](https://github.com/matreshkajs/examples-and-tutorials)
- [Release History](https://github.com/matreshkajs/matreshka/releases)
- [JSDoc files](https://github.com/matreshkajs/matreshka.io/tree/master/doc)
- [Twitter (automatically reports about new versions)](https://twitter.com/matreshkajs)
- [Support the project on Patreon](https://www.patreon.com/finom)

**License:** [MIT License](https://raw.github.com/finom/matreshka/master/LICENSE)



<a href="https://www.browserstack.com/" target="_blank">
    <img src="http://matreshka.io/img/logos/browserstack.svg" height="30" valign="middle">
</a> is provided a sponsored access to their testing platform
# Introduction

- [What is Mithril?](#what-is-mithril)
- [Getting started](#getting-started)
- [Hello world](#hello-world)
- [DOM elements](#dom-elements)
- [Components](#components)
- [Routing](#routing)
- [XHR](#xhr)

---

### What is Mithril?

Mithril is a modern client-side Javascript framework for building Single Page Applications.  
It's small (< 8kb gzip), fast and provides routing and XHR utilities out of the box.

<div style="display:flex;margin:0 0 30px;">
	<div style="width:50%;">
		<h5>Download size</h5>
		<small>Mithril (8kb)</small>
		<div style="animation:grow 0.08s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:4%;"></div>
		<small style="color:#aaa;">Vue + Vue-Router + Vuex + fetch (40kb)</small>
		<div style="animation:grow 0.4s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:20%"></div>
		<small style="color:#aaa;">React + React-Router + Redux + fetch (64kb)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:32%"></div>
		<small style="color:#aaa;">Angular (135kb)</small>
		<div style="animation:grow 1.35s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:68%"></div>
	</div>
	<div style="width:50%;">
		<h5>Performance</h5>
		<small>Mithril (6.4ms)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:24%;"></div>
		<small style="color:#aaa;">Vue (9.8ms)</small>
		<div style="animation:grow 0.98s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:40%"></div>
		<small style="color:#aaa;">React (12.1ms)</small>
		<div style="animation:grow 1.21s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:48%"></div>
		<small style="color:#aaa;">Angular (11.5ms)</small>
		<div style="animation:grow 1.15s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:44%"></div>
	</div>
</div>

Mithril is used by companies like Vimeo and Nike, and open source platforms like Lichess.

If you are an experienced developer and want to know how Mithril compares to other frameworks, see the [framework comparison](http://mithril.js.org/framework-comparison.html) page.

Mithril supports browsers all the way back to IE9, no polyfills required.

---

### Getting started

The easiest way to try out Mithril is to include it from a CDN, and follow this tutorial. It'll cover the majority of the API surface (including routing and XHR) but it'll only take 10 minutes.

Let's create an HTML file to follow along:

```markup
<body>
	<script src="//unpkg.com/mithril/mithril.js"></script>
	<script>
	var root = document.body

	// your code goes here!
	</script>
</body>
```

---

### Hello world

Let's start as small as we can: render some text on screen. Copy the code below into your file (and by copy, I mean type it out - you'll learn better)

```javascript
var root = document.body

m.render(root, "Hello world")
```

Now, let's change the text to something else. Add this line of code under the previous one:

```javascript
m.render(root, "My first app")
```

As you can see, you use the same code to both create and update HTML. Mithril automatically figures out the most efficient way of updating the text, rather than blindly recreating it from scratch.

---

### DOM elements

Let's wrap our text in an `<h1>` tag.

```javascript
m.render(root, m("h1", "My first app"))
```

The `m()` function can be used to describe any HTML structure you want. So if you need to add a class to the `<h1>`:

```javascript
m("h1", {class: "title"}, "My first app")
```

If you want to have multiple elements:

```javascript
[
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
]
```

And so on:

```javascript
m("main", [
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
])
```

Note: If you prefer `<html>` syntax, [it's possible to use it via a Babel plugin](http://mithril.js.org/jsx.html).

```jsx
// HTML syntax via Babel's JSX plugin
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

---

### Components

A Mithril component is just an object with a `view` function. Here's the code above as a component:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", "A button"),
		])
	}
}
```

To activate the component, we use `m.mount`.

```javascript
m.mount(root, Hello)
```

As you would expect, doing so creates this markup:

```markup
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

The `m.mount` function is similar to `m.render`, but instead of rendering some HTML only once, it activates Mithril's auto-redrawing system. To understand what that means, let's add some events:

```javascript
var count = 0 // added a variable

var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			// changed the next line
			m("button", {onclick: function() {count++}}, count + " clicks"),
		])
	}
}

m.mount(root, Hello)
```

We defined an `onclick` event on the button, which increments a variable `count` (which was declared at the top). We are now also rendering the value of that variable in the button label.

You can now update the label of the button by clicking the button. Since we used `m.mount`, you don't need to manually call `m.render` to apply the changes in the `count` variable to the HTML; Mithril does it for you.

If you're wondering about performance, it turns out Mithril is very fast at rendering updates, because it only touches the parts of the DOM it absolutely needs to. So in our example above, when you click the button, the text in it is the only part of the DOM Mithril actually updates.

---

### Routing

Routing just means going from one screen to another in an application with several screens.

Let's add a splash page that appears before our click counter. First we create a component for it:

```javascript
var Splash = {
	view: function() {
		return m("a", {href: "#!/hello"}, "Enter!")
	}
}
```

As you can see, this component simply renders a link to `#!/hello`. The `#!` part is known as a hashbang, and it's a common convention used in Single Page Applications to indicate that the stuff after it (the `/hello` part) is a route path.

Now that we going to have more than one screen, we use `m.route` instead of `m.mount`.

```javascript
m.route(root, "/splash", {
	"/splash": Splash,
	"/hello": Hello,
})
```

The `m.route` function still has the same auto-redrawing functionality that `m.mount` does, and it also enables URL awareness; in other words, it lets Mithril know what to do when it sees a `#!` in the URL.

The `"/splash"` right after `root` means that's the default route, i.e. if the hashbang in the URL doesn't point to one of the defined routes (`/splash` and `/hello`, in our case), then Mithril redirects to the default route. So if you open the page in a browser and your URL is `http://localhost`, then you get redirected to `http://localhost/#!/splash`.

Also, as you would expect, clicking on the link on the splash page takes you to the click counter screen we created earlier. Notice that now your URL will point to `http://localhost/#!/hello`. You can navigate back and forth to the splash page using the browser's back and next button.

---

### XHR

Basically, XHR is just a way to talk to a server.

Let's change our click counter to make it save data on a server. For the server, we'll use [REM](http://rem-rest-api.herokuapp.com), a mock REST API designed for toy apps like this tutorial.

First we create a function that calls `m.request`. The `url` specifies an endpoint that represents a resource, the `method` specifies the type of action we're taking (typically the `PUT` method [upserts](https://en.wiktionary.org/wiki/upsert)), `data` is the payload that we're sending to the endpoint and `withCredentials` means to enable cookies (a requirement for the REM API to work)

```javascript
var count = 0
var increment = function() {
	m.request({
		method: "PUT",
		url: "//rem-rest-api.herokuapp.com/api/tutorial/1",
		data: {count: count + 1},
		withCredentials: true,
	})
	.then(function(data) {
		count = parseInt(data.count)
	})
}
```

Calling the increment function [upserts](https://en.wiktionary.org/wiki/upsert) an object `{count: 1}` to the `/api/tutorial/1` endpoint. This endpoint returns an object with the same `count` value that was sent to it. Notice that the `count` variable is only updated after the request completes, and it's updated with the response value from the server now.

Let's replace the event handler in the component to call the `increment` function instead of incrementing the `count` variable directly:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", {onclick: increment}, count + " clicks"),
		])
	}
}
```

Clicking the button should now update the count.

---

We covered how to create and update HTML, how to create components, routes for a Single Page Application, and interacted with a server via XHR.

This should be enough to get you started writing the frontend for a real application. Now that you are comfortable with the basics of the Mithril API, [be sure to check out the simple application tutorial](http://mithril.js.org/simple-application.html), which walks you through building a realistic application.
 NuclearJS

[![Build Status](https://travis-ci.org/optimizely/nuclear-js.svg?branch=master)](https://travis-ci.org/optimizely/nuclear-js)
[![Coverage Status](https://coveralls.io/repos/optimizely/nuclear-js/badge.svg?branch=master)](https://coveralls.io/r/optimizely/nuclear-js?branch=master)
[![Join the chat at https://gitter.im/optimizely/nuclear-js](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/optimizely/nuclear-js?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Sauce Test Status](https://saucelabs.com/browser-matrix/nuclearjs.svg)](https://saucelabs.com/u/nuclearjs)

Traditional Flux architecture built with ImmutableJS data structures.

## Documentation

[https://optimizely.github.io/nuclear-js/](https://optimizely.github.io/nuclear-js/)

## Design Philosophy

- **Simple Over Easy** - The purpose of NuclearJS isn't to write the most expressive TodoMVC anyone's ever seen.  The goal of NuclearJS is to provide a way to model data that is easy to reason about and decouple at very large scale.

- **Immutable** - A means for less defensive programming, more predictability and better performance.

- **Functional** - The framework should be implemented functionally wherever appropriate.  This reduces incidental complexity and pairs well with Immutability.

- **Smallest Amount of State Possible** - Using NuclearJS should encourage the modeling of your application state in the most minimal way possible.

- **Decoupled** - A NuclearJS system should be able to function without any sort of UI or frontend.  It should be backend/frontend agnostic and be able to run on a NodeJS server.

## Installation

NuclearJS can be downloaded from [npm](https://www.npmjs.com/).

```
npm install nuclear-js
```

## Examples

- [Shopping Cart Example](./examples/shopping-cart) - Provides a general overview of basic NuclearJS concepts: actions, stores and getters with ReactJS.
- [Flux Chat Example](./examples/flux-chat) - A classic Facebook flux chat example written in NuclearJS.
- [Rest API Example](./examples/rest-api) - Shows how to deal with fetching data from an API using NuclearJS conventions.
- [Hot reloadable stores](./examples/hot-reloading) - Shows how to setup stores to be hot reloadable using webpack hot module replacement.

## How NuclearJS differs from other Flux implementations

1.  All app state is in a singular immutable map, like [Om](https://github.com/omcljs/om).  In development you can see your entire application state at every point in time thanks to awesome debugging tools built into NuclearJS.

2.  State is not spread out through stores, instead stores are a declarative way of describing some top-level domain of your app state. For each key in the app state map a store declares the initial state of that key and how that piece of the app state reacts over time to actions dispatched on the flux system.

3.  Stores are not reference-able nor have any `getX` methods on them.  Instead NuclearJS uses a functional lens concept called **getters**. In fact, the use of getters obviates the need for any store to know about another store, eliminating the confusing `store.waitsFor` method found in other flux implementations.

4.  NuclearJS is insanely efficient - change detection granularity is infinitesimal, you can even observe computed state where several pieces of the state map are combined together and run through a transform function.  NuclearJS is smart enough to know when the value of any computed changes and only call its observer if and only if its value changed in a way that is orders of magnitude more efficient than traditional dirty checking.  It does this by leveraging ImmutableJS data structure and using a `state1 !== state2` reference comparison which runs in constant time.

5.  Automatic data observation / rendering -- automatic re-rendering is built in for React in the form of a very lightweight mixin.  It is also easily possible to build the same functionality for any UI framework such as VueJS, AngularJS and even Backbone.

6.  NuclearJS is not a side-project, it's used as the default Flux implementation that powers all of Optimizely.  It is well tested and will continue to be maintained for the foreseeable future. Our current codebase has over dozens of stores, actions and getters, we even share our prescribed method of large scale code organization and testing strategies.

## Performance

Getters are only calculated whenever their dependencies change. So if the dependency is a keypath then it will only recalculate when that path in the app state map has changed (which can be done as a simple `state.getIn(keyPath) !== oldState.getIn(keyPath)` which is an `O(log32(n))` operation. The other case is when a getter is dependent on other getters. Since every getter is a pure function, NuclearJS will only recompute the getter if the values of its dependencies change.

## API Documentation

[API Documentation](https://optimizely.github.io/nuclear-js/docs/07-api.html)

## For Smaller Applications

NuclearJS was designed first and foremost for large scale production codebases.  For a much more lightweight Flux implementation that shares many of the same ideas and design principles check out [Microcosm](https://github.com/vigetlabs/microcosm).

## Contributing

Contributions are welcome, especially with the documentation website and examples.  See [CONTRIBUTING.md](./CONTRIBUTING.md).
# Polymer

[![Build Status](https://travis-ci.org/Polymer/polymer.svg?branch=master)](https://travis-ci.org/Polymer/polymer)
[![Published on npm](https://img.shields.io/npm/v/@polymer/polymer.svg)](https://www.npmjs.com/package/@polymer/polymer)
[![Published on webcomponents.org](https://img.shields.io/badge/webcomponents.org-published-blue.svg)](https://www.webcomponents.org/element/@polymer/polymer)

> ℹ️ Note: This is the current stable version of the Polymer library.  At Google I/O 2018 we announced a new Web Component base class, [`LitElement`](https://github.com/Polymer/lit-element), as a successor to the `PolymerElement` base class in this library.
>
> If you're starting a new project, we recommend that you consider using LitElement instead.
>
> If you have a project you've built with an earlier version of the Polymer library, we recommend that you [migrate](#about-polymer-30) to 3.0 for best compatibility with the JavaScript ecosystem. Thanks to the interoperability of Web Components, elements built with Polymer 3.0 and LitElement can be mixed and matched in the same app, so once you have updated your project to Polymer 3.0, you can migrate to LitElement incrementally, one element at a time.  See our blog post on the [Polymer Project roadmap](https://www.polymer-project.org/blog/2018-05-02-roadmap-update.html) for more information.

Polymer lets you build encapsulated, reusable [Web Components](https://www.webcomponents.org/introduction) that work just like standard HTML elements, to use in building web applications.  Using a Web Component built with Polymer is as simple as importing its definition then using it like any other HTML element:

```html
<!-- Import a component -->
<script src="https://unpkg.com/@polymer/paper-checkbox@next/paper-checkbox.js?module" type="module" ></script>

<!-- Use it like any other HTML element -->
<paper-checkbox>Web Components!</paper-checkbox>
```

Web Components are now implemented natively on Safari and Chrome (~70% of installed browsers), and run well on Firefox, Edge, and IE11 using [polyfills](https://github.com/webcomponents/webcomponentsjs).  Read more [below](#overview).

## Getting started

 * The easiest way to try out Polymer is to use one of these online tools:

    * Runs in all [supported](#supported-browsers) browsers: [StackBlitz](https://stackblitz.com/edit/polymer-element-example?file=index.js), [Glitch](https://glitch.com/edit/#!/polymer-element-example?path=index.html)

    * Runs in browsers with [JavaScript Modules](https://caniuse.com/#search=modules): [JSBin](https://jsbin.com/wuxejiz/edit?html,output),
 [CodePen](https://codepen.io/kevinpschaaf/pen/BxdErp?editors=1000).

 * You can also save [this HTML file](https://gist.githubusercontent.com/kevinpschaaf/8a5acbea7b25d2bb5e82eeea2b105669/raw/c3a86872f07603e2d0ddae736687e52a5c8c499f/index.html) to a local file and run it in any browser that supports [JavaScript Modules]((https://caniuse.com/#search=modules)).

 * When you're ready to use Polymer in a project, install it via [npm](https://www.npmjs.com/). To run the project in the browser,
 a module-compatible toolchain is required. We recommend installing the [Polymer CLI](https://github.com/Polymer/tools/tree/master/packages/cli) to and using its development server as follows.

    1. Add Polymer to your project:

        ```npm i @polymer/polymer```

    1. Create an element by extending PolymerElement and calling `customElements.define` with your class (see the examples below).

    1. Install the Polymer CLI:

        ```npm i -g polymer-cli```

    1. Run the development server and open a browser pointing to its URL:

        ```polymer serve --npm```

    > Polymer 3.0 is published on [npm](https://www.npmjs.com/package/@polymer/polymer) using JavaScript Modules.
    This means it can take advantage of the standard native JavaScript module loader available in all current major browsers.
    >
    > However, since Polymer uses npm conventions to reference dependencies by name, a light transform to rewrite specifiers to URLs is required to run in the browser. The polymer-cli's development server `polymer serve`, as well as `polymer build` (for building an optimized app for deployment)  automatically handles this transform.

    Tools like [webpack](https://webpack.js.org/) and [Rollup](https://rollupjs.org/) can also be used to serve and/or bundle Polymer elements.


## Minimal Example

  1. Create a class that extends `PolymerElement`.
  1. Implement a static `properties` getter that describes the element's public property/attribute API
  (these automatically become observed attributes).
  1. Then implement a `template` getter that returns an `HTMLTemplateElement` describing the element's rendering, including encapsulated styling and any property bindings.

```html
  <script src="node_modules/@webcomponents/webcomponents-loader.js"></script>
  <script type="module">
    import {PolymerElement, html} from '@polymer/polymer';

    class MyElement extends PolymerElement {
      static get properties() { return { mood: String }}
      static get template() {
        return html`
          <style> .mood { color: green; } </style>
          Web Components are <span class="mood">[[mood]]</span>!
        `;
      }
    }

    customElements.define('my-element', MyElement);
  </script>

  <my-element mood="happy"></my-element>
```

## Overview

Web components are an incredibly powerful new set of primitives baked into the web platform, and open up a whole new world of possibility when it comes to componentizing front-end code and easily creating powerful, immersive, app-like experiences on the web.

Polymer is a lightweight library built on top of the web standards-based [Web Components](http://webcomponents.org/introduction) APIs, and makes it easier to build your very own custom HTML elements. Creating reusable custom elements - and using elements built by others - can make building complex web applications easier and more efficient.

By being based on the Web Components APIs built in the browser (or [polyfilled](https://github.com/webcomponents/webcomponentsjs) where needed), elements built with Polymer are:

* Built from the platform up
* Self-contained
* Re-usable
* Interoperable across frameworks

Among many ways to leverage custom elements, they can be particularly useful for building reusable UI components. Instead of continually re-building a specific navigation bar or button in different frameworks and for different projects, you can define this element once using Polymer, and then reuse it throughout your project or in any future project.

Polymer provides a declarative syntax to easily create your own custom elements, using all standard web technologies - define the structure of the element with HTML, style it with CSS, and add interactions to the element with JavaScript.

Polymer also provides optional two-way data-binding, meaning:

1. When properties in the model for an element get updated, the element can update itself in response.
2. When the element is updated internally, the changes can be propagated back to the model.

Polymer is designed to be flexible, lightweight, and close to the web platform - the library doesn't invent complex new abstractions and magic, but uses the best features of the web platform in straightforward ways to simply sugar the creation of custom elements.

## About Polymer 3.0

Polymer 3.0 is now released to stable, and introduces a major change to how Polymer is distributed: from HTML Imports on Bower, to JS modules on npm.  Otherwise, the API is almost entirely backward compatible with Polymer 2.0 (the only changes are removing APIs related to HTML Imports like `importHref`, and converting Polymer's API to be module-based rather than globals-based).

Migrating to Polymer 3.0 by hand is mostly mechanical:
* Components should be defined in JS modules instead of in HTML
* Templates should be encoded in JS modules using a `static get template()` getter on PolymerElement subclasses using the `html` tagged template literal function (which parses `HTMLTemplateElement`s out of strings in JS) rather than using `<template>` elements in a `<dom-module>`
* All dependencies should be imported JS module imports rather than HTML Imports.

However, the [`polymer-modulizer`](https://github.com/Polymer/polymer-modulizer) tool automates the vast majority of this migration work.  Please see details on that repo for automated conversion of Polymer 2.0 apps and elements to Polymer 3.0.

👀 **Looking for Polymer v2.x?** Please see the [the v2 branch](https://github.com/Polymer/polymer/tree/2.x).

👀 **Looking for Polymer v1.x?** Please see the [the v1 branch](https://github.com/Polymer/polymer/tree/1.x).

## Contributing

The Polymer team loves contributions from the community! Take a look at our [contributing guide](CONTRIBUTING.md) for more information on how to contribute.  Please file issues on the Polymer issue tracker following the issue template and contributing guide [issues](https://github.com/Polymer/polymer/issues/new).

## Communicating with the Polymer team

Beyond GitHub, we try to have a variety of different lines of communication available:

* [Blog](https://blog.polymer-project.org/)
* [Twitter](https://twitter.com/polymer)
* [Google+ community](https://plus.google.com/communities/115626364525706131031)
* [Mailing list](https://groups.google.com/forum/#!forum/polymer-dev)
* [Slack channel](https://bit.ly/polymerslack)

# License

The Polymer library uses a BSD-like license that is available [here](./LICENSE.txt)

[![Riot logo](https://riot.js.org/img/logo/riot480x.png)](https://riot.js.org)


## Simple and elegant component-based UI library

[![Build Status][travis-image]][travis-url]
[![MIT License][license-image]][license-url]
[![Riot Forum][riot-forum-image]][riot-forum-url]
[![Join the chat at https://gitter.im/riot/riot][gitter-image]][gitter-url]
[![Join the chat (ja) at https://riot-jp-slackin.herokuapp.com/][slack-ja-image]][slack-ja-url]
[![OpenCollective Backers][backer-badge]][backer-url] [![OpenCollective Sponsors][sponsor-badge]][sponsor-url]

[![NPM version][npm-version-image]][npm-url]
[![NPM downloads][npm-downloads-image]][npm-url]
[![jsDelivr Hits][jsdelivr-image]][jsdelivr-url]
[![Coverage Status][coverage-image]][coverage-url]
![Riot Size][lib-size]
[![Code Quality][codeclimate-image]][codeclimate-url]

[![Sauce Test Status][saucelabs-image]][saucelabs-url]

### Framework Size Comparison

| Framework                                      | Version         | Minified Size (gzip) |
|------------------------------------------------|-----------------|----------------------|
| @angular/core + Polyfills                      | 6.0.9           | 141.79kb             |
| Ember                                          | 2.18.2          | 121.84kb             |
| Polymer + Web Components Polyfill Lite         | 1.8.0           | 66.3kb               |
| React + Map and Set Polyfills                  | 16.4.0          | 41.60kb              |
| Web Components Polyfill                        | 0.7.24          | 33.68kb              |
| Vue                                            | 2.5.17          | 31.65kb              |
| __Riot__                                       | 3.12.0          | 10.80kb              |
| Inferno                                        | 5.4.2           | 7.79kb               |
| Preact                                         | 8.3.1           | 3.48kb               |

The above comparison includes polyfills to support old browsers like IE9 that in Riot.js are supported by default

### Browsers support

Riot is supported by all modern browsers and it does not require any additional polyfill

- IE 9+
- Edge
- Chrome
- Safari 7+
- Firefox
- Safari iOS
- Android

### Custom tags • Concise syntax • Simple API • Tiny Size

Riot brings custom tags to all modern browsers. Think React + Polymer but with enjoyable syntax and a small learning curve.

#### Tag definition

``` javascript
<timer>

  <p>Seconds Elapsed: { time }</p>

  this.time = opts.start || 0

  tick() {
    this.update({ time: ++this.time })
  }

  var timer = setInterval(this.tick, 1000)

  this.on('unmount', function() {
    clearInterval(timer)
  })

</timer>
```

[Open this example on Plunker](http://riot.js.org/examples/plunker/?app=timer)

#### Mounting

``` javascript
riot.mount('timer', { start: 0 })
```

#### Nesting

Custom tags lets you build complex views with HTML.

``` html
<timetable>
  <timer start="0"></timer>
  <timer start="10"></timer>
  <timer start="20"></timer>
</timetable>
```

HTML syntax is the de facto language on the web and it's designed for building user interfaces. The syntax is explicit, nesting is inherent to the language and attributes offer a clean way to provide options for custom tags.


### Expressions Bindings
- Absolutely the smallest possible amount of DOM updates and reflows.
- One way data flow: updates and unmounts are propagated downwards from parent to children.
- Expressions are pre-compiled and cached for high performance.
- Lifecycle events for more control.


### Close to standards
- No proprietary event system.
- Event normalization.
- The rendered DOM can be freely manipulated with other tools.
- No extra HTML root elements or `data-` attributes.
- Plays well with any frontend framework.


### Use your dearest language and tools
- Create tags with CoffeeScript, Jade, LiveScript, Typescript, ES6 or [any pre-processor](http://riot.js.org/guide/compiler/#pre-processors) you want.
- Integrate with NPM, CommonJS, AMD, Bower or Component
- Develop with [Gulp](https://github.com/e-jigsaw/gulp-riot), [Grunt](https://github.com/ariesjia/grunt-riot), [Wintersmith](https://github.com/collingreen/wintersmith-riot), [webpack*](https://github.com/riot/tag-loader), [Rollup*](https://github.com/riot/rollup-plugin-riot), [Browserify*](https://github.com/riot/riotify), [Babel*](https://github.com/riot/babel-preset-es2015-riot) or Bublé
- Test with [Karma*](https://github.com/riot/karma-riot), Mocha or whatever you like

*Note*: `*` officially maintained

### CDN hosting
- [jsDelivr](http://www.jsdelivr.com/projects/riot)
- [cdnjs](https://cdnjs.com/libraries/riot)


### Concise syntax
- Power shortcuts: `class={ enabled: is_enabled, hidden: hasErrors() }`.
- No extra brain load such as `render`, `state`, or `constructor`.
- Interpolation: `Add #{ items.length + 1 }` or `class="item { selected: flag }"`
- Compact ES6 method syntax.

### Demos
- [**Riot Examples** - Community's Official](https://github.com/riot/examples)
- [**Riot Animore** - Official Tags Animations Library](https://github.com/riot/animore)
- [Riot Todo MVC](http://todomvc.com/examples/riotjs/)
- [Hackernews reader](http://git.io/riot-hn)
- [Vuejs examples by Riotjs](https://github.com/txchen/feplay/tree/gh-pages/riot_vue)
- [Flux-like ES6 Todo](https://github.com/srackham/riot-todo)
- [Timer](http://jsfiddle.net/gnumanth/h9kuozp5/)
- [Another flux demo comparable to React ones](http://txchen.github.io/feplay/riot_flux)
- [Various experiments](http://richardbondi.net/programming/riot)
- [Isomorphic application](https://github.com/Avnerus/riot-isomorphic)
- [Isomorphic proof of concept](https://github.com/PabloSichert/isomorphic-proof-of-concept)
- [flux-riot todo](http://mingliangfeng.me/flux-riot)
- [Another Riot Todo MVC](http://nippur72.github.io/riotjs-todomvc/#/)
- [Cheft isomorphic by express](https://github.com/cheft/cheft)
- [electron-riot - Riot in an electron application](https://github.com/mike-ward/electron-riot)
- [An express, riot, jade, webpack simple boilerplate](https://github.com/revington/frontend-boilerplate)
- [Riot.js vs React.js comparison of a simple comment box](https://github.com/vitogit/riot.js-vs-react.js-comment-box)
- [Riot Seed project - webpack, routing, ava tests, dispatcher](https://github.com/continuata/riot-seed)
- [Riot-Redux League Table example](https://github.com/drewmiley/PoolLeague)
- [Riot vs React vs Ractive Counters using Redux store](https://github.com/drewmiley/ractive-react-riot-redux-counters-example)

### Books
- [Building Apps with Riot](https://bleedingedgepress.com/building-apps-with-riot/)

### Tutorials
- [Building Apps with Riot, ES6 and Webpack](http://blog.srackham.com/posts/riot-es6-webpack-apps/)
- [Building Apps with Riot, Babel, RiotControl and Webpack](https://github.com/txchen/feplay/tree/gh-pages/riot_webpack)
- [Building tabs with Riot](http://robertwpearce.com/blog/riotjs-example.html)
- [The "React tutorial" for Riot](https://juriansluiman.nl/article/154/the-react-tutorial-for-riot)
- [How to package "tag libraries" in Riot](https://github.com/ivan-saorin/riot-tutorial-tags-pack-app)
- [Another React tutorial with Riot](https://github.com/viliamjr/commentsTuto)
- [Riot Custom Tag by Example](http://www.triplet.fi/blog/riot-custom-tag-by-example/)
- [Riot Compiler Explained](http://www.triplet.fi/blog/riot-compiler-explained/)
- [Adding compiled Riot tags to your Gulp + Browserify build](http://www.triplet.fi/blog/adding_compiled_riot_tags_to_your_gulp_browserify_build/)
- [The anatomy of a tag - a primer tutorial](http://www.marcusoft.net/2015/12/riotjs-anatomy-of-a-tag.html)
- [Using TDD with Riot+mocha+chai](http://vitomd.com/blog/coding/tutorial_tdd_riot_mocha/)
- [The Basics - from ground up to connected tag-networks](http://happy-css.com/lessons/riotjs/)
- [Hello Riot.js : a quick tutorial about this awesome lib](http://vitomd.com/blog/coding/hello-riot-js-quick-tutorial-about-this-awesome-lib/)

### Video Tutorials
- [Introduction](https://www.youtube.com/watch?v=al87U6NgRTc)
- [Loops, Events and Callbacks](https://www.youtube.com/watch?v=T-ZV9dv93sw)
- [Server Rendering with Node & Express](http://youtu.be/6ww1UXGJzcs)
- [Riot And Webpack Setup](https://youtu.be/UgdZbT-KPpY)
- [Riot and Redux - Part 1](https://youtu.be/Y6vpKAGT2-8)
- [Riot and Redux - Part 2](https://youtu.be/DgM03bvgCYc)
- [Riot and Redux - Part 3](https://youtu.be/QuwnbuneAzM)
- [Riot and Redux - Part 4](https://youtu.be/qc6bjtu7KG0)
- [Riot and Redux - Part 5](https://youtu.be/M4BNsRMatVY)
- [Riot and Redux - Part 6](https://youtu.be/jr8KDpwtRsk)


### Libraries / Frameworks
- [Flux- like event controller for Riot](https://github.com/jimsparkman/RiotControl)
- [flux-riot framework](https://github.com/mingliangfeng/flux-riot)
- [Cheftjs - chinese framework for Riot](https://github.com/cheft/cheftjs)
- [Veronica - flux adaption for Riot](https://www.npmjs.com/package/veronica-x)
- [Minimal Flux dispatcher pattern](https://gist.github.com/continuata/c605846751c09a5e94d12ae8c91cbf05)
- [riot-format: a format library for riotjs, like angular $filter](https://github.com/joylei/riot-format)
- [riot-view-router: a simple state based router mixin](https://github.com/neetjn/riot-view-router)
- [riotx - Centralized State Management for riot.js](https://github.com/cam-inc/riotx)
- [storybook for riot.js components <sup>alpha</sup>](https://github.com/storybooks/storybook/tree/master/app/riot)

### Components
- [Material UI](http://kysonic.github.io/riot-mui/)
- [RiotGear Components](https://riotgear.js.org)
- [RiotGear Router](http://riotgear.js.org/components/router/)
- [Riot Bootstrap](http://cognitom.github.io/riot-bootstrap/)
- [iToolkit](https://github.com/BE-FE/iToolkit)
- [Riot Routehandler](https://github.com/crisward/riot-routehandler)-[(Demo)](http://codepen.io/crisward/pen/xwGJpM?editors=101)
- [Riot Flipcard](https://github.com/crisward/riot-flipcard) - [(Demo)](https://crisward.github.io/riot-flipcard/)
- [Riot Grid](https://github.com/crisward/riot-grid) - [(Demo)](http://codepen.io/crisward/pen/rxepMX?editors=101)
- [Riot Grid2](https://github.com/crisward/riot-grid2) - [(Demo)](http://crisward.github.io/riot-grid2/)
- [Riot Subtag](https://github.com/crisward/riot-subtag) - faster than lots of if's
- [ESLint Riot Plugin](https://github.com/txchen/eslint-plugin-riot)
- [riot-animate](https://github.com/sartaj/riot-animate)
- [Nest UI](https://github.com/fengzilong/Nest) - [(Demo)](https://fengzilong.github.io/Nest/)
- [rGrid](https://github.com/limodou/rgrid) - [(Demo)](https://limodou.github.io/rgrid/examples.html)
- [typewriter](https://github.com/amitguptagwl/web-snippets/tree/master/riotjs-components/typewriter) - [(Demo)](http://amitkumargupta.work)

### Resources
- [create-riot-app](https://github.com/alexstep/create-riot-app-ejected) dev environment
- [Riot + AngularJS](https://github.com/lucasbrigida/angular-riot)
- [Module loader for WebPack](https://www.npmjs.com/package/riotjs-loader)
- [Riot + Meteor]( https://atmospherejs.com/baysao/riotjs)
- [Riot Snake Game](http://cdn.rawgit.com/atian25/blog/master/assets/riot-snake.html)
- [Riot Tag Syntax Checker](http://cognitom.github.io/riot-checker/)
- [Riot 文档中译版](https://github.com/Centaur/riotjs_doc_cn) :cn:
- [Riot + Wintersmith](https://github.com/collingreen/wintersmith-riot)
- [Riot precompiler plugin for lineman](https://github.com/Power-Inside/lineman-riot)
- [Riot Startkit - Flux inspired skeleton app + WebPack + PostCSS](https://github.com/wbkd/riotjs-startkit)
- [Yeoman generator - Generator riot mobile](https://www.npmjs.com/package/generator-riot-mobile)
- [Yeoman generator - Generator riot element](https://www.npmjs.com/package/generator-riot-element)
- [Riot for TypeScript](https://github.com/nippur72/RiotTS)
- [Riot loader plugin for RequireJS](https://github.com/amenadiel/requirejs-riot)
- [Riot loader plugin for JSPM/SystemJS](https://github.com/amenadiel/systemjs-riot)
- [RiotJS Style Guide](https://github.com/voorhoede/riotjs-style-guide)
- [Riot Cheatsheet](http://martinmuzatko.github.io/riot-cheatsheet/)

### Performance
- **Riot vs React performance:** [(Riot version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-riot-vs-vanilla) vs [(React version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-react-vs-vanilla)

### Miscellaneous
- [Q&A with RiotJS author Tero Piirainen](http://www.triplet.fi/blog/q-and-a-with-riotjs-author-tero-piirainen/)
- [riot-detector (Chrome Extension)](https://chrome.google.com/webstore/detail/riot-detector/cnnmjeggdmicjojlnjghdgkdlijiobke)

### Editors / Editor Plugins (Syntax highlighting, autcompletion, etc...)
- [riot (Atom Package)](https://atom.io/packages/riot)
- [language-riot-tag (Atom Package)](https://github.com/dekimasoon/language-riot-tag)
  - Based on Vue's official Sublime Text highlighter
  - Note: Designed for html, not jade.
- [sublime-tag (Sublime Text)](https://github.com/crisward/sublime-tag)
- [riot-tag (Visual Studio)](https://github.com/crisward/riot-tag)
- [web-mode (Emacs)](http://web-mode.org)
  - See how to configure [#1967](https://github.com/riot/riot/issues/1967)

### How to contribute

If you are reading this it's already a good sign and we are thankful for it! We try our best working as much as we could on riot but your help is always appreciated.

If you want to contribute to riot helping us maintaining the project please check first the list of [our open issues](https://github.com/riot/riot/issues) to understand whether there is a task where you could help.

Riot is mainly developed on UNIX systems so you will be able to run all the commands necessary to build and test the library using our [Makefile](Makefile). If you are on a Microsoft machine it could be harder to set up you development environment properly.

Following the steps below you should be able to properly submit your patch to the project

#### 1) Clone the repo and browse to the riot folder

```shell
$ git clone git@github.com:riot/riot.git && cd riot
```
#### 2) Set up your git branch

```shell
$ git checkout -b feature/my-awesome-patch
```

#### 3) Install the npm dependencies

```shell
$ npm i
```

#### 4) Build and test riot using the Makefile

```shell
# To build and test riot
$ make riot

# To build without testing
$ make raw

# To build anytime you change a src file
$ make watch

# To bench riot
$ make perf
```

#### 5) Pull request only against the `dev` branch making sure you have read [our pull request template](.github/PULL_REQUEST_TEMPLATE.md)

#### 6) Be patient


### Credits

Riot is made with :heart: by many smart people from all over the world. Thanks to all the contributors<br>
It's actively maintained by:
<table>
  <tbody>
    <tr>
      <td valign="top">
        <img width="125" height="125" src="https://github.com/GianlucaGuarini.png?s=125?s=125">
        <br>
        <a href="https://github.com/GianlucaGuarini">Gianluca Guarini</a>
      </td>
     </tr>
  </tbody>
</table>

## Official Website

http://riot.js.org

## Backers

Support us with a monthly donation and help us continue our activities. [Become a backer][support-url]

[![Backers][backers-image]][support-url]

## Sponsors

Become a sponsor to get your logo on our README. [Become a sponsor][support-url]

[![Sponsors][sponsors-image]][support-url]

## Thanks

Special thanks to Browserstack for their support

<a href='https://www.browserstack.com/'>
  <img width='70px' src="https://cdn.worldvectorlogo.com/logos/browserstack.svg" alt="browser stack">
</a>

[travis-image]:https://img.shields.io/travis/riot/riot.svg?style=flat-square
[travis-url]:https://travis-ci.org/riot/riot

[license-image]:http://img.shields.io/badge/license-MIT-000000.svg?style=flat-square
[license-url]:LICENSE.txt

[npm-version-image]:http://img.shields.io/npm/v/riot.svg?style=flat-square
[npm-downloads-image]:http://img.shields.io/npm/dm/riot.svg?style=flat-square
[npm-url]:https://npmjs.org/package/riot

[riot-forum-image]:https://img.shields.io/badge/muut-JOIN_FORUM%E2%86%92-ff0044.svg?style=flat-square
[riot-forum-url]:http://riot.js.org/forum/

[coverage-image]:https://img.shields.io/coveralls/riot/riot/dev.svg?style=flat-square
[coverage-url]:https://coveralls.io/r/riot/riot?branch=dev

[saucelabs-image]:https://saucelabs.com/browser-matrix/testsriotjs.svg?1
[saucelabs-url]:https://saucelabs.com/u/testsriotjs

[gitter-image]:https://img.shields.io/badge/GITTER-JOIN_CHAT_%E2%86%92-1dce73.svg?style=flat-square
[gitter-url]:https://gitter.im/riot/riot?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge

[slack-ja-image]:https://img.shields.io/badge/SLACK_(ja)-JOIN_CHAT_%E2%86%92-551a8b.svg?style=flat-square
[slack-ja-url]:https://riot-jp-slackin.herokuapp.com/

[codeclimate-image]:https://api.codeclimate.com/v1/badges/b81ddf3c77e8189876da/maintainability
[codeclimate-url]:https://codeclimate.com/github/riot/riot

[donations-campaign-url]:https://pledgie.com/campaigns/31139
[donations-campaign-image]:https://pledgie.com/campaigns/31139.png?skin_name=chrome

[jsdelivr-image]: https://data.jsdelivr.com/v1/package/npm/riot/badge
[jsdelivr-url]: https://www.jsdelivr.com/package/npm/riot


[backer-url]: #backers
[backer-badge]: https://opencollective.com/riot/backers/badge.svg?color=blue
[sponsor-url]: #sponsors
[sponsor-badge]: https://opencollective.com/riot/sponsors/badge.svg?color=blue

[support-url]: https://opencollective.com/riot#support

[lib-size]: http://img.badgesize.io/https://unpkg.com/riot/riot.min.js?compression=gzip

[backers-image]: https://opencollective.com/riot/backers.svg
[sponsors-image]: https://opencollective.com/riot/sponsors.svg
# Spine
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/spine/spine?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://secure.travis-ci.org/spine/spine.svg)](http://travis-ci.org/spine/spine)

Spine is a lightweight MVC library for building JavaScript web applications. Spine gives you structure and then gets out of your way, allowing you to concentrate on the fun stuff: building awesome web applications.

Spine is opinionated in its approach to web application architecture and design. Spine's architecture complements patterns such as de-coupled components and CommonJS modules, markedly helping with code quality and maintainability.

The library is written in [CoffeeScript](http://coffeescript.org), and though it doesn't necessarily require CoffeeScript to develop applications - you can use whichever language you're most familiar with or prefer - the documentation and some associated tools like [Hem](https://github.com/spine/hem) and [spine.app](https://github.com/spine/spine.app) cater to those who prefer CoffeeScript's syntax.

## Learn it

Documentation is often incomplete or just lies waiting to happen. Approachable source code reduces knowledge dependencies. This is an area where Spine really excells compared to other MVC frameworks. Spine is tiny; the core library comes in at less than 700 lines of CoffeeScript code. It is written in such a way to prefer readability over terseness or clever tricks, and it is small enough that within a rather small timeframe you can understand how all the pieces work together. Expertise is achievable within days or weeks rather than months or years. For these reasons, remaining lightweight and simple is fundamental to Spine.

For documentation, usage, and examples, see: [spinejs.com](http://spinejs.com)

The test suite can also occasionally provide additional useful examples, especially if you are looking for non-coffeescript examples.

# Contributing

## Reporting issues

To file a bug report, please visit the [GitHub issues page](https://github.com/spine/spine/issues).  It's great if you can attach code (test cases and fixes for bugs, and test cases and a proposed implementation for features), but reproducible bug reports are also welcome. 

For support or help with using spine please use the [Spine Google Group](https://groups.google.com/forum/#!forum/spinejs) and/or StackOverflow rather than opening an issue on Github. If you post in those places you are more likely to get more people to chime in, and others can benefit from it more readily.

## Cloning master and running the test suite

To get started contributing to Spine, first clone the repository and make sure you can run the test suite.  If you're not familiar with Git, visit the [Git homepage](http://git-scm.com) to download Git for your platform.

First, clone the repository:

```
$ git clone git://github.com/spine/spine.git
$ cd spine
```

Next, You will need node and npm to pull in the testing libraries. Once you're all set with those then from within the Spine repo directory run 

```
$ npm install .
```

This should bring in [Jasmine](http://jasmine.github.io/), Coffeescript, and a minimalist local server for running the tests a browser. You can also simply open `test/index.html` in a browser to run the [Jasmine](http://jasmine.github.io/) test suite for spine core.  If you see all the tests passing, you're ready to contribute! A known issue is that some of the routing tests will fail if you are simply using a `file://` protocol in the browser. This has to do with browser security. You can avoid this by running the local server, `$ npm start`. Alternatively you can use a server like Apache or Nginx to serve the test files to the browser. 

If you have [phantom.js](http://phantomjs.org/) available then a script is included to make running tests even slicker!

```
$ npm test
```

## Contributing to the Spine documentation

Perhaps the easiest way to get started with contributing is through the docs.  If you find typos, bugs, or omissions in the docs, please submit a pull request to fix.  The Spine website [spinejs.com](http://spinejs.com), which is the primary documentation, is a very simple rails app [spine.site](https://github.com/spine/spine.site). You don't need to know Rails or Ruby to contribute. The vast majority of it is in Markdown

## Contributing to the Spine code

This recommended contribution process is based on the [Ruby on Rails contribution guide](http://edgeguides.rubyonrails.org/contributing_to_ruby_on_rails.html#contributing-to-the-rails-code).  In general, please include tests with new features or bugfixes, work in a feature branch until you're ready to submit or discuss your code, then fork the repository, push to your fork, and issue a pull request.

### CoffeeScript

When submitting a pull request for code, please submit in CoffeeScript. Building the effected js files is required for testing sake, but submitting those js files is optional.

Assuming you have Node.js and npm already installed then proceed by installing local dev dependencies:

```
$ npm install .
```

Then use the provided build scripts to compile your CoffeeScript files:

```
$ cake build
$ cake watch
```

These tasks use a locally installed copy of CoffeeScript to ensure all contributors use the same version of the compiler.

### Git

Let's say I'm going to submit a patch to add someFeatureFix:

```
$ git checkout dev
```

Feature branches should start from `dev` **not** `master`. If you branch off of, or do builds on the master branch you will get CoffeeScript source map files, which are cool, but tend to ruin automatic merges with git.

```
$ git checkout -b someFeatureFix
$ vim test/...
  # (...add tests...)
$ cake watch
  # (...this should recompile and changes you make in your CoffeeScript...)

-- figure out what spine module your changes belong in
$ vim src/spine.coffee
or
$ vim src/[otherSpineComponent].coffee
  # (...add the feature/fix...)
$ open test/index.html
  # (...make sure tests run for each component that was changed...)
  # (...test in other browsers with various jquery versions if you feel like there is risk... )
$ git commit -m "Add Some Feature Fix"
```

Then, [fork the Spine repository](https://github.com/spine/spine/fork), and push your branch to your fork:

```
$ git remote add <your user name> git@github.com:<your user name>/spine.git
$ git push <your user name> someFeatureFix
```

Finally, issue a pull request from inside the GitHub interface to the `dev` branch of spine, and your contribution is ready for consideration, discussion, and (hopefully) merging in!
# ![TodoMVC](media/logo.png)

> Helping you select an MV\* framework

### [Website](http://todomvc.com)&nbsp;&nbsp;&nbsp;&nbsp;[Blog](http://blog.tastejs.com)&nbsp;&nbsp;&nbsp;&nbsp;[TasteJS](http://tastejs.com)

[![Build Status](https://travis-ci.org/tastejs/todomvc.svg)](https://travis-ci.org/tastejs/todomvc)
[![Cypress.io tests](https://img.shields.io/badge/cypress.io-tests-green.svg?style=flat-square)](https://dashboard.cypress.io/#/projects/n4ynap/runs)

Developers these days are spoiled with choice when it comes to selecting an MV\* framework for structuring and organizing JavaScript web apps.

Backbone, Ember, AngularJS... the list of new and stable solutions goes on and on, but just how do you decide on which to use in a sea of so many options?

To help solve this problem, we created TodoMVC - a project which offers the same Todo application implemented using MV* concepts in most of the popular JavaScript MV\* frameworks of today.


## Team

TodoMVC would not be possible without a strong team of [contributors](https://github.com/tastejs/todomvc/contributors) helping push the project forward each day. Additionally, we have a core project team composed of:

#### [Addy Osmani](https://github.com/addyosmani) - Founder/Lead

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/96270e4c3e5e9806cf7245475c00b275.png?s=40">
  Addy is a Software Engineer at Google who originally created TodoMVC. He oversees the project direction, maintenance and organizes the planning and development efforts of the team.

#### [Sindre Sorhus](https://github.com/sindresorhus) - Lead Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9.png?s=40">
Sindre is a Web Developer who leads core development, quality control and application design for the project. His engineering contributions have helped us ensure consistency and best practices are enforced wherever possible. Sindre also leads up development of the TodoMVC application spec.

#### [Pascal Hartig](https://github.com/passy) - Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/be451fcdbf0e5ff07f23ed16cb5c90a3.png?s=40">
Pascal is a Software Engineer at Twitter with a deep passion for consistency. He watches pull requests and helps developers getting their contributions integrated with TodoMVC.

#### [Stephen Sawchuk](https://github.com/stephenplusplus) - Developer

<img align="left" width="40" height="40" src="https://avatars3.githubusercontent.com/u/723048?v=2&s=40">
Stephen is a Front-end Engineer at Quicken Loans that cares about improving the maintainability and developer experience of open-source projects. His recent contributions include helping us move all apps over to using Bower and implementing the new information bar.

#### [Colin Eberhardt](https://github.com/colineberhardt) - Developer

<img align="left" width="40" height="40" src="https://secure.gravatar.com/avatar/73bba00b41ff1c9ecc3ee29487bace7d?s=40">
Colin is a software consultant at Scott Logic who is passionate about all software - from JavaScript to Java, and C# to Objective-C. His recent contribution to the project has been a fully automated test suite.

#### [Sam Saccone](https://github.com/samccone) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/userimage/602125/f2f1d93164ec62b527f0398c65b2d1f3.jpg?size=40">
Sam is a Software Engineer at Google who is driven by an endless desire to create, solve problems, and improve developers' lives.

#### [Arthur Verschaeve](https://github.com/arthurvr) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/avatar/e34daab0d2e344219adb5234198269c5?size=40">
Arthur is an open-source fanboy from Belgium. He is passionate about developer tooling and all things JavaScript.

#### [Fady Samir Sadek](https://github.com/FadySamirSadek) - Developer

<img align="left" width="40" height="40" src="https://avatars2.githubusercontent.com/u/7483806?s=40&u=99b3958687789735c12cf736332361a06b951355&v=4">
Fady is a front-end developer who loves all things JavaScript and enjoys solving real world problems using the web platform and helping other developers do the same. He currently leads maintenance of the project and ensures that the project is friendly for new contributors and upcoming developers.

#### [Gianni Chiappetta](https://github.com/gf3) - Logo designer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/4b0209ae3652cc5a7d53545e759fbe39.png?s=40">
Gianni is a programmer and designer currently working as the Chief Rigger at MetaLab.

## Disclaimer

<img align="right" width="230" height="230" src="media/icon-small.png">

TodoMVC has been called many things including the 'Speed-dating' and 'Rosetta Stone' of MV\* frameworks. Whilst we hope that this project can offer assistance in deciding what frameworks are worth spending more time looking at, remember that the Todo application offers a limited view of a framework's potential capability.

It is meant to be used as a gateway to reviewing how a basic application using a framework may be structured, and we heavily recommend investing time researching a solution in more depth before opting to use it.

Also, please keep in mind that TodoMVC is not the perfect way to compare the size of different frameworks. We intentionally use the unminified versions to make reading the source code easier.


## Getting Involved

Whilst we enjoy implementing and improving existing Todo apps, we're always interested in speaking to framework authors (and users) wishing to share Todo app implementations in their framework/solution of choice.

Check out our [contribution docs](contributing.md) for more info.


## License

Everything in this repo is MIT License unless otherwise specified.

[MIT](license.md) © Addy Osmani, Sindre Sorhus, Pascal Hartig, Stephen Sawchuk.
<p align="center"><a href="https://vuejs.org" target="_blank"><img width="100"src="https://vuejs.org/images/logo.png"></a></p>

<p align="center">
  <a href="https://circleci.com/gh/vuejs/vue/tree/dev"><img src="https://img.shields.io/circleci/project/vuejs/vue/dev.svg" alt="Build Status"></a>
  <a href="https://codecov.io/github/vuejs/vue?branch=dev"><img src="https://img.shields.io/codecov/c/github/vuejs/vue/dev.svg" alt="Coverage Status"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/dm/vue.svg" alt="Downloads"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/v/vue.svg" alt="Version"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/l/vue.svg" alt="License"></a>
  <a href="https://chat.vuejs.org/"><img src="https://img.shields.io/badge/chat-on%20discord-7289da.svg" alt="Chat">
  <br>
  <a href="https://saucelabs.com/u/vuejs"><img src="https://saucelabs.com/browser-matrix/vuejs.svg" alt="Sauce Test Status"></a>
</p>

<h2 align="center">Supporting Vue.js</h2>

Vue.js is an MIT-licensed open source project. It's an independent project with its ongoing development made possible entirely thanks to the support by these awesome [backers](https://github.com/vuejs/vue/blob/dev/BACKERS.md). If you'd like to join them, please consider:

- [Become a backer or sponsor on Patreon](https://www.patreon.com/evanyou).
- [Become a backer or sponsor on OpenCollective](https://opencollective.com/vuejs).

#### What's the difference between Patreon and OpenCollective?

Funds donated via Patreon goes directly to support Evan You's full-time work on Vue.js. Funds donated via OpenCollective are managed with transparent expenses and will be used for compensating work and expenses by core team members or sponsoring community events. Your name/logo will receive proper recognition and exposure by donating on either platform.

<h3 align="center">Sponsors via Patreon</h3>

<h4 align="center">Platinum</h4>

<p align="center">
  <a href="https://stdlib.com">
    <img width="240px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/stdlib.png">
  </a>
  <br><br>
  <a href="https://xiaozhuanlan.com">
    <img width="160px" src="https://raw.githubusercontent.com/vuejs/cn.vuejs.org/master/themes/vue/source/images/xiaozhuanlan.png">
  </a>
</p>

<h4 align="center">Gold</h4>

<table>
  <tbody>
    <tr>
      <td align="center" valign="middle">
        <a href="https://deepstreamhub.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/deepstream.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://jsfiddle.net/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/jsfiddle.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://laravel.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/laravel.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://chaitin.cn/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/chaitin.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://htmlburger.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/htmlburger.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://starter.someline.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/someline.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="http://monterail.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/monterail.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.2mhost.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/2mhost.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://vuejsjob.com/?ref=vuejs" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/vuejobs.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://leanpub.com/vuejs2" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tmvuejs2.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://component.io/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/component_io.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.v2ex.com/t/379389" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/v2exer.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="https://www.xfive.co/" target="_blank">
          <img width="80px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/xfive.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://www.frontenddevelopermeetups.com/" target="_blank">
          <img width="160px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/frontend-meetups.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://onsen.io/vue/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/onsen-ui.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://tooltwist.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tooltwist.png">
        </a>
      </td>
    </tr>
  </tbody>
</table>

<h3 align="center">Sponsors via OpenCollective</h3>

<h4 align="center">Platinum</h4>

<a href="https://opencollective.com/vuejs/platinumsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/platinumsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/1/avatar.svg"></a>

<h4 align="center">Gold</h4>

<a href="https://opencollective.com/vuejs/goldsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/bronzesponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/bronzesponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/2/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/2/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/3/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/3/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/4/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/4
  /avatar.svg"></a>

---

## Introduction

Vue (pronounced `/vjuː/`, like view) is a **progressive framework** for building user interfaces. It is designed from the ground up to be incrementally adoptable, and can easily scale between a library and a framework depending on different use cases. It consists of an approachable core library that focuses on the view layer only, and an ecosystem of supporting libraries that helps you tackle complexity in large Single-Page Applications.

#### Browser Compatibility

Vue.js supports all browsers that are [ES5-compliant](http://kangax.github.io/compat-table/es5/) (IE8 and below are not supported).

## Ecosystem

| Project | Status | Description |
|---------|--------|-------------|
| [vue-router]          | [![vue-router-status]][vue-router-package] | Single-page application routing |
| [vuex]                | [![vuex-status]][vuex-package] | Large-scale state management |
| [vue-cli]             | [![vue-cli-status]][vue-cli-package] | Project scaffolding |
| [vue-loader]          | [![vue-loader-status]][vue-loader-package] | Single File Component (`*.vue` file) loader for webpack |
| [vue-server-renderer] | [![vue-server-renderer-status]][vue-server-renderer-package] | Server-side rendering support |
| [vue-class-component] | [![vue-class-component-status]][vue-class-component-package] | TypeScript decorator for a class-based API |
| [vue-rx]              | [![vue-rx-status]][vue-rx-package] | RxJS integration |
| [vue-devtools]        | [![vue-devtools-status]][vue-devtools-package] | Browser DevTools extension |

[vue-router]: https://github.com/vuejs/vue-router
[vuex]: https://github.com/vuejs/vuex
[vue-cli]: https://github.com/vuejs/vue-cli
[vue-loader]: https://github.com/vuejs/vue-loader
[vue-server-renderer]: https://github.com/vuejs/vue/tree/dev/packages/vue-server-renderer
[vue-class-component]: https://github.com/vuejs/vue-class-component
[vue-rx]: https://github.com/vuejs/vue-rx
[vue-devtools]:  https://github.com/vuejs/vue-devtools

[vue-router-status]: https://img.shields.io/npm/v/vue-router.svg
[vuex-status]: https://img.shields.io/npm/v/vuex.svg
[vue-cli-status]: https://img.shields.io/npm/v/vue-cli.svg
[vue-loader-status]: https://img.shields.io/npm/v/vue-loader.svg
[vue-server-renderer-status]: https://img.shields.io/npm/v/vue-server-renderer.svg
[vue-class-component-status]: https://img.shields.io/npm/v/vue-class-component.svg
[vue-rx-status]: https://img.shields.io/npm/v/vue-rx.svg
[vue-devtools-status]: https://img.shields.io/chrome-web-store/v/nhdogjmejiglipccpnnnanhbledajbpd.svg

[vue-router-package]: https://npmjs.com/package/vue-router
[vuex-package]: https://npmjs.com/package/vuex
[vue-cli-package]: https://npmjs.com/package/vue-cli
[vue-loader-package]: https://npmjs.com/package/vue-loader
[vue-server-renderer-package]: https://npmjs.com/package/vue-server-renderer
[vue-class-component-package]: https://npmjs.com/package/vue-class-component
[vue-rx-package]: https://npmjs.com/package/vue-rx
[vue-devtools-package]: https://chrome.google.com/webstore/detail/vuejs-devtools/nhdogjmejiglipccpnnnanhbledajbpd

## Documentation

To check out live examples and docs, visit [vuejs.org](https://vuejs.org).

## Questions

For questions and support please use the [the official forum](http://forum.vuejs.org) or [community chat](https://chat.vuejs.org/). The issue list of this repo is **exclusively** for bug reports and feature requests.

## Issues

Please make sure to read the [Issue Reporting Checklist](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md#issue-reporting-guidelines) before opening an issue. Issues not conforming to the guidelines may be closed immediately.

## Changelog

Detailed changes for each release are documented in the [release notes](https://github.com/vuejs/vue/releases).

## Stay In Touch

- [Twitter](https://twitter.com/vuejs)
- [Blog](https://medium.com/the-vue-point)
- [Job Board](https://vuejobs.com/?ref=vuejs)

## Contribution

Please make sure to read the [Contributing Guide](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md) before making a pull request. If you have a Vue-related project/component/tool, add it with a pull-request to [this curated list](https://github.com/vuejs/awesome-vue)!

Thank you to all the people who already contributed to Vue!

<a href="https://github.com/vuejs/vue/graphs/contributors"><img src="https://opencollective.com/vuejs/contributors.svg?width=890" /></a>


## License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2013-present, Yuxi (Evan) You
[![Build Status](https://travis-ci.org/angular/angular.svg?branch=master)](https://travis-ci.org/angular/angular)
[![CircleCI](https://circleci.com/gh/angular/angular/tree/master.svg?style=shield)](https://circleci.com/gh/angular/angular/tree/master)
[![BrowserStack Status](https://www.browserstack.com/automate/badge.svg?badge_key=LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)](https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)
[![Join the chat at https://gitter.im/angular/angular](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/angular/angular?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![npm version](https://badge.fury.io/js/%40angular%2Fcore.svg)](https://www.npmjs.com/@angular/core)


# Angular

Angular is a development platform for building mobile and desktop web applications using Typescript/JavaScript and other languages.

## Quickstart

[Get started in 5 minutes][quickstart].


## Changelog

[Learn about the latest improvements][changelog]. 


## Want to help?

Want to file a bug, contribute some code, or improve documentation? Excellent! Read up on our
guidelines for [contributing][contributing] and then check out one of our issues in the [hotlist: community-help](https://github.com/angular/angular/labels/hotlist%3A%20community-help).

[browserstack]: https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06
[contributing]: https://github.com/angular/angular/blob/master/CONTRIBUTING.md
[quickstart]: https://angular.io/guide/quickstart
[changelog]: https://github.com/angular/angular/blob/master/CHANGELOG.md
[ng]: https://angular.io
# aurelia-framework

[![npm Version](https://img.shields.io/npm/v/aurelia-framework.svg)](https://www.npmjs.com/package/aurelia-framework)
[![ZenHub](https://raw.githubusercontent.com/ZenHubIO/support/master/zenhub-badge.png)](https://zenhub.io)
[![Join the chat at https://gitter.im/aurelia/discuss](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/aurelia/discuss?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![CircleCI](https://circleci.com/gh/aurelia/framework.svg?style=shield)](https://circleci.com/gh/aurelia/framework)

This library is part of the [Aurelia](http://www.aurelia.io/) platform and contains the aurelia framework which brings together all the required core aurelia libraries into a ready-to-go application-building platform.

> To keep up to date on [Aurelia](http://www.aurelia.io/), please visit and subscribe to [the official blog](http://blog.aurelia.io/) and [our email list](http://eepurl.com/ces50j). We also invite you to [follow us on twitter](https://twitter.com/aureliaeffect). If you have questions look around our [Discourse forums](https://discourse.aurelia.io/), chat in our [community on Gitter](https://gitter.im/aurelia/discuss) or use [stack overflow](http://stackoverflow.com/search?q=aurelia). Documentation can be found [in our developer hub](http://aurelia.io/docs). If you would like to have deeper insight into our development process, please install the [ZenHub](https://zenhub.io) Chrome or Firefox Extension and visit any of our repository's boards.

## Documentation

You can read the documentation for the aurelia framework [here](http://aurelia.io/docs). If you would like to help improve this documentation, the source for many of the docs can be found in the doc folder within this repository. Other docs, not related to the general framework, but directed at specific libraries, can be found in the doc folder of those libraries.

## Platform Support

This library can be used in the **browser** only.

## Building The Code

To build the code, follow these steps.

1. Ensure that [NodeJS](http://nodejs.org/) is installed. This provides the platform on which the build tooling runs.
2. From the project folder, execute the following command:

  ```shell
  npm install
  ```
3. Ensure that [Gulp](http://gulpjs.com/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g gulp
  ```
4. To build the code, you can now run:

  ```shell
  gulp build
  ```
5. You will find the compiled code in the `dist` folder, available in three module formats: AMD, CommonJS and ES6.

6. See `gulpfile.js` for other tasks related to generating the docs and linting.

## Running The Tests

To run the unit tests, first ensure that you have followed the steps above in order to install all dependencies and successfully build the library. Once you have done that, proceed with these additional steps:

1. Ensure that the [Karma](http://karma-runner.github.io/) CLI is installed. If you need to install it, use the following command:

  ```shell
  npm install -g karma-cli
  ```
2. Ensure that [jspm](http://jspm.io/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g jspm
  ```
3. Install the client-side dependencies with jspm:

  ```shell
  jspm install
  ```

4. You can now run the tests with this command:

  ```shell
  karma start
  ```
dojo
====

This is the foundation package for the Dojo 1 Toolkit.  While still being maintained, new development is primarily focused on modern Dojo.

Checkout the [Dojo framework website](https://dojo.io/) or if you want a more detailed technical status and overview, checkout the [`Dojo roadmap`](https://dojo.io/community/).

This package is sometimes
referred to as the “core”, it contains the most generally applicable sub-packages
and modules. The dojo package covers a wide range of functionality like Ajax, DOM
manipulation, class-type programming, events, promises, data stores,
drag-and-drop and internationalization libraries.

Installing
----------

Installation instructions are available at
[dojotoolkit.org/download](<http://dojotoolkit.org/download/>).

Getting Started
---------------

If you are starting out with Dojo, the following resources are available to you:

-   [Tutorials](<http://dojotoolkit.org/documentation/>)

-   [Reference Guide](<http://dojotoolkit.org/reference-guide/>)

-   [API Documentation](<http://dojotoolkit.org/api/>)

-   [Community Forum](<http://dojotoolkit.org/community/>)

What to Use Dojo For and When to Use It
---------------------------------------

The following is a brief sampling of some of the areas where Dojo may prove to
be the right tool for your next project:

-   For keeping your code fast and maintainable, Dojo offers an asynchronous
    module definition (AMD) loader -- encapsulating pieces of code into useful
    units, loading small JavaScript files only when they are needed, and loading
    files separately even when they are dependent on one another.

-   When you want to easily extend existing classes, share functionality among a
    number of classes, and maximize code reuse, Dojo provides class-like
    inheritance and “mixins.”

-   For creating advanced and customizable user interfaces out of refined,
    efficient, and modular pieces, Dojo’s Dijit framework offers several dozen
    enterprise-ready widgets -- including buttons, textboxes, form widgets with
    built-in validation, layout elements, and much more -- along with themes to
    lend them a consistent look. All of this is available for mobile
    environments as well.

-   For working with advanced vector graphics, Dojo’s GFX API can render
    graphics in a wide variety of formats, with support for seamless
    manipulation (skewing, rotating, resizing), gradients, responding to mouse
    events, and more.

-   The `dojox/charting` library supports powerful data visualization and
    dynamic charting, including a variety of 2D plots and animated charting
    elements.

-   When you need feature-rich, lightweight, and mobile-friendly grids/tables,
    Dojo offers the `dgrid` widget, along with customizable default themes and
    accompanying features such as in-cell editing, row/cell selection, column
    resizing/reordering, keyboard handling, pagination, and more.

-   Dojo is the officially supported framework for the ArcGIS API for
    JavaScript, one of the most widely used enterprise-grade APIs for web
    mapping and spatial analysis -- learning to use Dojo will open doors to
    creating richer web mapping applications using that API.

License and Copyright
---------------------

The Dojo Toolkit (including this package) is dual licensed under BSD 3-Clause
and AFL. For more information on the license please see the [License
Information](<http://dojotoolkit.org/license>). The Dojo Toolkit is Copyright
(c) 2005-2018, JS Foundation. All rights reserved.
<p align="center">
  <a href="https://emberjs.com"><img width="300" src="https://raw.githubusercontent.com/emberjs/website/master/source/images/brand/ember_Ember-Light.png"></a>
</p>

<p align="center">
  <a href="http://travis-ci.org/emberjs/ember.js"><img src="https://secure.travis-ci.org/emberjs/ember.js.svg?branch=master" alt="Build Status"></a>
  <a href="https://codeclimate.com/github/emberjs/ember.js"><img src="https://codeclimate.com/github/emberjs/ember.js.svg" alt="Code Climate"></a>
  <a href="https://discord.gg/zT3asNS"><img src="https://img.shields.io/discord/480462759797063690.svg?logo=discord" alt="Discord Community Server"></a>
</p>

Ember.js is a JavaScript framework that greatly reduces the time, effort and resources needed
to build any web application. It is focused on making you, the developer, as productive as possible by doing all the common, repetitive, yet essential, tasks involved in most web development projects.

Ember.js also provides access to the most advanced features of JavaScript, HTML and the Browser giving you everything you need to create your next killer web app.

- [Website](https://emberjs.com)
- [Guides](https://guides.emberjs.com)
- [API](https://emberjs.com/api)
- [Community](https://emberjs.com/community)
- [Blog](https://emberjs.com/blog)
- [Builds](https://emberjs.com/builds)

# Contribution

See [CONTRIBUTING.md](https://github.com/emberjs/ember.js/blob/master/CONTRIBUTING.md)

---

Cross-browser testing provided by:

<a href="http://browserstack.com"><img height="70" src="https://p3.zdusercontent.com/attachment/1015988/PWfFdN71Aung2evRkIVQuKJpE?token=eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0..aUrNFb8clSXsFwgw5BUTcg.IJr5piuCen7PmSSBHSrOnqM9K5YZfxX3lvbp-5LCqoKOi4CjjgdA419iqjofs0nLtm26FMURvZ8JRTuKB4iHer6lGu5f8dXHtIkYAHjP5fXDWkl044Yg2mSdrhF6uPy62GdlBYoYxwvgkNrac8nN_In8GY-qOC7bYmlZyJT7tsTZUTYbNMQiXS86YA5LgdCEWzWreMvc3C6cvZtVXIrcVgpkroIhvsTQPm4vQA-Uq6iCbTPA4oX5cpEtMtrlg4jYBnnAE4BTw5UwU_dY83ep5g.7wpc1IKv0rSRGsvqCG_q3g" alt="BrowserStack"></a>
# [React](https://reactjs.org/) &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/facebook/react/blob/master/LICENSE) [![npm version](https://img.shields.io/npm/v/react.svg?style=flat)](https://www.npmjs.com/package/react) [![Coverage Status](https://img.shields.io/coveralls/facebook/react/master.svg?style=flat)](https://coveralls.io/github/facebook/react?branch=master) [![CircleCI Status](https://circleci.com/gh/facebook/react.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/facebook/react) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://reactjs.org/docs/how-to-contribute.html#your-first-pull-request)

React is a JavaScript library for building user interfaces.

* **Declarative:** React makes it painless to create interactive UIs. Design simple views for each state in your application, and React will efficiently update and render just the right components when your data changes. Declarative views make your code more predictable, simpler to understand, and easier to debug.
* **Component-Based:** Build encapsulated components that manage their own state, then compose them to make complex UIs. Since component logic is written in JavaScript instead of templates, you can easily pass rich data through your app and keep state out of the DOM.
* **Learn Once, Write Anywhere:** We don't make assumptions about the rest of your technology stack, so you can develop new features in React without rewriting existing code. React can also render on the server using Node and power mobile apps using [React Native](https://facebook.github.io/react-native/).

[Learn how to use React in your own project](https://reactjs.org/docs/getting-started.html).

## Installation

React has been designed for gradual adoption from the start, and **you can use as little or as much React as you need**:

* Use [Online Playgrounds](https://reactjs.org/docs/getting-started.html#online-playgrounds) to get a taste of React.
* [Add React to a Website](https://reactjs.org/docs/add-react-to-a-website.html) as a `<script>` tag in one minute.
* [Create a New React App](https://reactjs.org/docs/create-a-new-react-app.html) if you're looking for a powerful JavaScript toolchain.

You can use React as a `<script>` tag from a [CDN](https://reactjs.org/docs/cdn-links.html), or as a `react` package on [npm](https://www.npmjs.com/).

## Documentation

You can find the React documentation [on the website](https://reactjs.org/docs).  

Check out the [Getting Started](https://reactjs.org/docs/getting-started.html) page for a quick overview.

The documentation is divided into several sections:

* [Tutorial](https://reactjs.org/tutorial/tutorial.html)
* [Main Concepts](https://reactjs.org/docs/hello-world.html)
* [Advanced Guides](https://reactjs.org/docs/jsx-in-depth.html)
* [API Reference](https://reactjs.org/docs/react-api.html)
* [Where to Get Support](https://reactjs.org/community/support.html)
* [Contributing Guide](https://reactjs.org/docs/how-to-contribute.html)

You can improve it by sending pull requests to [this repository](https://github.com/reactjs/reactjs.org).

## Examples

We have several examples [on the website](https://reactjs.org/). Here is the first one to get you started:

```jsx
class HelloMessage extends React.Component {
  render() {
    return <div>Hello {this.props.name}</div>;
  }
}

ReactDOM.render(
  <HelloMessage name="Taylor" />,
  document.getElementById('container')
);
```

This example will render "Hello Taylor" into a container on the page.

You'll notice that we used an HTML-like syntax; [we call it JSX](https://reactjs.org/docs/introducing-jsx.html). JSX is not required to use React, but it makes code more readable, and writing it feels like writing HTML. If you're using React as a `<script>` tag, read [this section](https://reactjs.org/docs/add-react-to-a-website.html#optional-try-react-with-jsx) on integrating JSX; otherwise, the [recommended JavaScript toolchains](https://reactjs.org/docs/create-a-new-react-app.html) handle it automatically.

## Contributing

The main purpose of this repository is to continue to evolve React core, making it faster and easier to use. Development of React happens in the open on GitHub, and we are grateful to the community for contributing bugfixes and improvements. Read below to learn how you can take part in improving React.

### [Code of Conduct](https://code.facebook.com/codeofconduct)

Facebook has adopted a Code of Conduct that we expect project participants to adhere to. Please read [the full text](https://code.facebook.com/codeofconduct) so that you can understand what actions will and will not be tolerated.

### [Contributing Guide](https://reactjs.org/contributing/how-to-contribute.html)

Read our [contributing guide](https://reactjs.org/contributing/how-to-contribute.html) to learn about our development process, how to propose bugfixes and improvements, and how to build and test your changes to React.

### Good First Issues

To help you get your feet wet and get you familiar with our contribution process, we have a list of [good first issues](https://github.com/facebook/react/labels/good%20first%20issue) that contain bugs which have a relatively limited scope. This is a great place to get started.

### License

React is [MIT licensed](./LICENSE).
     ____                     __      __
    /\  _`\                  /\ \    /\ \                                   __
    \ \ \ \ \     __      ___\ \ \/'\\ \ \____    ___     ___      __      /\_\    ____
     \ \  _ <'  /'__`\   /'___\ \ , < \ \ '__`\  / __`\ /' _ `\  /'__`\    \/\ \  /',__\
      \ \ \ \ \/\ \ \.\_/\ \__/\ \ \\`\\ \ \ \ \/\ \ \ \/\ \/\ \/\  __/  __ \ \ \/\__, `\
       \ \____/\ \__/.\_\ \____\\ \_\ \_\ \_,__/\ \____/\ \_\ \_\ \____\/\_\_\ \ \/\____/
        \/___/  \/__/\/_/\/____/ \/_/\/_/\/___/  \/___/  \/_/\/_/\/____/\/_/\ \_\ \/___/
                                                                           \ \____/
                                                                            \/___/
    (_'_______________________________________________________________________________'_)
    (_.———————————————————————————————————————————————————————————————————————————————._)


Backbone supplies structure to JavaScript-heavy applications by providing models with key-value binding and custom events, collections with a rich API of enumerable functions, views with declarative event handling, and connects it all to your existing application over a RESTful JSON interface.

For Docs, License, Tests, pre-packed downloads, and everything else, really, see:
http://backbonejs.org

To suggest a feature or report a bug:
https://github.com/jashkenas/backbone/issues

For questions on working with Backbone or general discussions:
https://groups.google.com/forum/#!forum/backbonejs,
http://stackoverflow.com/questions/tagged/backbone.js, or
https://gitter.im/jashkenas/backbone

Backbone is an open-sourced component of DocumentCloud:
https://github.com/documentcloud

Many thanks to our contributors:
https://github.com/jashkenas/backbone/graphs/contributors

Special thanks to Robert Kieffer for the original philosophy behind Backbone.
https://github.com/broofa
# Hyperapp

[![Travis CI](https://img.shields.io/travis/jorgebucaran/hyperapp/master.svg)](https://travis-ci.org/jorgebucaran/hyperapp)
[![Codecov](https://img.shields.io/codecov/c/github/jorgebucaran/hyperapp/master.svg)](https://codecov.io/gh/jorgebucaran/hyperapp)
[![npm](https://img.shields.io/npm/v/hyperapp.svg)](https://www.npmjs.org/package/hyperapp)
[![Slack](https://hyperappjs.herokuapp.com/badge.svg)](https://hyperappjs.herokuapp.com "Join us")

Hyperapp is a JavaScript micro-framework for building web applications.

> :wave: [**Hyperapp 2.0**](https://github.com/jorgebucaran/hyperapp/pull/726) is coming out soon! Try it from the [V2](https://github.com/jorgebucaran/hyperapp/tree/V2) branch right now and be sure to follow [@HyperappJS](https://twitter.com/hyperappjs) for all the Hyperapp news & updates.

- **Minimal** — We have aggressively minimized the concepts you need to understand to be productive while remaining on par with what other frameworks can do.
- **Pragmatic** — Hyperapp holds firm on the functional programming front when managing your state, but takes a pragmatic approach to allow for side effects, asynchronous actions, and DOM manipulations.
- **Standalone** — Do more with less. Hyperapp combines state management with a virtual DOM engine that supports keyed updates & lifecycle events — all with no dependencies.

## Getting Started

Our first example is a counter that can be incremented or decremented. Go ahead and [try it online](https://codepen.io/hyperapp/pen/zNxZLP/left/?editors=0010).

```jsx
import { h, app } from "hyperapp"

const state = {
  count: 0
}

const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}

const view = (state, actions) => (
  <div>
    <h1>{state.count}</h1>
    <button onclick={() => actions.down(1)}>-</button>
    <button onclick={() => actions.up(1)}>+</button>
  </div>
)

app(state, actions, view, document.body)
```

Hyperapp consists of a two-function API. <samp>hyperapp.h</samp> returns a new [virtual DOM](#view) node tree and <samp>hyperapp.app</samp> [mounts](#mounting) a new application in the specified DOM element. Without an element, it's possible to use Hyperapp "headless", which can be useful when unit testing your program.

This example assumes you are using a JavaScript compiler like [Babel](https://babeljs.io) or [TypeScript](https://www.typescriptlang.org) and a module bundler like [Parcel](https://parceljs.org), [Webpack](https://webpack.js.org), etc. If you are using JSX, all you need to do is install the JSX [transform plugin](https://babeljs.io/docs/en/babel-plugin-transform-react-jsx) and add the pragma option to your <samp>.babelrc</samp> file.

```json
{
  "plugins": [["@babel/plugin-transform-react-jsx", { "pragma": "h" }]]
}
```

JSX is a language syntax extension that lets you write HTML tags interspersed with JavaScript. Because browsers don't understand JSX, we use a compiler to transform it into <samp>hyperapp.h</samp> function calls under the hood.

```jsx
const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

Note that JSX is not required for building applications with Hyperapp. You can use <samp>hyperapp.h</samp> directly and without a compilation step as shown above. Other alternatives to JSX include [@hyperapp/html](https://github.com/hyperapp/html), [hyperx](https://github.com/substack/hyperx), [t7](https://github.com/trueadm/t7) and [ijk](https://github.com/lukejacksonn/ijk).

## Installation

Install with npm or Yarn.

<pre>
npm i <a href=https://www.npmjs.com/package/hyperapp>hyperapp</a>
</pre>

Then with a module bundler like [Rollup](https://rollupjs.org) or [Webpack](https://webpack.js.org), use as you would anything else.

```js
import { h, app } from "hyperapp"
```

If you don't want to set up a build environment, you can download Hyperapp from a CDN like [unpkg.com](https://unpkg.com/hyperapp) and it will be globally available through the <samp>window.hyperapp</samp> object. We support all ES5-compliant browsers, including Internet Explorer 10 and above.

```html
<script src="https://unpkg.com/hyperapp"></script>
```

## Overview

Hyperapp applications consist of three interconnected parts: the [state](#state), [view](#view), and [actions](#actions).

Once initialized, your application executes in a continuous loop, taking in actions from users or from external events, updating the state, and representing changes in the view through a virtual DOM model. Think of an action as a signal that notifies Hyperapp to update the state and schedule the next view to redraw. After processing an action, the new state is presented back to the user.

### State

The state is a plain JavaScript object that describes your entire program. It consists of all the dynamic data that is moved around in the application during its execution. The state cannot be mutated once it is created. We must use actions to update it.

```js
const state = {
  count: 0
}
```

Like any JavaScript object, the state can be a nested tree of objects. We refer to nested objects in the state as partial state. A single state tree does not conflict with modularity — see [Nested Actions](#nested-actions) to find out how to update deeply nested objects and split your state and actions.

```js
const state = {
  top: {
    count: 0
  },
  bottom: {
    count: 0
  }
}
```

Because Hyperapp performs a shallow merge when updating your state, the top-level state must be a plain JavaScript object, other than this, you can use any type, including arrays, ES6 [Maps](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map), [Sets](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set), [Immutable.js](https://facebook.github.io/immutable-js/) structures, etc.

#### Local State

Hyperapp does not have the concept of local state. Instead, components are pure functions that return a virtual DOM representation of the global state.

### Actions

The only way to change the state is via actions. An action is a unary function (accepts a single argument) expecting a payload. The payload can be anything you want to pass into the action.

To update the state, an action must return a partial state object. The new state will be the result of a shallow merge between this object and the current state. Under the hood, Hyperapp wires every function in your actions to automatically redraw the view on state changes.

```js
const actions = {
  setValue: value => ({ value })
}
```

Instead of returning a partial state object directly, an action can return a function that takes the current state and actions as arguments and returns a partial state object.

```js
const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}
```

State updates are always immutable. Do not mutate the state object argument within an action and return it — the results are not what you expect (e.g., the view will not be redrawn).

Immutability enables time-travel debugging, helps prevent introducing hard-to-track-down bugs by making state changes more predictable, and allows cheap memoization of components using shallow equality <samp>===</samp> checks.

#### Asynchronous Actions

Actions used for side effects (writing to databases, sending a request to a server, etc.) don't need to have a return value. You may call an action from within another action or callback function. Actions which return a Promise, <samp>undefined</samp> or <samp>null</samp> will not trigger redraws or update the state.

```js
const actions = {
  upLater: value => (state, actions) => {
    setTimeout(actions.up, 1000, value)
  },
  up: value => state => ({ count: state.count + value })
}
```

An action can be an <samp>[async](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function)</samp> function. Because <samp>async</samp> functions return a Promise, and not a partial state object, you need to call another action in order to update the state.

```js
const actions = {
  upLater: () => async (state, actions) => {
    await new Promise(done => setTimeout(done, 1000))
    actions.up(10)
  },
  up: value => state => ({ count: state.count + value })
}
```

#### Nested Actions

Actions can be nested inside namespaces. Updating deeply nested state is as easy as declaring actions inside an object in the same path as the part of the state you want to update.

```jsx
const state = {
  counter: {
    count: 0
  }
}

const actions = {
  counter: {
    down: value => state => ({ count: state.count - value }),
    up: value => state => ({ count: state.count + value })
  }
}
```

#### Interoperability

The <samp>app</samp> function returns a copy of your actions where every function is wired to changes in the state. Exposing this object to the outside world can be useful to operate your application from another program or framework, subscribe to global events, listen to mouse and keyboard input, etc.

To see this in action, modify the example from [Getting Started](#getting-started) to save the wired actions to a variable and try using them. You should see the counter update accordingly.

```jsx
const main = app(state, actions, view, document.body)

setInterval(main.up, 250, 1)
setInterval(main.down, 500, 1)
```

Because state updates are always immutable, returning a reference to the current state will not schedule a view redraw.

```jsx
const actions = {
  getState: () => state => state
}
```

### View

Every time your application state changes, the view function is called so that you can specify how you want the DOM to look based on the new state. The view returns your specification in the form of a plain JavaScript object known as a virtual DOM and Hyperapp takes care of updating the actual DOM to match it.

```js
import { h } from "hyperapp"

export const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

A virtual DOM is a description of what a DOM should look like using a tree of nested JavaScript objects known as virtual nodes. Think of it as a lightweight representation of the DOM. In the example, the view function returns an object like this.

```jsx
{
  nodeName: "div",
  attributes: {},
  children: [
    {
      nodeName: "h1",
      attributes: {},
      children: [0]
    },
    {
      nodeName: "button",
      attributes: { ... },
      children: ["-"]
    },
    {
      nodeName:   "button",
      attributes: { ... },
      children: ["+"]
    }
  ]
}
```

The virtual DOM model allows us to write code as if the entire document is thrown away and rebuilt on each change, while we only update what actually changed. We try to do this in the least number of steps possible, by comparing the new virtual DOM against the previous one. This leads to high efficiency, since typically only a small percentage of nodes need to change, and changing real DOM nodes is costly compared to recalculating the virtual DOM.

It may seem wasteful to throw away the old virtual DOM and re-create it entirely on every update — not to mention the fact that at any one time, Hyperapp is keeping two virtual DOM trees in memory, but as it turns out, browsers can create hundreds of thousands of objects very quickly. On the other hand, modifying the DOM is several orders of magnitude more expensive.

### Mounting

To mount your application on a page, we need a DOM element. This element is referred to as the application container. Applications built with Hyperapp always have a single container.

```jsx
app(state, actions, view, container)
```

Hyperapp will also attempt to reuse existing elements inside the container enabling SEO optimization and improving your sites time-to-interactive. The process consists of serving a fully rendered page together with your application. Then instead of throwing away the existing content, we'll turn your DOM nodes into an interactive application out of the box.

This is how we can recycle server-rendered content out the counter example from before. See [Getting Started](#getting-started) for the application code.

```html
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <script defer src="bundle.js"></script>
</head>

<body>
  <div>
    <h1>0</h1>
    <button>-</button>
    <button>+</button>
  </div>
</body>
</html>
```

### Components

A component is a pure function that returns a virtual node. Unlike the view function, components are not wired to your application state or actions. Components are dumb, reusable blocks of code that encapsulate markup, styles, and behaviors that belong together.

Here's a taste of how to use components in your application. The application is a typical To-Do manager. Go ahead and [try it online here](https://codepen.io/hyperapp/pen/zNxRLy).

```jsx
import { h } from "hyperapp"

const TodoItem = ({ id, value, done, toggle }) => (
  <li
    class={done && "done"}
    onclick={() =>
      toggle({
        value: done,
        id: id
      })
    }
  >
    {value}
  </li>
)

export const view = (state, actions) => (
  <div>
    <h1>Todo</h1>
    <ul>
      {state.todos.map(({ id, value, done }) => (
        <TodoItem id={id} value={value} done={done} toggle={actions.toggle} />
      ))}
    </ul>
  </div>
)
```

If you don't know all the attributes that you want to place in a component ahead of time, you can use the [spread syntax](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_operator). Note that Hyperapp components can return an array of elements as in the following example. This technique lets you group a list of children without adding extra nodes to the DOM.

```jsx
const TodoList = ({ todos, toggle }) =>
  todos.map(todo => <TodoItem {...todo} toggle={toggle} />)
```

#### Lazy Components

Components can only receive attributes and children from their parent component. Similarly to the top-level view function, lazy components are passed your application global state and actions. To create a lazy component, return a view function from a regular component.

```jsx
import { h } from "hyperapp"

export const Up = ({ by }) => (state, actions) => (
  <button onclick={() => actions.up(by)}>+ {by}</button>
)

export const Down = ({ by }) => (state, actions) => (
  <button onclick={() => actions.down(by)}>- {by}</button>
)

export const Double = () => (state, actions) => (
  <button onclick={() => actions.up(state.count)}>+ {state.count}</button>
)

export const view = (state, actions) => (
  <main>
    <h1>{state.count}</h1>
    <Up by={2} />
    <Down by={1} />
    <Double />
  </main>
)
```

#### Handling Component State

Suppose you have a list of questions with answers that are collapsed initially. A flag `answerIsOpen` is used to determine if a question's answer is open.

Since there is no concept of local state in Hyperapp, the global state is always updated rather than an individual component's state.

To update a single question's state, the entire `questions` array will be mapped to a new array where the `answerIsOpen` property will be toggled if the question matches the one belonging to the component.

[View the example online](https://codepen.io/anon/pen/ZogRYP).

#### Children Composition

Components receive their children elements via the second argument, allowing you and other components to pass arbitrary children down to them.

```jsx
const Box = ({ color }, children) => (
  <div class={`box box-${color}`}>{children}</div>
)

const HelloBox = ({ name }) => (
  <Box color="green">
    <h1 class="title">Hello, {name}!</h1>
  </Box>
)
```

## Supported Attributes

Supported attributes include [HTML attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes), [SVG attributes](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute), [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events), [Lifecycle Events](#lifecycle-events), and [Keys](#keys). Note that non-standard HTML attribute names are not supported, <samp>onclick</samp> and <samp>class</samp> are valid, but <samp>onClick</samp> or <samp>className</samp> are not.

### Styles

The <samp>style</samp> attribute expects a plain object rather than a string as in HTML.
Each declaration consists of a style name property written in <samp>camelCase</samp> and a value. CSS variables are supported too.

Individual style properties will be diffed and mapped against <samp>[HTMLElement.style](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style)</samp> property members of the DOM element - you should therefore use the JavaScript style object [property names](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference), e.g. <samp>backgroundColor</samp> rather than <samp>background-color</samp>.

```jsx
import { h } from "hyperapp"

export const Jumbotron = ({ text }) => (
  <div
    style={{
      color: "white",
      fontSize: "32px",
      textAlign: center,
      backgroundImage: `url(${imgUrl})`
    }}
  >
    {text}
  </div>
)
```

### Lifecycle Events

You can be notified when elements managed by the virtual DOM are created, updated or removed via lifecycle events. Use them for animation, data fetching, wrapping third-party libraries, cleaning up resources, etc.

Note that lifecycle events are attached to virtual DOM nodes, not to components. Consider adding a key to ensure that the event is attached to a specific DOM element, rather than a recycled one.

#### oncreate

This event is fired after the element is created and attached to the DOM. Use it to manipulate the DOM node directly, make a network request, create a slide/fade in animation, etc.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    oncreate={element => element.focus()}
  />
)
```

#### onupdate

This event is fired every time we update the element attributes. Use <samp>oldAttributes</samp> inside the event handler to check if any attributes changed or not.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    onupdate={(element, oldAttributes) => {
      if (oldAttributes.placeholder !== placeholder) {
        // Handle changes here!
      }
    }}
  />
)
```

#### onremove

This event is fired before the element is removed from the DOM. Use it to create slide/fade out animations. Call <samp>done</samp> inside the function to remove the element. This event is not called in its child elements.

```jsx
import { h } from "hyperapp"

export const MessageWithFadeout = ({ title }) => (
  <div onremove={(element, done) => fadeout(element).then(done)}>
    <h1>{title}</h1>
  </div>
)
```

#### ondestroy

This event is fired after the element has been removed from the DOM, either directly or as a result of a parent being removed. Use it for invalidating timers, canceling a network request, removing global events listeners, etc.

```jsx
import { h } from "hyperapp"

export const Camera = ({ onerror }) => (
  <video
    poster="loading.png"
    oncreate={element => {
      navigator.mediaDevices
        .getUserMedia({ video: true })
        .then(stream => (element.srcObject = stream))
        .catch(onerror)
    }}
    ondestroy={element => element.srcObject.getTracks()[0].stop()}
  />
)
```

### Keys

Keys help identify nodes every time we update the DOM. By setting the <samp>key</samp> property on a virtual node, you declare that the node should correspond to a particular DOM element. This allows us to re-order the element into its new position, if the position changed, rather than risk destroying it.

```jsx
import { h } from "hyperapp"

export const ImageGallery = ({ images }) =>
  images.map(({ hash, url, description }) => (
    <li key={hash}>
      <img src={url} alt={description} />
    </li>
  ))
```

Keys must be unique among sibling nodes. Don't use an array index as the key, if the index also specifies the order of siblings. If the position and number of items in a list are fixed, it will make no difference, but if the list is dynamic, the key will change every time the tree is rebuilt.

```jsx
import { h } from "hyperapp"

export const PlayerList = ({ players }) =>
  players
    .slice()
    .sort((player, nextPlayer) => nextPlayer.score - player.score)
    .map(player => (
      <li key={player.username} class={player.isAlive ? "alive" : "dead"}>
        <PlayerProfile {...player} />
      </li>
    ))
```

#### Top-Level Nodes

Keys are not registered on the top-level node of your view. If you are toggling the top-level view, and you must use keys, wrap them in an unchanging node.

## Links

- [Slack](https://hyperappjs.herokuapp.com)
- [Twitter](https://twitter.com/hyperappJS)
- [Examples](https://codepen.io/search/pens/?q=hyperapp)
- [/r/hyperapp](https://www.reddit.com/r/hyperapp)

## License

Hyperapp is MIT licensed. See [LICENSE](LICENSE.md).
# Knockout

**Knockout** is a JavaScript [MVVM](http://en.wikipedia.org/wiki/Model_View_ViewModel) (a modern variant of MVC) library that makes it easier to create rich, desktop-like user interfaces with JavaScript and HTML. It uses *observers* to make your UI automatically stay in sync with an underlying data model, along with a powerful and extensible set of *declarative bindings* to enable productive development.

## Getting started

[![Join the chat at https://gitter.im/knockout/knockout](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/knockout/knockout?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

**Totally new to Knockout?** The most fun place to start is the [online interactive tutorials](http://learn.knockoutjs.com/).

For more details, see

 * Documentation on [the project's website](http://knockoutjs.com/documentation/introduction.html)
 * Online examples at [http://knockoutjs.com/examples/](http://knockoutjs.com/examples/)

## Downloading Knockout

You can [download released versions of Knockout](http://knockoutjs.com/downloads/) from the project's website.

For Node.js developers, Knockout is also available from [npm](https://npmjs.org/) - just run `npm install knockout`.

## Building Knockout from sources

If you prefer to build the library yourself:

1. **Clone the repo from GitHub**

   ```sh
   git clone https://github.com/knockout/knockout.git
   cd knockout
   ```

2. **Acquire build dependencies.**

   Make sure you have [Node.js](http://nodejs.org/) installed on your workstation. This is only needed to _build_ Knockout from sources. Knockout itself has no dependency on Node.js once it is built (it works with any server technology or none). Now run:

   ```sh
   npm install -g grunt-cli
   npm install
   ```

   The first `npm` command sets up the popular [Grunt](http://gruntjs.com/) build tool. You might need to run this command with `sudo` if you're on Linux or Mac OS X, or in an Administrator command prompt on Windows. The second `npm` command fetches the remaining build dependencies.

3. **Run the build tool**

   ```sh
   grunt
   ```
   Now you'll find the built files in `build/output/`.

## Running the tests

If you have [phantomjs](http://phantomjs.org/download.html) installed, then the `grunt` script will automatically run the specification suite and report its results.

Or, if you want to run the specs in a browser (e.g., for debugging), simply open `spec/runner.html` in your browser.

## License

MIT license - [http://www.opensource.org/licenses/mit-license.php](http://www.opensource.org/licenses/mit-license.php)
<p align="center">
    <a href="http://markojs.com/"><img src="https://raw.githubusercontent.com/marko-js/branding/master/marko-logo-medium-cropped.png" alt="Marko logo" width="300" /></a><br /><br />
</p>

Marko is a friendly (and fast!) UI library that makes building web apps fun.
Learn more on [markojs.com](http://markojs.com/), and even [Try Marko Online!](http://markojs.com/try-online/)

[![Build Status](https://travis-ci.org/marko-js/marko.svg?branch=master)](https://travis-ci.org/marko-js/marko)
[![Coverage Status](https://codecov.io/gh/marko-js/marko/branch/master/graph/badge.svg)](https://codecov.io/gh/marko-js/marko)
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/marko-js/marko)
[![NPM](https://img.shields.io/npm/v/marko.svg)](https://www.npmjs.com/package/marko)
[![Downloads](https://img.shields.io/npm/dm/marko.svg)](http://npm-stat.com/charts.html?package=marko)

# Get Involved

- **Contributing**: Pull requests are welcome!
  - Read [`CONTRIBUTING.md`](.github/CONTRIBUTING.md) and check out our [bite-sized](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Adifficulty%3Abite-sized) and [help-wanted](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Astatus%3Ahelp-wanted) issues
  - Submit github issues for any feature enhancements, bugs or documentation problems
- **Support**: Join our [gitter chat](https://gitter.im/marko-js/marko) to ask questions to get support from the maintainers and other Marko developers
  - Questions/comments can also be posted as [github issues](https://github.com/marko-js/marko/issues)
- **Discuss**: Tweet using the `#MarkoJS` hashtag and follow [@MarkoDevTeam](https://twitter.com/MarkoDevTeam)

# Installation

```bash
npm install marko --save
```

# Examples

Marko provides an elegant and readable syntax for both single-file components
and components broken into separate files. There are plenty of examples to play
with on [Marko's Try-Online](http://markojs.com/try-online/). Additional
[component documentation](http://markojs.com/docs/components/) can be found on
the Marko.js website.

## Single file

The following single-file component renders a button and a counter with the
number of times the button has been clicked. [Try this example now!](http://markojs.com/try-online/?file=%2Fcomponents%2Fcomponents%2Fclick-count%2Findex.marko)

**click-count.marko**

```marko
class {
    onCreate() {
        this.state = { count:0 };
    }
    increment() {
        this.state.count++;
    }
}

style {
    .count {
        color:#09c;
        font-size:3em;
    }
    .example-button {
        font-size:1em;
        padding:0.5em;
    }
}

<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

## Multi-file

The same component as above split into an `index.marko` template file,
`component.js` containing your component logic, and `style.css` containing your
component style:

**index.marko**

```marko
<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

**component.js**

```js
module.exports = {
  onCreate() {
    this.state = { count: 0 };
  },
  increment() {
    this.state.count++;
  }
};
```

**style.css**

```css
.count {
  color: #09c;
  font-size: 3em;
}
.example-button {
  font-size: 1em;
  padding: 0.5em;
}
```

## Concise Syntax

Marko also support a beautiful concise syntax as an alternative to the HTML
syntax. Find out more about the [concise syntax here](http://markojs.com/docs/concise/).

```marko
<!-- Marko HTML syntax -->
<ul>
    <li for(color in ['a', 'b', 'c'])>
        ${color}
    </li>
</ul>
```

```marko
// Marko concise syntax
ul
    li for(color in ['a', 'b', 'c'])
        -- ${color}
```

# Changelog

See [CHANGELOG.md](CHANGELOG.md)

# Maintainers

- [Patrick Steele-Idem](https://github.com/patrick-steele-idem) (Twitter: [@psteeleidem](http://twitter.com/psteeleidem))
- [Michael Rawlings](https://github.com/mlrawlings) (Twitter: [@mlrawlings](https://twitter.com/mlrawlings))
- [Phillip Gates-Idem](https://github.com/philidem/) (Twitter: [@philidem](https://twitter.com/philidem))
- [Austin Kelleher](https://github.com/austinkelleher) (Twitter: [@AustinKelleher](https://twitter.com/AustinKelleher))
- [Dylan Piercey](https://github.com/dylanpiercey) (Twitter: [@dylan_piercey](https://twitter.com/dylan_piercey))
- [Martin Aberer](https://github.com/tindli) (Twitter: [@metaCoffee](https://twitter.com/metaCoffee))

# Code of Conduct

This project adheres to the [eBay Code of Conduct](http://ebay.github.io/codeofconduct).
By participating in this project you agree to abide by its terms.

# License

MIT
# Matreshka.js 2 [![npm version](https://badge.fury.io/js/matreshka.svg)](https://badge.fury.io/js/matreshka) [![Build Status](https://travis-ci.org/matreshkajs/matreshka.svg)](https://travis-ci.org/matreshkajs/matreshka) [![Coverage Status](https://coveralls.io/repos/github/matreshkajs/matreshka/badge.svg?branch=master)](https://coveralls.io/github/matreshkajs/matreshka?branch=master) [![Join the chat at https://gitter.im/finom/matreshka](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/matreshkajs/matreshka)

[![Matreshka Website](http://matreshka.io/img/mk5-logo_full-vert.svg)](http://matreshka.io)

> Matreshka.js is a simple JavaScript framework for single page applications creation. It fills the gap between a junior and a senior because of simple and intuitive API based on JavaScript classes and accessors. Everything you need to get started is your JavaScript knowledge.

## Features
- Reactive API which allows to solve hard and confusing problems easily
- High robustness of developed apps
- The ability to refactor legacy applications without rewriting them from scratch
- Only couple of hours is needed to master the framework because of an absence of complex concepts

**[Download](https://github.com/matreshkajs/matreshka/tree/gh-pages)**

**Install via NPM**
```
npm install --save matreshka
```

-----------------------------------

## Resources
- [The website](http://matreshka.io)
- [Examples and tutorials](https://github.com/matreshkajs/examples-and-tutorials)
- [Release History](https://github.com/matreshkajs/matreshka/releases)
- [JSDoc files](https://github.com/matreshkajs/matreshka.io/tree/master/doc)
- [Twitter (automatically reports about new versions)](https://twitter.com/matreshkajs)
- [Support the project on Patreon](https://www.patreon.com/finom)

**License:** [MIT License](https://raw.github.com/finom/matreshka/master/LICENSE)



<a href="https://www.browserstack.com/" target="_blank">
    <img src="http://matreshka.io/img/logos/browserstack.svg" height="30" valign="middle">
</a> is provided a sponsored access to their testing platform
# Introduction

- [What is Mithril?](#what-is-mithril)
- [Getting started](#getting-started)
- [Hello world](#hello-world)
- [DOM elements](#dom-elements)
- [Components](#components)
- [Routing](#routing)
- [XHR](#xhr)

---

### What is Mithril?

Mithril is a modern client-side Javascript framework for building Single Page Applications.  
It's small (< 8kb gzip), fast and provides routing and XHR utilities out of the box.

<div style="display:flex;margin:0 0 30px;">
	<div style="width:50%;">
		<h5>Download size</h5>
		<small>Mithril (8kb)</small>
		<div style="animation:grow 0.08s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:4%;"></div>
		<small style="color:#aaa;">Vue + Vue-Router + Vuex + fetch (40kb)</small>
		<div style="animation:grow 0.4s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:20%"></div>
		<small style="color:#aaa;">React + React-Router + Redux + fetch (64kb)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:32%"></div>
		<small style="color:#aaa;">Angular (135kb)</small>
		<div style="animation:grow 1.35s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:68%"></div>
	</div>
	<div style="width:50%;">
		<h5>Performance</h5>
		<small>Mithril (6.4ms)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:24%;"></div>
		<small style="color:#aaa;">Vue (9.8ms)</small>
		<div style="animation:grow 0.98s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:40%"></div>
		<small style="color:#aaa;">React (12.1ms)</small>
		<div style="animation:grow 1.21s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:48%"></div>
		<small style="color:#aaa;">Angular (11.5ms)</small>
		<div style="animation:grow 1.15s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:44%"></div>
	</div>
</div>

Mithril is used by companies like Vimeo and Nike, and open source platforms like Lichess.

If you are an experienced developer and want to know how Mithril compares to other frameworks, see the [framework comparison](http://mithril.js.org/framework-comparison.html) page.

Mithril supports browsers all the way back to IE9, no polyfills required.

---

### Getting started

The easiest way to try out Mithril is to include it from a CDN, and follow this tutorial. It'll cover the majority of the API surface (including routing and XHR) but it'll only take 10 minutes.

Let's create an HTML file to follow along:

```markup
<body>
	<script src="//unpkg.com/mithril/mithril.js"></script>
	<script>
	var root = document.body

	// your code goes here!
	</script>
</body>
```

---

### Hello world

Let's start as small as we can: render some text on screen. Copy the code below into your file (and by copy, I mean type it out - you'll learn better)

```javascript
var root = document.body

m.render(root, "Hello world")
```

Now, let's change the text to something else. Add this line of code under the previous one:

```javascript
m.render(root, "My first app")
```

As you can see, you use the same code to both create and update HTML. Mithril automatically figures out the most efficient way of updating the text, rather than blindly recreating it from scratch.

---

### DOM elements

Let's wrap our text in an `<h1>` tag.

```javascript
m.render(root, m("h1", "My first app"))
```

The `m()` function can be used to describe any HTML structure you want. So if you need to add a class to the `<h1>`:

```javascript
m("h1", {class: "title"}, "My first app")
```

If you want to have multiple elements:

```javascript
[
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
]
```

And so on:

```javascript
m("main", [
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
])
```

Note: If you prefer `<html>` syntax, [it's possible to use it via a Babel plugin](http://mithril.js.org/jsx.html).

```jsx
// HTML syntax via Babel's JSX plugin
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

---

### Components

A Mithril component is just an object with a `view` function. Here's the code above as a component:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", "A button"),
		])
	}
}
```

To activate the component, we use `m.mount`.

```javascript
m.mount(root, Hello)
```

As you would expect, doing so creates this markup:

```markup
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

The `m.mount` function is similar to `m.render`, but instead of rendering some HTML only once, it activates Mithril's auto-redrawing system. To understand what that means, let's add some events:

```javascript
var count = 0 // added a variable

var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			// changed the next line
			m("button", {onclick: function() {count++}}, count + " clicks"),
		])
	}
}

m.mount(root, Hello)
```

We defined an `onclick` event on the button, which increments a variable `count` (which was declared at the top). We are now also rendering the value of that variable in the button label.

You can now update the label of the button by clicking the button. Since we used `m.mount`, you don't need to manually call `m.render` to apply the changes in the `count` variable to the HTML; Mithril does it for you.

If you're wondering about performance, it turns out Mithril is very fast at rendering updates, because it only touches the parts of the DOM it absolutely needs to. So in our example above, when you click the button, the text in it is the only part of the DOM Mithril actually updates.

---

### Routing

Routing just means going from one screen to another in an application with several screens.

Let's add a splash page that appears before our click counter. First we create a component for it:

```javascript
var Splash = {
	view: function() {
		return m("a", {href: "#!/hello"}, "Enter!")
	}
}
```

As you can see, this component simply renders a link to `#!/hello`. The `#!` part is known as a hashbang, and it's a common convention used in Single Page Applications to indicate that the stuff after it (the `/hello` part) is a route path.

Now that we going to have more than one screen, we use `m.route` instead of `m.mount`.

```javascript
m.route(root, "/splash", {
	"/splash": Splash,
	"/hello": Hello,
})
```

The `m.route` function still has the same auto-redrawing functionality that `m.mount` does, and it also enables URL awareness; in other words, it lets Mithril know what to do when it sees a `#!` in the URL.

The `"/splash"` right after `root` means that's the default route, i.e. if the hashbang in the URL doesn't point to one of the defined routes (`/splash` and `/hello`, in our case), then Mithril redirects to the default route. So if you open the page in a browser and your URL is `http://localhost`, then you get redirected to `http://localhost/#!/splash`.

Also, as you would expect, clicking on the link on the splash page takes you to the click counter screen we created earlier. Notice that now your URL will point to `http://localhost/#!/hello`. You can navigate back and forth to the splash page using the browser's back and next button.

---

### XHR

Basically, XHR is just a way to talk to a server.

Let's change our click counter to make it save data on a server. For the server, we'll use [REM](http://rem-rest-api.herokuapp.com), a mock REST API designed for toy apps like this tutorial.

First we create a function that calls `m.request`. The `url` specifies an endpoint that represents a resource, the `method` specifies the type of action we're taking (typically the `PUT` method [upserts](https://en.wiktionary.org/wiki/upsert)), `data` is the payload that we're sending to the endpoint and `withCredentials` means to enable cookies (a requirement for the REM API to work)

```javascript
var count = 0
var increment = function() {
	m.request({
		method: "PUT",
		url: "//rem-rest-api.herokuapp.com/api/tutorial/1",
		data: {count: count + 1},
		withCredentials: true,
	})
	.then(function(data) {
		count = parseInt(data.count)
	})
}
```

Calling the increment function [upserts](https://en.wiktionary.org/wiki/upsert) an object `{count: 1}` to the `/api/tutorial/1` endpoint. This endpoint returns an object with the same `count` value that was sent to it. Notice that the `count` variable is only updated after the request completes, and it's updated with the response value from the server now.

Let's replace the event handler in the component to call the `increment` function instead of incrementing the `count` variable directly:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", {onclick: increment}, count + " clicks"),
		])
	}
}
```

Clicking the button should now update the count.

---

We covered how to create and update HTML, how to create components, routes for a Single Page Application, and interacted with a server via XHR.

This should be enough to get you started writing the frontend for a real application. Now that you are comfortable with the basics of the Mithril API, [be sure to check out the simple application tutorial](http://mithril.js.org/simple-application.html), which walks you through building a realistic application.
 NuclearJS

[![Build Status](https://travis-ci.org/optimizely/nuclear-js.svg?branch=master)](https://travis-ci.org/optimizely/nuclear-js)
[![Coverage Status](https://coveralls.io/repos/optimizely/nuclear-js/badge.svg?branch=master)](https://coveralls.io/r/optimizely/nuclear-js?branch=master)
[![Join the chat at https://gitter.im/optimizely/nuclear-js](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/optimizely/nuclear-js?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Sauce Test Status](https://saucelabs.com/browser-matrix/nuclearjs.svg)](https://saucelabs.com/u/nuclearjs)

Traditional Flux architecture built with ImmutableJS data structures.

## Documentation

[https://optimizely.github.io/nuclear-js/](https://optimizely.github.io/nuclear-js/)

## Design Philosophy

- **Simple Over Easy** - The purpose of NuclearJS isn't to write the most expressive TodoMVC anyone's ever seen.  The goal of NuclearJS is to provide a way to model data that is easy to reason about and decouple at very large scale.

- **Immutable** - A means for less defensive programming, more predictability and better performance.

- **Functional** - The framework should be implemented functionally wherever appropriate.  This reduces incidental complexity and pairs well with Immutability.

- **Smallest Amount of State Possible** - Using NuclearJS should encourage the modeling of your application state in the most minimal way possible.

- **Decoupled** - A NuclearJS system should be able to function without any sort of UI or frontend.  It should be backend/frontend agnostic and be able to run on a NodeJS server.

## Installation

NuclearJS can be downloaded from [npm](https://www.npmjs.com/).

```
npm install nuclear-js
```

## Examples

- [Shopping Cart Example](./examples/shopping-cart) - Provides a general overview of basic NuclearJS concepts: actions, stores and getters with ReactJS.
- [Flux Chat Example](./examples/flux-chat) - A classic Facebook flux chat example written in NuclearJS.
- [Rest API Example](./examples/rest-api) - Shows how to deal with fetching data from an API using NuclearJS conventions.
- [Hot reloadable stores](./examples/hot-reloading) - Shows how to setup stores to be hot reloadable using webpack hot module replacement.

## How NuclearJS differs from other Flux implementations

1.  All app state is in a singular immutable map, like [Om](https://github.com/omcljs/om).  In development you can see your entire application state at every point in time thanks to awesome debugging tools built into NuclearJS.

2.  State is not spread out through stores, instead stores are a declarative way of describing some top-level domain of your app state. For each key in the app state map a store declares the initial state of that key and how that piece of the app state reacts over time to actions dispatched on the flux system.

3.  Stores are not reference-able nor have any `getX` methods on them.  Instead NuclearJS uses a functional lens concept called **getters**. In fact, the use of getters obviates the need for any store to know about another store, eliminating the confusing `store.waitsFor` method found in other flux implementations.

4.  NuclearJS is insanely efficient - change detection granularity is infinitesimal, you can even observe computed state where several pieces of the state map are combined together and run through a transform function.  NuclearJS is smart enough to know when the value of any computed changes and only call its observer if and only if its value changed in a way that is orders of magnitude more efficient than traditional dirty checking.  It does this by leveraging ImmutableJS data structure and using a `state1 !== state2` reference comparison which runs in constant time.

5.  Automatic data observation / rendering -- automatic re-rendering is built in for React in the form of a very lightweight mixin.  It is also easily possible to build the same functionality for any UI framework such as VueJS, AngularJS and even Backbone.

6.  NuclearJS is not a side-project, it's used as the default Flux implementation that powers all of Optimizely.  It is well tested and will continue to be maintained for the foreseeable future. Our current codebase has over dozens of stores, actions and getters, we even share our prescribed method of large scale code organization and testing strategies.

## Performance

Getters are only calculated whenever their dependencies change. So if the dependency is a keypath then it will only recalculate when that path in the app state map has changed (which can be done as a simple `state.getIn(keyPath) !== oldState.getIn(keyPath)` which is an `O(log32(n))` operation. The other case is when a getter is dependent on other getters. Since every getter is a pure function, NuclearJS will only recompute the getter if the values of its dependencies change.

## API Documentation

[API Documentation](https://optimizely.github.io/nuclear-js/docs/07-api.html)

## For Smaller Applications

NuclearJS was designed first and foremost for large scale production codebases.  For a much more lightweight Flux implementation that shares many of the same ideas and design principles check out [Microcosm](https://github.com/vigetlabs/microcosm).

## Contributing

Contributions are welcome, especially with the documentation website and examples.  See [CONTRIBUTING.md](./CONTRIBUTING.md).
# Polymer

[![Build Status](https://travis-ci.org/Polymer/polymer.svg?branch=master)](https://travis-ci.org/Polymer/polymer)
[![Published on npm](https://img.shields.io/npm/v/@polymer/polymer.svg)](https://www.npmjs.com/package/@polymer/polymer)
[![Published on webcomponents.org](https://img.shields.io/badge/webcomponents.org-published-blue.svg)](https://www.webcomponents.org/element/@polymer/polymer)

> ℹ️ Note: This is the current stable version of the Polymer library.  At Google I/O 2018 we announced a new Web Component base class, [`LitElement`](https://github.com/Polymer/lit-element), as a successor to the `PolymerElement` base class in this library.
>
> If you're starting a new project, we recommend that you consider using LitElement instead.
>
> If you have a project you've built with an earlier version of the Polymer library, we recommend that you [migrate](#about-polymer-30) to 3.0 for best compatibility with the JavaScript ecosystem. Thanks to the interoperability of Web Components, elements built with Polymer 3.0 and LitElement can be mixed and matched in the same app, so once you have updated your project to Polymer 3.0, you can migrate to LitElement incrementally, one element at a time.  See our blog post on the [Polymer Project roadmap](https://www.polymer-project.org/blog/2018-05-02-roadmap-update.html) for more information.

Polymer lets you build encapsulated, reusable [Web Components](https://www.webcomponents.org/introduction) that work just like standard HTML elements, to use in building web applications.  Using a Web Component built with Polymer is as simple as importing its definition then using it like any other HTML element:

```html
<!-- Import a component -->
<script src="https://unpkg.com/@polymer/paper-checkbox@next/paper-checkbox.js?module" type="module" ></script>

<!-- Use it like any other HTML element -->
<paper-checkbox>Web Components!</paper-checkbox>
```

Web Components are now implemented natively on Safari and Chrome (~70% of installed browsers), and run well on Firefox, Edge, and IE11 using [polyfills](https://github.com/webcomponents/webcomponentsjs).  Read more [below](#overview).

## Getting started

 * The easiest way to try out Polymer is to use one of these online tools:

    * Runs in all [supported](#supported-browsers) browsers: [StackBlitz](https://stackblitz.com/edit/polymer-element-example?file=index.js), [Glitch](https://glitch.com/edit/#!/polymer-element-example?path=index.html)

    * Runs in browsers with [JavaScript Modules](https://caniuse.com/#search=modules): [JSBin](https://jsbin.com/wuxejiz/edit?html,output),
 [CodePen](https://codepen.io/kevinpschaaf/pen/BxdErp?editors=1000).

 * You can also save [this HTML file](https://gist.githubusercontent.com/kevinpschaaf/8a5acbea7b25d2bb5e82eeea2b105669/raw/c3a86872f07603e2d0ddae736687e52a5c8c499f/index.html) to a local file and run it in any browser that supports [JavaScript Modules]((https://caniuse.com/#search=modules)).

 * When you're ready to use Polymer in a project, install it via [npm](https://www.npmjs.com/). To run the project in the browser,
 a module-compatible toolchain is required. We recommend installing the [Polymer CLI](https://github.com/Polymer/tools/tree/master/packages/cli) to and using its development server as follows.

    1. Add Polymer to your project:

        ```npm i @polymer/polymer```

    1. Create an element by extending PolymerElement and calling `customElements.define` with your class (see the examples below).

    1. Install the Polymer CLI:

        ```npm i -g polymer-cli```

    1. Run the development server and open a browser pointing to its URL:

        ```polymer serve --npm```

    > Polymer 3.0 is published on [npm](https://www.npmjs.com/package/@polymer/polymer) using JavaScript Modules.
    This means it can take advantage of the standard native JavaScript module loader available in all current major browsers.
    >
    > However, since Polymer uses npm conventions to reference dependencies by name, a light transform to rewrite specifiers to URLs is required to run in the browser. The polymer-cli's development server `polymer serve`, as well as `polymer build` (for building an optimized app for deployment)  automatically handles this transform.

    Tools like [webpack](https://webpack.js.org/) and [Rollup](https://rollupjs.org/) can also be used to serve and/or bundle Polymer elements.


## Minimal Example

  1. Create a class that extends `PolymerElement`.
  1. Implement a static `properties` getter that describes the element's public property/attribute API
  (these automatically become observed attributes).
  1. Then implement a `template` getter that returns an `HTMLTemplateElement` describing the element's rendering, including encapsulated styling and any property bindings.

```html
  <script src="node_modules/@webcomponents/webcomponents-loader.js"></script>
  <script type="module">
    import {PolymerElement, html} from '@polymer/polymer';

    class MyElement extends PolymerElement {
      static get properties() { return { mood: String }}
      static get template() {
        return html`
          <style> .mood { color: green; } </style>
          Web Components are <span class="mood">[[mood]]</span>!
        `;
      }
    }

    customElements.define('my-element', MyElement);
  </script>

  <my-element mood="happy"></my-element>
```

## Overview

Web components are an incredibly powerful new set of primitives baked into the web platform, and open up a whole new world of possibility when it comes to componentizing front-end code and easily creating powerful, immersive, app-like experiences on the web.

Polymer is a lightweight library built on top of the web standards-based [Web Components](http://webcomponents.org/introduction) APIs, and makes it easier to build your very own custom HTML elements. Creating reusable custom elements - and using elements built by others - can make building complex web applications easier and more efficient.

By being based on the Web Components APIs built in the browser (or [polyfilled](https://github.com/webcomponents/webcomponentsjs) where needed), elements built with Polymer are:

* Built from the platform up
* Self-contained
* Re-usable
* Interoperable across frameworks

Among many ways to leverage custom elements, they can be particularly useful for building reusable UI components. Instead of continually re-building a specific navigation bar or button in different frameworks and for different projects, you can define this element once using Polymer, and then reuse it throughout your project or in any future project.

Polymer provides a declarative syntax to easily create your own custom elements, using all standard web technologies - define the structure of the element with HTML, style it with CSS, and add interactions to the element with JavaScript.

Polymer also provides optional two-way data-binding, meaning:

1. When properties in the model for an element get updated, the element can update itself in response.
2. When the element is updated internally, the changes can be propagated back to the model.

Polymer is designed to be flexible, lightweight, and close to the web platform - the library doesn't invent complex new abstractions and magic, but uses the best features of the web platform in straightforward ways to simply sugar the creation of custom elements.

## About Polymer 3.0

Polymer 3.0 is now released to stable, and introduces a major change to how Polymer is distributed: from HTML Imports on Bower, to JS modules on npm.  Otherwise, the API is almost entirely backward compatible with Polymer 2.0 (the only changes are removing APIs related to HTML Imports like `importHref`, and converting Polymer's API to be module-based rather than globals-based).

Migrating to Polymer 3.0 by hand is mostly mechanical:
* Components should be defined in JS modules instead of in HTML
* Templates should be encoded in JS modules using a `static get template()` getter on PolymerElement subclasses using the `html` tagged template literal function (which parses `HTMLTemplateElement`s out of strings in JS) rather than using `<template>` elements in a `<dom-module>`
* All dependencies should be imported JS module imports rather than HTML Imports.

However, the [`polymer-modulizer`](https://github.com/Polymer/polymer-modulizer) tool automates the vast majority of this migration work.  Please see details on that repo for automated conversion of Polymer 2.0 apps and elements to Polymer 3.0.

👀 **Looking for Polymer v2.x?** Please see the [the v2 branch](https://github.com/Polymer/polymer/tree/2.x).

👀 **Looking for Polymer v1.x?** Please see the [the v1 branch](https://github.com/Polymer/polymer/tree/1.x).

## Contributing

The Polymer team loves contributions from the community! Take a look at our [contributing guide](CONTRIBUTING.md) for more information on how to contribute.  Please file issues on the Polymer issue tracker following the issue template and contributing guide [issues](https://github.com/Polymer/polymer/issues/new).

## Communicating with the Polymer team

Beyond GitHub, we try to have a variety of different lines of communication available:

* [Blog](https://blog.polymer-project.org/)
* [Twitter](https://twitter.com/polymer)
* [Google+ community](https://plus.google.com/communities/115626364525706131031)
* [Mailing list](https://groups.google.com/forum/#!forum/polymer-dev)
* [Slack channel](https://bit.ly/polymerslack)

# License

The Polymer library uses a BSD-like license that is available [here](./LICENSE.txt)

[![Riot logo](https://riot.js.org/img/logo/riot480x.png)](https://riot.js.org)


## Simple and elegant component-based UI library

[![Build Status][travis-image]][travis-url]
[![MIT License][license-image]][license-url]
[![Riot Forum][riot-forum-image]][riot-forum-url]
[![Join the chat at https://gitter.im/riot/riot][gitter-image]][gitter-url]
[![Join the chat (ja) at https://riot-jp-slackin.herokuapp.com/][slack-ja-image]][slack-ja-url]
[![OpenCollective Backers][backer-badge]][backer-url] [![OpenCollective Sponsors][sponsor-badge]][sponsor-url]

[![NPM version][npm-version-image]][npm-url]
[![NPM downloads][npm-downloads-image]][npm-url]
[![jsDelivr Hits][jsdelivr-image]][jsdelivr-url]
[![Coverage Status][coverage-image]][coverage-url]
![Riot Size][lib-size]
[![Code Quality][codeclimate-image]][codeclimate-url]

[![Sauce Test Status][saucelabs-image]][saucelabs-url]

### Framework Size Comparison

| Framework                                      | Version         | Minified Size (gzip) |
|------------------------------------------------|-----------------|----------------------|
| @angular/core + Polyfills                      | 6.0.9           | 141.79kb             |
| Ember                                          | 2.18.2          | 121.84kb             |
| Polymer + Web Components Polyfill Lite         | 1.8.0           | 66.3kb               |
| React + Map and Set Polyfills                  | 16.4.0          | 41.60kb              |
| Web Components Polyfill                        | 0.7.24          | 33.68kb              |
| Vue                                            | 2.5.17          | 31.65kb              |
| __Riot__                                       | 3.12.0          | 10.80kb              |
| Inferno                                        | 5.4.2           | 7.79kb               |
| Preact                                         | 8.3.1           | 3.48kb               |

The above comparison includes polyfills to support old browsers like IE9 that in Riot.js are supported by default

### Browsers support

Riot is supported by all modern browsers and it does not require any additional polyfill

- IE 9+
- Edge
- Chrome
- Safari 7+
- Firefox
- Safari iOS
- Android

### Custom tags • Concise syntax • Simple API • Tiny Size

Riot brings custom tags to all modern browsers. Think React + Polymer but with enjoyable syntax and a small learning curve.

#### Tag definition

``` javascript
<timer>

  <p>Seconds Elapsed: { time }</p>

  this.time = opts.start || 0

  tick() {
    this.update({ time: ++this.time })
  }

  var timer = setInterval(this.tick, 1000)

  this.on('unmount', function() {
    clearInterval(timer)
  })

</timer>
```

[Open this example on Plunker](http://riot.js.org/examples/plunker/?app=timer)

#### Mounting

``` javascript
riot.mount('timer', { start: 0 })
```

#### Nesting

Custom tags lets you build complex views with HTML.

``` html
<timetable>
  <timer start="0"></timer>
  <timer start="10"></timer>
  <timer start="20"></timer>
</timetable>
```

HTML syntax is the de facto language on the web and it's designed for building user interfaces. The syntax is explicit, nesting is inherent to the language and attributes offer a clean way to provide options for custom tags.


### Expressions Bindings
- Absolutely the smallest possible amount of DOM updates and reflows.
- One way data flow: updates and unmounts are propagated downwards from parent to children.
- Expressions are pre-compiled and cached for high performance.
- Lifecycle events for more control.


### Close to standards
- No proprietary event system.
- Event normalization.
- The rendered DOM can be freely manipulated with other tools.
- No extra HTML root elements or `data-` attributes.
- Plays well with any frontend framework.


### Use your dearest language and tools
- Create tags with CoffeeScript, Jade, LiveScript, Typescript, ES6 or [any pre-processor](http://riot.js.org/guide/compiler/#pre-processors) you want.
- Integrate with NPM, CommonJS, AMD, Bower or Component
- Develop with [Gulp](https://github.com/e-jigsaw/gulp-riot), [Grunt](https://github.com/ariesjia/grunt-riot), [Wintersmith](https://github.com/collingreen/wintersmith-riot), [webpack*](https://github.com/riot/tag-loader), [Rollup*](https://github.com/riot/rollup-plugin-riot), [Browserify*](https://github.com/riot/riotify), [Babel*](https://github.com/riot/babel-preset-es2015-riot) or Bublé
- Test with [Karma*](https://github.com/riot/karma-riot), Mocha or whatever you like

*Note*: `*` officially maintained

### CDN hosting
- [jsDelivr](http://www.jsdelivr.com/projects/riot)
- [cdnjs](https://cdnjs.com/libraries/riot)


### Concise syntax
- Power shortcuts: `class={ enabled: is_enabled, hidden: hasErrors() }`.
- No extra brain load such as `render`, `state`, or `constructor`.
- Interpolation: `Add #{ items.length + 1 }` or `class="item { selected: flag }"`
- Compact ES6 method syntax.

### Demos
- [**Riot Examples** - Community's Official](https://github.com/riot/examples)
- [**Riot Animore** - Official Tags Animations Library](https://github.com/riot/animore)
- [Riot Todo MVC](http://todomvc.com/examples/riotjs/)
- [Hackernews reader](http://git.io/riot-hn)
- [Vuejs examples by Riotjs](https://github.com/txchen/feplay/tree/gh-pages/riot_vue)
- [Flux-like ES6 Todo](https://github.com/srackham/riot-todo)
- [Timer](http://jsfiddle.net/gnumanth/h9kuozp5/)
- [Another flux demo comparable to React ones](http://txchen.github.io/feplay/riot_flux)
- [Various experiments](http://richardbondi.net/programming/riot)
- [Isomorphic application](https://github.com/Avnerus/riot-isomorphic)
- [Isomorphic proof of concept](https://github.com/PabloSichert/isomorphic-proof-of-concept)
- [flux-riot todo](http://mingliangfeng.me/flux-riot)
- [Another Riot Todo MVC](http://nippur72.github.io/riotjs-todomvc/#/)
- [Cheft isomorphic by express](https://github.com/cheft/cheft)
- [electron-riot - Riot in an electron application](https://github.com/mike-ward/electron-riot)
- [An express, riot, jade, webpack simple boilerplate](https://github.com/revington/frontend-boilerplate)
- [Riot.js vs React.js comparison of a simple comment box](https://github.com/vitogit/riot.js-vs-react.js-comment-box)
- [Riot Seed project - webpack, routing, ava tests, dispatcher](https://github.com/continuata/riot-seed)
- [Riot-Redux League Table example](https://github.com/drewmiley/PoolLeague)
- [Riot vs React vs Ractive Counters using Redux store](https://github.com/drewmiley/ractive-react-riot-redux-counters-example)

### Books
- [Building Apps with Riot](https://bleedingedgepress.com/building-apps-with-riot/)

### Tutorials
- [Building Apps with Riot, ES6 and Webpack](http://blog.srackham.com/posts/riot-es6-webpack-apps/)
- [Building Apps with Riot, Babel, RiotControl and Webpack](https://github.com/txchen/feplay/tree/gh-pages/riot_webpack)
- [Building tabs with Riot](http://robertwpearce.com/blog/riotjs-example.html)
- [The "React tutorial" for Riot](https://juriansluiman.nl/article/154/the-react-tutorial-for-riot)
- [How to package "tag libraries" in Riot](https://github.com/ivan-saorin/riot-tutorial-tags-pack-app)
- [Another React tutorial with Riot](https://github.com/viliamjr/commentsTuto)
- [Riot Custom Tag by Example](http://www.triplet.fi/blog/riot-custom-tag-by-example/)
- [Riot Compiler Explained](http://www.triplet.fi/blog/riot-compiler-explained/)
- [Adding compiled Riot tags to your Gulp + Browserify build](http://www.triplet.fi/blog/adding_compiled_riot_tags_to_your_gulp_browserify_build/)
- [The anatomy of a tag - a primer tutorial](http://www.marcusoft.net/2015/12/riotjs-anatomy-of-a-tag.html)
- [Using TDD with Riot+mocha+chai](http://vitomd.com/blog/coding/tutorial_tdd_riot_mocha/)
- [The Basics - from ground up to connected tag-networks](http://happy-css.com/lessons/riotjs/)
- [Hello Riot.js : a quick tutorial about this awesome lib](http://vitomd.com/blog/coding/hello-riot-js-quick-tutorial-about-this-awesome-lib/)

### Video Tutorials
- [Introduction](https://www.youtube.com/watch?v=al87U6NgRTc)
- [Loops, Events and Callbacks](https://www.youtube.com/watch?v=T-ZV9dv93sw)
- [Server Rendering with Node & Express](http://youtu.be/6ww1UXGJzcs)
- [Riot And Webpack Setup](https://youtu.be/UgdZbT-KPpY)
- [Riot and Redux - Part 1](https://youtu.be/Y6vpKAGT2-8)
- [Riot and Redux - Part 2](https://youtu.be/DgM03bvgCYc)
- [Riot and Redux - Part 3](https://youtu.be/QuwnbuneAzM)
- [Riot and Redux - Part 4](https://youtu.be/qc6bjtu7KG0)
- [Riot and Redux - Part 5](https://youtu.be/M4BNsRMatVY)
- [Riot and Redux - Part 6](https://youtu.be/jr8KDpwtRsk)


### Libraries / Frameworks
- [Flux- like event controller for Riot](https://github.com/jimsparkman/RiotControl)
- [flux-riot framework](https://github.com/mingliangfeng/flux-riot)
- [Cheftjs - chinese framework for Riot](https://github.com/cheft/cheftjs)
- [Veronica - flux adaption for Riot](https://www.npmjs.com/package/veronica-x)
- [Minimal Flux dispatcher pattern](https://gist.github.com/continuata/c605846751c09a5e94d12ae8c91cbf05)
- [riot-format: a format library for riotjs, like angular $filter](https://github.com/joylei/riot-format)
- [riot-view-router: a simple state based router mixin](https://github.com/neetjn/riot-view-router)
- [riotx - Centralized State Management for riot.js](https://github.com/cam-inc/riotx)
- [storybook for riot.js components <sup>alpha</sup>](https://github.com/storybooks/storybook/tree/master/app/riot)

### Components
- [Material UI](http://kysonic.github.io/riot-mui/)
- [RiotGear Components](https://riotgear.js.org)
- [RiotGear Router](http://riotgear.js.org/components/router/)
- [Riot Bootstrap](http://cognitom.github.io/riot-bootstrap/)
- [iToolkit](https://github.com/BE-FE/iToolkit)
- [Riot Routehandler](https://github.com/crisward/riot-routehandler)-[(Demo)](http://codepen.io/crisward/pen/xwGJpM?editors=101)
- [Riot Flipcard](https://github.com/crisward/riot-flipcard) - [(Demo)](https://crisward.github.io/riot-flipcard/)
- [Riot Grid](https://github.com/crisward/riot-grid) - [(Demo)](http://codepen.io/crisward/pen/rxepMX?editors=101)
- [Riot Grid2](https://github.com/crisward/riot-grid2) - [(Demo)](http://crisward.github.io/riot-grid2/)
- [Riot Subtag](https://github.com/crisward/riot-subtag) - faster than lots of if's
- [ESLint Riot Plugin](https://github.com/txchen/eslint-plugin-riot)
- [riot-animate](https://github.com/sartaj/riot-animate)
- [Nest UI](https://github.com/fengzilong/Nest) - [(Demo)](https://fengzilong.github.io/Nest/)
- [rGrid](https://github.com/limodou/rgrid) - [(Demo)](https://limodou.github.io/rgrid/examples.html)
- [typewriter](https://github.com/amitguptagwl/web-snippets/tree/master/riotjs-components/typewriter) - [(Demo)](http://amitkumargupta.work)

### Resources
- [create-riot-app](https://github.com/alexstep/create-riot-app-ejected) dev environment
- [Riot + AngularJS](https://github.com/lucasbrigida/angular-riot)
- [Module loader for WebPack](https://www.npmjs.com/package/riotjs-loader)
- [Riot + Meteor]( https://atmospherejs.com/baysao/riotjs)
- [Riot Snake Game](http://cdn.rawgit.com/atian25/blog/master/assets/riot-snake.html)
- [Riot Tag Syntax Checker](http://cognitom.github.io/riot-checker/)
- [Riot 文档中译版](https://github.com/Centaur/riotjs_doc_cn) :cn:
- [Riot + Wintersmith](https://github.com/collingreen/wintersmith-riot)
- [Riot precompiler plugin for lineman](https://github.com/Power-Inside/lineman-riot)
- [Riot Startkit - Flux inspired skeleton app + WebPack + PostCSS](https://github.com/wbkd/riotjs-startkit)
- [Yeoman generator - Generator riot mobile](https://www.npmjs.com/package/generator-riot-mobile)
- [Yeoman generator - Generator riot element](https://www.npmjs.com/package/generator-riot-element)
- [Riot for TypeScript](https://github.com/nippur72/RiotTS)
- [Riot loader plugin for RequireJS](https://github.com/amenadiel/requirejs-riot)
- [Riot loader plugin for JSPM/SystemJS](https://github.com/amenadiel/systemjs-riot)
- [RiotJS Style Guide](https://github.com/voorhoede/riotjs-style-guide)
- [Riot Cheatsheet](http://martinmuzatko.github.io/riot-cheatsheet/)

### Performance
- **Riot vs React performance:** [(Riot version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-riot-vs-vanilla) vs [(React version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-react-vs-vanilla)

### Miscellaneous
- [Q&A with RiotJS author Tero Piirainen](http://www.triplet.fi/blog/q-and-a-with-riotjs-author-tero-piirainen/)
- [riot-detector (Chrome Extension)](https://chrome.google.com/webstore/detail/riot-detector/cnnmjeggdmicjojlnjghdgkdlijiobke)

### Editors / Editor Plugins (Syntax highlighting, autcompletion, etc...)
- [riot (Atom Package)](https://atom.io/packages/riot)
- [language-riot-tag (Atom Package)](https://github.com/dekimasoon/language-riot-tag)
  - Based on Vue's official Sublime Text highlighter
  - Note: Designed for html, not jade.
- [sublime-tag (Sublime Text)](https://github.com/crisward/sublime-tag)
- [riot-tag (Visual Studio)](https://github.com/crisward/riot-tag)
- [web-mode (Emacs)](http://web-mode.org)
  - See how to configure [#1967](https://github.com/riot/riot/issues/1967)

### How to contribute

If you are reading this it's already a good sign and we are thankful for it! We try our best working as much as we could on riot but your help is always appreciated.

If you want to contribute to riot helping us maintaining the project please check first the list of [our open issues](https://github.com/riot/riot/issues) to understand whether there is a task where you could help.

Riot is mainly developed on UNIX systems so you will be able to run all the commands necessary to build and test the library using our [Makefile](Makefile). If you are on a Microsoft machine it could be harder to set up you development environment properly.

Following the steps below you should be able to properly submit your patch to the project

#### 1) Clone the repo and browse to the riot folder

```shell
$ git clone git@github.com:riot/riot.git && cd riot
```
#### 2) Set up your git branch

```shell
$ git checkout -b feature/my-awesome-patch
```

#### 3) Install the npm dependencies

```shell
$ npm i
```

#### 4) Build and test riot using the Makefile

```shell
# To build and test riot
$ make riot

# To build without testing
$ make raw

# To build anytime you change a src file
$ make watch

# To bench riot
$ make perf
```

#### 5) Pull request only against the `dev` branch making sure you have read [our pull request template](.github/PULL_REQUEST_TEMPLATE.md)

#### 6) Be patient


### Credits

Riot is made with :heart: by many smart people from all over the world. Thanks to all the contributors<br>
It's actively maintained by:
<table>
  <tbody>
    <tr>
      <td valign="top">
        <img width="125" height="125" src="https://github.com/GianlucaGuarini.png?s=125?s=125">
        <br>
        <a href="https://github.com/GianlucaGuarini">Gianluca Guarini</a>
      </td>
     </tr>
  </tbody>
</table>

## Official Website

http://riot.js.org

## Backers

Support us with a monthly donation and help us continue our activities. [Become a backer][support-url]

[![Backers][backers-image]][support-url]

## Sponsors

Become a sponsor to get your logo on our README. [Become a sponsor][support-url]

[![Sponsors][sponsors-image]][support-url]

## Thanks

Special thanks to Browserstack for their support

<a href='https://www.browserstack.com/'>
  <img width='70px' src="https://cdn.worldvectorlogo.com/logos/browserstack.svg" alt="browser stack">
</a>

[travis-image]:https://img.shields.io/travis/riot/riot.svg?style=flat-square
[travis-url]:https://travis-ci.org/riot/riot

[license-image]:http://img.shields.io/badge/license-MIT-000000.svg?style=flat-square
[license-url]:LICENSE.txt

[npm-version-image]:http://img.shields.io/npm/v/riot.svg?style=flat-square
[npm-downloads-image]:http://img.shields.io/npm/dm/riot.svg?style=flat-square
[npm-url]:https://npmjs.org/package/riot

[riot-forum-image]:https://img.shields.io/badge/muut-JOIN_FORUM%E2%86%92-ff0044.svg?style=flat-square
[riot-forum-url]:http://riot.js.org/forum/

[coverage-image]:https://img.shields.io/coveralls/riot/riot/dev.svg?style=flat-square
[coverage-url]:https://coveralls.io/r/riot/riot?branch=dev

[saucelabs-image]:https://saucelabs.com/browser-matrix/testsriotjs.svg?1
[saucelabs-url]:https://saucelabs.com/u/testsriotjs

[gitter-image]:https://img.shields.io/badge/GITTER-JOIN_CHAT_%E2%86%92-1dce73.svg?style=flat-square
[gitter-url]:https://gitter.im/riot/riot?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge

[slack-ja-image]:https://img.shields.io/badge/SLACK_(ja)-JOIN_CHAT_%E2%86%92-551a8b.svg?style=flat-square
[slack-ja-url]:https://riot-jp-slackin.herokuapp.com/

[codeclimate-image]:https://api.codeclimate.com/v1/badges/b81ddf3c77e8189876da/maintainability
[codeclimate-url]:https://codeclimate.com/github/riot/riot

[donations-campaign-url]:https://pledgie.com/campaigns/31139
[donations-campaign-image]:https://pledgie.com/campaigns/31139.png?skin_name=chrome

[jsdelivr-image]: https://data.jsdelivr.com/v1/package/npm/riot/badge
[jsdelivr-url]: https://www.jsdelivr.com/package/npm/riot


[backer-url]: #backers
[backer-badge]: https://opencollective.com/riot/backers/badge.svg?color=blue
[sponsor-url]: #sponsors
[sponsor-badge]: https://opencollective.com/riot/sponsors/badge.svg?color=blue

[support-url]: https://opencollective.com/riot#support

[lib-size]: http://img.badgesize.io/https://unpkg.com/riot/riot.min.js?compression=gzip

[backers-image]: https://opencollective.com/riot/backers.svg
[sponsors-image]: https://opencollective.com/riot/sponsors.svg
# Spine
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/spine/spine?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://secure.travis-ci.org/spine/spine.svg)](http://travis-ci.org/spine/spine)

Spine is a lightweight MVC library for building JavaScript web applications. Spine gives you structure and then gets out of your way, allowing you to concentrate on the fun stuff: building awesome web applications.

Spine is opinionated in its approach to web application architecture and design. Spine's architecture complements patterns such as de-coupled components and CommonJS modules, markedly helping with code quality and maintainability.

The library is written in [CoffeeScript](http://coffeescript.org), and though it doesn't necessarily require CoffeeScript to develop applications - you can use whichever language you're most familiar with or prefer - the documentation and some associated tools like [Hem](https://github.com/spine/hem) and [spine.app](https://github.com/spine/spine.app) cater to those who prefer CoffeeScript's syntax.

## Learn it

Documentation is often incomplete or just lies waiting to happen. Approachable source code reduces knowledge dependencies. This is an area where Spine really excells compared to other MVC frameworks. Spine is tiny; the core library comes in at less than 700 lines of CoffeeScript code. It is written in such a way to prefer readability over terseness or clever tricks, and it is small enough that within a rather small timeframe you can understand how all the pieces work together. Expertise is achievable within days or weeks rather than months or years. For these reasons, remaining lightweight and simple is fundamental to Spine.

For documentation, usage, and examples, see: [spinejs.com](http://spinejs.com)

The test suite can also occasionally provide additional useful examples, especially if you are looking for non-coffeescript examples.

# Contributing

## Reporting issues

To file a bug report, please visit the [GitHub issues page](https://github.com/spine/spine/issues).  It's great if you can attach code (test cases and fixes for bugs, and test cases and a proposed implementation for features), but reproducible bug reports are also welcome. 

For support or help with using spine please use the [Spine Google Group](https://groups.google.com/forum/#!forum/spinejs) and/or StackOverflow rather than opening an issue on Github. If you post in those places you are more likely to get more people to chime in, and others can benefit from it more readily.

## Cloning master and running the test suite

To get started contributing to Spine, first clone the repository and make sure you can run the test suite.  If you're not familiar with Git, visit the [Git homepage](http://git-scm.com) to download Git for your platform.

First, clone the repository:

```
$ git clone git://github.com/spine/spine.git
$ cd spine
```

Next, You will need node and npm to pull in the testing libraries. Once you're all set with those then from within the Spine repo directory run 

```
$ npm install .
```

This should bring in [Jasmine](http://jasmine.github.io/), Coffeescript, and a minimalist local server for running the tests a browser. You can also simply open `test/index.html` in a browser to run the [Jasmine](http://jasmine.github.io/) test suite for spine core.  If you see all the tests passing, you're ready to contribute! A known issue is that some of the routing tests will fail if you are simply using a `file://` protocol in the browser. This has to do with browser security. You can avoid this by running the local server, `$ npm start`. Alternatively you can use a server like Apache or Nginx to serve the test files to the browser. 

If you have [phantom.js](http://phantomjs.org/) available then a script is included to make running tests even slicker!

```
$ npm test
```

## Contributing to the Spine documentation

Perhaps the easiest way to get started with contributing is through the docs.  If you find typos, bugs, or omissions in the docs, please submit a pull request to fix.  The Spine website [spinejs.com](http://spinejs.com), which is the primary documentation, is a very simple rails app [spine.site](https://github.com/spine/spine.site). You don't need to know Rails or Ruby to contribute. The vast majority of it is in Markdown

## Contributing to the Spine code

This recommended contribution process is based on the [Ruby on Rails contribution guide](http://edgeguides.rubyonrails.org/contributing_to_ruby_on_rails.html#contributing-to-the-rails-code).  In general, please include tests with new features or bugfixes, work in a feature branch until you're ready to submit or discuss your code, then fork the repository, push to your fork, and issue a pull request.

### CoffeeScript

When submitting a pull request for code, please submit in CoffeeScript. Building the effected js files is required for testing sake, but submitting those js files is optional.

Assuming you have Node.js and npm already installed then proceed by installing local dev dependencies:

```
$ npm install .
```

Then use the provided build scripts to compile your CoffeeScript files:

```
$ cake build
$ cake watch
```

These tasks use a locally installed copy of CoffeeScript to ensure all contributors use the same version of the compiler.

### Git

Let's say I'm going to submit a patch to add someFeatureFix:

```
$ git checkout dev
```

Feature branches should start from `dev` **not** `master`. If you branch off of, or do builds on the master branch you will get CoffeeScript source map files, which are cool, but tend to ruin automatic merges with git.

```
$ git checkout -b someFeatureFix
$ vim test/...
  # (...add tests...)
$ cake watch
  # (...this should recompile and changes you make in your CoffeeScript...)

-- figure out what spine module your changes belong in
$ vim src/spine.coffee
or
$ vim src/[otherSpineComponent].coffee
  # (...add the feature/fix...)
$ open test/index.html
  # (...make sure tests run for each component that was changed...)
  # (...test in other browsers with various jquery versions if you feel like there is risk... )
$ git commit -m "Add Some Feature Fix"
```

Then, [fork the Spine repository](https://github.com/spine/spine/fork), and push your branch to your fork:

```
$ git remote add <your user name> git@github.com:<your user name>/spine.git
$ git push <your user name> someFeatureFix
```

Finally, issue a pull request from inside the GitHub interface to the `dev` branch of spine, and your contribution is ready for consideration, discussion, and (hopefully) merging in!
# ![TodoMVC](media/logo.png)

> Helping you select an MV\* framework

### [Website](http://todomvc.com)&nbsp;&nbsp;&nbsp;&nbsp;[Blog](http://blog.tastejs.com)&nbsp;&nbsp;&nbsp;&nbsp;[TasteJS](http://tastejs.com)

[![Build Status](https://travis-ci.org/tastejs/todomvc.svg)](https://travis-ci.org/tastejs/todomvc)
[![Cypress.io tests](https://img.shields.io/badge/cypress.io-tests-green.svg?style=flat-square)](https://dashboard.cypress.io/#/projects/n4ynap/runs)

Developers these days are spoiled with choice when it comes to selecting an MV\* framework for structuring and organizing JavaScript web apps.

Backbone, Ember, AngularJS... the list of new and stable solutions goes on and on, but just how do you decide on which to use in a sea of so many options?

To help solve this problem, we created TodoMVC - a project which offers the same Todo application implemented using MV* concepts in most of the popular JavaScript MV\* frameworks of today.


## Team

TodoMVC would not be possible without a strong team of [contributors](https://github.com/tastejs/todomvc/contributors) helping push the project forward each day. Additionally, we have a core project team composed of:

#### [Addy Osmani](https://github.com/addyosmani) - Founder/Lead

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/96270e4c3e5e9806cf7245475c00b275.png?s=40">
  Addy is a Software Engineer at Google who originally created TodoMVC. He oversees the project direction, maintenance and organizes the planning and development efforts of the team.

#### [Sindre Sorhus](https://github.com/sindresorhus) - Lead Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9.png?s=40">
Sindre is a Web Developer who leads core development, quality control and application design for the project. His engineering contributions have helped us ensure consistency and best practices are enforced wherever possible. Sindre also leads up development of the TodoMVC application spec.

#### [Pascal Hartig](https://github.com/passy) - Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/be451fcdbf0e5ff07f23ed16cb5c90a3.png?s=40">
Pascal is a Software Engineer at Twitter with a deep passion for consistency. He watches pull requests and helps developers getting their contributions integrated with TodoMVC.

#### [Stephen Sawchuk](https://github.com/stephenplusplus) - Developer

<img align="left" width="40" height="40" src="https://avatars3.githubusercontent.com/u/723048?v=2&s=40">
Stephen is a Front-end Engineer at Quicken Loans that cares about improving the maintainability and developer experience of open-source projects. His recent contributions include helping us move all apps over to using Bower and implementing the new information bar.

#### [Colin Eberhardt](https://github.com/colineberhardt) - Developer

<img align="left" width="40" height="40" src="https://secure.gravatar.com/avatar/73bba00b41ff1c9ecc3ee29487bace7d?s=40">
Colin is a software consultant at Scott Logic who is passionate about all software - from JavaScript to Java, and C# to Objective-C. His recent contribution to the project has been a fully automated test suite.

#### [Sam Saccone](https://github.com/samccone) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/userimage/602125/f2f1d93164ec62b527f0398c65b2d1f3.jpg?size=40">
Sam is a Software Engineer at Google who is driven by an endless desire to create, solve problems, and improve developers' lives.

#### [Arthur Verschaeve](https://github.com/arthurvr) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/avatar/e34daab0d2e344219adb5234198269c5?size=40">
Arthur is an open-source fanboy from Belgium. He is passionate about developer tooling and all things JavaScript.

#### [Fady Samir Sadek](https://github.com/FadySamirSadek) - Developer

<img align="left" width="40" height="40" src="https://avatars2.githubusercontent.com/u/7483806?s=40&u=99b3958687789735c12cf736332361a06b951355&v=4">
Fady is a front-end developer who loves all things JavaScript and enjoys solving real world problems using the web platform and helping other developers do the same. He currently leads maintenance of the project and ensures that the project is friendly for new contributors and upcoming developers.

#### [Gianni Chiappetta](https://github.com/gf3) - Logo designer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/4b0209ae3652cc5a7d53545e759fbe39.png?s=40">
Gianni is a programmer and designer currently working as the Chief Rigger at MetaLab.

## Disclaimer

<img align="right" width="230" height="230" src="media/icon-small.png">

TodoMVC has been called many things including the 'Speed-dating' and 'Rosetta Stone' of MV\* frameworks. Whilst we hope that this project can offer assistance in deciding what frameworks are worth spending more time looking at, remember that the Todo application offers a limited view of a framework's potential capability.

It is meant to be used as a gateway to reviewing how a basic application using a framework may be structured, and we heavily recommend investing time researching a solution in more depth before opting to use it.

Also, please keep in mind that TodoMVC is not the perfect way to compare the size of different frameworks. We intentionally use the unminified versions to make reading the source code easier.


## Getting Involved

Whilst we enjoy implementing and improving existing Todo apps, we're always interested in speaking to framework authors (and users) wishing to share Todo app implementations in their framework/solution of choice.

Check out our [contribution docs](contributing.md) for more info.


## License

Everything in this repo is MIT License unless otherwise specified.

[MIT](license.md) © Addy Osmani, Sindre Sorhus, Pascal Hartig, Stephen Sawchuk.
<p align="center"><a href="https://vuejs.org" target="_blank"><img width="100"src="https://vuejs.org/images/logo.png"></a></p>

<p align="center">
  <a href="https://circleci.com/gh/vuejs/vue/tree/dev"><img src="https://img.shields.io/circleci/project/vuejs/vue/dev.svg" alt="Build Status"></a>
  <a href="https://codecov.io/github/vuejs/vue?branch=dev"><img src="https://img.shields.io/codecov/c/github/vuejs/vue/dev.svg" alt="Coverage Status"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/dm/vue.svg" alt="Downloads"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/v/vue.svg" alt="Version"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/l/vue.svg" alt="License"></a>
  <a href="https://chat.vuejs.org/"><img src="https://img.shields.io/badge/chat-on%20discord-7289da.svg" alt="Chat">
  <br>
  <a href="https://saucelabs.com/u/vuejs"><img src="https://saucelabs.com/browser-matrix/vuejs.svg" alt="Sauce Test Status"></a>
</p>

<h2 align="center">Supporting Vue.js</h2>

Vue.js is an MIT-licensed open source project. It's an independent project with its ongoing development made possible entirely thanks to the support by these awesome [backers](https://github.com/vuejs/vue/blob/dev/BACKERS.md). If you'd like to join them, please consider:

- [Become a backer or sponsor on Patreon](https://www.patreon.com/evanyou).
- [Become a backer or sponsor on OpenCollective](https://opencollective.com/vuejs).

#### What's the difference between Patreon and OpenCollective?

Funds donated via Patreon goes directly to support Evan You's full-time work on Vue.js. Funds donated via OpenCollective are managed with transparent expenses and will be used for compensating work and expenses by core team members or sponsoring community events. Your name/logo will receive proper recognition and exposure by donating on either platform.

<h3 align="center">Sponsors via Patreon</h3>

<h4 align="center">Platinum</h4>

<p align="center">
  <a href="https://stdlib.com">
    <img width="240px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/stdlib.png">
  </a>
  <br><br>
  <a href="https://xiaozhuanlan.com">
    <img width="160px" src="https://raw.githubusercontent.com/vuejs/cn.vuejs.org/master/themes/vue/source/images/xiaozhuanlan.png">
  </a>
</p>

<h4 align="center">Gold</h4>

<table>
  <tbody>
    <tr>
      <td align="center" valign="middle">
        <a href="https://deepstreamhub.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/deepstream.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://jsfiddle.net/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/jsfiddle.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://laravel.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/laravel.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://chaitin.cn/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/chaitin.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://htmlburger.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/htmlburger.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://starter.someline.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/someline.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="http://monterail.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/monterail.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.2mhost.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/2mhost.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://vuejsjob.com/?ref=vuejs" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/vuejobs.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://leanpub.com/vuejs2" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tmvuejs2.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://component.io/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/component_io.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.v2ex.com/t/379389" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/v2exer.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="https://www.xfive.co/" target="_blank">
          <img width="80px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/xfive.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://www.frontenddevelopermeetups.com/" target="_blank">
          <img width="160px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/frontend-meetups.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://onsen.io/vue/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/onsen-ui.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://tooltwist.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tooltwist.png">
        </a>
      </td>
    </tr>
  </tbody>
</table>

<h3 align="center">Sponsors via OpenCollective</h3>

<h4 align="center">Platinum</h4>

<a href="https://opencollective.com/vuejs/platinumsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/platinumsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/1/avatar.svg"></a>

<h4 align="center">Gold</h4>

<a href="https://opencollective.com/vuejs/goldsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/bronzesponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/bronzesponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/2/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/2/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/3/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/3/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/4/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/4
  /avatar.svg"></a>

---

## Introduction

Vue (pronounced `/vjuː/`, like view) is a **progressive framework** for building user interfaces. It is designed from the ground up to be incrementally adoptable, and can easily scale between a library and a framework depending on different use cases. It consists of an approachable core library that focuses on the view layer only, and an ecosystem of supporting libraries that helps you tackle complexity in large Single-Page Applications.

#### Browser Compatibility

Vue.js supports all browsers that are [ES5-compliant](http://kangax.github.io/compat-table/es5/) (IE8 and below are not supported).

## Ecosystem

| Project | Status | Description |
|---------|--------|-------------|
| [vue-router]          | [![vue-router-status]][vue-router-package] | Single-page application routing |
| [vuex]                | [![vuex-status]][vuex-package] | Large-scale state management |
| [vue-cli]             | [![vue-cli-status]][vue-cli-package] | Project scaffolding |
| [vue-loader]          | [![vue-loader-status]][vue-loader-package] | Single File Component (`*.vue` file) loader for webpack |
| [vue-server-renderer] | [![vue-server-renderer-status]][vue-server-renderer-package] | Server-side rendering support |
| [vue-class-component] | [![vue-class-component-status]][vue-class-component-package] | TypeScript decorator for a class-based API |
| [vue-rx]              | [![vue-rx-status]][vue-rx-package] | RxJS integration |
| [vue-devtools]        | [![vue-devtools-status]][vue-devtools-package] | Browser DevTools extension |

[vue-router]: https://github.com/vuejs/vue-router
[vuex]: https://github.com/vuejs/vuex
[vue-cli]: https://github.com/vuejs/vue-cli
[vue-loader]: https://github.com/vuejs/vue-loader
[vue-server-renderer]: https://github.com/vuejs/vue/tree/dev/packages/vue-server-renderer
[vue-class-component]: https://github.com/vuejs/vue-class-component
[vue-rx]: https://github.com/vuejs/vue-rx
[vue-devtools]:  https://github.com/vuejs/vue-devtools

[vue-router-status]: https://img.shields.io/npm/v/vue-router.svg
[vuex-status]: https://img.shields.io/npm/v/vuex.svg
[vue-cli-status]: https://img.shields.io/npm/v/vue-cli.svg
[vue-loader-status]: https://img.shields.io/npm/v/vue-loader.svg
[vue-server-renderer-status]: https://img.shields.io/npm/v/vue-server-renderer.svg
[vue-class-component-status]: https://img.shields.io/npm/v/vue-class-component.svg
[vue-rx-status]: https://img.shields.io/npm/v/vue-rx.svg
[vue-devtools-status]: https://img.shields.io/chrome-web-store/v/nhdogjmejiglipccpnnnanhbledajbpd.svg

[vue-router-package]: https://npmjs.com/package/vue-router
[vuex-package]: https://npmjs.com/package/vuex
[vue-cli-package]: https://npmjs.com/package/vue-cli
[vue-loader-package]: https://npmjs.com/package/vue-loader
[vue-server-renderer-package]: https://npmjs.com/package/vue-server-renderer
[vue-class-component-package]: https://npmjs.com/package/vue-class-component
[vue-rx-package]: https://npmjs.com/package/vue-rx
[vue-devtools-package]: https://chrome.google.com/webstore/detail/vuejs-devtools/nhdogjmejiglipccpnnnanhbledajbpd

## Documentation

To check out live examples and docs, visit [vuejs.org](https://vuejs.org).

## Questions

For questions and support please use the [the official forum](http://forum.vuejs.org) or [community chat](https://chat.vuejs.org/). The issue list of this repo is **exclusively** for bug reports and feature requests.

## Issues

Please make sure to read the [Issue Reporting Checklist](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md#issue-reporting-guidelines) before opening an issue. Issues not conforming to the guidelines may be closed immediately.

## Changelog

Detailed changes for each release are documented in the [release notes](https://github.com/vuejs/vue/releases).

## Stay In Touch

- [Twitter](https://twitter.com/vuejs)
- [Blog](https://medium.com/the-vue-point)
- [Job Board](https://vuejobs.com/?ref=vuejs)

## Contribution

Please make sure to read the [Contributing Guide](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md) before making a pull request. If you have a Vue-related project/component/tool, add it with a pull-request to [this curated list](https://github.com/vuejs/awesome-vue)!

Thank you to all the people who already contributed to Vue!

<a href="https://github.com/vuejs/vue/graphs/contributors"><img src="https://opencollective.com/vuejs/contributors.svg?width=890" /></a>


## License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2013-present, Yuxi (Evan) You
[![Build Status](https://travis-ci.org/angular/angular.svg?branch=master)](https://travis-ci.org/angular/angular)
[![CircleCI](https://circleci.com/gh/angular/angular/tree/master.svg?style=shield)](https://circleci.com/gh/angular/angular/tree/master)
[![BrowserStack Status](https://www.browserstack.com/automate/badge.svg?badge_key=LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)](https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06)
[![Join the chat at https://gitter.im/angular/angular](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/angular/angular?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![npm version](https://badge.fury.io/js/%40angular%2Fcore.svg)](https://www.npmjs.com/@angular/core)


# Angular

Angular is a development platform for building mobile and desktop web applications using Typescript/JavaScript and other languages.

## Quickstart

[Get started in 5 minutes][quickstart].


## Changelog

[Learn about the latest improvements][changelog]. 


## Want to help?

Want to file a bug, contribute some code, or improve documentation? Excellent! Read up on our
guidelines for [contributing][contributing] and then check out one of our issues in the [hotlist: community-help](https://github.com/angular/angular/labels/hotlist%3A%20community-help).

[browserstack]: https://www.browserstack.com/automate/public-build/LzF3RzBVVGt6VWE2S0hHaC9uYllOZz09LS1BVjNTclBKV0x4eVRlcjA4QVY1M0N3PT0=--eb4ce8c8dc2c1c5b2b5352d473ee12a73ac20e06
[contributing]: https://github.com/angular/angular/blob/master/CONTRIBUTING.md
[quickstart]: https://angular.io/guide/quickstart
[changelog]: https://github.com/angular/angular/blob/master/CHANGELOG.md
[ng]: https://angular.io
# aurelia-framework

[![npm Version](https://img.shields.io/npm/v/aurelia-framework.svg)](https://www.npmjs.com/package/aurelia-framework)
[![ZenHub](https://raw.githubusercontent.com/ZenHubIO/support/master/zenhub-badge.png)](https://zenhub.io)
[![Join the chat at https://gitter.im/aurelia/discuss](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/aurelia/discuss?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![CircleCI](https://circleci.com/gh/aurelia/framework.svg?style=shield)](https://circleci.com/gh/aurelia/framework)

This library is part of the [Aurelia](http://www.aurelia.io/) platform and contains the aurelia framework which brings together all the required core aurelia libraries into a ready-to-go application-building platform.

> To keep up to date on [Aurelia](http://www.aurelia.io/), please visit and subscribe to [the official blog](http://blog.aurelia.io/) and [our email list](http://eepurl.com/ces50j). We also invite you to [follow us on twitter](https://twitter.com/aureliaeffect). If you have questions look around our [Discourse forums](https://discourse.aurelia.io/), chat in our [community on Gitter](https://gitter.im/aurelia/discuss) or use [stack overflow](http://stackoverflow.com/search?q=aurelia). Documentation can be found [in our developer hub](http://aurelia.io/docs). If you would like to have deeper insight into our development process, please install the [ZenHub](https://zenhub.io) Chrome or Firefox Extension and visit any of our repository's boards.

## Documentation

You can read the documentation for the aurelia framework [here](http://aurelia.io/docs). If you would like to help improve this documentation, the source for many of the docs can be found in the doc folder within this repository. Other docs, not related to the general framework, but directed at specific libraries, can be found in the doc folder of those libraries.

## Platform Support

This library can be used in the **browser** only.

## Building The Code

To build the code, follow these steps.

1. Ensure that [NodeJS](http://nodejs.org/) is installed. This provides the platform on which the build tooling runs.
2. From the project folder, execute the following command:

  ```shell
  npm install
  ```
3. Ensure that [Gulp](http://gulpjs.com/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g gulp
  ```
4. To build the code, you can now run:

  ```shell
  gulp build
  ```
5. You will find the compiled code in the `dist` folder, available in three module formats: AMD, CommonJS and ES6.

6. See `gulpfile.js` for other tasks related to generating the docs and linting.

## Running The Tests

To run the unit tests, first ensure that you have followed the steps above in order to install all dependencies and successfully build the library. Once you have done that, proceed with these additional steps:

1. Ensure that the [Karma](http://karma-runner.github.io/) CLI is installed. If you need to install it, use the following command:

  ```shell
  npm install -g karma-cli
  ```
2. Ensure that [jspm](http://jspm.io/) is installed. If you need to install it, use the following command:

  ```shell
  npm install -g jspm
  ```
3. Install the client-side dependencies with jspm:

  ```shell
  jspm install
  ```

4. You can now run the tests with this command:

  ```shell
  karma start
  ```
dojo
====

This is the foundation package for the Dojo 1 Toolkit.  While still being maintained, new development is primarily focused on modern Dojo.

Checkout the [Dojo framework website](https://dojo.io/) or if you want a more detailed technical status and overview, checkout the [`Dojo roadmap`](https://dojo.io/community/).

This package is sometimes
referred to as the “core”, it contains the most generally applicable sub-packages
and modules. The dojo package covers a wide range of functionality like Ajax, DOM
manipulation, class-type programming, events, promises, data stores,
drag-and-drop and internationalization libraries.

Installing
----------

Installation instructions are available at
[dojotoolkit.org/download](<http://dojotoolkit.org/download/>).

Getting Started
---------------

If you are starting out with Dojo, the following resources are available to you:

-   [Tutorials](<http://dojotoolkit.org/documentation/>)

-   [Reference Guide](<http://dojotoolkit.org/reference-guide/>)

-   [API Documentation](<http://dojotoolkit.org/api/>)

-   [Community Forum](<http://dojotoolkit.org/community/>)

What to Use Dojo For and When to Use It
---------------------------------------

The following is a brief sampling of some of the areas where Dojo may prove to
be the right tool for your next project:

-   For keeping your code fast and maintainable, Dojo offers an asynchronous
    module definition (AMD) loader -- encapsulating pieces of code into useful
    units, loading small JavaScript files only when they are needed, and loading
    files separately even when they are dependent on one another.

-   When you want to easily extend existing classes, share functionality among a
    number of classes, and maximize code reuse, Dojo provides class-like
    inheritance and “mixins.”

-   For creating advanced and customizable user interfaces out of refined,
    efficient, and modular pieces, Dojo’s Dijit framework offers several dozen
    enterprise-ready widgets -- including buttons, textboxes, form widgets with
    built-in validation, layout elements, and much more -- along with themes to
    lend them a consistent look. All of this is available for mobile
    environments as well.

-   For working with advanced vector graphics, Dojo’s GFX API can render
    graphics in a wide variety of formats, with support for seamless
    manipulation (skewing, rotating, resizing), gradients, responding to mouse
    events, and more.

-   The `dojox/charting` library supports powerful data visualization and
    dynamic charting, including a variety of 2D plots and animated charting
    elements.

-   When you need feature-rich, lightweight, and mobile-friendly grids/tables,
    Dojo offers the `dgrid` widget, along with customizable default themes and
    accompanying features such as in-cell editing, row/cell selection, column
    resizing/reordering, keyboard handling, pagination, and more.

-   Dojo is the officially supported framework for the ArcGIS API for
    JavaScript, one of the most widely used enterprise-grade APIs for web
    mapping and spatial analysis -- learning to use Dojo will open doors to
    creating richer web mapping applications using that API.

License and Copyright
---------------------

The Dojo Toolkit (including this package) is dual licensed under BSD 3-Clause
and AFL. For more information on the license please see the [License
Information](<http://dojotoolkit.org/license>). The Dojo Toolkit is Copyright
(c) 2005-2018, JS Foundation. All rights reserved.
<p align="center">
  <a href="https://emberjs.com"><img width="300" src="https://raw.githubusercontent.com/emberjs/website/master/source/images/brand/ember_Ember-Light.png"></a>
</p>

<p align="center">
  <a href="http://travis-ci.org/emberjs/ember.js"><img src="https://secure.travis-ci.org/emberjs/ember.js.svg?branch=master" alt="Build Status"></a>
  <a href="https://codeclimate.com/github/emberjs/ember.js"><img src="https://codeclimate.com/github/emberjs/ember.js.svg" alt="Code Climate"></a>
  <a href="https://discord.gg/zT3asNS"><img src="https://img.shields.io/discord/480462759797063690.svg?logo=discord" alt="Discord Community Server"></a>
</p>

Ember.js is a JavaScript framework that greatly reduces the time, effort and resources needed
to build any web application. It is focused on making you, the developer, as productive as possible by doing all the common, repetitive, yet essential, tasks involved in most web development projects.

Ember.js also provides access to the most advanced features of JavaScript, HTML and the Browser giving you everything you need to create your next killer web app.

- [Website](https://emberjs.com)
- [Guides](https://guides.emberjs.com)
- [API](https://emberjs.com/api)
- [Community](https://emberjs.com/community)
- [Blog](https://emberjs.com/blog)
- [Builds](https://emberjs.com/builds)

# Contribution

See [CONTRIBUTING.md](https://github.com/emberjs/ember.js/blob/master/CONTRIBUTING.md)

---

Cross-browser testing provided by:

<a href="http://browserstack.com"><img height="70" src="https://p3.zdusercontent.com/attachment/1015988/PWfFdN71Aung2evRkIVQuKJpE?token=eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2In0..aUrNFb8clSXsFwgw5BUTcg.IJr5piuCen7PmSSBHSrOnqM9K5YZfxX3lvbp-5LCqoKOi4CjjgdA419iqjofs0nLtm26FMURvZ8JRTuKB4iHer6lGu5f8dXHtIkYAHjP5fXDWkl044Yg2mSdrhF6uPy62GdlBYoYxwvgkNrac8nN_In8GY-qOC7bYmlZyJT7tsTZUTYbNMQiXS86YA5LgdCEWzWreMvc3C6cvZtVXIrcVgpkroIhvsTQPm4vQA-Uq6iCbTPA4oX5cpEtMtrlg4jYBnnAE4BTw5UwU_dY83ep5g.7wpc1IKv0rSRGsvqCG_q3g" alt="BrowserStack"></a>
# [React](https://reactjs.org/) &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/facebook/react/blob/master/LICENSE) [![npm version](https://img.shields.io/npm/v/react.svg?style=flat)](https://www.npmjs.com/package/react) [![Coverage Status](https://img.shields.io/coveralls/facebook/react/master.svg?style=flat)](https://coveralls.io/github/facebook/react?branch=master) [![CircleCI Status](https://circleci.com/gh/facebook/react.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/facebook/react) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://reactjs.org/docs/how-to-contribute.html#your-first-pull-request)

React is a JavaScript library for building user interfaces.

* **Declarative:** React makes it painless to create interactive UIs. Design simple views for each state in your application, and React will efficiently update and render just the right components when your data changes. Declarative views make your code more predictable, simpler to understand, and easier to debug.
* **Component-Based:** Build encapsulated components that manage their own state, then compose them to make complex UIs. Since component logic is written in JavaScript instead of templates, you can easily pass rich data through your app and keep state out of the DOM.
* **Learn Once, Write Anywhere:** We don't make assumptions about the rest of your technology stack, so you can develop new features in React without rewriting existing code. React can also render on the server using Node and power mobile apps using [React Native](https://facebook.github.io/react-native/).

[Learn how to use React in your own project](https://reactjs.org/docs/getting-started.html).

## Installation

React has been designed for gradual adoption from the start, and **you can use as little or as much React as you need**:

* Use [Online Playgrounds](https://reactjs.org/docs/getting-started.html#online-playgrounds) to get a taste of React.
* [Add React to a Website](https://reactjs.org/docs/add-react-to-a-website.html) as a `<script>` tag in one minute.
* [Create a New React App](https://reactjs.org/docs/create-a-new-react-app.html) if you're looking for a powerful JavaScript toolchain.

You can use React as a `<script>` tag from a [CDN](https://reactjs.org/docs/cdn-links.html), or as a `react` package on [npm](https://www.npmjs.com/).

## Documentation

You can find the React documentation [on the website](https://reactjs.org/docs).  

Check out the [Getting Started](https://reactjs.org/docs/getting-started.html) page for a quick overview.

The documentation is divided into several sections:

* [Tutorial](https://reactjs.org/tutorial/tutorial.html)
* [Main Concepts](https://reactjs.org/docs/hello-world.html)
* [Advanced Guides](https://reactjs.org/docs/jsx-in-depth.html)
* [API Reference](https://reactjs.org/docs/react-api.html)
* [Where to Get Support](https://reactjs.org/community/support.html)
* [Contributing Guide](https://reactjs.org/docs/how-to-contribute.html)

You can improve it by sending pull requests to [this repository](https://github.com/reactjs/reactjs.org).

## Examples

We have several examples [on the website](https://reactjs.org/). Here is the first one to get you started:

```jsx
class HelloMessage extends React.Component {
  render() {
    return <div>Hello {this.props.name}</div>;
  }
}

ReactDOM.render(
  <HelloMessage name="Taylor" />,
  document.getElementById('container')
);
```

This example will render "Hello Taylor" into a container on the page.

You'll notice that we used an HTML-like syntax; [we call it JSX](https://reactjs.org/docs/introducing-jsx.html). JSX is not required to use React, but it makes code more readable, and writing it feels like writing HTML. If you're using React as a `<script>` tag, read [this section](https://reactjs.org/docs/add-react-to-a-website.html#optional-try-react-with-jsx) on integrating JSX; otherwise, the [recommended JavaScript toolchains](https://reactjs.org/docs/create-a-new-react-app.html) handle it automatically.

## Contributing

The main purpose of this repository is to continue to evolve React core, making it faster and easier to use. Development of React happens in the open on GitHub, and we are grateful to the community for contributing bugfixes and improvements. Read below to learn how you can take part in improving React.

### [Code of Conduct](https://code.facebook.com/codeofconduct)

Facebook has adopted a Code of Conduct that we expect project participants to adhere to. Please read [the full text](https://code.facebook.com/codeofconduct) so that you can understand what actions will and will not be tolerated.

### [Contributing Guide](https://reactjs.org/contributing/how-to-contribute.html)

Read our [contributing guide](https://reactjs.org/contributing/how-to-contribute.html) to learn about our development process, how to propose bugfixes and improvements, and how to build and test your changes to React.

### Good First Issues

To help you get your feet wet and get you familiar with our contribution process, we have a list of [good first issues](https://github.com/facebook/react/labels/good%20first%20issue) that contain bugs which have a relatively limited scope. This is a great place to get started.

### License

React is [MIT licensed](./LICENSE).
     ____                     __      __
    /\  _`\                  /\ \    /\ \                                   __
    \ \ \ \ \     __      ___\ \ \/'\\ \ \____    ___     ___      __      /\_\    ____
     \ \  _ <'  /'__`\   /'___\ \ , < \ \ '__`\  / __`\ /' _ `\  /'__`\    \/\ \  /',__\
      \ \ \ \ \/\ \ \.\_/\ \__/\ \ \\`\\ \ \ \ \/\ \ \ \/\ \/\ \/\  __/  __ \ \ \/\__, `\
       \ \____/\ \__/.\_\ \____\\ \_\ \_\ \_,__/\ \____/\ \_\ \_\ \____\/\_\_\ \ \/\____/
        \/___/  \/__/\/_/\/____/ \/_/\/_/\/___/  \/___/  \/_/\/_/\/____/\/_/\ \_\ \/___/
                                                                           \ \____/
                                                                            \/___/
    (_'_______________________________________________________________________________'_)
    (_.———————————————————————————————————————————————————————————————————————————————._)


Backbone supplies structure to JavaScript-heavy applications by providing models with key-value binding and custom events, collections with a rich API of enumerable functions, views with declarative event handling, and connects it all to your existing application over a RESTful JSON interface.

For Docs, License, Tests, pre-packed downloads, and everything else, really, see:
http://backbonejs.org

To suggest a feature or report a bug:
https://github.com/jashkenas/backbone/issues

For questions on working with Backbone or general discussions:
https://groups.google.com/forum/#!forum/backbonejs,
http://stackoverflow.com/questions/tagged/backbone.js, or
https://gitter.im/jashkenas/backbone

Backbone is an open-sourced component of DocumentCloud:
https://github.com/documentcloud

Many thanks to our contributors:
https://github.com/jashkenas/backbone/graphs/contributors

Special thanks to Robert Kieffer for the original philosophy behind Backbone.
https://github.com/broofa
# Hyperapp

[![Travis CI](https://img.shields.io/travis/jorgebucaran/hyperapp/master.svg)](https://travis-ci.org/jorgebucaran/hyperapp)
[![Codecov](https://img.shields.io/codecov/c/github/jorgebucaran/hyperapp/master.svg)](https://codecov.io/gh/jorgebucaran/hyperapp)
[![npm](https://img.shields.io/npm/v/hyperapp.svg)](https://www.npmjs.org/package/hyperapp)
[![Slack](https://hyperappjs.herokuapp.com/badge.svg)](https://hyperappjs.herokuapp.com "Join us")

Hyperapp is a JavaScript micro-framework for building web applications.

> :wave: [**Hyperapp 2.0**](https://github.com/jorgebucaran/hyperapp/pull/726) is coming out soon! Try it from the [V2](https://github.com/jorgebucaran/hyperapp/tree/V2) branch right now and be sure to follow [@HyperappJS](https://twitter.com/hyperappjs) for all the Hyperapp news & updates.

- **Minimal** — We have aggressively minimized the concepts you need to understand to be productive while remaining on par with what other frameworks can do.
- **Pragmatic** — Hyperapp holds firm on the functional programming front when managing your state, but takes a pragmatic approach to allow for side effects, asynchronous actions, and DOM manipulations.
- **Standalone** — Do more with less. Hyperapp combines state management with a virtual DOM engine that supports keyed updates & lifecycle events — all with no dependencies.

## Getting Started

Our first example is a counter that can be incremented or decremented. Go ahead and [try it online](https://codepen.io/hyperapp/pen/zNxZLP/left/?editors=0010).

```jsx
import { h, app } from "hyperapp"

const state = {
  count: 0
}

const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}

const view = (state, actions) => (
  <div>
    <h1>{state.count}</h1>
    <button onclick={() => actions.down(1)}>-</button>
    <button onclick={() => actions.up(1)}>+</button>
  </div>
)

app(state, actions, view, document.body)
```

Hyperapp consists of a two-function API. <samp>hyperapp.h</samp> returns a new [virtual DOM](#view) node tree and <samp>hyperapp.app</samp> [mounts](#mounting) a new application in the specified DOM element. Without an element, it's possible to use Hyperapp "headless", which can be useful when unit testing your program.

This example assumes you are using a JavaScript compiler like [Babel](https://babeljs.io) or [TypeScript](https://www.typescriptlang.org) and a module bundler like [Parcel](https://parceljs.org), [Webpack](https://webpack.js.org), etc. If you are using JSX, all you need to do is install the JSX [transform plugin](https://babeljs.io/docs/en/babel-plugin-transform-react-jsx) and add the pragma option to your <samp>.babelrc</samp> file.

```json
{
  "plugins": [["@babel/plugin-transform-react-jsx", { "pragma": "h" }]]
}
```

JSX is a language syntax extension that lets you write HTML tags interspersed with JavaScript. Because browsers don't understand JSX, we use a compiler to transform it into <samp>hyperapp.h</samp> function calls under the hood.

```jsx
const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

Note that JSX is not required for building applications with Hyperapp. You can use <samp>hyperapp.h</samp> directly and without a compilation step as shown above. Other alternatives to JSX include [@hyperapp/html](https://github.com/hyperapp/html), [hyperx](https://github.com/substack/hyperx), [t7](https://github.com/trueadm/t7) and [ijk](https://github.com/lukejacksonn/ijk).

## Installation

Install with npm or Yarn.

<pre>
npm i <a href=https://www.npmjs.com/package/hyperapp>hyperapp</a>
</pre>

Then with a module bundler like [Rollup](https://rollupjs.org) or [Webpack](https://webpack.js.org), use as you would anything else.

```js
import { h, app } from "hyperapp"
```

If you don't want to set up a build environment, you can download Hyperapp from a CDN like [unpkg.com](https://unpkg.com/hyperapp) and it will be globally available through the <samp>window.hyperapp</samp> object. We support all ES5-compliant browsers, including Internet Explorer 10 and above.

```html
<script src="https://unpkg.com/hyperapp"></script>
```

## Overview

Hyperapp applications consist of three interconnected parts: the [state](#state), [view](#view), and [actions](#actions).

Once initialized, your application executes in a continuous loop, taking in actions from users or from external events, updating the state, and representing changes in the view through a virtual DOM model. Think of an action as a signal that notifies Hyperapp to update the state and schedule the next view to redraw. After processing an action, the new state is presented back to the user.

### State

The state is a plain JavaScript object that describes your entire program. It consists of all the dynamic data that is moved around in the application during its execution. The state cannot be mutated once it is created. We must use actions to update it.

```js
const state = {
  count: 0
}
```

Like any JavaScript object, the state can be a nested tree of objects. We refer to nested objects in the state as partial state. A single state tree does not conflict with modularity — see [Nested Actions](#nested-actions) to find out how to update deeply nested objects and split your state and actions.

```js
const state = {
  top: {
    count: 0
  },
  bottom: {
    count: 0
  }
}
```

Because Hyperapp performs a shallow merge when updating your state, the top-level state must be a plain JavaScript object, other than this, you can use any type, including arrays, ES6 [Maps](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map), [Sets](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set), [Immutable.js](https://facebook.github.io/immutable-js/) structures, etc.

#### Local State

Hyperapp does not have the concept of local state. Instead, components are pure functions that return a virtual DOM representation of the global state.

### Actions

The only way to change the state is via actions. An action is a unary function (accepts a single argument) expecting a payload. The payload can be anything you want to pass into the action.

To update the state, an action must return a partial state object. The new state will be the result of a shallow merge between this object and the current state. Under the hood, Hyperapp wires every function in your actions to automatically redraw the view on state changes.

```js
const actions = {
  setValue: value => ({ value })
}
```

Instead of returning a partial state object directly, an action can return a function that takes the current state and actions as arguments and returns a partial state object.

```js
const actions = {
  down: value => state => ({ count: state.count - value }),
  up: value => state => ({ count: state.count + value })
}
```

State updates are always immutable. Do not mutate the state object argument within an action and return it — the results are not what you expect (e.g., the view will not be redrawn).

Immutability enables time-travel debugging, helps prevent introducing hard-to-track-down bugs by making state changes more predictable, and allows cheap memoization of components using shallow equality <samp>===</samp> checks.

#### Asynchronous Actions

Actions used for side effects (writing to databases, sending a request to a server, etc.) don't need to have a return value. You may call an action from within another action or callback function. Actions which return a Promise, <samp>undefined</samp> or <samp>null</samp> will not trigger redraws or update the state.

```js
const actions = {
  upLater: value => (state, actions) => {
    setTimeout(actions.up, 1000, value)
  },
  up: value => state => ({ count: state.count + value })
}
```

An action can be an <samp>[async](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function)</samp> function. Because <samp>async</samp> functions return a Promise, and not a partial state object, you need to call another action in order to update the state.

```js
const actions = {
  upLater: () => async (state, actions) => {
    await new Promise(done => setTimeout(done, 1000))
    actions.up(10)
  },
  up: value => state => ({ count: state.count + value })
}
```

#### Nested Actions

Actions can be nested inside namespaces. Updating deeply nested state is as easy as declaring actions inside an object in the same path as the part of the state you want to update.

```jsx
const state = {
  counter: {
    count: 0
  }
}

const actions = {
  counter: {
    down: value => state => ({ count: state.count - value }),
    up: value => state => ({ count: state.count + value })
  }
}
```

#### Interoperability

The <samp>app</samp> function returns a copy of your actions where every function is wired to changes in the state. Exposing this object to the outside world can be useful to operate your application from another program or framework, subscribe to global events, listen to mouse and keyboard input, etc.

To see this in action, modify the example from [Getting Started](#getting-started) to save the wired actions to a variable and try using them. You should see the counter update accordingly.

```jsx
const main = app(state, actions, view, document.body)

setInterval(main.up, 250, 1)
setInterval(main.down, 500, 1)
```

Because state updates are always immutable, returning a reference to the current state will not schedule a view redraw.

```jsx
const actions = {
  getState: () => state => state
}
```

### View

Every time your application state changes, the view function is called so that you can specify how you want the DOM to look based on the new state. The view returns your specification in the form of a plain JavaScript object known as a virtual DOM and Hyperapp takes care of updating the actual DOM to match it.

```js
import { h } from "hyperapp"

export const view = (state, actions) =>
  h("div", {}, [
    h("h1", {}, state.count),
    h("button", { onclick: () => actions.down(1) }, "-"),
    h("button", { onclick: () => actions.up(1) }, "+")
  ])
```

A virtual DOM is a description of what a DOM should look like using a tree of nested JavaScript objects known as virtual nodes. Think of it as a lightweight representation of the DOM. In the example, the view function returns an object like this.

```jsx
{
  nodeName: "div",
  attributes: {},
  children: [
    {
      nodeName: "h1",
      attributes: {},
      children: [0]
    },
    {
      nodeName: "button",
      attributes: { ... },
      children: ["-"]
    },
    {
      nodeName:   "button",
      attributes: { ... },
      children: ["+"]
    }
  ]
}
```

The virtual DOM model allows us to write code as if the entire document is thrown away and rebuilt on each change, while we only update what actually changed. We try to do this in the least number of steps possible, by comparing the new virtual DOM against the previous one. This leads to high efficiency, since typically only a small percentage of nodes need to change, and changing real DOM nodes is costly compared to recalculating the virtual DOM.

It may seem wasteful to throw away the old virtual DOM and re-create it entirely on every update — not to mention the fact that at any one time, Hyperapp is keeping two virtual DOM trees in memory, but as it turns out, browsers can create hundreds of thousands of objects very quickly. On the other hand, modifying the DOM is several orders of magnitude more expensive.

### Mounting

To mount your application on a page, we need a DOM element. This element is referred to as the application container. Applications built with Hyperapp always have a single container.

```jsx
app(state, actions, view, container)
```

Hyperapp will also attempt to reuse existing elements inside the container enabling SEO optimization and improving your sites time-to-interactive. The process consists of serving a fully rendered page together with your application. Then instead of throwing away the existing content, we'll turn your DOM nodes into an interactive application out of the box.

This is how we can recycle server-rendered content out the counter example from before. See [Getting Started](#getting-started) for the application code.

```html
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <script defer src="bundle.js"></script>
</head>

<body>
  <div>
    <h1>0</h1>
    <button>-</button>
    <button>+</button>
  </div>
</body>
</html>
```

### Components

A component is a pure function that returns a virtual node. Unlike the view function, components are not wired to your application state or actions. Components are dumb, reusable blocks of code that encapsulate markup, styles, and behaviors that belong together.

Here's a taste of how to use components in your application. The application is a typical To-Do manager. Go ahead and [try it online here](https://codepen.io/hyperapp/pen/zNxRLy).

```jsx
import { h } from "hyperapp"

const TodoItem = ({ id, value, done, toggle }) => (
  <li
    class={done && "done"}
    onclick={() =>
      toggle({
        value: done,
        id: id
      })
    }
  >
    {value}
  </li>
)

export const view = (state, actions) => (
  <div>
    <h1>Todo</h1>
    <ul>
      {state.todos.map(({ id, value, done }) => (
        <TodoItem id={id} value={value} done={done} toggle={actions.toggle} />
      ))}
    </ul>
  </div>
)
```

If you don't know all the attributes that you want to place in a component ahead of time, you can use the [spread syntax](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_operator). Note that Hyperapp components can return an array of elements as in the following example. This technique lets you group a list of children without adding extra nodes to the DOM.

```jsx
const TodoList = ({ todos, toggle }) =>
  todos.map(todo => <TodoItem {...todo} toggle={toggle} />)
```

#### Lazy Components

Components can only receive attributes and children from their parent component. Similarly to the top-level view function, lazy components are passed your application global state and actions. To create a lazy component, return a view function from a regular component.

```jsx
import { h } from "hyperapp"

export const Up = ({ by }) => (state, actions) => (
  <button onclick={() => actions.up(by)}>+ {by}</button>
)

export const Down = ({ by }) => (state, actions) => (
  <button onclick={() => actions.down(by)}>- {by}</button>
)

export const Double = () => (state, actions) => (
  <button onclick={() => actions.up(state.count)}>+ {state.count}</button>
)

export const view = (state, actions) => (
  <main>
    <h1>{state.count}</h1>
    <Up by={2} />
    <Down by={1} />
    <Double />
  </main>
)
```

#### Handling Component State

Suppose you have a list of questions with answers that are collapsed initially. A flag `answerIsOpen` is used to determine if a question's answer is open.

Since there is no concept of local state in Hyperapp, the global state is always updated rather than an individual component's state.

To update a single question's state, the entire `questions` array will be mapped to a new array where the `answerIsOpen` property will be toggled if the question matches the one belonging to the component.

[View the example online](https://codepen.io/anon/pen/ZogRYP).

#### Children Composition

Components receive their children elements via the second argument, allowing you and other components to pass arbitrary children down to them.

```jsx
const Box = ({ color }, children) => (
  <div class={`box box-${color}`}>{children}</div>
)

const HelloBox = ({ name }) => (
  <Box color="green">
    <h1 class="title">Hello, {name}!</h1>
  </Box>
)
```

## Supported Attributes

Supported attributes include [HTML attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes), [SVG attributes](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute), [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events), [Lifecycle Events](#lifecycle-events), and [Keys](#keys). Note that non-standard HTML attribute names are not supported, <samp>onclick</samp> and <samp>class</samp> are valid, but <samp>onClick</samp> or <samp>className</samp> are not.

### Styles

The <samp>style</samp> attribute expects a plain object rather than a string as in HTML.
Each declaration consists of a style name property written in <samp>camelCase</samp> and a value. CSS variables are supported too.

Individual style properties will be diffed and mapped against <samp>[HTMLElement.style](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style)</samp> property members of the DOM element - you should therefore use the JavaScript style object [property names](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference), e.g. <samp>backgroundColor</samp> rather than <samp>background-color</samp>.

```jsx
import { h } from "hyperapp"

export const Jumbotron = ({ text }) => (
  <div
    style={{
      color: "white",
      fontSize: "32px",
      textAlign: center,
      backgroundImage: `url(${imgUrl})`
    }}
  >
    {text}
  </div>
)
```

### Lifecycle Events

You can be notified when elements managed by the virtual DOM are created, updated or removed via lifecycle events. Use them for animation, data fetching, wrapping third-party libraries, cleaning up resources, etc.

Note that lifecycle events are attached to virtual DOM nodes, not to components. Consider adding a key to ensure that the event is attached to a specific DOM element, rather than a recycled one.

#### oncreate

This event is fired after the element is created and attached to the DOM. Use it to manipulate the DOM node directly, make a network request, create a slide/fade in animation, etc.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    oncreate={element => element.focus()}
  />
)
```

#### onupdate

This event is fired every time we update the element attributes. Use <samp>oldAttributes</samp> inside the event handler to check if any attributes changed or not.

```jsx
import { h } from "hyperapp"

export const Textbox = ({ placeholder }) => (
  <input
    type="text"
    placeholder={placeholder}
    onupdate={(element, oldAttributes) => {
      if (oldAttributes.placeholder !== placeholder) {
        // Handle changes here!
      }
    }}
  />
)
```

#### onremove

This event is fired before the element is removed from the DOM. Use it to create slide/fade out animations. Call <samp>done</samp> inside the function to remove the element. This event is not called in its child elements.

```jsx
import { h } from "hyperapp"

export const MessageWithFadeout = ({ title }) => (
  <div onremove={(element, done) => fadeout(element).then(done)}>
    <h1>{title}</h1>
  </div>
)
```

#### ondestroy

This event is fired after the element has been removed from the DOM, either directly or as a result of a parent being removed. Use it for invalidating timers, canceling a network request, removing global events listeners, etc.

```jsx
import { h } from "hyperapp"

export const Camera = ({ onerror }) => (
  <video
    poster="loading.png"
    oncreate={element => {
      navigator.mediaDevices
        .getUserMedia({ video: true })
        .then(stream => (element.srcObject = stream))
        .catch(onerror)
    }}
    ondestroy={element => element.srcObject.getTracks()[0].stop()}
  />
)
```

### Keys

Keys help identify nodes every time we update the DOM. By setting the <samp>key</samp> property on a virtual node, you declare that the node should correspond to a particular DOM element. This allows us to re-order the element into its new position, if the position changed, rather than risk destroying it.

```jsx
import { h } from "hyperapp"

export const ImageGallery = ({ images }) =>
  images.map(({ hash, url, description }) => (
    <li key={hash}>
      <img src={url} alt={description} />
    </li>
  ))
```

Keys must be unique among sibling nodes. Don't use an array index as the key, if the index also specifies the order of siblings. If the position and number of items in a list are fixed, it will make no difference, but if the list is dynamic, the key will change every time the tree is rebuilt.

```jsx
import { h } from "hyperapp"

export const PlayerList = ({ players }) =>
  players
    .slice()
    .sort((player, nextPlayer) => nextPlayer.score - player.score)
    .map(player => (
      <li key={player.username} class={player.isAlive ? "alive" : "dead"}>
        <PlayerProfile {...player} />
      </li>
    ))
```

#### Top-Level Nodes

Keys are not registered on the top-level node of your view. If you are toggling the top-level view, and you must use keys, wrap them in an unchanging node.

## Links

- [Slack](https://hyperappjs.herokuapp.com)
- [Twitter](https://twitter.com/hyperappJS)
- [Examples](https://codepen.io/search/pens/?q=hyperapp)
- [/r/hyperapp](https://www.reddit.com/r/hyperapp)

## License

Hyperapp is MIT licensed. See [LICENSE](LICENSE.md).
# Knockout

**Knockout** is a JavaScript [MVVM](http://en.wikipedia.org/wiki/Model_View_ViewModel) (a modern variant of MVC) library that makes it easier to create rich, desktop-like user interfaces with JavaScript and HTML. It uses *observers* to make your UI automatically stay in sync with an underlying data model, along with a powerful and extensible set of *declarative bindings* to enable productive development.

## Getting started

[![Join the chat at https://gitter.im/knockout/knockout](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/knockout/knockout?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

**Totally new to Knockout?** The most fun place to start is the [online interactive tutorials](http://learn.knockoutjs.com/).

For more details, see

 * Documentation on [the project's website](http://knockoutjs.com/documentation/introduction.html)
 * Online examples at [http://knockoutjs.com/examples/](http://knockoutjs.com/examples/)

## Downloading Knockout

You can [download released versions of Knockout](http://knockoutjs.com/downloads/) from the project's website.

For Node.js developers, Knockout is also available from [npm](https://npmjs.org/) - just run `npm install knockout`.

## Building Knockout from sources

If you prefer to build the library yourself:

1. **Clone the repo from GitHub**

   ```sh
   git clone https://github.com/knockout/knockout.git
   cd knockout
   ```

2. **Acquire build dependencies.**

   Make sure you have [Node.js](http://nodejs.org/) installed on your workstation. This is only needed to _build_ Knockout from sources. Knockout itself has no dependency on Node.js once it is built (it works with any server technology or none). Now run:

   ```sh
   npm install -g grunt-cli
   npm install
   ```

   The first `npm` command sets up the popular [Grunt](http://gruntjs.com/) build tool. You might need to run this command with `sudo` if you're on Linux or Mac OS X, or in an Administrator command prompt on Windows. The second `npm` command fetches the remaining build dependencies.

3. **Run the build tool**

   ```sh
   grunt
   ```
   Now you'll find the built files in `build/output/`.

## Running the tests

If you have [phantomjs](http://phantomjs.org/download.html) installed, then the `grunt` script will automatically run the specification suite and report its results.

Or, if you want to run the specs in a browser (e.g., for debugging), simply open `spec/runner.html` in your browser.

## License

MIT license - [http://www.opensource.org/licenses/mit-license.php](http://www.opensource.org/licenses/mit-license.php)
<p align="center">
    <a href="http://markojs.com/"><img src="https://raw.githubusercontent.com/marko-js/branding/master/marko-logo-medium-cropped.png" alt="Marko logo" width="300" /></a><br /><br />
</p>

Marko is a friendly (and fast!) UI library that makes building web apps fun.
Learn more on [markojs.com](http://markojs.com/), and even [Try Marko Online!](http://markojs.com/try-online/)

[![Build Status](https://travis-ci.org/marko-js/marko.svg?branch=master)](https://travis-ci.org/marko-js/marko)
[![Coverage Status](https://codecov.io/gh/marko-js/marko/branch/master/graph/badge.svg)](https://codecov.io/gh/marko-js/marko)
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/marko-js/marko)
[![NPM](https://img.shields.io/npm/v/marko.svg)](https://www.npmjs.com/package/marko)
[![Downloads](https://img.shields.io/npm/dm/marko.svg)](http://npm-stat.com/charts.html?package=marko)

# Get Involved

- **Contributing**: Pull requests are welcome!
  - Read [`CONTRIBUTING.md`](.github/CONTRIBUTING.md) and check out our [bite-sized](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Adifficulty%3Abite-sized) and [help-wanted](https://github.com/marko-js/marko/issues?q=is%3Aissue+is%3Aopen+label%3Astatus%3Ahelp-wanted) issues
  - Submit github issues for any feature enhancements, bugs or documentation problems
- **Support**: Join our [gitter chat](https://gitter.im/marko-js/marko) to ask questions to get support from the maintainers and other Marko developers
  - Questions/comments can also be posted as [github issues](https://github.com/marko-js/marko/issues)
- **Discuss**: Tweet using the `#MarkoJS` hashtag and follow [@MarkoDevTeam](https://twitter.com/MarkoDevTeam)

# Installation

```bash
npm install marko --save
```

# Examples

Marko provides an elegant and readable syntax for both single-file components
and components broken into separate files. There are plenty of examples to play
with on [Marko's Try-Online](http://markojs.com/try-online/). Additional
[component documentation](http://markojs.com/docs/components/) can be found on
the Marko.js website.

## Single file

The following single-file component renders a button and a counter with the
number of times the button has been clicked. [Try this example now!](http://markojs.com/try-online/?file=%2Fcomponents%2Fcomponents%2Fclick-count%2Findex.marko)

**click-count.marko**

```marko
class {
    onCreate() {
        this.state = { count:0 };
    }
    increment() {
        this.state.count++;
    }
}

style {
    .count {
        color:#09c;
        font-size:3em;
    }
    .example-button {
        font-size:1em;
        padding:0.5em;
    }
}

<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

## Multi-file

The same component as above split into an `index.marko` template file,
`component.js` containing your component logic, and `style.css` containing your
component style:

**index.marko**

```marko
<div.count>
    ${state.count}
</div>
<button.example-button on-click('increment')>
    Click me!
</button>
```

**component.js**

```js
module.exports = {
  onCreate() {
    this.state = { count: 0 };
  },
  increment() {
    this.state.count++;
  }
};
```

**style.css**

```css
.count {
  color: #09c;
  font-size: 3em;
}
.example-button {
  font-size: 1em;
  padding: 0.5em;
}
```

## Concise Syntax

Marko also support a beautiful concise syntax as an alternative to the HTML
syntax. Find out more about the [concise syntax here](http://markojs.com/docs/concise/).

```marko
<!-- Marko HTML syntax -->
<ul>
    <li for(color in ['a', 'b', 'c'])>
        ${color}
    </li>
</ul>
```

```marko
// Marko concise syntax
ul
    li for(color in ['a', 'b', 'c'])
        -- ${color}
```

# Changelog

See [CHANGELOG.md](CHANGELOG.md)

# Maintainers

- [Patrick Steele-Idem](https://github.com/patrick-steele-idem) (Twitter: [@psteeleidem](http://twitter.com/psteeleidem))
- [Michael Rawlings](https://github.com/mlrawlings) (Twitter: [@mlrawlings](https://twitter.com/mlrawlings))
- [Phillip Gates-Idem](https://github.com/philidem/) (Twitter: [@philidem](https://twitter.com/philidem))
- [Austin Kelleher](https://github.com/austinkelleher) (Twitter: [@AustinKelleher](https://twitter.com/AustinKelleher))
- [Dylan Piercey](https://github.com/dylanpiercey) (Twitter: [@dylan_piercey](https://twitter.com/dylan_piercey))
- [Martin Aberer](https://github.com/tindli) (Twitter: [@metaCoffee](https://twitter.com/metaCoffee))

# Code of Conduct

This project adheres to the [eBay Code of Conduct](http://ebay.github.io/codeofconduct).
By participating in this project you agree to abide by its terms.

# License

MIT
# Matreshka.js 2 [![npm version](https://badge.fury.io/js/matreshka.svg)](https://badge.fury.io/js/matreshka) [![Build Status](https://travis-ci.org/matreshkajs/matreshka.svg)](https://travis-ci.org/matreshkajs/matreshka) [![Coverage Status](https://coveralls.io/repos/github/matreshkajs/matreshka/badge.svg?branch=master)](https://coveralls.io/github/matreshkajs/matreshka?branch=master) [![Join the chat at https://gitter.im/finom/matreshka](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/matreshkajs/matreshka)

[![Matreshka Website](http://matreshka.io/img/mk5-logo_full-vert.svg)](http://matreshka.io)

> Matreshka.js is a simple JavaScript framework for single page applications creation. It fills the gap between a junior and a senior because of simple and intuitive API based on JavaScript classes and accessors. Everything you need to get started is your JavaScript knowledge.

## Features
- Reactive API which allows to solve hard and confusing problems easily
- High robustness of developed apps
- The ability to refactor legacy applications without rewriting them from scratch
- Only couple of hours is needed to master the framework because of an absence of complex concepts

**[Download](https://github.com/matreshkajs/matreshka/tree/gh-pages)**

**Install via NPM**
```
npm install --save matreshka
```

-----------------------------------

## Resources
- [The website](http://matreshka.io)
- [Examples and tutorials](https://github.com/matreshkajs/examples-and-tutorials)
- [Release History](https://github.com/matreshkajs/matreshka/releases)
- [JSDoc files](https://github.com/matreshkajs/matreshka.io/tree/master/doc)
- [Twitter (automatically reports about new versions)](https://twitter.com/matreshkajs)
- [Support the project on Patreon](https://www.patreon.com/finom)

**License:** [MIT License](https://raw.github.com/finom/matreshka/master/LICENSE)



<a href="https://www.browserstack.com/" target="_blank">
    <img src="http://matreshka.io/img/logos/browserstack.svg" height="30" valign="middle">
</a> is provided a sponsored access to their testing platform
# Introduction

- [What is Mithril?](#what-is-mithril)
- [Getting started](#getting-started)
- [Hello world](#hello-world)
- [DOM elements](#dom-elements)
- [Components](#components)
- [Routing](#routing)
- [XHR](#xhr)

---

### What is Mithril?

Mithril is a modern client-side Javascript framework for building Single Page Applications.  
It's small (< 8kb gzip), fast and provides routing and XHR utilities out of the box.

<div style="display:flex;margin:0 0 30px;">
	<div style="width:50%;">
		<h5>Download size</h5>
		<small>Mithril (8kb)</small>
		<div style="animation:grow 0.08s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:4%;"></div>
		<small style="color:#aaa;">Vue + Vue-Router + Vuex + fetch (40kb)</small>
		<div style="animation:grow 0.4s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:20%"></div>
		<small style="color:#aaa;">React + React-Router + Redux + fetch (64kb)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:32%"></div>
		<small style="color:#aaa;">Angular (135kb)</small>
		<div style="animation:grow 1.35s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:68%"></div>
	</div>
	<div style="width:50%;">
		<h5>Performance</h5>
		<small>Mithril (6.4ms)</small>
		<div style="animation:grow 0.64s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:24%;"></div>
		<small style="color:#aaa;">Vue (9.8ms)</small>
		<div style="animation:grow 0.98s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:40%"></div>
		<small style="color:#aaa;">React (12.1ms)</small>
		<div style="animation:grow 1.21s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:48%"></div>
		<small style="color:#aaa;">Angular (11.5ms)</small>
		<div style="animation:grow 1.15s;background:#1e5799;height:3px;margin:0 10px 10px 0;transform-origin:0;width:44%"></div>
	</div>
</div>

Mithril is used by companies like Vimeo and Nike, and open source platforms like Lichess.

If you are an experienced developer and want to know how Mithril compares to other frameworks, see the [framework comparison](http://mithril.js.org/framework-comparison.html) page.

Mithril supports browsers all the way back to IE9, no polyfills required.

---

### Getting started

The easiest way to try out Mithril is to include it from a CDN, and follow this tutorial. It'll cover the majority of the API surface (including routing and XHR) but it'll only take 10 minutes.

Let's create an HTML file to follow along:

```markup
<body>
	<script src="//unpkg.com/mithril/mithril.js"></script>
	<script>
	var root = document.body

	// your code goes here!
	</script>
</body>
```

---

### Hello world

Let's start as small as we can: render some text on screen. Copy the code below into your file (and by copy, I mean type it out - you'll learn better)

```javascript
var root = document.body

m.render(root, "Hello world")
```

Now, let's change the text to something else. Add this line of code under the previous one:

```javascript
m.render(root, "My first app")
```

As you can see, you use the same code to both create and update HTML. Mithril automatically figures out the most efficient way of updating the text, rather than blindly recreating it from scratch.

---

### DOM elements

Let's wrap our text in an `<h1>` tag.

```javascript
m.render(root, m("h1", "My first app"))
```

The `m()` function can be used to describe any HTML structure you want. So if you need to add a class to the `<h1>`:

```javascript
m("h1", {class: "title"}, "My first app")
```

If you want to have multiple elements:

```javascript
[
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
]
```

And so on:

```javascript
m("main", [
	m("h1", {class: "title"}, "My first app"),
	m("button", "A button"),
])
```

Note: If you prefer `<html>` syntax, [it's possible to use it via a Babel plugin](http://mithril.js.org/jsx.html).

```jsx
// HTML syntax via Babel's JSX plugin
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

---

### Components

A Mithril component is just an object with a `view` function. Here's the code above as a component:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", "A button"),
		])
	}
}
```

To activate the component, we use `m.mount`.

```javascript
m.mount(root, Hello)
```

As you would expect, doing so creates this markup:

```markup
<main>
	<h1 class="title">My first app</h1>
	<button>A button</button>
</main>
```

The `m.mount` function is similar to `m.render`, but instead of rendering some HTML only once, it activates Mithril's auto-redrawing system. To understand what that means, let's add some events:

```javascript
var count = 0 // added a variable

var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			// changed the next line
			m("button", {onclick: function() {count++}}, count + " clicks"),
		])
	}
}

m.mount(root, Hello)
```

We defined an `onclick` event on the button, which increments a variable `count` (which was declared at the top). We are now also rendering the value of that variable in the button label.

You can now update the label of the button by clicking the button. Since we used `m.mount`, you don't need to manually call `m.render` to apply the changes in the `count` variable to the HTML; Mithril does it for you.

If you're wondering about performance, it turns out Mithril is very fast at rendering updates, because it only touches the parts of the DOM it absolutely needs to. So in our example above, when you click the button, the text in it is the only part of the DOM Mithril actually updates.

---

### Routing

Routing just means going from one screen to another in an application with several screens.

Let's add a splash page that appears before our click counter. First we create a component for it:

```javascript
var Splash = {
	view: function() {
		return m("a", {href: "#!/hello"}, "Enter!")
	}
}
```

As you can see, this component simply renders a link to `#!/hello`. The `#!` part is known as a hashbang, and it's a common convention used in Single Page Applications to indicate that the stuff after it (the `/hello` part) is a route path.

Now that we going to have more than one screen, we use `m.route` instead of `m.mount`.

```javascript
m.route(root, "/splash", {
	"/splash": Splash,
	"/hello": Hello,
})
```

The `m.route` function still has the same auto-redrawing functionality that `m.mount` does, and it also enables URL awareness; in other words, it lets Mithril know what to do when it sees a `#!` in the URL.

The `"/splash"` right after `root` means that's the default route, i.e. if the hashbang in the URL doesn't point to one of the defined routes (`/splash` and `/hello`, in our case), then Mithril redirects to the default route. So if you open the page in a browser and your URL is `http://localhost`, then you get redirected to `http://localhost/#!/splash`.

Also, as you would expect, clicking on the link on the splash page takes you to the click counter screen we created earlier. Notice that now your URL will point to `http://localhost/#!/hello`. You can navigate back and forth to the splash page using the browser's back and next button.

---

### XHR

Basically, XHR is just a way to talk to a server.

Let's change our click counter to make it save data on a server. For the server, we'll use [REM](http://rem-rest-api.herokuapp.com), a mock REST API designed for toy apps like this tutorial.

First we create a function that calls `m.request`. The `url` specifies an endpoint that represents a resource, the `method` specifies the type of action we're taking (typically the `PUT` method [upserts](https://en.wiktionary.org/wiki/upsert)), `data` is the payload that we're sending to the endpoint and `withCredentials` means to enable cookies (a requirement for the REM API to work)

```javascript
var count = 0
var increment = function() {
	m.request({
		method: "PUT",
		url: "//rem-rest-api.herokuapp.com/api/tutorial/1",
		data: {count: count + 1},
		withCredentials: true,
	})
	.then(function(data) {
		count = parseInt(data.count)
	})
}
```

Calling the increment function [upserts](https://en.wiktionary.org/wiki/upsert) an object `{count: 1}` to the `/api/tutorial/1` endpoint. This endpoint returns an object with the same `count` value that was sent to it. Notice that the `count` variable is only updated after the request completes, and it's updated with the response value from the server now.

Let's replace the event handler in the component to call the `increment` function instead of incrementing the `count` variable directly:

```javascript
var Hello = {
	view: function() {
		return m("main", [
			m("h1", {class: "title"}, "My first app"),
			m("button", {onclick: increment}, count + " clicks"),
		])
	}
}
```

Clicking the button should now update the count.

---

We covered how to create and update HTML, how to create components, routes for a Single Page Application, and interacted with a server via XHR.

This should be enough to get you started writing the frontend for a real application. Now that you are comfortable with the basics of the Mithril API, [be sure to check out the simple application tutorial](http://mithril.js.org/simple-application.html), which walks you through building a realistic application.
 NuclearJS

[![Build Status](https://travis-ci.org/optimizely/nuclear-js.svg?branch=master)](https://travis-ci.org/optimizely/nuclear-js)
[![Coverage Status](https://coveralls.io/repos/optimizely/nuclear-js/badge.svg?branch=master)](https://coveralls.io/r/optimizely/nuclear-js?branch=master)
[![Join the chat at https://gitter.im/optimizely/nuclear-js](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/optimizely/nuclear-js?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Sauce Test Status](https://saucelabs.com/browser-matrix/nuclearjs.svg)](https://saucelabs.com/u/nuclearjs)

Traditional Flux architecture built with ImmutableJS data structures.

## Documentation

[https://optimizely.github.io/nuclear-js/](https://optimizely.github.io/nuclear-js/)

## Design Philosophy

- **Simple Over Easy** - The purpose of NuclearJS isn't to write the most expressive TodoMVC anyone's ever seen.  The goal of NuclearJS is to provide a way to model data that is easy to reason about and decouple at very large scale.

- **Immutable** - A means for less defensive programming, more predictability and better performance.

- **Functional** - The framework should be implemented functionally wherever appropriate.  This reduces incidental complexity and pairs well with Immutability.

- **Smallest Amount of State Possible** - Using NuclearJS should encourage the modeling of your application state in the most minimal way possible.

- **Decoupled** - A NuclearJS system should be able to function without any sort of UI or frontend.  It should be backend/frontend agnostic and be able to run on a NodeJS server.

## Installation

NuclearJS can be downloaded from [npm](https://www.npmjs.com/).

```
npm install nuclear-js
```

## Examples

- [Shopping Cart Example](./examples/shopping-cart) - Provides a general overview of basic NuclearJS concepts: actions, stores and getters with ReactJS.
- [Flux Chat Example](./examples/flux-chat) - A classic Facebook flux chat example written in NuclearJS.
- [Rest API Example](./examples/rest-api) - Shows how to deal with fetching data from an API using NuclearJS conventions.
- [Hot reloadable stores](./examples/hot-reloading) - Shows how to setup stores to be hot reloadable using webpack hot module replacement.

## How NuclearJS differs from other Flux implementations

1.  All app state is in a singular immutable map, like [Om](https://github.com/omcljs/om).  In development you can see your entire application state at every point in time thanks to awesome debugging tools built into NuclearJS.

2.  State is not spread out through stores, instead stores are a declarative way of describing some top-level domain of your app state. For each key in the app state map a store declares the initial state of that key and how that piece of the app state reacts over time to actions dispatched on the flux system.

3.  Stores are not reference-able nor have any `getX` methods on them.  Instead NuclearJS uses a functional lens concept called **getters**. In fact, the use of getters obviates the need for any store to know about another store, eliminating the confusing `store.waitsFor` method found in other flux implementations.

4.  NuclearJS is insanely efficient - change detection granularity is infinitesimal, you can even observe computed state where several pieces of the state map are combined together and run through a transform function.  NuclearJS is smart enough to know when the value of any computed changes and only call its observer if and only if its value changed in a way that is orders of magnitude more efficient than traditional dirty checking.  It does this by leveraging ImmutableJS data structure and using a `state1 !== state2` reference comparison which runs in constant time.

5.  Automatic data observation / rendering -- automatic re-rendering is built in for React in the form of a very lightweight mixin.  It is also easily possible to build the same functionality for any UI framework such as VueJS, AngularJS and even Backbone.

6.  NuclearJS is not a side-project, it's used as the default Flux implementation that powers all of Optimizely.  It is well tested and will continue to be maintained for the foreseeable future. Our current codebase has over dozens of stores, actions and getters, we even share our prescribed method of large scale code organization and testing strategies.

## Performance

Getters are only calculated whenever their dependencies change. So if the dependency is a keypath then it will only recalculate when that path in the app state map has changed (which can be done as a simple `state.getIn(keyPath) !== oldState.getIn(keyPath)` which is an `O(log32(n))` operation. The other case is when a getter is dependent on other getters. Since every getter is a pure function, NuclearJS will only recompute the getter if the values of its dependencies change.

## API Documentation

[API Documentation](https://optimizely.github.io/nuclear-js/docs/07-api.html)

## For Smaller Applications

NuclearJS was designed first and foremost for large scale production codebases.  For a much more lightweight Flux implementation that shares many of the same ideas and design principles check out [Microcosm](https://github.com/vigetlabs/microcosm).

## Contributing

Contributions are welcome, especially with the documentation website and examples.  See [CONTRIBUTING.md](./CONTRIBUTING.md).
# Polymer

[![Build Status](https://travis-ci.org/Polymer/polymer.svg?branch=master)](https://travis-ci.org/Polymer/polymer)
[![Published on npm](https://img.shields.io/npm/v/@polymer/polymer.svg)](https://www.npmjs.com/package/@polymer/polymer)
[![Published on webcomponents.org](https://img.shields.io/badge/webcomponents.org-published-blue.svg)](https://www.webcomponents.org/element/@polymer/polymer)

> ℹ️ Note: This is the current stable version of the Polymer library.  At Google I/O 2018 we announced a new Web Component base class, [`LitElement`](https://github.com/Polymer/lit-element), as a successor to the `PolymerElement` base class in this library.
>
> If you're starting a new project, we recommend that you consider using LitElement instead.
>
> If you have a project you've built with an earlier version of the Polymer library, we recommend that you [migrate](#about-polymer-30) to 3.0 for best compatibility with the JavaScript ecosystem. Thanks to the interoperability of Web Components, elements built with Polymer 3.0 and LitElement can be mixed and matched in the same app, so once you have updated your project to Polymer 3.0, you can migrate to LitElement incrementally, one element at a time.  See our blog post on the [Polymer Project roadmap](https://www.polymer-project.org/blog/2018-05-02-roadmap-update.html) for more information.

Polymer lets you build encapsulated, reusable [Web Components](https://www.webcomponents.org/introduction) that work just like standard HTML elements, to use in building web applications.  Using a Web Component built with Polymer is as simple as importing its definition then using it like any other HTML element:

```html
<!-- Import a component -->
<script src="https://unpkg.com/@polymer/paper-checkbox@next/paper-checkbox.js?module" type="module" ></script>

<!-- Use it like any other HTML element -->
<paper-checkbox>Web Components!</paper-checkbox>
```

Web Components are now implemented natively on Safari and Chrome (~70% of installed browsers), and run well on Firefox, Edge, and IE11 using [polyfills](https://github.com/webcomponents/webcomponentsjs).  Read more [below](#overview).

## Getting started

 * The easiest way to try out Polymer is to use one of these online tools:

    * Runs in all [supported](#supported-browsers) browsers: [StackBlitz](https://stackblitz.com/edit/polymer-element-example?file=index.js), [Glitch](https://glitch.com/edit/#!/polymer-element-example?path=index.html)

    * Runs in browsers with [JavaScript Modules](https://caniuse.com/#search=modules): [JSBin](https://jsbin.com/wuxejiz/edit?html,output),
 [CodePen](https://codepen.io/kevinpschaaf/pen/BxdErp?editors=1000).

 * You can also save [this HTML file](https://gist.githubusercontent.com/kevinpschaaf/8a5acbea7b25d2bb5e82eeea2b105669/raw/c3a86872f07603e2d0ddae736687e52a5c8c499f/index.html) to a local file and run it in any browser that supports [JavaScript Modules]((https://caniuse.com/#search=modules)).

 * When you're ready to use Polymer in a project, install it via [npm](https://www.npmjs.com/). To run the project in the browser,
 a module-compatible toolchain is required. We recommend installing the [Polymer CLI](https://github.com/Polymer/tools/tree/master/packages/cli) to and using its development server as follows.

    1. Add Polymer to your project:

        ```npm i @polymer/polymer```

    1. Create an element by extending PolymerElement and calling `customElements.define` with your class (see the examples below).

    1. Install the Polymer CLI:

        ```npm i -g polymer-cli```

    1. Run the development server and open a browser pointing to its URL:

        ```polymer serve --npm```

    > Polymer 3.0 is published on [npm](https://www.npmjs.com/package/@polymer/polymer) using JavaScript Modules.
    This means it can take advantage of the standard native JavaScript module loader available in all current major browsers.
    >
    > However, since Polymer uses npm conventions to reference dependencies by name, a light transform to rewrite specifiers to URLs is required to run in the browser. The polymer-cli's development server `polymer serve`, as well as `polymer build` (for building an optimized app for deployment)  automatically handles this transform.

    Tools like [webpack](https://webpack.js.org/) and [Rollup](https://rollupjs.org/) can also be used to serve and/or bundle Polymer elements.


## Minimal Example

  1. Create a class that extends `PolymerElement`.
  1. Implement a static `properties` getter that describes the element's public property/attribute API
  (these automatically become observed attributes).
  1. Then implement a `template` getter that returns an `HTMLTemplateElement` describing the element's rendering, including encapsulated styling and any property bindings.

```html
  <script src="node_modules/@webcomponents/webcomponents-loader.js"></script>
  <script type="module">
    import {PolymerElement, html} from '@polymer/polymer';

    class MyElement extends PolymerElement {
      static get properties() { return { mood: String }}
      static get template() {
        return html`
          <style> .mood { color: green; } </style>
          Web Components are <span class="mood">[[mood]]</span>!
        `;
      }
    }

    customElements.define('my-element', MyElement);
  </script>

  <my-element mood="happy"></my-element>
```

## Overview

Web components are an incredibly powerful new set of primitives baked into the web platform, and open up a whole new world of possibility when it comes to componentizing front-end code and easily creating powerful, immersive, app-like experiences on the web.

Polymer is a lightweight library built on top of the web standards-based [Web Components](http://webcomponents.org/introduction) APIs, and makes it easier to build your very own custom HTML elements. Creating reusable custom elements - and using elements built by others - can make building complex web applications easier and more efficient.

By being based on the Web Components APIs built in the browser (or [polyfilled](https://github.com/webcomponents/webcomponentsjs) where needed), elements built with Polymer are:

* Built from the platform up
* Self-contained
* Re-usable
* Interoperable across frameworks

Among many ways to leverage custom elements, they can be particularly useful for building reusable UI components. Instead of continually re-building a specific navigation bar or button in different frameworks and for different projects, you can define this element once using Polymer, and then reuse it throughout your project or in any future project.

Polymer provides a declarative syntax to easily create your own custom elements, using all standard web technologies - define the structure of the element with HTML, style it with CSS, and add interactions to the element with JavaScript.

Polymer also provides optional two-way data-binding, meaning:

1. When properties in the model for an element get updated, the element can update itself in response.
2. When the element is updated internally, the changes can be propagated back to the model.

Polymer is designed to be flexible, lightweight, and close to the web platform - the library doesn't invent complex new abstractions and magic, but uses the best features of the web platform in straightforward ways to simply sugar the creation of custom elements.

## About Polymer 3.0

Polymer 3.0 is now released to stable, and introduces a major change to how Polymer is distributed: from HTML Imports on Bower, to JS modules on npm.  Otherwise, the API is almost entirely backward compatible with Polymer 2.0 (the only changes are removing APIs related to HTML Imports like `importHref`, and converting Polymer's API to be module-based rather than globals-based).

Migrating to Polymer 3.0 by hand is mostly mechanical:
* Components should be defined in JS modules instead of in HTML
* Templates should be encoded in JS modules using a `static get template()` getter on PolymerElement subclasses using the `html` tagged template literal function (which parses `HTMLTemplateElement`s out of strings in JS) rather than using `<template>` elements in a `<dom-module>`
* All dependencies should be imported JS module imports rather than HTML Imports.

However, the [`polymer-modulizer`](https://github.com/Polymer/polymer-modulizer) tool automates the vast majority of this migration work.  Please see details on that repo for automated conversion of Polymer 2.0 apps and elements to Polymer 3.0.

👀 **Looking for Polymer v2.x?** Please see the [the v2 branch](https://github.com/Polymer/polymer/tree/2.x).

👀 **Looking for Polymer v1.x?** Please see the [the v1 branch](https://github.com/Polymer/polymer/tree/1.x).

## Contributing

The Polymer team loves contributions from the community! Take a look at our [contributing guide](CONTRIBUTING.md) for more information on how to contribute.  Please file issues on the Polymer issue tracker following the issue template and contributing guide [issues](https://github.com/Polymer/polymer/issues/new).

## Communicating with the Polymer team

Beyond GitHub, we try to have a variety of different lines of communication available:

* [Blog](https://blog.polymer-project.org/)
* [Twitter](https://twitter.com/polymer)
* [Google+ community](https://plus.google.com/communities/115626364525706131031)
* [Mailing list](https://groups.google.com/forum/#!forum/polymer-dev)
* [Slack channel](https://bit.ly/polymerslack)

# License

The Polymer library uses a BSD-like license that is available [here](./LICENSE.txt)

[![Riot logo](https://riot.js.org/img/logo/riot480x.png)](https://riot.js.org)


## Simple and elegant component-based UI library

[![Build Status][travis-image]][travis-url]
[![MIT License][license-image]][license-url]
[![Riot Forum][riot-forum-image]][riot-forum-url]
[![Join the chat at https://gitter.im/riot/riot][gitter-image]][gitter-url]
[![Join the chat (ja) at https://riot-jp-slackin.herokuapp.com/][slack-ja-image]][slack-ja-url]
[![OpenCollective Backers][backer-badge]][backer-url] [![OpenCollective Sponsors][sponsor-badge]][sponsor-url]

[![NPM version][npm-version-image]][npm-url]
[![NPM downloads][npm-downloads-image]][npm-url]
[![jsDelivr Hits][jsdelivr-image]][jsdelivr-url]
[![Coverage Status][coverage-image]][coverage-url]
![Riot Size][lib-size]
[![Code Quality][codeclimate-image]][codeclimate-url]

[![Sauce Test Status][saucelabs-image]][saucelabs-url]

### Framework Size Comparison

| Framework                                      | Version         | Minified Size (gzip) |
|------------------------------------------------|-----------------|----------------------|
| @angular/core + Polyfills                      | 6.0.9           | 141.79kb             |
| Ember                                          | 2.18.2          | 121.84kb             |
| Polymer + Web Components Polyfill Lite         | 1.8.0           | 66.3kb               |
| React + Map and Set Polyfills                  | 16.4.0          | 41.60kb              |
| Web Components Polyfill                        | 0.7.24          | 33.68kb              |
| Vue                                            | 2.5.17          | 31.65kb              |
| __Riot__                                       | 3.12.0          | 10.80kb              |
| Inferno                                        | 5.4.2           | 7.79kb               |
| Preact                                         | 8.3.1           | 3.48kb               |

The above comparison includes polyfills to support old browsers like IE9 that in Riot.js are supported by default

### Browsers support

Riot is supported by all modern browsers and it does not require any additional polyfill

- IE 9+
- Edge
- Chrome
- Safari 7+
- Firefox
- Safari iOS
- Android

### Custom tags • Concise syntax • Simple API • Tiny Size

Riot brings custom tags to all modern browsers. Think React + Polymer but with enjoyable syntax and a small learning curve.

#### Tag definition

``` javascript
<timer>

  <p>Seconds Elapsed: { time }</p>

  this.time = opts.start || 0

  tick() {
    this.update({ time: ++this.time })
  }

  var timer = setInterval(this.tick, 1000)

  this.on('unmount', function() {
    clearInterval(timer)
  })

</timer>
```

[Open this example on Plunker](http://riot.js.org/examples/plunker/?app=timer)

#### Mounting

``` javascript
riot.mount('timer', { start: 0 })
```

#### Nesting

Custom tags lets you build complex views with HTML.

``` html
<timetable>
  <timer start="0"></timer>
  <timer start="10"></timer>
  <timer start="20"></timer>
</timetable>
```

HTML syntax is the de facto language on the web and it's designed for building user interfaces. The syntax is explicit, nesting is inherent to the language and attributes offer a clean way to provide options for custom tags.


### Expressions Bindings
- Absolutely the smallest possible amount of DOM updates and reflows.
- One way data flow: updates and unmounts are propagated downwards from parent to children.
- Expressions are pre-compiled and cached for high performance.
- Lifecycle events for more control.


### Close to standards
- No proprietary event system.
- Event normalization.
- The rendered DOM can be freely manipulated with other tools.
- No extra HTML root elements or `data-` attributes.
- Plays well with any frontend framework.


### Use your dearest language and tools
- Create tags with CoffeeScript, Jade, LiveScript, Typescript, ES6 or [any pre-processor](http://riot.js.org/guide/compiler/#pre-processors) you want.
- Integrate with NPM, CommonJS, AMD, Bower or Component
- Develop with [Gulp](https://github.com/e-jigsaw/gulp-riot), [Grunt](https://github.com/ariesjia/grunt-riot), [Wintersmith](https://github.com/collingreen/wintersmith-riot), [webpack*](https://github.com/riot/tag-loader), [Rollup*](https://github.com/riot/rollup-plugin-riot), [Browserify*](https://github.com/riot/riotify), [Babel*](https://github.com/riot/babel-preset-es2015-riot) or Bublé
- Test with [Karma*](https://github.com/riot/karma-riot), Mocha or whatever you like

*Note*: `*` officially maintained

### CDN hosting
- [jsDelivr](http://www.jsdelivr.com/projects/riot)
- [cdnjs](https://cdnjs.com/libraries/riot)


### Concise syntax
- Power shortcuts: `class={ enabled: is_enabled, hidden: hasErrors() }`.
- No extra brain load such as `render`, `state`, or `constructor`.
- Interpolation: `Add #{ items.length + 1 }` or `class="item { selected: flag }"`
- Compact ES6 method syntax.

### Demos
- [**Riot Examples** - Community's Official](https://github.com/riot/examples)
- [**Riot Animore** - Official Tags Animations Library](https://github.com/riot/animore)
- [Riot Todo MVC](http://todomvc.com/examples/riotjs/)
- [Hackernews reader](http://git.io/riot-hn)
- [Vuejs examples by Riotjs](https://github.com/txchen/feplay/tree/gh-pages/riot_vue)
- [Flux-like ES6 Todo](https://github.com/srackham/riot-todo)
- [Timer](http://jsfiddle.net/gnumanth/h9kuozp5/)
- [Another flux demo comparable to React ones](http://txchen.github.io/feplay/riot_flux)
- [Various experiments](http://richardbondi.net/programming/riot)
- [Isomorphic application](https://github.com/Avnerus/riot-isomorphic)
- [Isomorphic proof of concept](https://github.com/PabloSichert/isomorphic-proof-of-concept)
- [flux-riot todo](http://mingliangfeng.me/flux-riot)
- [Another Riot Todo MVC](http://nippur72.github.io/riotjs-todomvc/#/)
- [Cheft isomorphic by express](https://github.com/cheft/cheft)
- [electron-riot - Riot in an electron application](https://github.com/mike-ward/electron-riot)
- [An express, riot, jade, webpack simple boilerplate](https://github.com/revington/frontend-boilerplate)
- [Riot.js vs React.js comparison of a simple comment box](https://github.com/vitogit/riot.js-vs-react.js-comment-box)
- [Riot Seed project - webpack, routing, ava tests, dispatcher](https://github.com/continuata/riot-seed)
- [Riot-Redux League Table example](https://github.com/drewmiley/PoolLeague)
- [Riot vs React vs Ractive Counters using Redux store](https://github.com/drewmiley/ractive-react-riot-redux-counters-example)

### Books
- [Building Apps with Riot](https://bleedingedgepress.com/building-apps-with-riot/)

### Tutorials
- [Building Apps with Riot, ES6 and Webpack](http://blog.srackham.com/posts/riot-es6-webpack-apps/)
- [Building Apps with Riot, Babel, RiotControl and Webpack](https://github.com/txchen/feplay/tree/gh-pages/riot_webpack)
- [Building tabs with Riot](http://robertwpearce.com/blog/riotjs-example.html)
- [The "React tutorial" for Riot](https://juriansluiman.nl/article/154/the-react-tutorial-for-riot)
- [How to package "tag libraries" in Riot](https://github.com/ivan-saorin/riot-tutorial-tags-pack-app)
- [Another React tutorial with Riot](https://github.com/viliamjr/commentsTuto)
- [Riot Custom Tag by Example](http://www.triplet.fi/blog/riot-custom-tag-by-example/)
- [Riot Compiler Explained](http://www.triplet.fi/blog/riot-compiler-explained/)
- [Adding compiled Riot tags to your Gulp + Browserify build](http://www.triplet.fi/blog/adding_compiled_riot_tags_to_your_gulp_browserify_build/)
- [The anatomy of a tag - a primer tutorial](http://www.marcusoft.net/2015/12/riotjs-anatomy-of-a-tag.html)
- [Using TDD with Riot+mocha+chai](http://vitomd.com/blog/coding/tutorial_tdd_riot_mocha/)
- [The Basics - from ground up to connected tag-networks](http://happy-css.com/lessons/riotjs/)
- [Hello Riot.js : a quick tutorial about this awesome lib](http://vitomd.com/blog/coding/hello-riot-js-quick-tutorial-about-this-awesome-lib/)

### Video Tutorials
- [Introduction](https://www.youtube.com/watch?v=al87U6NgRTc)
- [Loops, Events and Callbacks](https://www.youtube.com/watch?v=T-ZV9dv93sw)
- [Server Rendering with Node & Express](http://youtu.be/6ww1UXGJzcs)
- [Riot And Webpack Setup](https://youtu.be/UgdZbT-KPpY)
- [Riot and Redux - Part 1](https://youtu.be/Y6vpKAGT2-8)
- [Riot and Redux - Part 2](https://youtu.be/DgM03bvgCYc)
- [Riot and Redux - Part 3](https://youtu.be/QuwnbuneAzM)
- [Riot and Redux - Part 4](https://youtu.be/qc6bjtu7KG0)
- [Riot and Redux - Part 5](https://youtu.be/M4BNsRMatVY)
- [Riot and Redux - Part 6](https://youtu.be/jr8KDpwtRsk)


### Libraries / Frameworks
- [Flux- like event controller for Riot](https://github.com/jimsparkman/RiotControl)
- [flux-riot framework](https://github.com/mingliangfeng/flux-riot)
- [Cheftjs - chinese framework for Riot](https://github.com/cheft/cheftjs)
- [Veronica - flux adaption for Riot](https://www.npmjs.com/package/veronica-x)
- [Minimal Flux dispatcher pattern](https://gist.github.com/continuata/c605846751c09a5e94d12ae8c91cbf05)
- [riot-format: a format library for riotjs, like angular $filter](https://github.com/joylei/riot-format)
- [riot-view-router: a simple state based router mixin](https://github.com/neetjn/riot-view-router)
- [riotx - Centralized State Management for riot.js](https://github.com/cam-inc/riotx)
- [storybook for riot.js components <sup>alpha</sup>](https://github.com/storybooks/storybook/tree/master/app/riot)

### Components
- [Material UI](http://kysonic.github.io/riot-mui/)
- [RiotGear Components](https://riotgear.js.org)
- [RiotGear Router](http://riotgear.js.org/components/router/)
- [Riot Bootstrap](http://cognitom.github.io/riot-bootstrap/)
- [iToolkit](https://github.com/BE-FE/iToolkit)
- [Riot Routehandler](https://github.com/crisward/riot-routehandler)-[(Demo)](http://codepen.io/crisward/pen/xwGJpM?editors=101)
- [Riot Flipcard](https://github.com/crisward/riot-flipcard) - [(Demo)](https://crisward.github.io/riot-flipcard/)
- [Riot Grid](https://github.com/crisward/riot-grid) - [(Demo)](http://codepen.io/crisward/pen/rxepMX?editors=101)
- [Riot Grid2](https://github.com/crisward/riot-grid2) - [(Demo)](http://crisward.github.io/riot-grid2/)
- [Riot Subtag](https://github.com/crisward/riot-subtag) - faster than lots of if's
- [ESLint Riot Plugin](https://github.com/txchen/eslint-plugin-riot)
- [riot-animate](https://github.com/sartaj/riot-animate)
- [Nest UI](https://github.com/fengzilong/Nest) - [(Demo)](https://fengzilong.github.io/Nest/)
- [rGrid](https://github.com/limodou/rgrid) - [(Demo)](https://limodou.github.io/rgrid/examples.html)
- [typewriter](https://github.com/amitguptagwl/web-snippets/tree/master/riotjs-components/typewriter) - [(Demo)](http://amitkumargupta.work)

### Resources
- [create-riot-app](https://github.com/alexstep/create-riot-app-ejected) dev environment
- [Riot + AngularJS](https://github.com/lucasbrigida/angular-riot)
- [Module loader for WebPack](https://www.npmjs.com/package/riotjs-loader)
- [Riot + Meteor]( https://atmospherejs.com/baysao/riotjs)
- [Riot Snake Game](http://cdn.rawgit.com/atian25/blog/master/assets/riot-snake.html)
- [Riot Tag Syntax Checker](http://cognitom.github.io/riot-checker/)
- [Riot 文档中译版](https://github.com/Centaur/riotjs_doc_cn) :cn:
- [Riot + Wintersmith](https://github.com/collingreen/wintersmith-riot)
- [Riot precompiler plugin for lineman](https://github.com/Power-Inside/lineman-riot)
- [Riot Startkit - Flux inspired skeleton app + WebPack + PostCSS](https://github.com/wbkd/riotjs-startkit)
- [Yeoman generator - Generator riot mobile](https://www.npmjs.com/package/generator-riot-mobile)
- [Yeoman generator - Generator riot element](https://www.npmjs.com/package/generator-riot-element)
- [Riot for TypeScript](https://github.com/nippur72/RiotTS)
- [Riot loader plugin for RequireJS](https://github.com/amenadiel/requirejs-riot)
- [Riot loader plugin for JSPM/SystemJS](https://github.com/amenadiel/systemjs-riot)
- [RiotJS Style Guide](https://github.com/voorhoede/riotjs-style-guide)
- [Riot Cheatsheet](http://martinmuzatko.github.io/riot-cheatsheet/)

### Performance
- **Riot vs React performance:** [(Riot version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-riot-vs-vanilla) vs [(React version)](https://github.com/kazzkiq/samples/tree/gh-pages/perf/dom-react-vs-vanilla)

### Miscellaneous
- [Q&A with RiotJS author Tero Piirainen](http://www.triplet.fi/blog/q-and-a-with-riotjs-author-tero-piirainen/)
- [riot-detector (Chrome Extension)](https://chrome.google.com/webstore/detail/riot-detector/cnnmjeggdmicjojlnjghdgkdlijiobke)

### Editors / Editor Plugins (Syntax highlighting, autcompletion, etc...)
- [riot (Atom Package)](https://atom.io/packages/riot)
- [language-riot-tag (Atom Package)](https://github.com/dekimasoon/language-riot-tag)
  - Based on Vue's official Sublime Text highlighter
  - Note: Designed for html, not jade.
- [sublime-tag (Sublime Text)](https://github.com/crisward/sublime-tag)
- [riot-tag (Visual Studio)](https://github.com/crisward/riot-tag)
- [web-mode (Emacs)](http://web-mode.org)
  - See how to configure [#1967](https://github.com/riot/riot/issues/1967)

### How to contribute

If you are reading this it's already a good sign and we are thankful for it! We try our best working as much as we could on riot but your help is always appreciated.

If you want to contribute to riot helping us maintaining the project please check first the list of [our open issues](https://github.com/riot/riot/issues) to understand whether there is a task where you could help.

Riot is mainly developed on UNIX systems so you will be able to run all the commands necessary to build and test the library using our [Makefile](Makefile). If you are on a Microsoft machine it could be harder to set up you development environment properly.

Following the steps below you should be able to properly submit your patch to the project

#### 1) Clone the repo and browse to the riot folder

```shell
$ git clone git@github.com:riot/riot.git && cd riot
```
#### 2) Set up your git branch

```shell
$ git checkout -b feature/my-awesome-patch
```

#### 3) Install the npm dependencies

```shell
$ npm i
```

#### 4) Build and test riot using the Makefile

```shell
# To build and test riot
$ make riot

# To build without testing
$ make raw

# To build anytime you change a src file
$ make watch

# To bench riot
$ make perf
```

#### 5) Pull request only against the `dev` branch making sure you have read [our pull request template](.github/PULL_REQUEST_TEMPLATE.md)

#### 6) Be patient


### Credits

Riot is made with :heart: by many smart people from all over the world. Thanks to all the contributors<br>
It's actively maintained by:
<table>
  <tbody>
    <tr>
      <td valign="top">
        <img width="125" height="125" src="https://github.com/GianlucaGuarini.png?s=125?s=125">
        <br>
        <a href="https://github.com/GianlucaGuarini">Gianluca Guarini</a>
      </td>
     </tr>
  </tbody>
</table>

## Official Website

http://riot.js.org

## Backers

Support us with a monthly donation and help us continue our activities. [Become a backer][support-url]

[![Backers][backers-image]][support-url]

## Sponsors

Become a sponsor to get your logo on our README. [Become a sponsor][support-url]

[![Sponsors][sponsors-image]][support-url]

## Thanks

Special thanks to Browserstack for their support

<a href='https://www.browserstack.com/'>
  <img width='70px' src="https://cdn.worldvectorlogo.com/logos/browserstack.svg" alt="browser stack">
</a>

[travis-image]:https://img.shields.io/travis/riot/riot.svg?style=flat-square
[travis-url]:https://travis-ci.org/riot/riot

[license-image]:http://img.shields.io/badge/license-MIT-000000.svg?style=flat-square
[license-url]:LICENSE.txt

[npm-version-image]:http://img.shields.io/npm/v/riot.svg?style=flat-square
[npm-downloads-image]:http://img.shields.io/npm/dm/riot.svg?style=flat-square
[npm-url]:https://npmjs.org/package/riot

[riot-forum-image]:https://img.shields.io/badge/muut-JOIN_FORUM%E2%86%92-ff0044.svg?style=flat-square
[riot-forum-url]:http://riot.js.org/forum/

[coverage-image]:https://img.shields.io/coveralls/riot/riot/dev.svg?style=flat-square
[coverage-url]:https://coveralls.io/r/riot/riot?branch=dev

[saucelabs-image]:https://saucelabs.com/browser-matrix/testsriotjs.svg?1
[saucelabs-url]:https://saucelabs.com/u/testsriotjs

[gitter-image]:https://img.shields.io/badge/GITTER-JOIN_CHAT_%E2%86%92-1dce73.svg?style=flat-square
[gitter-url]:https://gitter.im/riot/riot?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge

[slack-ja-image]:https://img.shields.io/badge/SLACK_(ja)-JOIN_CHAT_%E2%86%92-551a8b.svg?style=flat-square
[slack-ja-url]:https://riot-jp-slackin.herokuapp.com/

[codeclimate-image]:https://api.codeclimate.com/v1/badges/b81ddf3c77e8189876da/maintainability
[codeclimate-url]:https://codeclimate.com/github/riot/riot

[donations-campaign-url]:https://pledgie.com/campaigns/31139
[donations-campaign-image]:https://pledgie.com/campaigns/31139.png?skin_name=chrome

[jsdelivr-image]: https://data.jsdelivr.com/v1/package/npm/riot/badge
[jsdelivr-url]: https://www.jsdelivr.com/package/npm/riot


[backer-url]: #backers
[backer-badge]: https://opencollective.com/riot/backers/badge.svg?color=blue
[sponsor-url]: #sponsors
[sponsor-badge]: https://opencollective.com/riot/sponsors/badge.svg?color=blue

[support-url]: https://opencollective.com/riot#support

[lib-size]: http://img.badgesize.io/https://unpkg.com/riot/riot.min.js?compression=gzip

[backers-image]: https://opencollective.com/riot/backers.svg
[sponsors-image]: https://opencollective.com/riot/sponsors.svg
# Spine
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/spine/spine?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://secure.travis-ci.org/spine/spine.svg)](http://travis-ci.org/spine/spine)

Spine is a lightweight MVC library for building JavaScript web applications. Spine gives you structure and then gets out of your way, allowing you to concentrate on the fun stuff: building awesome web applications.

Spine is opinionated in its approach to web application architecture and design. Spine's architecture complements patterns such as de-coupled components and CommonJS modules, markedly helping with code quality and maintainability.

The library is written in [CoffeeScript](http://coffeescript.org), and though it doesn't necessarily require CoffeeScript to develop applications - you can use whichever language you're most familiar with or prefer - the documentation and some associated tools like [Hem](https://github.com/spine/hem) and [spine.app](https://github.com/spine/spine.app) cater to those who prefer CoffeeScript's syntax.

## Learn it

Documentation is often incomplete or just lies waiting to happen. Approachable source code reduces knowledge dependencies. This is an area where Spine really excells compared to other MVC frameworks. Spine is tiny; the core library comes in at less than 700 lines of CoffeeScript code. It is written in such a way to prefer readability over terseness or clever tricks, and it is small enough that within a rather small timeframe you can understand how all the pieces work together. Expertise is achievable within days or weeks rather than months or years. For these reasons, remaining lightweight and simple is fundamental to Spine.

For documentation, usage, and examples, see: [spinejs.com](http://spinejs.com)

The test suite can also occasionally provide additional useful examples, especially if you are looking for non-coffeescript examples.

# Contributing

## Reporting issues

To file a bug report, please visit the [GitHub issues page](https://github.com/spine/spine/issues).  It's great if you can attach code (test cases and fixes for bugs, and test cases and a proposed implementation for features), but reproducible bug reports are also welcome. 

For support or help with using spine please use the [Spine Google Group](https://groups.google.com/forum/#!forum/spinejs) and/or StackOverflow rather than opening an issue on Github. If you post in those places you are more likely to get more people to chime in, and others can benefit from it more readily.

## Cloning master and running the test suite

To get started contributing to Spine, first clone the repository and make sure you can run the test suite.  If you're not familiar with Git, visit the [Git homepage](http://git-scm.com) to download Git for your platform.

First, clone the repository:

```
$ git clone git://github.com/spine/spine.git
$ cd spine
```

Next, You will need node and npm to pull in the testing libraries. Once you're all set with those then from within the Spine repo directory run 

```
$ npm install .
```

This should bring in [Jasmine](http://jasmine.github.io/), Coffeescript, and a minimalist local server for running the tests a browser. You can also simply open `test/index.html` in a browser to run the [Jasmine](http://jasmine.github.io/) test suite for spine core.  If you see all the tests passing, you're ready to contribute! A known issue is that some of the routing tests will fail if you are simply using a `file://` protocol in the browser. This has to do with browser security. You can avoid this by running the local server, `$ npm start`. Alternatively you can use a server like Apache or Nginx to serve the test files to the browser. 

If you have [phantom.js](http://phantomjs.org/) available then a script is included to make running tests even slicker!

```
$ npm test
```

## Contributing to the Spine documentation

Perhaps the easiest way to get started with contributing is through the docs.  If you find typos, bugs, or omissions in the docs, please submit a pull request to fix.  The Spine website [spinejs.com](http://spinejs.com), which is the primary documentation, is a very simple rails app [spine.site](https://github.com/spine/spine.site). You don't need to know Rails or Ruby to contribute. The vast majority of it is in Markdown

## Contributing to the Spine code

This recommended contribution process is based on the [Ruby on Rails contribution guide](http://edgeguides.rubyonrails.org/contributing_to_ruby_on_rails.html#contributing-to-the-rails-code).  In general, please include tests with new features or bugfixes, work in a feature branch until you're ready to submit or discuss your code, then fork the repository, push to your fork, and issue a pull request.

### CoffeeScript

When submitting a pull request for code, please submit in CoffeeScript. Building the effected js files is required for testing sake, but submitting those js files is optional.

Assuming you have Node.js and npm already installed then proceed by installing local dev dependencies:

```
$ npm install .
```

Then use the provided build scripts to compile your CoffeeScript files:

```
$ cake build
$ cake watch
```

These tasks use a locally installed copy of CoffeeScript to ensure all contributors use the same version of the compiler.

### Git

Let's say I'm going to submit a patch to add someFeatureFix:

```
$ git checkout dev
```

Feature branches should start from `dev` **not** `master`. If you branch off of, or do builds on the master branch you will get CoffeeScript source map files, which are cool, but tend to ruin automatic merges with git.

```
$ git checkout -b someFeatureFix
$ vim test/...
  # (...add tests...)
$ cake watch
  # (...this should recompile and changes you make in your CoffeeScript...)

-- figure out what spine module your changes belong in
$ vim src/spine.coffee
or
$ vim src/[otherSpineComponent].coffee
  # (...add the feature/fix...)
$ open test/index.html
  # (...make sure tests run for each component that was changed...)
  # (...test in other browsers with various jquery versions if you feel like there is risk... )
$ git commit -m "Add Some Feature Fix"
```

Then, [fork the Spine repository](https://github.com/spine/spine/fork), and push your branch to your fork:

```
$ git remote add <your user name> git@github.com:<your user name>/spine.git
$ git push <your user name> someFeatureFix
```

Finally, issue a pull request from inside the GitHub interface to the `dev` branch of spine, and your contribution is ready for consideration, discussion, and (hopefully) merging in!
# ![TodoMVC](media/logo.png)

> Helping you select an MV\* framework

### [Website](http://todomvc.com)&nbsp;&nbsp;&nbsp;&nbsp;[Blog](http://blog.tastejs.com)&nbsp;&nbsp;&nbsp;&nbsp;[TasteJS](http://tastejs.com)

[![Build Status](https://travis-ci.org/tastejs/todomvc.svg)](https://travis-ci.org/tastejs/todomvc)
[![Cypress.io tests](https://img.shields.io/badge/cypress.io-tests-green.svg?style=flat-square)](https://dashboard.cypress.io/#/projects/n4ynap/runs)

Developers these days are spoiled with choice when it comes to selecting an MV\* framework for structuring and organizing JavaScript web apps.

Backbone, Ember, AngularJS... the list of new and stable solutions goes on and on, but just how do you decide on which to use in a sea of so many options?

To help solve this problem, we created TodoMVC - a project which offers the same Todo application implemented using MV* concepts in most of the popular JavaScript MV\* frameworks of today.


## Team

TodoMVC would not be possible without a strong team of [contributors](https://github.com/tastejs/todomvc/contributors) helping push the project forward each day. Additionally, we have a core project team composed of:

#### [Addy Osmani](https://github.com/addyosmani) - Founder/Lead

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/96270e4c3e5e9806cf7245475c00b275.png?s=40">
  Addy is a Software Engineer at Google who originally created TodoMVC. He oversees the project direction, maintenance and organizes the planning and development efforts of the team.

#### [Sindre Sorhus](https://github.com/sindresorhus) - Lead Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9.png?s=40">
Sindre is a Web Developer who leads core development, quality control and application design for the project. His engineering contributions have helped us ensure consistency and best practices are enforced wherever possible. Sindre also leads up development of the TodoMVC application spec.

#### [Pascal Hartig](https://github.com/passy) - Developer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/be451fcdbf0e5ff07f23ed16cb5c90a3.png?s=40">
Pascal is a Software Engineer at Twitter with a deep passion for consistency. He watches pull requests and helps developers getting their contributions integrated with TodoMVC.

#### [Stephen Sawchuk](https://github.com/stephenplusplus) - Developer

<img align="left" width="40" height="40" src="https://avatars3.githubusercontent.com/u/723048?v=2&s=40">
Stephen is a Front-end Engineer at Quicken Loans that cares about improving the maintainability and developer experience of open-source projects. His recent contributions include helping us move all apps over to using Bower and implementing the new information bar.

#### [Colin Eberhardt](https://github.com/colineberhardt) - Developer

<img align="left" width="40" height="40" src="https://secure.gravatar.com/avatar/73bba00b41ff1c9ecc3ee29487bace7d?s=40">
Colin is a software consultant at Scott Logic who is passionate about all software - from JavaScript to Java, and C# to Objective-C. His recent contribution to the project has been a fully automated test suite.

#### [Sam Saccone](https://github.com/samccone) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/userimage/602125/f2f1d93164ec62b527f0398c65b2d1f3.jpg?size=40">
Sam is a Software Engineer at Google who is driven by an endless desire to create, solve problems, and improve developers' lives.

#### [Arthur Verschaeve](https://github.com/arthurvr) - Developer

<img align="left" width="40" height="40" src="https://en.gravatar.com/avatar/e34daab0d2e344219adb5234198269c5?size=40">
Arthur is an open-source fanboy from Belgium. He is passionate about developer tooling and all things JavaScript.

#### [Fady Samir Sadek](https://github.com/FadySamirSadek) - Developer

<img align="left" width="40" height="40" src="https://avatars2.githubusercontent.com/u/7483806?s=40&u=99b3958687789735c12cf736332361a06b951355&v=4">
Fady is a front-end developer who loves all things JavaScript and enjoys solving real world problems using the web platform and helping other developers do the same. He currently leads maintenance of the project and ensures that the project is friendly for new contributors and upcoming developers.

#### [Gianni Chiappetta](https://github.com/gf3) - Logo designer

<img align="left" width="40" height="40" src="https://www.gravatar.com/avatar/4b0209ae3652cc5a7d53545e759fbe39.png?s=40">
Gianni is a programmer and designer currently working as the Chief Rigger at MetaLab.

## Disclaimer

<img align="right" width="230" height="230" src="media/icon-small.png">

TodoMVC has been called many things including the 'Speed-dating' and 'Rosetta Stone' of MV\* frameworks. Whilst we hope that this project can offer assistance in deciding what frameworks are worth spending more time looking at, remember that the Todo application offers a limited view of a framework's potential capability.

It is meant to be used as a gateway to reviewing how a basic application using a framework may be structured, and we heavily recommend investing time researching a solution in more depth before opting to use it.

Also, please keep in mind that TodoMVC is not the perfect way to compare the size of different frameworks. We intentionally use the unminified versions to make reading the source code easier.


## Getting Involved

Whilst we enjoy implementing and improving existing Todo apps, we're always interested in speaking to framework authors (and users) wishing to share Todo app implementations in their framework/solution of choice.

Check out our [contribution docs](contributing.md) for more info.


## License

Everything in this repo is MIT License unless otherwise specified.

[MIT](license.md) © Addy Osmani, Sindre Sorhus, Pascal Hartig, Stephen Sawchuk.
<p align="center"><a href="https://vuejs.org" target="_blank"><img width="100"src="https://vuejs.org/images/logo.png"></a></p>

<p align="center">
  <a href="https://circleci.com/gh/vuejs/vue/tree/dev"><img src="https://img.shields.io/circleci/project/vuejs/vue/dev.svg" alt="Build Status"></a>
  <a href="https://codecov.io/github/vuejs/vue?branch=dev"><img src="https://img.shields.io/codecov/c/github/vuejs/vue/dev.svg" alt="Coverage Status"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/dm/vue.svg" alt="Downloads"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/v/vue.svg" alt="Version"></a>
  <a href="https://www.npmjs.com/package/vue"><img src="https://img.shields.io/npm/l/vue.svg" alt="License"></a>
  <a href="https://chat.vuejs.org/"><img src="https://img.shields.io/badge/chat-on%20discord-7289da.svg" alt="Chat">
  <br>
  <a href="https://saucelabs.com/u/vuejs"><img src="https://saucelabs.com/browser-matrix/vuejs.svg" alt="Sauce Test Status"></a>
</p>

<h2 align="center">Supporting Vue.js</h2>

Vue.js is an MIT-licensed open source project. It's an independent project with its ongoing development made possible entirely thanks to the support by these awesome [backers](https://github.com/vuejs/vue/blob/dev/BACKERS.md). If you'd like to join them, please consider:

- [Become a backer or sponsor on Patreon](https://www.patreon.com/evanyou).
- [Become a backer or sponsor on OpenCollective](https://opencollective.com/vuejs).

#### What's the difference between Patreon and OpenCollective?

Funds donated via Patreon goes directly to support Evan You's full-time work on Vue.js. Funds donated via OpenCollective are managed with transparent expenses and will be used for compensating work and expenses by core team members or sponsoring community events. Your name/logo will receive proper recognition and exposure by donating on either platform.

<h3 align="center">Sponsors via Patreon</h3>

<h4 align="center">Platinum</h4>

<p align="center">
  <a href="https://stdlib.com">
    <img width="240px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/stdlib.png">
  </a>
  <br><br>
  <a href="https://xiaozhuanlan.com">
    <img width="160px" src="https://raw.githubusercontent.com/vuejs/cn.vuejs.org/master/themes/vue/source/images/xiaozhuanlan.png">
  </a>
</p>

<h4 align="center">Gold</h4>

<table>
  <tbody>
    <tr>
      <td align="center" valign="middle">
        <a href="https://deepstreamhub.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/deepstream.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://jsfiddle.net/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/jsfiddle.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://laravel.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/laravel.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://chaitin.cn/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/chaitin.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://htmlburger.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/htmlburger.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://starter.someline.com/">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/someline.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="http://monterail.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/monterail.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.2mhost.com/" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/2mhost.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://vuejsjob.com/?ref=vuejs" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/vuejobs.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://leanpub.com/vuejs2" target="_blank">
          <img width="120px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tmvuejs2.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://component.io/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/component_io.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://www.v2ex.com/t/379389" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/v2exer.png">
        </a>
      </td>
    </tr>
    <tr></tr>
    <tr>
      <td align="center" valign="middle">
        <a href="https://www.xfive.co/" target="_blank">
          <img width="80px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/xfive.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://www.frontenddevelopermeetups.com/" target="_blank">
          <img width="160px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/frontend-meetups.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="https://onsen.io/vue/" target="_blank">
          <img width="130px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/onsen-ui.png">
        </a>
      </td>
      <td align="center" valign="middle">
        <a href="http://tooltwist.com" target="_blank">
          <img width="140px" src="https://raw.githubusercontent.com/vuejs/vuejs.org/master/themes/vue/source/images/tooltwist.png">
        </a>
      </td>
    </tr>
  </tbody>
</table>

<h3 align="center">Sponsors via OpenCollective</h3>

<h4 align="center">Platinum</h4>

<a href="https://opencollective.com/vuejs/platinumsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/platinumsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/platinumsponsor/1/avatar.svg"></a>

<h4 align="center">Gold</h4>

<a href="https://opencollective.com/vuejs/goldsponsor/0/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/bronzesponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/bronzesponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/1/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/2/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/2/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/3/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/3/avatar.svg"></a>
<a href="https://opencollective.com/vuejs/goldsponsor/4/website" target="_blank"><img src="https://opencollective.com/vuejs/goldsponsor/4
  /avatar.svg"></a>

---

## Introduction

Vue (pronounced `/vjuː/`, like view) is a **progressive framework** for building user interfaces. It is designed from the ground up to be incrementally adoptable, and can easily scale between a library and a framework depending on different use cases. It consists of an approachable core library that focuses on the view layer only, and an ecosystem of supporting libraries that helps you tackle complexity in large Single-Page Applications.

#### Browser Compatibility

Vue.js supports all browsers that are [ES5-compliant](http://kangax.github.io/compat-table/es5/) (IE8 and below are not supported).

## Ecosystem

| Project | Status | Description |
|---------|--------|-------------|
| [vue-router]          | [![vue-router-status]][vue-router-package] | Single-page application routing |
| [vuex]                | [![vuex-status]][vuex-package] | Large-scale state management |
| [vue-cli]             | [![vue-cli-status]][vue-cli-package] | Project scaffolding |
| [vue-loader]          | [![vue-loader-status]][vue-loader-package] | Single File Component (`*.vue` file) loader for webpack |
| [vue-server-renderer] | [![vue-server-renderer-status]][vue-server-renderer-package] | Server-side rendering support |
| [vue-class-component] | [![vue-class-component-status]][vue-class-component-package] | TypeScript decorator for a class-based API |
| [vue-rx]              | [![vue-rx-status]][vue-rx-package] | RxJS integration |
| [vue-devtools]        | [![vue-devtools-status]][vue-devtools-package] | Browser DevTools extension |

[vue-router]: https://github.com/vuejs/vue-router
[vuex]: https://github.com/vuejs/vuex
[vue-cli]: https://github.com/vuejs/vue-cli
[vue-loader]: https://github.com/vuejs/vue-loader
[vue-server-renderer]: https://github.com/vuejs/vue/tree/dev/packages/vue-server-renderer
[vue-class-component]: https://github.com/vuejs/vue-class-component
[vue-rx]: https://github.com/vuejs/vue-rx
[vue-devtools]:  https://github.com/vuejs/vue-devtools

[vue-router-status]: https://img.shields.io/npm/v/vue-router.svg
[vuex-status]: https://img.shields.io/npm/v/vuex.svg
[vue-cli-status]: https://img.shields.io/npm/v/vue-cli.svg
[vue-loader-status]: https://img.shields.io/npm/v/vue-loader.svg
[vue-server-renderer-status]: https://img.shields.io/npm/v/vue-server-renderer.svg
[vue-class-component-status]: https://img.shields.io/npm/v/vue-class-component.svg
[vue-rx-status]: https://img.shields.io/npm/v/vue-rx.svg
[vue-devtools-status]: https://img.shields.io/chrome-web-store/v/nhdogjmejiglipccpnnnanhbledajbpd.svg

[vue-router-package]: https://npmjs.com/package/vue-router
[vuex-package]: https://npmjs.com/package/vuex
[vue-cli-package]: https://npmjs.com/package/vue-cli
[vue-loader-package]: https://npmjs.com/package/vue-loader
[vue-server-renderer-package]: https://npmjs.com/package/vue-server-renderer
[vue-class-component-package]: https://npmjs.com/package/vue-class-component
[vue-rx-package]: https://npmjs.com/package/vue-rx
[vue-devtools-package]: https://chrome.google.com/webstore/detail/vuejs-devtools/nhdogjmejiglipccpnnnanhbledajbpd

## Documentation

To check out live examples and docs, visit [vuejs.org](https://vuejs.org).

## Questions

For questions and support please use the [the official forum](http://forum.vuejs.org) or [community chat](https://chat.vuejs.org/). The issue list of this repo is **exclusively** for bug reports and feature requests.

## Issues

Please make sure to read the [Issue Reporting Checklist](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md#issue-reporting-guidelines) before opening an issue. Issues not conforming to the guidelines may be closed immediately.

## Changelog

Detailed changes for each release are documented in the [release notes](https://github.com/vuejs/vue/releases).

## Stay In Touch

- [Twitter](https://twitter.com/vuejs)
- [Blog](https://medium.com/the-vue-point)
- [Job Board](https://vuejobs.com/?ref=vuejs)

## Contribution

Please make sure to read the [Contributing Guide](https://github.com/vuejs/vue/blob/dev/.github/CONTRIBUTING.md) before making a pull request. If you have a Vue-related project/component/tool, add it with a pull-request to [this curated list](https://github.com/vuejs/awesome-vue)!

Thank you to all the people who already contributed to Vue!

<a href="https://github.com/vuejs/vue/graphs/contributors"><img src="https://opencollective.com/vuejs/contributors.svg?width=890" /></a>


## License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2013-present, Yuxi (Evan) You
