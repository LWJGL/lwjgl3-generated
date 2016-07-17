/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This is a minimal state immediate mode graphical user interface single header toolkit written in ANSI C and licensed under public domain. It was
 * designed as a simple embeddable user interface for application and does not have any dependencies, a default renderbackend or OS window and input
 * handling but instead provides a very modular library approach by using simple input state for input and draw commands describing primitive shapes as
 * output. So instead of providing a layered library that tries to abstract over a number of platform and render backends it only focuses on the actual
 * UI.
 * 
 * <h3>VALUES</h3>
 * 
 * <ul>
 * <li>Immediate mode graphical user interface toolkit</li>
 * <li>Single header library</li>
 * <li>Written in C89 (ANSI C)</li>
 * <li>Small codebase (~15kLOC)</li>
 * <li>Focus on portability, efficiency and simplicity</li>
 * <li>No dependencies (not even the standard library if not wanted)</li>
 * <li>Fully skinnable and customizable</li>
 * <li>Low memory footprint with total memory control if needed or wanted</li>
 * <li>UTF-8 support</li>
 * <li>No global or hidden state</li>
 * <li>Customizable library modules (you can compile and use only what you need)</li>
 * <li>Optional font baker and vertex buffer output</li>
 * </ul>
 * 
 * <h3>FEATURES</h3>
 * 
 * <ul>
 * <li>Absolutely no platform dependent code</li>
 * <li>Memory management control ranging from/to</li>
 * <li>Ease of use by allocating everything from the standard library</li>
 * <li>Control every byte of memory inside the library</li>
 * <li>Font handling control ranging from/to</li>
 * <li>Use your own font implementation to draw shapes/vertexes</li>
 * <li>Use this libraries internal font baking and handling API</li>
 * <li>Drawing output control ranging from/to</li>
 * <li>Simple shapes for more high level APIs which already having drawing capabilities</li>
 * <li>Hardware accessible anti-aliased vertex buffer output</li>
 * <li>Customizable colors and properties ranging from/to</li>
 * <li>Simple changes to color by filling a simple color table</li>
 * <li>Complete control with ability to use skinning to decorate widgets</li>
 * <li>Bendable UI library with widget ranging from/to</li>
 * <li>Basic widgets like buttons, checkboxes, slider, ...</li>
 * <li>Advanced widget like abstract comboboxes, contextual menus,...</li>
 * <li>Compile time configuration to only compile what you need</li>
 * <li>Subset which can be used if you do not want to link or use the standard library</li>
 * <li>Can be easily modified only update on user input instead of frame updates</li>
 * </ul>
 */
public class Nuklear {

	/** Constants. */
	public static final int
		NK_UTF_INVALID       = 0xFFFD,
		NK_UTF_SIZE          = 4,
		NK_INPUT_MAX         = 16,
		NK_MAX_NUMBER_BUFFER = 64;

	/** Boolean values. */
	public static final int
		nk_false = 0,
		nk_true  = 1;

	/** nk_heading */
	public static final int
		NK_UP    = 0,
		NK_RIGHT = 1,
		NK_DOWN  = 2,
		NK_LEFT  = 3;

	/** nk_button_behavior */
	public static final int
		NK_BUTTON_DEFAULT  = 0,
		NK_BUTTON_REPEATER = 1;

	/** nk_modify */
	public static final int
		NK_FIXED      = nk_false,
		NK_MODIFIABLE = nk_true;

	/** nk_orientation */
	public static final int
		NK_VERTICAL   = 0,
		NK_HORIZONTAL = 1;

	/** nk_collapse_states */
	public static final int
		NK_MINIMIZED = nk_false,
		NK_MAXIMIZED = nk_true;

	/** nk_show_states */
	public static final int
		NK_HIDDEN = nk_false,
		NK_SHOWN  = nk_true;

	/** nk_chart_type */
	public static final int
		NK_CHART_LINES  = 0,
		NK_CHART_COLUMN = 1,
		NK_CHART_MAX    = 2;

	/** nk_chart_event */
	public static final int
		NK_CHART_HOVERING = 0x1,
		NK_CHART_CLICKED  = 0x2;

	/** nk_color_format */
	public static final int
		NK_RGB  = 0,
		NK_RGBA = 1;

	/** nk_popup_type */
	public static final int
		NK_POPUP_STATIC  = 0,
		NK_POPUP_DYNAMIC = 1;

	/** nk_layout_format */
	public static final int
		NK_DYNAMIC = 0,
		NK_STATIC  = 1;

	/** nk_tree_type */
	public static final int
		NK_TREE_NODE = 0,
		NK_TREE_TAB  = 1;

	/** nk_anti_aliasing */
	public static final int
		NK_ANTI_ALIASING_OFF = 0,
		NK_ANTI_ALIASING_ON  = 1;

	/** nk_symbol_type */
	public static final int
		NK_SYMBOL_NONE           = 0,
		NK_SYMBOL_X              = 1,
		NK_SYMBOL_UNDERSCORE     = 2,
		NK_SYMBOL_CIRCLE         = 3,
		NK_SYMBOL_CIRCLE_FILLED  = 4,
		NK_SYMBOL_RECT           = 5,
		NK_SYMBOL_RECT_FILLED    = 6,
		NK_SYMBOL_TRIANGLE_UP    = 7,
		NK_SYMBOL_TRIANGLE_DOWN  = 8,
		NK_SYMBOL_TRIANGLE_LEFT  = 9,
		NK_SYMBOL_TRIANGLE_RIGHT = 10,
		NK_SYMBOL_PLUS           = 11,
		NK_SYMBOL_MINUS          = 12,
		NK_SYMBOL_MAX            = 13;

	/** nk_keys */
	public static final int
		NK_KEY_NONE              = 0,
		NK_KEY_SHIFT             = 1,
		NK_KEY_CTRL              = 2,
		NK_KEY_DEL               = 3,
		NK_KEY_ENTER             = 4,
		NK_KEY_TAB               = 5,
		NK_KEY_BACKSPACE         = 6,
		NK_KEY_COPY              = 7,
		NK_KEY_CUT               = 8,
		NK_KEY_PASTE             = 9,
		NK_KEY_UP                = 10,
		NK_KEY_DOWN              = 11,
		NK_KEY_LEFT              = 12,
		NK_KEY_RIGHT             = 13,
		NK_KEY_TEXT_INSERT_MODE  = 14,
		NK_KEY_TEXT_REPLACE_MODE = 15,
		NK_KEY_TEXT_RESET_MODE   = 16,
		NK_KEY_TEXT_LINE_START   = 17,
		NK_KEY_TEXT_LINE_END     = 18,
		NK_KEY_TEXT_START        = 19,
		NK_KEY_TEXT_END          = 20,
		NK_KEY_TEXT_UNDO         = 21,
		NK_KEY_TEXT_REDO         = 22,
		NK_KEY_TEXT_WORD_LEFT    = 23,
		NK_KEY_TEXT_WORD_RIGHT   = 24,
		NK_KEY_SCROLL_START      = 25,
		NK_KEY_SCROLL_END        = 26,
		NK_KEY_SCROLL_DOWN       = 27,
		NK_KEY_SCROLL_UP         = 28,
		NK_KEY_MAX               = 29;

	/** nk_buttons */
	public static final int
		NK_BUTTON_LEFT   = 0,
		NK_BUTTON_MIDDLE = 1,
		NK_BUTTON_RIGHT  = 2,
		NK_BUTTON_MAX    = 3;

	/** nk_style_colors */
	public static final int
		NK_COLOR_TEXT                    = 0,
		NK_COLOR_WINDOW                  = 1,
		NK_COLOR_HEADER                  = 2,
		NK_COLOR_BORDER                  = 3,
		NK_COLOR_BUTTON                  = 4,
		NK_COLOR_BUTTON_HOVER            = 5,
		NK_COLOR_BUTTON_ACTIVE           = 6,
		NK_COLOR_TOGGLE                  = 7,
		NK_COLOR_TOGGLE_HOVER            = 8,
		NK_COLOR_TOGGLE_CURSOR           = 9,
		NK_COLOR_SELECT                  = 10,
		NK_COLOR_SELECT_ACTIVE           = 11,
		NK_COLOR_SLIDER                  = 12,
		NK_COLOR_SLIDER_CURSOR           = 13,
		NK_COLOR_SLIDER_CURSOR_HOVER     = 14,
		NK_COLOR_SLIDER_CURSOR_ACTIVE    = 15,
		NK_COLOR_PROPERTY                = 16,
		NK_COLOR_EDIT                    = 17,
		NK_COLOR_EDIT_CURSOR             = 18,
		NK_COLOR_COMBO                   = 19,
		NK_COLOR_CHART                   = 20,
		NK_COLOR_CHART_COLOR             = 21,
		NK_COLOR_CHART_COLOR_HIGHLIGHT   = 22,
		NK_COLOR_SCROLLBAR               = 23,
		NK_COLOR_SCROLLBAR_CURSOR        = 24,
		NK_COLOR_SCROLLBAR_CURSOR_HOVER  = 25,
		NK_COLOR_SCROLLBAR_CURSOR_ACTIVE = 26,
		NK_COLOR_TAB_HEADER              = 27,
		NK_COLOR_COUNT                   = 28;

	/** nk_style_cursor */
	public static final int
		NK_CURSOR_ARROW                      = 0,
		NK_CURSOR_TEXT                       = 1,
		NK_CURSOR_MOVE                       = 2,
		NK_CURSOR_RESIZE_VERTICAL            = 3,
		NK_CURSOR_RESIZE_HORIZONTAL          = 4,
		NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT = 5,
		NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT = 6,
		NK_CURSOR_COUNT                      = 7;

	/** The widget cannot be seen and is completely out of view */
	public static final int NK_WIDGET_INVALID = 0;

	/** The widget is completely inside the window and can be updated and drawn */
	public static final int NK_WIDGET_VALID = 1;

	/** The widget is partially visible and cannot be updated */
	public static final int NK_WIDGET_ROM = 2;

	/** nk_widget_states */
	public static final int NK_WIDGET_STATE_MODIFIED = 1 << 1;

	/** widget is neither active nor hovered */
	public static final int NK_WIDGET_STATE_INACTIVE = 1 << 2;

	/** widget has been hovered on the current frame */
	public static final int NK_WIDGET_STATE_ENTERED = 1 << 3;

	/** widget is being hovered */
	public static final int NK_WIDGET_STATE_HOVER = 1 << 4;

	/** widget is currently activated */
	public static final int NK_WIDGET_STATE_ACTIVED = 1 << 5;

	/** widget is from this frame on not hovered anymore */
	public static final int NK_WIDGET_STATE_LEFT = 1 << 6;

	/** widget is being hovered */
	public static final int NK_WIDGET_STATE_HOVERED = NK_WIDGET_STATE_HOVER|NK_WIDGET_STATE_MODIFIED;

	/** widget is currently activated */
	public static final int NK_WIDGET_STATE_ACTIVE = NK_WIDGET_STATE_ACTIVED|NK_WIDGET_STATE_MODIFIED;

	/** nk_text_align */
	public static final int
		NK_TEXT_ALIGN_LEFT     = 0x1,
		NK_TEXT_ALIGN_CENTERED = 0x2,
		NK_TEXT_ALIGN_RIGHT    = 0x4,
		NK_TEXT_ALIGN_TOP      = 0x8,
		NK_TEXT_ALIGN_MIDDLE   = 0x10,
		NK_TEXT_ALIGN_BOTTOM   = 0x20;

	/** nk_text_alignment */
	public static final int
		NK_TEXT_LEFT     = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_LEFT,
		NK_TEXT_CENTERED = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_CENTERED,
		NK_TEXT_RIGHT    = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_RIGHT;

	/** nk_edit_flags */
	public static final int
		NK_EDIT_DEFAULT              = 0x0,
		NK_EDIT_READ_ONLY            = 1 << 0,
		NK_EDIT_AUTO_SELECT          = 1 << 1,
		NK_EDIT_SIG_ENTER            = 1 << 2,
		NK_EDIT_ALLOW_TAB            = 1 << 3,
		NK_EDIT_NO_CURSOR            = 1 << 4,
		NK_EDIT_SELECTABLE           = 1 << 5,
		NK_EDIT_CLIPBOARD            = 1 << 6,
		NK_EDIT_CTRL_ENTER_NEWLINE   = 1 << 7,
		NK_EDIT_NO_HORIZONTAL_SCROLL = 1 << 8,
		NK_EDIT_ALWAYS_INSERT_MODE   = 1 << 9,
		NK_EDIT_MULTILINE            = 1 << 11;

	/** nk_edit_types */
	public static final int
		NK_EDIT_SIMPLE = NK_EDIT_ALWAYS_INSERT_MODE,
		NK_EDIT_FIELD  = NK_EDIT_SIMPLE|NK_EDIT_SELECTABLE,
		NK_EDIT_BOX    = NK_EDIT_ALWAYS_INSERT_MODE|NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB,
		NK_EDIT_EDITOR = NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD;

	/** edit widget is currently being modified */
	public static final int NK_EDIT_ACTIVE = 1 << 0;

	/** edit widget is not active and is not being modified */
	public static final int NK_EDIT_INACTIVE = 1 << 1;

	/** edit widget went from state inactive to state active */
	public static final int NK_EDIT_ACTIVATED = 1 << 2;

	/** edit widget went from state active to state inactive */
	public static final int NK_EDIT_DEACTIVATED = 1 << 3;

	/** edit widget has received an enter and lost focus */
	public static final int NK_EDIT_COMMITED = 1 << 4;

	/** Draws a border around the window to visually separate the window * from the background */
	public static final int NK_WINDOW_BORDER = 1 << 0;

	/** Draws a border between window header and body */
	public static final int NK_WINDOW_BORDER_HEADER = 1 << 1;

	/** The movable flag indicates that a window can be moved by user input or * by dragging the window header */
	public static final int NK_WINDOW_MOVABLE = 1 << 2;

	/** The scalable flag indicates that a window can be scaled by user input * by dragging a scaler icon at the button of the window */
	public static final int NK_WINDOW_SCALABLE = 1 << 3;

	/** adds a closable icon into the header */
	public static final int NK_WINDOW_CLOSABLE = 1 << 4;

	/** adds a minimize icon into the header */
	public static final int NK_WINDOW_MINIMIZABLE = 1 << 5;

	/** special window type growing up in height while being filled to a * certain maximum height */
	public static final int NK_WINDOW_DYNAMIC = 1 << 6;

	/** Removes the scrollbar from the window */
	public static final int NK_WINDOW_NO_SCROLLBAR = 1 << 7;

	/** Forces a header at the top at the window showing the title */
	public static final int NK_WINDOW_TITLE = 1 << 8;

	/** nk_allocation_type */
	public static final int
		NK_BUFFER_FIXED   = 0,
		NK_BUFFER_DYNAMIC = 1;

	/** nk_buffer_allocation_type */
	public static final int
		NK_BUFFER_FRONT = 0,
		NK_BUFFER_BACK  = 1,
		NK_BUFFER_MAX   = 2;

	/** nk_text_edit_type */
	public static final int
		NK_TEXT_EDIT_SINGLE_LINE = 0,
		NK_TEXT_EDIT_MULTI_LINE  = 1;

	/** nk_text_edit_mode */
	public static final int
		NK_TEXT_EDIT_MODE_VIEW    = 0,
		NK_TEXT_EDIT_MODE_INSERT  = 1,
		NK_TEXT_EDIT_MODE_REPLACE = 2;

	/** texture coordinates inside font glyphs are clamped between 0-1 */
	public static final int NK_COORD_UV = 0;

	/** texture coordinates inside font glyphs are in absolute pixel */
	public static final int NK_COORD_PIXEL = 1;

	/** nk_font_atlas_format */
	public static final int
		NK_FONT_ATLAS_ALPHA8 = 0,
		NK_FONT_ATLAS_RGBA32 = 1;

	/** nk_command_type */
	public static final int
		NK_COMMAND_NOP              = 0,
		NK_COMMAND_SCISSOR          = 1,
		NK_COMMAND_LINE             = 2,
		NK_COMMAND_CURVE            = 3,
		NK_COMMAND_RECT             = 4,
		NK_COMMAND_RECT_FILLED      = 5,
		NK_COMMAND_RECT_MULTI_COLOR = 6,
		NK_COMMAND_CIRCLE           = 7,
		NK_COMMAND_CIRCLE_FILLED    = 8,
		NK_COMMAND_ARC              = 9,
		NK_COMMAND_ARC_FILLED       = 10,
		NK_COMMAND_TRIANGLE         = 11,
		NK_COMMAND_TRIANGLE_FILLED  = 12,
		NK_COMMAND_POLYGON          = 13,
		NK_COMMAND_POLYGON_FILLED   = 14,
		NK_COMMAND_POLYLINE         = 15,
		NK_COMMAND_TEXT             = 16,
		NK_COMMAND_IMAGE            = 17;

	/** nk_command_clipping */
	public static final int
		NK_CLIPPING_OFF = nk_false,
		NK_CLIPPING_ON  = nk_true;

	/** build up path has no connection back to the beginning */
	public static final int NK_STROKE_OPEN = nk_false;

	/** build up path has a connection back to the beginning */
	public static final int NK_STROKE_CLOSED = nk_true;

	/** nk_style_item_type */
	public static final int
		NK_STYLE_ITEM_COLOR = 0,
		NK_STYLE_ITEM_IMAGE = 1;

	/** nk_style_header_align */
	public static final int
		NK_HEADER_LEFT  = 0,
		NK_HEADER_RIGHT = 1;

	/** dummy flag which mark the beginning of the private window flag part */
	public static final int NK_WINDOW_PRIVATE = 1 << 9;

	/** sets the window into a read only mode and does not allow input changes */
	public static final int NK_WINDOW_ROM = 1 << 10;

	/** Hides the window and stops any window interaction and drawing can be set by user input or by closing the window */
	public static final int NK_WINDOW_HIDDEN = 1 << 11;

	/** marks the window as minimized */
	public static final int NK_WINDOW_MINIMIZED = 1 << 12;

	/** Marks the window as subwindow of another window */
	public static final int NK_WINDOW_SUB = 1 << 13;

	/** Marks the window as window widget group */
	public static final int NK_WINDOW_GROUP = 1 << 14;

	/** Marks the window as a popup window */
	public static final int NK_WINDOW_POPUP = 1 << 15;

	/** Marks the window as a nonblock popup window */
	public static final int NK_WINDOW_NONBLOCK = 1 << 16;

	/** Marks the window as a combo box or menu */
	public static final int NK_WINDOW_CONTEXTUAL = 1 << 17;

	/** Marks the window as a combo box */
	public static final int NK_WINDOW_COMBO = 1 << 18;

	/** Marks the window as a menu */
	public static final int NK_WINDOW_MENU = 1 << 19;

	/** Marks the window as a menu */
	public static final int NK_WINDOW_TOOLTIP = 1 << 20;

	/** Removes the read only mode at the end of the window */
	public static final int NK_WINDOW_REMOVE_ROM = 1 << 21;

	static { Library.loadSystem("lwjgl_nuklear"); }

	static { MemoryUtil.getAllocator(); }

	protected Nuklear() {
		throw new UnsupportedOperationException();
	}

	// --- [ nk_init_fixed ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param memory 
	 * @param size   
	 * @param font   
	 */
	public static native int nnk_init_fixed(long ctx, long memory, long size, long font);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param memory 
	 * @param font   
	 */
	public static boolean nk_init_fixed(NkContext ctx, ByteBuffer memory, NkUserFont font) {
		return nnk_init_fixed(ctx.address(), memAddress(memory), (long)memory.remaining(), font == null ? NULL : font.address()) != 0;
	}

	// --- [ nk_init_custom ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param cmds 
	 * @param pool 
	 * @param font 
	 */
	public static native int nnk_init_custom(long ctx, long cmds, long pool, long font);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param cmds 
	 * @param pool 
	 * @param font 
	 */
	public static boolean nk_init_custom(NkContext ctx, NkBuffer cmds, NkBuffer pool, NkUserFont font) {
		return nnk_init_custom(ctx.address(), cmds.address(), pool.address(), font == null ? NULL : font.address()) != 0;
	}

	// --- [ nk_init ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param allocator 
	 * @param font      
	 */
	public static native int nnk_init(long ctx, long allocator, long font);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param allocator 
	 * @param font      
	 */
	public static boolean nk_init(NkContext ctx, NkAllocator allocator, NkUserFont font) {
		return nnk_init(ctx.address(), allocator.address(), font == null ? NULL : font.address()) != 0;
	}

	// --- [ nk_clear ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_clear(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_clear(NkContext ctx) {
		nnk_clear(ctx.address());
	}

	// --- [ nk_free ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_free(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_free(NkContext ctx) {
		nnk_free(ctx.address());
	}

	// --- [ nk_set_user_data ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param handle 
	 */
	public static native void nnk_set_user_data(long ctx, long handle);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param handle 
	 */
	public static void nk_set_user_data(NkContext ctx, NkHandle handle) {
		nnk_set_user_data(ctx.address(), handle == null ? NULL : handle.address());
	}

	// --- [ nk_begin ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param panel  
	 * @param title  
	 * @param bounds 
	 * @param flags  one or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_SUB WINDOW_SUB}</td><td>{@link #NK_WINDOW_GROUP WINDOW_GROUP}</td></tr><tr><td>{@link #NK_WINDOW_POPUP WINDOW_POPUP}</td><td>{@link #NK_WINDOW_NONBLOCK WINDOW_NONBLOCK}</td><td>{@link #NK_WINDOW_CONTEXTUAL WINDOW_CONTEXTUAL}</td><td>{@link #NK_WINDOW_COMBO WINDOW_COMBO}</td><td>{@link #NK_WINDOW_MENU WINDOW_MENU}</td><td>{@link #NK_WINDOW_TOOLTIP WINDOW_TOOLTIP}</td></tr><tr><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
	 */
	public static native int nnk_begin(long ctx, long panel, long title, long bounds, int flags);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param panel  
	 * @param title  
	 * @param bounds 
	 * @param flags  one or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_SUB WINDOW_SUB}</td><td>{@link #NK_WINDOW_GROUP WINDOW_GROUP}</td></tr><tr><td>{@link #NK_WINDOW_POPUP WINDOW_POPUP}</td><td>{@link #NK_WINDOW_NONBLOCK WINDOW_NONBLOCK}</td><td>{@link #NK_WINDOW_CONTEXTUAL WINDOW_CONTEXTUAL}</td><td>{@link #NK_WINDOW_COMBO WINDOW_COMBO}</td><td>{@link #NK_WINDOW_MENU WINDOW_MENU}</td><td>{@link #NK_WINDOW_TOOLTIP WINDOW_TOOLTIP}</td></tr><tr><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
	 */
	public static boolean nk_begin(NkContext ctx, NkPanel panel, ByteBuffer title, NkRect bounds, int flags) {
		if ( CHECKS )
			checkNT1(title);
		return nnk_begin(ctx.address(), panel.address(), memAddress(title), bounds.address(), flags) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param panel  
	 * @param title  
	 * @param bounds 
	 * @param flags  one or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_SUB WINDOW_SUB}</td><td>{@link #NK_WINDOW_GROUP WINDOW_GROUP}</td></tr><tr><td>{@link #NK_WINDOW_POPUP WINDOW_POPUP}</td><td>{@link #NK_WINDOW_NONBLOCK WINDOW_NONBLOCK}</td><td>{@link #NK_WINDOW_CONTEXTUAL WINDOW_CONTEXTUAL}</td><td>{@link #NK_WINDOW_COMBO WINDOW_COMBO}</td><td>{@link #NK_WINDOW_MENU WINDOW_MENU}</td><td>{@link #NK_WINDOW_TOOLTIP WINDOW_TOOLTIP}</td></tr><tr><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
	 */
	public static boolean nk_begin(NkContext ctx, NkPanel panel, CharSequence title, NkRect bounds, int flags) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			return nnk_begin(ctx.address(), panel.address(), memAddress(titleEncoded), bounds.address(), flags) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_end(NkContext ctx) {
		nnk_end(ctx.address());
	}

	// --- [ nk_window_find ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static native long nnk_window_find(long ctx, long name);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static NkWindow nk_window_find(NkContext ctx, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		long __result = nnk_window_find(ctx.address(), memAddress(name));
		return NkWindow.create(__result);
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static NkWindow nk_window_find(NkContext ctx, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			long __result = nnk_window_find(ctx.address(), memAddress(nameEncoded));
			return NkWindow.create(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_get_bounds ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_window_get_bounds(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkRect nk_window_get_bounds(NkContext ctx, NkRect __result) {
		nnk_window_get_bounds(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_window_get_position ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_window_get_position(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkVec2 nk_window_get_position(NkContext ctx, NkVec2 __result) {
		nnk_window_get_position(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_window_get_size ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_window_get_size(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkVec2 nk_window_get_size(NkContext ctx, NkVec2 __result) {
		nnk_window_get_size(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_window_get_width ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native float nnk_window_get_width(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static float nk_window_get_width(NkContext ctx) {
		return nnk_window_get_width(ctx.address());
	}

	// --- [ nk_window_get_height ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native float nnk_window_get_height(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static float nk_window_get_height(NkContext ctx) {
		return nnk_window_get_height(ctx.address());
	}

	// --- [ nk_window_get_panel ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native long nnk_window_get_panel(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkPanel nk_window_get_panel(NkContext ctx) {
		long __result = nnk_window_get_panel(ctx.address());
		return NkPanel.create(__result);
	}

	// --- [ nk_window_get_content_region ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_window_get_content_region(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkRect nk_window_get_content_region(NkContext ctx, NkRect __result) {
		nnk_window_get_content_region(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_window_get_content_region_min ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_window_get_content_region_min(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkVec2 nk_window_get_content_region_min(NkContext ctx, NkVec2 __result) {
		nnk_window_get_content_region_min(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_window_get_content_region_max ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_window_get_content_region_max(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkVec2 nk_window_get_content_region_max(NkContext ctx, NkVec2 __result) {
		nnk_window_get_content_region_max(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_window_get_content_region_size ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_window_get_content_region_size(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkVec2 nk_window_get_content_region_size(NkContext ctx, NkVec2 __result) {
		nnk_window_get_content_region_size(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_window_get_canvas ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native long nnk_window_get_canvas(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkCommandBuffer nk_window_get_canvas(NkContext ctx) {
		long __result = nnk_window_get_canvas(ctx.address());
		return NkCommandBuffer.create(__result);
	}

	// --- [ nk_window_has_focus ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native int nnk_window_has_focus(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static boolean nk_window_has_focus(NkContext ctx) {
		return nnk_window_has_focus(ctx.address()) != 0;
	}

	// --- [ nk_window_is_collapsed ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static native int nnk_window_is_collapsed(long ctx, long name);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static boolean nk_window_is_collapsed(NkContext ctx, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nnk_window_is_collapsed(ctx.address(), memAddress(name)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static boolean nk_window_is_collapsed(NkContext ctx, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			return nnk_window_is_collapsed(ctx.address(), memAddress(nameEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_is_closed ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static native int nnk_window_is_closed(long ctx, long name);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static boolean nk_window_is_closed(NkContext ctx, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nnk_window_is_closed(ctx.address(), memAddress(name)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static boolean nk_window_is_closed(NkContext ctx, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			return nnk_window_is_closed(ctx.address(), memAddress(nameEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_is_active ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static native int nnk_window_is_active(long ctx, long name);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static boolean nk_window_is_active(NkContext ctx, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nnk_window_is_active(ctx.address(), memAddress(name)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static boolean nk_window_is_active(NkContext ctx, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			return nnk_window_is_active(ctx.address(), memAddress(nameEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_is_hovered ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native int nnk_window_is_hovered(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static boolean nk_window_is_hovered(NkContext ctx) {
		return nnk_window_is_hovered(ctx.address()) != 0;
	}

	// --- [ nk_window_is_any_hovered ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native int nnk_window_is_any_hovered(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static boolean nk_window_is_any_hovered(NkContext ctx) {
		return nnk_window_is_any_hovered(ctx.address()) != 0;
	}

	// --- [ nk_item_is_any_active ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native int nnk_item_is_any_active(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static boolean nk_item_is_any_active(NkContext ctx) {
		return nnk_item_is_any_active(ctx.address()) != 0;
	}

	// --- [ nk_window_set_bounds ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param bounds 
	 */
	public static native void nnk_window_set_bounds(long ctx, long bounds);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param bounds 
	 */
	public static void nk_window_set_bounds(NkContext ctx, NkRect bounds) {
		nnk_window_set_bounds(ctx.address(), bounds.address());
	}

	// --- [ nk_window_set_position ] ---

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param position 
	 */
	public static native void nnk_window_set_position(long ctx, long position);

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param position 
	 */
	public static void nk_window_set_position(NkContext ctx, NkVec2 position) {
		nnk_window_set_position(ctx.address(), position.address());
	}

	// --- [ nk_window_set_size ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param size 
	 */
	public static native void nnk_window_set_size(long ctx, long size);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param size 
	 */
	public static void nk_window_set_size(NkContext ctx, NkVec2 size) {
		nnk_window_set_size(ctx.address(), size.address());
	}

	// --- [ nk_window_set_title ] ---

	/**
	 * 
	 *
	 * @param ctx          the nuklear context
	 * @param title_to_set 
	 */
	public static native void nnk_window_set_title(long ctx, long title_to_set);

	/**
	 * 
	 *
	 * @param ctx          the nuklear context
	 * @param title_to_set 
	 */
	public static void nk_window_set_title(NkContext ctx, ByteBuffer title_to_set) {
		if ( CHECKS )
			checkNT1(title_to_set);
		nnk_window_set_title(ctx.address(), memAddress(title_to_set));
	}

	/**
	 * 
	 *
	 * @param ctx          the nuklear context
	 * @param title_to_set 
	 */
	public static void nk_window_set_title(NkContext ctx, CharSequence title_to_set) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer title_to_setEncoded = stack.UTF8(title_to_set);
			nnk_window_set_title(ctx.address(), memAddress(title_to_setEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_set_focus ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static native void nnk_window_set_focus(long ctx, long name);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static void nk_window_set_focus(NkContext ctx, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		nnk_window_set_focus(ctx.address(), memAddress(name));
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static void nk_window_set_focus(NkContext ctx, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_window_set_focus(ctx.address(), memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_close ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static native void nnk_window_close(long ctx, long name);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static void nk_window_close(NkContext ctx, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		nnk_window_close(ctx.address(), memAddress(name));
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 */
	public static void nk_window_close(NkContext ctx, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_window_close(ctx.address(), memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_collapse ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 * @param c    one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 */
	public static native void nnk_window_collapse(long ctx, long name, int c);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 * @param c    one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 */
	public static void nk_window_collapse(NkContext ctx, ByteBuffer name, int c) {
		if ( CHECKS )
			checkNT1(name);
		nnk_window_collapse(ctx.address(), memAddress(name), c);
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 * @param c    one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 */
	public static void nk_window_collapse(NkContext ctx, CharSequence name, int c) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_window_collapse(ctx.address(), memAddress(nameEncoded), c);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_window_show ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 * @param s    one of:<br><table><tr><td>{@link #NK_HIDDEN HIDDEN}</td><td>{@link #NK_SHOWN SHOWN}</td></tr></table>
	 */
	public static native void nnk_window_show(long ctx, long name, int s);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 * @param s    one of:<br><table><tr><td>{@link #NK_HIDDEN HIDDEN}</td><td>{@link #NK_SHOWN SHOWN}</td></tr></table>
	 */
	public static void nk_window_show(NkContext ctx, ByteBuffer name, int s) {
		if ( CHECKS )
			checkNT1(name);
		nnk_window_show(ctx.address(), memAddress(name), s);
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param name 
	 * @param s    one of:<br><table><tr><td>{@link #NK_HIDDEN HIDDEN}</td><td>{@link #NK_SHOWN SHOWN}</td></tr></table>
	 */
	public static void nk_window_show(NkContext ctx, CharSequence name, int s) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_window_show(ctx.address(), memAddress(nameEncoded), s);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_layout_row_dynamic ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param height 
	 * @param cols   
	 */
	public static native void nnk_layout_row_dynamic(long ctx, float height, int cols);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param height 
	 * @param cols   
	 */
	public static void nk_layout_row_dynamic(NkContext ctx, float height, int cols) {
		nnk_layout_row_dynamic(ctx.address(), height, cols);
	}

	// --- [ nk_layout_row_static ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param height     
	 * @param item_width 
	 * @param cols       
	 */
	public static native void nnk_layout_row_static(long ctx, float height, int item_width, int cols);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param height     
	 * @param item_width 
	 * @param cols       
	 */
	public static void nk_layout_row_static(NkContext ctx, float height, int item_width, int cols) {
		nnk_layout_row_static(ctx.address(), height, item_width, cols);
	}

	// --- [ nk_layout_row_begin ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param fmt        one of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
	 * @param row_height 
	 * @param cols       
	 */
	public static native void nnk_layout_row_begin(long ctx, int fmt, float row_height, int cols);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param fmt        one of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
	 * @param row_height 
	 * @param cols       
	 */
	public static void nk_layout_row_begin(NkContext ctx, int fmt, float row_height, int cols) {
		nnk_layout_row_begin(ctx.address(), fmt, row_height, cols);
	}

	// --- [ nk_layout_row_push ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param value 
	 */
	public static native void nnk_layout_row_push(long ctx, float value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param value 
	 */
	public static void nk_layout_row_push(NkContext ctx, float value) {
		nnk_layout_row_push(ctx.address(), value);
	}

	// --- [ nk_layout_row_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_layout_row_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_layout_row_end(NkContext ctx) {
		nnk_layout_row_end(ctx.address());
	}

	// --- [ nk_layout_row ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param fmt    one of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
	 * @param height 
	 * @param cols   
	 * @param ratio  
	 */
	public static native void nnk_layout_row(long ctx, int fmt, float height, int cols, long ratio);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param fmt    one of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
	 * @param height 
	 * @param cols   
	 * @param ratio  
	 */
	public static void nk_layout_row(NkContext ctx, int fmt, float height, int cols, FloatBuffer ratio) {
		nnk_layout_row(ctx.address(), fmt, height, cols, memAddress(ratio));
	}

	// --- [ nk_layout_space_begin ] ---

	/**
	 * 
	 *
	 * @param ctx          the nuklear context
	 * @param fmt          one of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
	 * @param height       
	 * @param widget_count 
	 */
	public static native void nnk_layout_space_begin(long ctx, int fmt, float height, int widget_count);

	/**
	 * 
	 *
	 * @param ctx          the nuklear context
	 * @param fmt          one of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
	 * @param height       
	 * @param widget_count 
	 */
	public static void nk_layout_space_begin(NkContext ctx, int fmt, float height, int widget_count) {
		nnk_layout_space_begin(ctx.address(), fmt, height, widget_count);
	}

	// --- [ nk_layout_space_push ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param rect 
	 */
	public static native void nnk_layout_space_push(long ctx, long rect);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param rect 
	 */
	public static void nk_layout_space_push(NkContext ctx, NkRect rect) {
		nnk_layout_space_push(ctx.address(), rect.address());
	}

	// --- [ nk_layout_space_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_layout_space_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_layout_space_end(NkContext ctx) {
		nnk_layout_space_end(ctx.address());
	}

	// --- [ nk_layout_space_bounds ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_layout_space_bounds(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkRect nk_layout_space_bounds(NkContext ctx, NkRect __result) {
		nnk_layout_space_bounds(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_layout_space_to_screen ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static native void nnk_layout_space_to_screen(long ctx, long ret);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static NkVec2 nk_layout_space_to_screen(NkContext ctx, NkVec2 ret) {
		nnk_layout_space_to_screen(ctx.address(), ret.address());
		return ret;
	}

	// --- [ nk_layout_space_to_local ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static native void nnk_layout_space_to_local(long ctx, long ret);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static NkVec2 nk_layout_space_to_local(NkContext ctx, NkVec2 ret) {
		nnk_layout_space_to_local(ctx.address(), ret.address());
		return ret;
	}

	// --- [ nk_layout_space_rect_to_screen ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static native void nnk_layout_space_rect_to_screen(long ctx, long ret);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static NkRect nk_layout_space_rect_to_screen(NkContext ctx, NkRect ret) {
		nnk_layout_space_rect_to_screen(ctx.address(), ret.address());
		return ret;
	}

	// --- [ nk_layout_space_rect_to_local ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static native void nnk_layout_space_rect_to_local(long ctx, long ret);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param ret 
	 */
	public static NkRect nk_layout_space_rect_to_local(NkContext ctx, NkRect ret) {
		nnk_layout_space_rect_to_local(ctx.address(), ret.address());
		return ret;
	}

	// --- [ nk_group_begin ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param title  
	 * @param flags  
	 */
	public static native int nnk_group_begin(long ctx, long layout, long title, int flags);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param title  
	 * @param flags  
	 */
	public static boolean nk_group_begin(NkContext ctx, NkPanel layout, ByteBuffer title, int flags) {
		if ( CHECKS )
			checkNT1(title);
		return nnk_group_begin(ctx.address(), layout.address(), memAddress(title), flags) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param title  
	 * @param flags  
	 */
	public static boolean nk_group_begin(NkContext ctx, NkPanel layout, CharSequence title, int flags) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			return nnk_group_begin(ctx.address(), layout.address(), memAddress(titleEncoded), flags) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_group_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_group_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_group_end(NkContext ctx) {
		nnk_group_end(ctx.address());
	}

	// --- [ nk_tree_push_hashed ] ---

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param type          one of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
	 * @param title         
	 * @param initial_state one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 * @param hash          
	 * @param len           
	 * @param seed          
	 */
	public static native int nnk_tree_push_hashed(long ctx, int type, long title, int initial_state, long hash, int len, int seed);

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param type          one of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
	 * @param title         
	 * @param initial_state one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 * @param hash          
	 * @param seed          
	 */
	public static boolean nk_tree_push_hashed(NkContext ctx, int type, ByteBuffer title, int initial_state, ByteBuffer hash, int seed) {
		if ( CHECKS )
			checkNT1(title);
		return nnk_tree_push_hashed(ctx.address(), type, memAddress(title), initial_state, memAddress(hash), hash.remaining(), seed) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param type          one of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
	 * @param title         
	 * @param initial_state one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 * @param hash          
	 * @param seed          
	 */
	public static boolean nk_tree_push_hashed(NkContext ctx, int type, CharSequence title, int initial_state, ByteBuffer hash, int seed) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			return nnk_tree_push_hashed(ctx.address(), type, memAddress(titleEncoded), initial_state, memAddress(hash), hash.remaining(), seed) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_tree_image_push_hashed ] ---

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param type          one of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
	 * @param img           
	 * @param title         
	 * @param initial_state one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 * @param hash          
	 * @param len           
	 * @param seed          
	 */
	public static native int nnk_tree_image_push_hashed(long ctx, int type, long img, long title, int initial_state, long hash, int len, int seed);

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param type          one of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
	 * @param img           
	 * @param title         
	 * @param initial_state one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 * @param hash          
	 * @param seed          
	 */
	public static boolean nk_tree_image_push_hashed(NkContext ctx, int type, NkImage img, ByteBuffer title, int initial_state, ByteBuffer hash, int seed) {
		if ( CHECKS )
			checkNT1(title);
		return nnk_tree_image_push_hashed(ctx.address(), type, img.address(), memAddress(title), initial_state, memAddress(hash), hash.remaining(), seed) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param type          one of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
	 * @param img           
	 * @param title         
	 * @param initial_state one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
	 * @param hash          
	 * @param seed          
	 */
	public static boolean nk_tree_image_push_hashed(NkContext ctx, int type, NkImage img, CharSequence title, int initial_state, CharSequence hash, int seed) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			ByteBuffer hashEncoded = stack.UTF8(hash, false);
			int hashEncodedLen = hashEncoded.capacity();
			return nnk_tree_image_push_hashed(ctx.address(), type, img.address(), memAddress(titleEncoded), initial_state, memAddress(hashEncoded), hashEncodedLen, seed) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_tree_pop ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_tree_pop(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_tree_pop(NkContext ctx) {
		nnk_tree_pop(ctx.address());
	}

	// --- [ nk_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param str       
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native void nnk_text(long ctx, long str, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param str       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static void nk_text(NkContext ctx, ByteBuffer str, int alignment) {
		nnk_text(ctx.address(), memAddress(str), str.remaining(), alignment);
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param str       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static void nk_text(NkContext ctx, CharSequence str, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			nnk_text(ctx.address(), memAddress(strEncoded), strEncodedLen, alignment);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_text_colored ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param str       
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param color     
	 */
	public static native void nnk_text_colored(long ctx, long str, int len, int alignment, long color);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param str       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param color     
	 */
	public static void nk_text_colored(NkContext ctx, ByteBuffer str, int alignment, NkColor color) {
		nnk_text_colored(ctx.address(), memAddress(str), str.remaining(), alignment, color.address());
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param str       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param color     
	 */
	public static void nk_text_colored(NkContext ctx, CharSequence str, int alignment, NkColor color) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			nnk_text_colored(ctx.address(), memAddress(strEncoded), strEncodedLen, alignment, color.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_text_wrap ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param str 
	 * @param len 
	 */
	public static native void nnk_text_wrap(long ctx, long str, int len);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param str 
	 */
	public static void nk_text_wrap(NkContext ctx, ByteBuffer str) {
		nnk_text_wrap(ctx.address(), memAddress(str), str.remaining());
	}

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param str 
	 */
	public static void nk_text_wrap(NkContext ctx, CharSequence str) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			nnk_text_wrap(ctx.address(), memAddress(strEncoded), strEncodedLen);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_text_wrap_colored ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param len   
	 * @param color 
	 */
	public static native void nnk_text_wrap_colored(long ctx, long str, int len, long color);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param color 
	 */
	public static void nk_text_wrap_colored(NkContext ctx, ByteBuffer str, NkColor color) {
		nnk_text_wrap_colored(ctx.address(), memAddress(str), str.remaining(), color.address());
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param color 
	 */
	public static void nk_text_wrap_colored(NkContext ctx, CharSequence str, NkColor color) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			nnk_text_wrap_colored(ctx.address(), memAddress(strEncoded), strEncodedLen, color.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native void nnk_label(long ctx, long str, int align);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static void nk_label(NkContext ctx, ByteBuffer str, int align) {
		if ( CHECKS )
			checkNT1(str);
		nnk_label(ctx.address(), memAddress(str), align);
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static void nk_label(NkContext ctx, CharSequence str, int align) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			nnk_label(ctx.address(), memAddress(strEncoded), align);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_label_colored ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param color 
	 */
	public static native void nnk_label_colored(long ctx, long str, int align, long color);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param color 
	 */
	public static void nk_label_colored(NkContext ctx, ByteBuffer str, int align, NkColor color) {
		if ( CHECKS )
			checkNT1(str);
		nnk_label_colored(ctx.address(), memAddress(str), align, color.address());
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param color 
	 */
	public static void nk_label_colored(NkContext ctx, CharSequence str, int align, NkColor color) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			nnk_label_colored(ctx.address(), memAddress(strEncoded), align, color.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_label_wrap ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param str 
	 */
	public static native void nnk_label_wrap(long ctx, long str);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param str 
	 */
	public static void nk_label_wrap(NkContext ctx, ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		nnk_label_wrap(ctx.address(), memAddress(str));
	}

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param str 
	 */
	public static void nk_label_wrap(NkContext ctx, CharSequence str) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			nnk_label_wrap(ctx.address(), memAddress(strEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_label_colored_wrap ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param color 
	 */
	public static native void nnk_label_colored_wrap(long ctx, long str, long color);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param color 
	 */
	public static void nk_label_colored_wrap(NkContext ctx, ByteBuffer str, NkColor color) {
		if ( CHECKS )
			checkNT1(str);
		nnk_label_colored_wrap(ctx.address(), memAddress(str), color.address());
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param color 
	 */
	public static void nk_label_colored_wrap(NkContext ctx, CharSequence str, NkColor color) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			nnk_label_colored_wrap(ctx.address(), memAddress(strEncoded), color.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_image ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param img 
	 */
	public static native void nnk_image(long ctx, long img);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param img 
	 */
	public static void nk_image(NkContext ctx, NkImage img) {
		nnk_image(ctx.address(), img.address());
	}

	// --- [ nk_button_set_behavior ] ---

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param behavior one of:<br><table><tr><td>{@link #NK_BUTTON_DEFAULT BUTTON_DEFAULT}</td><td>{@link #NK_BUTTON_REPEATER BUTTON_REPEATER}</td></tr></table>
	 */
	public static native void nnk_button_set_behavior(long ctx, int behavior);

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param behavior one of:<br><table><tr><td>{@link #NK_BUTTON_DEFAULT BUTTON_DEFAULT}</td><td>{@link #NK_BUTTON_REPEATER BUTTON_REPEATER}</td></tr></table>
	 */
	public static void nk_button_set_behavior(NkContext ctx, int behavior) {
		nnk_button_set_behavior(ctx.address(), behavior);
	}

	// --- [ nk_button_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param title 
	 * @param len   
	 */
	public static native int nnk_button_text(long ctx, long title, int len);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param title 
	 */
	public static boolean nk_button_text(NkContext ctx, ByteBuffer title) {
		return nnk_button_text(ctx.address(), memAddress(title), title.remaining()) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param title 
	 */
	public static boolean nk_button_text(NkContext ctx, CharSequence title) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title, false);
			int titleEncodedLen = titleEncoded.capacity();
			return nnk_button_text(ctx.address(), memAddress(titleEncoded), titleEncodedLen) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_button_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param title 
	 */
	public static native int nnk_button_label(long ctx, long title);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param title 
	 */
	public static boolean nk_button_label(NkContext ctx, ByteBuffer title) {
		if ( CHECKS )
			checkNT1(title);
		return nnk_button_label(ctx.address(), memAddress(title)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param title 
	 */
	public static boolean nk_button_label(NkContext ctx, CharSequence title) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			return nnk_button_label(ctx.address(), memAddress(titleEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_button_color ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param color 
	 */
	public static native int nnk_button_color(long ctx, long color);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param color 
	 */
	public static boolean nk_button_color(NkContext ctx, NkColor color) {
		return nnk_button_color(ctx.address(), color.address()) != 0;
	}

	// --- [ nk_button_symbol ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 */
	public static native int nnk_button_symbol(long ctx, int symbol);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 */
	public static boolean nk_button_symbol(NkContext ctx, int symbol) {
		return nnk_button_symbol(ctx.address(), symbol) != 0;
	}

	// --- [ nk_button_image ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param img 
	 */
	public static native int nnk_button_image(long ctx, long img);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param img 
	 */
	public static boolean nk_button_image(NkContext ctx, NkImage img) {
		return nnk_button_image(ctx.address(), img.address()) != 0;
	}

	// --- [ nk_button_symbol_label ] ---

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param symbol         one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text           
	 * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_button_symbol_label(long ctx, int symbol, long text, int text_alignment);

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param symbol         one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text           
	 * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_symbol_label(NkContext ctx, int symbol, ByteBuffer text, int text_alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_button_symbol_label(ctx.address(), symbol, memAddress(text), text_alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param symbol         one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text           
	 * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_symbol_label(NkContext ctx, int symbol, CharSequence text, int text_alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_button_symbol_label(ctx.address(), symbol, memAddress(textEncoded), text_alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_button_symbol_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_button_symbol_text(long ctx, int symbol, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_symbol_text(NkContext ctx, int symbol, ByteBuffer text, int alignment) {
		return nnk_button_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_symbol_text(NkContext ctx, int symbol, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_button_symbol_text(ctx.address(), symbol, memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_button_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param img            
	 * @param text           
	 * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_button_image_label(long ctx, long img, long text, int text_alignment);

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param img            
	 * @param text           
	 * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_image_label(NkContext ctx, NkImage img, ByteBuffer text, int text_alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_button_image_label(ctx.address(), img.address(), memAddress(text), text_alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param img            
	 * @param text           
	 * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_image_label(NkContext ctx, NkImage img, CharSequence text, int text_alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_button_image_label(ctx.address(), img.address(), memAddress(textEncoded), text_alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_button_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_button_image_text(long ctx, long img, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_image_text(NkContext ctx, NkImage img, ByteBuffer text, int alignment) {
		return nnk_button_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_button_image_text(NkContext ctx, NkImage img, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_button_image_text(ctx.address(), img.address(), memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_check_label ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static native int nnk_check_label(long ctx, long str, int active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_check_label(NkContext ctx, ByteBuffer str, boolean active) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_check_label(ctx.address(), memAddress(str), active ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_check_label(NkContext ctx, CharSequence str, boolean active) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_check_label(ctx.address(), memAddress(strEncoded), active ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_check_text ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param len    
	 * @param active 
	 */
	public static native int nnk_check_text(long ctx, long str, int len, int active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_check_text(NkContext ctx, ByteBuffer str, boolean active) {
		return nnk_check_text(ctx.address(), memAddress(str), str.remaining(), active ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_check_text(NkContext ctx, CharSequence str, boolean active) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_check_text(ctx.address(), memAddress(strEncoded), strEncodedLen, active ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_check_flags_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static native int nnk_check_flags_label(long ctx, long str, int flags, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static int nk_check_flags_label(NkContext ctx, ByteBuffer str, int flags, int value) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_check_flags_label(ctx.address(), memAddress(str), flags, value);
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static int nk_check_flags_label(NkContext ctx, CharSequence str, int flags, int value) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_check_flags_label(ctx.address(), memAddress(strEncoded), flags, value);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_check_flags_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param len   
	 * @param flags 
	 * @param value 
	 */
	public static native int nnk_check_flags_text(long ctx, long str, int len, int flags, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static int nk_check_flags_text(NkContext ctx, ByteBuffer str, int flags, int value) {
		return nnk_check_flags_text(ctx.address(), memAddress(str), str.remaining(), flags, value);
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static int nk_check_flags_text(NkContext ctx, CharSequence str, int flags, int value) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_check_flags_text(ctx.address(), memAddress(strEncoded), strEncodedLen, flags, value);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_checkbox_label ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static native int nnk_checkbox_label(long ctx, long str, long active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_checkbox_label(NkContext ctx, ByteBuffer str, IntBuffer active) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(active, 1);
		}
		return nnk_checkbox_label(ctx.address(), memAddress(str), memAddress(active)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_checkbox_label(NkContext ctx, CharSequence str, IntBuffer active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_checkbox_label(ctx.address(), memAddress(strEncoded), memAddress(active)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_checkbox_text ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param len    
	 * @param active 
	 */
	public static native int nnk_checkbox_text(long ctx, long str, int len, long active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_checkbox_text(NkContext ctx, ByteBuffer str, IntBuffer active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		return nnk_checkbox_text(ctx.address(), memAddress(str), str.remaining(), memAddress(active)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_checkbox_text(NkContext ctx, CharSequence str, IntBuffer active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_checkbox_text(ctx.address(), memAddress(strEncoded), strEncodedLen, memAddress(active)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_checkbox_flags_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static native int nnk_checkbox_flags_label(long ctx, long str, long flags, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static boolean nk_checkbox_flags_label(NkContext ctx, ByteBuffer str, IntBuffer flags, int value) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(flags, 1);
		}
		return nnk_checkbox_flags_label(ctx.address(), memAddress(str), memAddress(flags), value) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static boolean nk_checkbox_flags_label(NkContext ctx, CharSequence str, IntBuffer flags, int value) {
		if ( CHECKS )
			checkBuffer(flags, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_checkbox_flags_label(ctx.address(), memAddress(strEncoded), memAddress(flags), value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_checkbox_flags_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param len   
	 * @param flags 
	 * @param value 
	 */
	public static native int nnk_checkbox_flags_text(long ctx, long str, int len, long flags, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static boolean nk_checkbox_flags_text(NkContext ctx, ByteBuffer str, IntBuffer flags, int value) {
		if ( CHECKS )
			checkBuffer(flags, 1);
		return nnk_checkbox_flags_text(ctx.address(), memAddress(str), str.remaining(), memAddress(flags), value) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param flags 
	 * @param value 
	 */
	public static boolean nk_checkbox_flags_text(NkContext ctx, CharSequence str, IntBuffer flags, int value) {
		if ( CHECKS )
			checkBuffer(flags, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_checkbox_flags_text(ctx.address(), memAddress(strEncoded), strEncodedLen, memAddress(flags), value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_radio_label ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static native int nnk_radio_label(long ctx, long str, long active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_radio_label(NkContext ctx, ByteBuffer str, IntBuffer active) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(active, 1);
		}
		return nnk_radio_label(ctx.address(), memAddress(str), memAddress(active)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_radio_label(NkContext ctx, CharSequence str, IntBuffer active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_radio_label(ctx.address(), memAddress(strEncoded), memAddress(active)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_radio_text ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param len    
	 * @param active 
	 */
	public static native int nnk_radio_text(long ctx, long str, int len, long active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_radio_text(NkContext ctx, ByteBuffer str, IntBuffer active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		return nnk_radio_text(ctx.address(), memAddress(str), str.remaining(), memAddress(active)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_radio_text(NkContext ctx, CharSequence str, IntBuffer active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_radio_text(ctx.address(), memAddress(strEncoded), strEncodedLen, memAddress(active)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_option_label ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static native int nnk_option_label(long ctx, long str, int active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_option_label(NkContext ctx, ByteBuffer str, boolean active) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_option_label(ctx.address(), memAddress(str), active ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_option_label(NkContext ctx, CharSequence str, boolean active) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_option_label(ctx.address(), memAddress(strEncoded), active ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_option_text ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param len    
	 * @param active 
	 */
	public static native int nnk_option_text(long ctx, long str, int len, int active);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_option_text(NkContext ctx, ByteBuffer str, boolean active) {
		return nnk_option_text(ctx.address(), memAddress(str), str.remaining(), active ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param str    
	 * @param active 
	 */
	public static boolean nk_option_text(NkContext ctx, CharSequence str, boolean active) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_option_text(ctx.address(), memAddress(strEncoded), strEncodedLen, active ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_selectable_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_selectable_label(long ctx, long str, int align, long value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_label(NkContext ctx, ByteBuffer str, int align, IntBuffer value) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(value, 1);
		}
		return nnk_selectable_label(ctx.address(), memAddress(str), align, memAddress(value)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_label(NkContext ctx, CharSequence str, int align, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_selectable_label(ctx.address(), memAddress(strEncoded), align, memAddress(value)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_selectable_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param len   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_selectable_text(long ctx, long str, int len, int align, long value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_text(NkContext ctx, ByteBuffer str, int align, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return nnk_selectable_text(ctx.address(), memAddress(str), str.remaining(), align, memAddress(value)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_text(NkContext ctx, CharSequence str, int align, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_selectable_text(ctx.address(), memAddress(strEncoded), strEncodedLen, align, memAddress(value)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_selectable_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_selectable_image_label(long ctx, long img, long str, int align, long value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_image_label(NkContext ctx, NkImage img, ByteBuffer str, int align, IntBuffer value) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(value, 1);
		}
		return nnk_selectable_image_label(ctx.address(), img == null ? NULL : img.address(), memAddress(str), align, memAddress(value)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_image_label(NkContext ctx, NkImage img, CharSequence str, int align, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_selectable_image_label(ctx.address(), img == null ? NULL : img.address(), memAddress(strEncoded), align, memAddress(value)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_selectable_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param len   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_selectable_image_text(long ctx, long img, long str, int len, int align, long value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_image_text(NkContext ctx, NkImage img, ByteBuffer str, int align, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return nnk_selectable_image_text(ctx.address(), img == null ? NULL : img.address(), memAddress(str), str.remaining(), align, memAddress(value)) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_selectable_image_text(NkContext ctx, NkImage img, CharSequence str, int align, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_selectable_image_text(ctx.address(), img == null ? NULL : img.address(), memAddress(strEncoded), strEncodedLen, align, memAddress(value)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_select_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_select_label(long ctx, long str, int align, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_label(NkContext ctx, ByteBuffer str, int align, boolean value) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_select_label(ctx.address(), memAddress(str), align, value ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_label(NkContext ctx, CharSequence str, int align, boolean value) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_select_label(ctx.address(), memAddress(strEncoded), align, value ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_select_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param len   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_select_text(long ctx, long str, int len, int align, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_text(NkContext ctx, ByteBuffer str, int align, boolean value) {
		return nnk_select_text(ctx.address(), memAddress(str), str.remaining(), align, value ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_text(NkContext ctx, CharSequence str, int align, boolean value) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_select_text(ctx.address(), memAddress(strEncoded), strEncodedLen, align, value ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_select_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_select_image_label(long ctx, long img, long str, int align, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_image_label(NkContext ctx, NkImage img, ByteBuffer str, int align, boolean value) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_select_image_label(ctx.address(), img == null ? NULL : img.address(), memAddress(str), align, value ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_image_label(NkContext ctx, NkImage img, CharSequence str, int align, boolean value) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_select_image_label(ctx.address(), img == null ? NULL : img.address(), memAddress(strEncoded), align, value ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_select_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param len   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static native int nnk_select_image_text(long ctx, long img, long str, int len, int align, int value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_image_text(NkContext ctx, NkImage img, ByteBuffer str, int align, boolean value) {
		return nnk_select_image_text(ctx.address(), img == null ? NULL : img.address(), memAddress(str), str.remaining(), align, value ? 1 : 0) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param img   
	 * @param str   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param value 
	 */
	public static boolean nk_select_image_text(NkContext ctx, NkImage img, CharSequence str, int align, boolean value) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_select_image_text(ctx.address(), img == null ? NULL : img.address(), memAddress(strEncoded), strEncodedLen, align, value ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_slide_float ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static native float nnk_slide_float(long ctx, float min, float val, float max, float step);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static float nk_slide_float(NkContext ctx, float min, float val, float max, float step) {
		return nnk_slide_float(ctx.address(), min, val, max, step);
	}

	// --- [ nk_slide_int ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static native int nnk_slide_int(long ctx, int min, int val, int max, int step);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static int nk_slide_int(NkContext ctx, int min, int val, int max, int step) {
		return nnk_slide_int(ctx.address(), min, val, max, step);
	}

	// --- [ nk_slider_float ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static native int nnk_slider_float(long ctx, float min, long val, float max, float step);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static int nk_slider_float(NkContext ctx, float min, FloatBuffer val, float max, float step) {
		return nnk_slider_float(ctx.address(), min, memAddress(val), max, step);
	}

	// --- [ nk_slider_int ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static native int nnk_slider_int(long ctx, int min, long val, int max, int step);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param min  
	 * @param val  
	 * @param max  
	 * @param step 
	 */
	public static int nk_slider_int(NkContext ctx, int min, IntBuffer val, int max, int step) {
		return nnk_slider_int(ctx.address(), min, memAddress(val), max, step);
	}

	// --- [ nk_progress ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param cur        
	 * @param max        
	 * @param modifyable 
	 */
	public static native int nnk_progress(long ctx, long cur, long max, int modifyable);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param cur        
	 * @param max        
	 * @param modifyable 
	 */
	public static boolean nk_progress(NkContext ctx, PointerBuffer cur, long max, boolean modifyable) {
		return nnk_progress(ctx.address(), memAddress(cur), max, modifyable ? 1 : 0) != 0;
	}

	// --- [ nk_prog ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param cur        
	 * @param max        
	 * @param modifyable 
	 */
	public static native long nnk_prog(long ctx, long cur, long max, int modifyable);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param cur        
	 * @param max        
	 * @param modifyable 
	 */
	public static long nk_prog(NkContext ctx, long cur, long max, boolean modifyable) {
		return nnk_prog(ctx.address(), cur, max, modifyable ? 1 : 0);
	}

	// --- [ nk_color_picker ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param color 
	 * @param fmt   one of:<br><table><tr><td>{@link #NK_RGB RGB}</td><td>{@link #NK_RGBA RGBA}</td></tr></table>
	 */
	public static native void nnk_color_picker(long ctx, long color, int fmt);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param color 
	 * @param fmt   one of:<br><table><tr><td>{@link #NK_RGB RGB}</td><td>{@link #NK_RGBA RGBA}</td></tr></table>
	 */
	public static NkColor nk_color_picker(NkContext ctx, NkColor color, int fmt) {
		nnk_color_picker(ctx.address(), color.address(), fmt);
		return color;
	}

	// --- [ nk_color_pick ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param color 
	 * @param fmt   one of:<br><table><tr><td>{@link #NK_RGB RGB}</td><td>{@link #NK_RGBA RGBA}</td></tr></table>
	 */
	public static native int nnk_color_pick(long ctx, long color, int fmt);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param color 
	 * @param fmt   one of:<br><table><tr><td>{@link #NK_RGB RGB}</td><td>{@link #NK_RGBA RGBA}</td></tr></table>
	 */
	public static boolean nk_color_pick(NkContext ctx, NkColor color, int fmt) {
		return nnk_color_pick(ctx.address(), color.address(), fmt) != 0;
	}

	// --- [ nk_property_float ] ---

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static native void nnk_property_float(long ctx, long name, float min, long val, float max, float step, float inc_per_pixel);

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static void nk_property_float(NkContext ctx, ByteBuffer name, float min, FloatBuffer val, float max, float step, float inc_per_pixel) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(val, 1);
		}
		nnk_property_float(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
	}

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static void nk_property_float(NkContext ctx, CharSequence name, float min, FloatBuffer val, float max, float step, float inc_per_pixel) {
		if ( CHECKS )
			checkBuffer(val, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_property_float(ctx.address(), memAddress(nameEncoded), min, memAddress(val), max, step, inc_per_pixel);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_property_int ] ---

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static native void nnk_property_int(long ctx, long name, int min, long val, int max, int step, int inc_per_pixel);

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static void nk_property_int(NkContext ctx, ByteBuffer name, int min, IntBuffer val, int max, int step, int inc_per_pixel) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(val, 1);
		}
		nnk_property_int(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
	}

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static void nk_property_int(NkContext ctx, CharSequence name, int min, IntBuffer val, int max, int step, int inc_per_pixel) {
		if ( CHECKS )
			checkBuffer(val, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_property_int(ctx.address(), memAddress(nameEncoded), min, memAddress(val), max, step, inc_per_pixel);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_propertyf ] ---

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static native float nnk_propertyf(long ctx, long name, float min, float val, float max, float step, float inc_per_pixel);

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static float nk_propertyf(NkContext ctx, ByteBuffer name, float min, float val, float max, float step, float inc_per_pixel) {
		if ( CHECKS )
			checkNT1(name);
		return nnk_propertyf(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
	}

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static float nk_propertyf(NkContext ctx, CharSequence name, float min, float val, float max, float step, float inc_per_pixel) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			return nnk_propertyf(ctx.address(), memAddress(nameEncoded), min, val, max, step, inc_per_pixel);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_propertyi ] ---

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static native int nnk_propertyi(long ctx, long name, int min, int val, int max, int step, int inc_per_pixel);

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static int nk_propertyi(NkContext ctx, ByteBuffer name, int min, int val, int max, int step, int inc_per_pixel) {
		if ( CHECKS )
			checkNT1(name);
		return nnk_propertyi(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
	}

	/**
	 * 
	 *
	 * @param ctx           the nuklear context
	 * @param name          
	 * @param min           
	 * @param val           
	 * @param max           
	 * @param step          
	 * @param inc_per_pixel 
	 */
	public static int nk_propertyi(NkContext ctx, CharSequence name, int min, int val, int max, int step, int inc_per_pixel) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			return nnk_propertyi(ctx.address(), memAddress(nameEncoded), min, val, max, step, inc_per_pixel);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_edit_string ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param flags  one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr></table>
	 * @param memory 
	 * @param len    
	 * @param max    
	 * @param filter 
	 */
	public static native int nnk_edit_string(long ctx, int flags, long memory, long len, int max, long filter);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param flags  one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr></table>
	 * @param memory 
	 * @param len    
	 * @param max    
	 * @param filter 
	 */
	public static int nk_edit_string(NkContext ctx, int flags, ByteBuffer memory, IntBuffer len, int max, NkFilterCallbackI filter) {
		if ( CHECKS ) {
			checkNT1(memory);
			checkBuffer(len, 1);
		}
		return nnk_edit_string(ctx.address(), flags, memAddress(memory), memAddress(len), max, filter == null ? NULL : filter.address());
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param flags  one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr></table>
	 * @param memory 
	 * @param len    
	 * @param max    
	 * @param filter 
	 */
	public static int nk_edit_string(NkContext ctx, int flags, CharSequence memory, IntBuffer len, int max, NkFilterCallbackI filter) {
		if ( CHECKS )
			checkBuffer(len, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer memoryEncoded = stack.UTF8(memory);
			return nnk_edit_string(ctx.address(), flags, memAddress(memoryEncoded), memAddress(len), max, filter == null ? NULL : filter.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_edit_buffer ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param flags  one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr></table>
	 * @param edit   
	 * @param filter 
	 */
	public static native int nnk_edit_buffer(long ctx, int flags, long edit, long filter);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param flags  one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr></table>
	 * @param edit   
	 * @param filter 
	 */
	public static int nk_edit_buffer(NkContext ctx, int flags, NkTextEdit edit, NkFilterCallbackI filter) {
		return nnk_edit_buffer(ctx.address(), flags, edit.address(), filter == null ? NULL : filter.address());
	}

	// --- [ nk_chart_begin ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param num  
	 * @param min  
	 * @param max  
	 */
	public static native int nnk_chart_begin(long ctx, int type, int num, float min, float max);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param num  
	 * @param min  
	 * @param max  
	 */
	public static boolean nk_chart_begin(NkContext ctx, int type, int num, float min, float max) {
		return nnk_chart_begin(ctx.address(), type, num, min, max) != 0;
	}

	// --- [ nk_chart_begin_colored ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param type   one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param color  
	 * @param active 
	 * @param num    
	 * @param min    
	 * @param max    
	 */
	public static native int nnk_chart_begin_colored(long ctx, int type, long color, long active, int num, float min, float max);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param type   one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param color  
	 * @param active 
	 * @param num    
	 * @param min    
	 * @param max    
	 */
	public static boolean nk_chart_begin_colored(NkContext ctx, int type, NkColor color, NkColor active, int num, float min, float max) {
		return nnk_chart_begin_colored(ctx.address(), type, color.address(), active.address(), num, min, max) != 0;
	}

	// --- [ nk_chart_add_slot ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param type      one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param count     
	 * @param min_value 
	 * @param max_value 
	 */
	public static native void nnk_chart_add_slot(long ctx, int type, int count, float min_value, float max_value);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param type      one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param count     
	 * @param min_value 
	 * @param max_value 
	 */
	public static void nk_chart_add_slot(NkContext ctx, int type, int count, float min_value, float max_value) {
		nnk_chart_add_slot(ctx.address(), type, count, min_value, max_value);
	}

	// --- [ nk_chart_add_slot_colored ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param type      one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param color     
	 * @param active    
	 * @param count     
	 * @param min_value 
	 * @param max_value 
	 */
	public static native void nnk_chart_add_slot_colored(long ctx, int type, long color, long active, int count, float min_value, float max_value);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param type      one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param color     
	 * @param active    
	 * @param count     
	 * @param min_value 
	 * @param max_value 
	 */
	public static void nk_chart_add_slot_colored(NkContext ctx, int type, NkColor color, NkColor active, int count, float min_value, float max_value) {
		nnk_chart_add_slot_colored(ctx.address(), type, color.address(), active.address(), count, min_value, max_value);
	}

	// --- [ nk_chart_push ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param value 
	 */
	public static native int nnk_chart_push(long ctx, float value);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param value 
	 */
	public static int nk_chart_push(NkContext ctx, float value) {
		return nnk_chart_push(ctx.address(), value);
	}

	// --- [ nk_chart_push_slot ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param value 
	 * @param slot  
	 */
	public static native int nnk_chart_push_slot(long ctx, float value, int slot);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param value 
	 * @param slot  
	 */
	public static int nk_chart_push_slot(NkContext ctx, float value, int slot) {
		return nnk_chart_push_slot(ctx.address(), value, slot);
	}

	// --- [ nk_chart_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_chart_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_chart_end(NkContext ctx) {
		nnk_chart_end(ctx.address());
	}

	// --- [ nk_plot ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param type   one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param values 
	 * @param count  
	 * @param offset 
	 */
	public static native void nnk_plot(long ctx, int type, long values, int count, int offset);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param type   one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param values 
	 * @param count  
	 * @param offset 
	 */
	public static void nk_plot(NkContext ctx, int type, FloatBuffer values, int count, int offset) {
		if ( CHECKS )
			checkBuffer(values, offset + count);
		nnk_plot(ctx.address(), type, memAddress(values), count, offset);
	}

	// --- [ nk_plot_function ] ---

	/**
	 * 
	 *
	 * @param ctx          the nuklear context
	 * @param type         one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param userdata     
	 * @param value_getter 
	 * @param count        
	 * @param offset       
	 */
	public static native void nnk_plot_function(long ctx, int type, long userdata, long value_getter, int count, int offset);

	/**
	 * 
	 *
	 * @param ctx          the nuklear context
	 * @param type         one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
	 * @param userdata     
	 * @param value_getter 
	 * @param count        
	 * @param offset       
	 */
	public static void nk_plot_function(NkContext ctx, int type, long userdata, NkValueGetterI value_getter, int count, int offset) {
		if ( CHECKS )
			checkPointer(userdata);
		nnk_plot_function(ctx.address(), type, userdata, value_getter.address(), count, offset);
	}

	// --- [ nk_popup_begin ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param type   one of:<br><table><tr><td>{@link #NK_POPUP_STATIC POPUP_STATIC}</td><td>{@link #NK_POPUP_DYNAMIC POPUP_DYNAMIC}</td></tr></table>
	 * @param title  
	 * @param flags  one of:<br><table><tr><td>{@link #NK_WINDOW_BORDER WINDOW_BORDER}</td><td>{@link #NK_WINDOW_BORDER_HEADER WINDOW_BORDER_HEADER}</td><td>{@link #NK_WINDOW_MOVABLE WINDOW_MOVABLE}</td><td>{@link #NK_WINDOW_SCALABLE WINDOW_SCALABLE}</td><td>{@link #NK_WINDOW_CLOSABLE WINDOW_CLOSABLE}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZABLE WINDOW_MINIMIZABLE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_NO_SCROLLBAR WINDOW_NO_SCROLLBAR}</td><td>{@link #NK_WINDOW_TITLE WINDOW_TITLE}</td></tr></table>
	 * @param rect   
	 */
	public static native int nnk_popup_begin(long ctx, long layout, int type, long title, int flags, long rect);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param type   one of:<br><table><tr><td>{@link #NK_POPUP_STATIC POPUP_STATIC}</td><td>{@link #NK_POPUP_DYNAMIC POPUP_DYNAMIC}</td></tr></table>
	 * @param title  
	 * @param flags  one of:<br><table><tr><td>{@link #NK_WINDOW_BORDER WINDOW_BORDER}</td><td>{@link #NK_WINDOW_BORDER_HEADER WINDOW_BORDER_HEADER}</td><td>{@link #NK_WINDOW_MOVABLE WINDOW_MOVABLE}</td><td>{@link #NK_WINDOW_SCALABLE WINDOW_SCALABLE}</td><td>{@link #NK_WINDOW_CLOSABLE WINDOW_CLOSABLE}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZABLE WINDOW_MINIMIZABLE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_NO_SCROLLBAR WINDOW_NO_SCROLLBAR}</td><td>{@link #NK_WINDOW_TITLE WINDOW_TITLE}</td></tr></table>
	 * @param rect   
	 */
	public static boolean nk_popup_begin(NkContext ctx, NkPanel layout, int type, ByteBuffer title, int flags, NkRect rect) {
		if ( CHECKS )
			checkNT1(title);
		return nnk_popup_begin(ctx.address(), layout.address(), type, memAddress(title), flags, rect.address()) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param type   one of:<br><table><tr><td>{@link #NK_POPUP_STATIC POPUP_STATIC}</td><td>{@link #NK_POPUP_DYNAMIC POPUP_DYNAMIC}</td></tr></table>
	 * @param title  
	 * @param flags  one of:<br><table><tr><td>{@link #NK_WINDOW_BORDER WINDOW_BORDER}</td><td>{@link #NK_WINDOW_BORDER_HEADER WINDOW_BORDER_HEADER}</td><td>{@link #NK_WINDOW_MOVABLE WINDOW_MOVABLE}</td><td>{@link #NK_WINDOW_SCALABLE WINDOW_SCALABLE}</td><td>{@link #NK_WINDOW_CLOSABLE WINDOW_CLOSABLE}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZABLE WINDOW_MINIMIZABLE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_NO_SCROLLBAR WINDOW_NO_SCROLLBAR}</td><td>{@link #NK_WINDOW_TITLE WINDOW_TITLE}</td></tr></table>
	 * @param rect   
	 */
	public static boolean nk_popup_begin(NkContext ctx, NkPanel layout, int type, CharSequence title, int flags, NkRect rect) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			return nnk_popup_begin(ctx.address(), layout.address(), type, memAddress(titleEncoded), flags, rect.address()) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_popup_close ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_popup_close(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_popup_close(NkContext ctx) {
		nnk_popup_close(ctx.address());
	}

	// --- [ nk_popup_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_popup_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_popup_end(NkContext ctx) {
		nnk_popup_end(ctx.address());
	}

	// --- [ nk_combo ] ---

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param items       
	 * @param count       
	 * @param selected    
	 * @param item_height 
	 */
	public static native int nnk_combo(long ctx, long items, int count, int selected, int item_height);

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param items       
	 * @param selected    
	 * @param item_height 
	 */
	public static boolean nk_combo(NkContext ctx, PointerBuffer items, boolean selected, int item_height) {
		return nnk_combo(ctx.address(), memAddress(items), items.remaining(), selected ? 1 : 0, item_height) != 0;
	}

	// --- [ nk_combo_separator ] ---

	/**
	 * 
	 *
	 * @param ctx                          the nuklear context
	 * @param items_separated_by_separator 
	 * @param separator                    
	 * @param selected                     
	 * @param count                        
	 * @param item_height                  
	 */
	public static native int nnk_combo_separator(long ctx, long items_separated_by_separator, int separator, int selected, int count, int item_height);

	/**
	 * 
	 *
	 * @param ctx                          the nuklear context
	 * @param items_separated_by_separator 
	 * @param separator                    
	 * @param selected                     
	 * @param count                        
	 * @param item_height                  
	 */
	public static boolean nk_combo_separator(NkContext ctx, ByteBuffer items_separated_by_separator, int separator, boolean selected, int count, int item_height) {
		if ( CHECKS )
			checkNT1(items_separated_by_separator);
		return nnk_combo_separator(ctx.address(), memAddress(items_separated_by_separator), separator, selected ? 1 : 0, count, item_height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx                          the nuklear context
	 * @param items_separated_by_separator 
	 * @param separator                    
	 * @param selected                     
	 * @param count                        
	 * @param item_height                  
	 */
	public static boolean nk_combo_separator(NkContext ctx, CharSequence items_separated_by_separator, int separator, boolean selected, int count, int item_height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer items_separated_by_separatorEncoded = stack.UTF8(items_separated_by_separator);
			return nnk_combo_separator(ctx.address(), memAddress(items_separated_by_separatorEncoded), separator, selected ? 1 : 0, count, item_height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_string ] ---

	/**
	 * 
	 *
	 * @param ctx                      the nuklear context
	 * @param items_separated_by_zeros 
	 * @param selected                 
	 * @param count                    
	 * @param item_height              
	 */
	public static native int nnk_combo_string(long ctx, long items_separated_by_zeros, int selected, int count, int item_height);

	/**
	 * 
	 *
	 * @param ctx                      the nuklear context
	 * @param items_separated_by_zeros 
	 * @param selected                 
	 * @param count                    
	 * @param item_height              
	 */
	public static boolean nk_combo_string(NkContext ctx, ByteBuffer items_separated_by_zeros, boolean selected, int count, int item_height) {
		if ( CHECKS )
			checkNT1(items_separated_by_zeros);
		return nnk_combo_string(ctx.address(), memAddress(items_separated_by_zeros), selected ? 1 : 0, count, item_height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx                      the nuklear context
	 * @param items_separated_by_zeros 
	 * @param selected                 
	 * @param count                    
	 * @param item_height              
	 */
	public static boolean nk_combo_string(NkContext ctx, CharSequence items_separated_by_zeros, boolean selected, int count, int item_height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer items_separated_by_zerosEncoded = stack.UTF8(items_separated_by_zeros);
			return nnk_combo_string(ctx.address(), memAddress(items_separated_by_zerosEncoded), selected ? 1 : 0, count, item_height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_callback ] ---

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param item_getter 
	 * @param userdata    
	 * @param selected    
	 * @param count       
	 * @param item_height 
	 */
	public static native int nnk_combo_callback(long ctx, long item_getter, long userdata, int selected, int count, int item_height);

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param item_getter 
	 * @param userdata    
	 * @param selected    
	 * @param count       
	 * @param item_height 
	 */
	public static boolean nk_combo_callback(NkContext ctx, NkItemGetterI item_getter, long userdata, boolean selected, int count, int item_height) {
		if ( CHECKS )
			checkPointer(userdata);
		return nnk_combo_callback(ctx.address(), item_getter.address(), userdata, selected ? 1 : 0, count, item_height) != 0;
	}

	// --- [ nk_combobox ] ---

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param items       
	 * @param count       
	 * @param selected    
	 * @param item_height 
	 */
	public static native void nnk_combobox(long ctx, long items, int count, long selected, int item_height);

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param items       
	 * @param selected    
	 * @param item_height 
	 */
	public static void nk_combobox(NkContext ctx, PointerBuffer items, IntBuffer selected, int item_height) {
		if ( CHECKS )
			checkBuffer(selected, 1);
		nnk_combobox(ctx.address(), memAddress(items), items.remaining(), memAddress(selected), item_height);
	}

	// --- [ nk_combobox_string ] ---

	/**
	 * 
	 *
	 * @param ctx                      the nuklear context
	 * @param items_separated_by_zeros 
	 * @param selected                 
	 * @param count                    
	 * @param item_height              
	 */
	public static native void nnk_combobox_string(long ctx, long items_separated_by_zeros, long selected, int count, int item_height);

	/**
	 * 
	 *
	 * @param ctx                      the nuklear context
	 * @param items_separated_by_zeros 
	 * @param selected                 
	 * @param count                    
	 * @param item_height              
	 */
	public static void nk_combobox_string(NkContext ctx, ByteBuffer items_separated_by_zeros, IntBuffer selected, int count, int item_height) {
		if ( CHECKS ) {
			checkNT1(items_separated_by_zeros);
			checkBuffer(selected, 1);
		}
		nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zeros), memAddress(selected), count, item_height);
	}

	/**
	 * 
	 *
	 * @param ctx                      the nuklear context
	 * @param items_separated_by_zeros 
	 * @param selected                 
	 * @param count                    
	 * @param item_height              
	 */
	public static void nk_combobox_string(NkContext ctx, CharSequence items_separated_by_zeros, IntBuffer selected, int count, int item_height) {
		if ( CHECKS )
			checkBuffer(selected, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer items_separated_by_zerosEncoded = stack.UTF8(items_separated_by_zeros);
			nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zerosEncoded), memAddress(selected), count, item_height);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combobox_separator ] ---

	/**
	 * 
	 *
	 * @param ctx                          the nuklear context
	 * @param items_separated_by_separator 
	 * @param separator                    
	 * @param selected                     
	 * @param count                        
	 * @param item_height                  
	 */
	public static native void nnk_combobox_separator(long ctx, long items_separated_by_separator, int separator, long selected, int count, int item_height);

	/**
	 * 
	 *
	 * @param ctx                          the nuklear context
	 * @param items_separated_by_separator 
	 * @param separator                    
	 * @param selected                     
	 * @param count                        
	 * @param item_height                  
	 */
	public static void nk_combobox_separator(NkContext ctx, ByteBuffer items_separated_by_separator, int separator, IntBuffer selected, int count, int item_height) {
		if ( CHECKS ) {
			checkNT1(items_separated_by_separator);
			checkBuffer(selected, 1);
		}
		nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separator), separator, memAddress(selected), count, item_height);
	}

	/**
	 * 
	 *
	 * @param ctx                          the nuklear context
	 * @param items_separated_by_separator 
	 * @param separator                    
	 * @param selected                     
	 * @param count                        
	 * @param item_height                  
	 */
	public static void nk_combobox_separator(NkContext ctx, CharSequence items_separated_by_separator, int separator, IntBuffer selected, int count, int item_height) {
		if ( CHECKS )
			checkBuffer(selected, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer items_separated_by_separatorEncoded = stack.UTF8(items_separated_by_separator);
			nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separatorEncoded), separator, memAddress(selected), count, item_height);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combobox_callback ] ---

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param item_getter 
	 * @param userdata    
	 * @param selected    
	 * @param count       
	 * @param item_height 
	 */
	public static native void nnk_combobox_callback(long ctx, long item_getter, long userdata, long selected, int count, int item_height);

	/**
	 * 
	 *
	 * @param ctx         the nuklear context
	 * @param item_getter 
	 * @param userdata    
	 * @param selected    
	 * @param count       
	 * @param item_height 
	 */
	public static void nk_combobox_callback(NkContext ctx, NkItemGetterI item_getter, long userdata, IntBuffer selected, int count, int item_height) {
		if ( CHECKS ) {
			checkPointer(userdata);
			checkBuffer(selected, 1);
		}
		nnk_combobox_callback(ctx.address(), item_getter.address(), userdata, memAddress(selected), count, item_height);
	}

	// --- [ nk_combo_begin_text ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param selected   
	 * @param len        
	 * @param max_height 
	 */
	public static native int nnk_combo_begin_text(long ctx, long layout, long selected, int len, int max_height);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param selected   
	 * @param max_height 
	 */
	public static boolean nk_combo_begin_text(NkContext ctx, NkPanel layout, ByteBuffer selected, int max_height) {
		return nnk_combo_begin_text(ctx.address(), layout.address(), memAddress(selected), selected.remaining(), max_height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param selected   
	 * @param max_height 
	 */
	public static boolean nk_combo_begin_text(NkContext ctx, NkPanel layout, CharSequence selected, int max_height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer selectedEncoded = stack.UTF8(selected, false);
			int selectedEncodedLen = selectedEncoded.capacity();
			return nnk_combo_begin_text(ctx.address(), layout.address(), memAddress(selectedEncoded), selectedEncodedLen, max_height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_begin_label ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param selected   
	 * @param max_height 
	 */
	public static native int nnk_combo_begin_label(long ctx, long layout, long selected, int max_height);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param selected   
	 * @param max_height 
	 */
	public static boolean nk_combo_begin_label(NkContext ctx, NkPanel layout, ByteBuffer selected, int max_height) {
		if ( CHECKS )
			checkNT1(selected);
		return nnk_combo_begin_label(ctx.address(), layout.address(), memAddress(selected), max_height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param selected   
	 * @param max_height 
	 */
	public static boolean nk_combo_begin_label(NkContext ctx, NkPanel layout, CharSequence selected, int max_height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer selectedEncoded = stack.UTF8(selected);
			return nnk_combo_begin_label(ctx.address(), layout.address(), memAddress(selectedEncoded), max_height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_begin_color ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param color      
	 * @param max_height 
	 */
	public static native int nnk_combo_begin_color(long ctx, long layout, long color, int max_height);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param color      
	 * @param max_height 
	 */
	public static boolean nk_combo_begin_color(NkContext ctx, NkPanel layout, NkColor color, int max_height) {
		return nnk_combo_begin_color(ctx.address(), layout.address(), color.address(), max_height) != 0;
	}

	// --- [ nk_combo_begin_symbol ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param symbol     one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param max_height 
	 */
	public static native int nnk_combo_begin_symbol(long ctx, long layout, int symbol, int max_height);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param symbol     one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param max_height 
	 */
	public static boolean nk_combo_begin_symbol(NkContext ctx, NkPanel layout, int symbol, int max_height) {
		return nnk_combo_begin_symbol(ctx.address(), layout.address(), symbol, max_height) != 0;
	}

	// --- [ nk_combo_begin_symbol_label ] ---

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param symbol   one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param height   
	 */
	public static native int nnk_combo_begin_symbol_label(long ctx, long layout, long selected, int symbol, int height);

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param symbol   one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param height   
	 */
	public static boolean nk_combo_begin_symbol_label(NkContext ctx, NkPanel layout, ByteBuffer selected, int symbol, int height) {
		if ( CHECKS )
			checkNT1(selected);
		return nnk_combo_begin_symbol_label(ctx.address(), layout.address(), memAddress(selected), symbol, height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param symbol   one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param height   
	 */
	public static boolean nk_combo_begin_symbol_label(NkContext ctx, NkPanel layout, CharSequence selected, int symbol, int height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer selectedEncoded = stack.UTF8(selected);
			return nnk_combo_begin_symbol_label(ctx.address(), layout.address(), memAddress(selectedEncoded), symbol, height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_begin_symbol_text ] ---

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param len      
	 * @param symbol   one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param height   
	 */
	public static native int nnk_combo_begin_symbol_text(long ctx, long layout, long selected, int len, int symbol, int height);

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param symbol   one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param height   
	 */
	public static boolean nk_combo_begin_symbol_text(NkContext ctx, NkPanel layout, ByteBuffer selected, int symbol, int height) {
		return nnk_combo_begin_symbol_text(ctx.address(), layout.address(), memAddress(selected), selected.remaining(), symbol, height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param symbol   one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param height   
	 */
	public static boolean nk_combo_begin_symbol_text(NkContext ctx, NkPanel layout, CharSequence selected, int symbol, int height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer selectedEncoded = stack.UTF8(selected, false);
			int selectedEncodedLen = selectedEncoded.capacity();
			return nnk_combo_begin_symbol_text(ctx.address(), layout.address(), memAddress(selectedEncoded), selectedEncodedLen, symbol, height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_begin_image ] ---

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param img        
	 * @param max_height 
	 */
	public static native int nnk_combo_begin_image(long ctx, long layout, long img, int max_height);

	/**
	 * 
	 *
	 * @param ctx        the nuklear context
	 * @param layout     
	 * @param img        
	 * @param max_height 
	 */
	public static boolean nk_combo_begin_image(NkContext ctx, NkPanel layout, NkImage img, int max_height) {
		return nnk_combo_begin_image(ctx.address(), layout.address(), img.address(), max_height) != 0;
	}

	// --- [ nk_combo_begin_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param img      
	 * @param height   
	 */
	public static native int nnk_combo_begin_image_label(long ctx, long layout, long selected, long img, int height);

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param img      
	 * @param height   
	 */
	public static boolean nk_combo_begin_image_label(NkContext ctx, NkPanel layout, ByteBuffer selected, NkImage img, int height) {
		if ( CHECKS )
			checkNT1(selected);
		return nnk_combo_begin_image_label(ctx.address(), layout.address(), memAddress(selected), img.address(), height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param img      
	 * @param height   
	 */
	public static boolean nk_combo_begin_image_label(NkContext ctx, NkPanel layout, CharSequence selected, NkImage img, int height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer selectedEncoded = stack.UTF8(selected);
			return nnk_combo_begin_image_label(ctx.address(), layout.address(), memAddress(selectedEncoded), img.address(), height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_begin_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param len      
	 * @param img      
	 * @param height   
	 */
	public static native int nnk_combo_begin_image_text(long ctx, long layout, long selected, int len, long img, int height);

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param img      
	 * @param height   
	 */
	public static boolean nk_combo_begin_image_text(NkContext ctx, NkPanel layout, ByteBuffer selected, NkImage img, int height) {
		return nnk_combo_begin_image_text(ctx.address(), layout.address(), memAddress(selected), selected.remaining(), img.address(), height) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param layout   
	 * @param selected 
	 * @param img      
	 * @param height   
	 */
	public static boolean nk_combo_begin_image_text(NkContext ctx, NkPanel layout, CharSequence selected, NkImage img, int height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer selectedEncoded = stack.UTF8(selected, false);
			int selectedEncodedLen = selectedEncoded.capacity();
			return nnk_combo_begin_image_text(ctx.address(), layout.address(), memAddress(selectedEncoded), selectedEncodedLen, img.address(), height) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_item_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_combo_item_label(long ctx, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_label(NkContext ctx, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_combo_item_label(ctx.address(), memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_label(NkContext ctx, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_combo_item_label(ctx.address(), memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_item_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_combo_item_text(long ctx, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_text(NkContext ctx, ByteBuffer text, int alignment) {
		return nnk_combo_item_text(ctx.address(), memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_text(NkContext ctx, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_combo_item_text(ctx.address(), memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_item_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_combo_item_image_label(long ctx, long img, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_image_label(NkContext ctx, NkImage img, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_combo_item_image_label(ctx.address(), img.address(), memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_image_label(NkContext ctx, NkImage img, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_combo_item_image_label(ctx.address(), img.address(), memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_item_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_combo_item_image_text(long ctx, long img, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_image_text(NkContext ctx, NkImage img, ByteBuffer text, int alignment) {
		return nnk_combo_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_image_text(NkContext ctx, NkImage img, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_combo_item_image_text(ctx.address(), img.address(), memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_item_symbol_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_combo_item_symbol_label(long ctx, int symbol, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_symbol_label(NkContext ctx, int symbol, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_combo_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_symbol_label(NkContext ctx, int symbol, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_combo_item_symbol_label(ctx.address(), symbol, memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_item_symbol_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_combo_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_symbol_text(NkContext ctx, int symbol, ByteBuffer text, int alignment) {
		return nnk_combo_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_combo_item_symbol_text(NkContext ctx, int symbol, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_combo_item_symbol_text(ctx.address(), symbol, memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_combo_close ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_combo_close(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_combo_close(NkContext ctx) {
		nnk_combo_close(ctx.address());
	}

	// --- [ nk_combo_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_combo_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_combo_end(NkContext ctx) {
		nnk_combo_end(ctx.address());
	}

	// --- [ nk_contextual_begin ] ---

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param layout         
	 * @param flags          one of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_SUB WINDOW_SUB}</td><td>{@link #NK_WINDOW_GROUP WINDOW_GROUP}</td></tr><tr><td>{@link #NK_WINDOW_POPUP WINDOW_POPUP}</td><td>{@link #NK_WINDOW_NONBLOCK WINDOW_NONBLOCK}</td><td>{@link #NK_WINDOW_CONTEXTUAL WINDOW_CONTEXTUAL}</td><td>{@link #NK_WINDOW_COMBO WINDOW_COMBO}</td><td>{@link #NK_WINDOW_MENU WINDOW_MENU}</td><td>{@link #NK_WINDOW_TOOLTIP WINDOW_TOOLTIP}</td></tr><tr><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
	 * @param size           
	 * @param trigger_bounds 
	 */
	public static native int nnk_contextual_begin(long ctx, long layout, int flags, long size, long trigger_bounds);

	/**
	 * 
	 *
	 * @param ctx            the nuklear context
	 * @param layout         
	 * @param flags          one of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_SUB WINDOW_SUB}</td><td>{@link #NK_WINDOW_GROUP WINDOW_GROUP}</td></tr><tr><td>{@link #NK_WINDOW_POPUP WINDOW_POPUP}</td><td>{@link #NK_WINDOW_NONBLOCK WINDOW_NONBLOCK}</td><td>{@link #NK_WINDOW_CONTEXTUAL WINDOW_CONTEXTUAL}</td><td>{@link #NK_WINDOW_COMBO WINDOW_COMBO}</td><td>{@link #NK_WINDOW_MENU WINDOW_MENU}</td><td>{@link #NK_WINDOW_TOOLTIP WINDOW_TOOLTIP}</td></tr><tr><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
	 * @param size           
	 * @param trigger_bounds 
	 */
	public static boolean nk_contextual_begin(NkContext ctx, NkPanel layout, int flags, NkVec2 size, NkRect trigger_bounds) {
		return nnk_contextual_begin(ctx.address(), layout.address(), flags, size.address(), trigger_bounds.address()) != 0;
	}

	// --- [ nk_contextual_item_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param len   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_contextual_item_text(long ctx, long text, int len, int align);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_text(NkContext ctx, ByteBuffer text, int align) {
		return nnk_contextual_item_text(ctx.address(), memAddress(text), text.remaining(), align) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_text(NkContext ctx, CharSequence text, int align) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_contextual_item_text(ctx.address(), memAddress(textEncoded), textEncodedLen, align) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_contextual_item_label ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_contextual_item_label(long ctx, long text, int align);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_label(NkContext ctx, ByteBuffer text, int align) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_contextual_item_label(ctx.address(), memAddress(text), align) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_label(NkContext ctx, CharSequence text, int align) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_contextual_item_label(ctx.address(), memAddress(textEncoded), align) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_contextual_item_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_contextual_item_image_label(long ctx, long img, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_image_label(NkContext ctx, NkImage img, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_contextual_item_image_label(ctx.address(), img.address(), memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_image_label(NkContext ctx, NkImage img, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_contextual_item_image_label(ctx.address(), img.address(), memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_contextual_item_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_contextual_item_image_text(long ctx, long img, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_image_text(NkContext ctx, NkImage img, ByteBuffer text, int alignment) {
		return nnk_contextual_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_image_text(NkContext ctx, NkImage img, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_contextual_item_image_text(ctx.address(), img.address(), memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_contextual_item_symbol_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_contextual_item_symbol_label(long ctx, int symbol, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_symbol_label(NkContext ctx, int symbol, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_contextual_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_symbol_label(NkContext ctx, int symbol, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_contextual_item_symbol_label(ctx.address(), symbol, memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_contextual_item_symbol_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_contextual_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_symbol_text(NkContext ctx, int symbol, ByteBuffer text, int alignment) {
		return nnk_contextual_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_contextual_item_symbol_text(NkContext ctx, int symbol, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_contextual_item_symbol_text(ctx.address(), symbol, memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_contextual_close ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_contextual_close(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_contextual_close(NkContext ctx) {
		nnk_contextual_close(ctx.address());
	}

	// --- [ nk_contextual_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_contextual_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_contextual_end(NkContext ctx) {
		nnk_contextual_end(ctx.address());
	}

	// --- [ nk_tooltip ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param text 
	 */
	public static native void nnk_tooltip(long ctx, long text);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param text 
	 */
	public static void nk_tooltip(NkContext ctx, ByteBuffer text) {
		if ( CHECKS )
			checkNT1(text);
		nnk_tooltip(ctx.address(), memAddress(text));
	}

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param text 
	 */
	public static void nk_tooltip(NkContext ctx, CharSequence text) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			nnk_tooltip(ctx.address(), memAddress(textEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_tooltip_begin ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param width  
	 */
	public static native int nnk_tooltip_begin(long ctx, long layout, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param width  
	 */
	public static boolean nk_tooltip_begin(NkContext ctx, NkPanel layout, float width) {
		return nnk_tooltip_begin(ctx.address(), layout.address(), width) != 0;
	}

	// --- [ nk_tooltip_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_tooltip_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_tooltip_end(NkContext ctx) {
		nnk_tooltip_end(ctx.address());
	}

	// --- [ nk_menubar_begin ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_menubar_begin(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_menubar_begin(NkContext ctx) {
		nnk_menubar_begin(ctx.address());
	}

	// --- [ nk_menubar_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_menubar_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_menubar_end(NkContext ctx) {
		nnk_menubar_end(ctx.address());
	}

	// --- [ nk_menu_begin_text ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param len    
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param width  
	 */
	public static native int nnk_menu_begin_text(long ctx, long layout, long text, int len, int align, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_text(NkContext ctx, NkPanel layout, ByteBuffer text, int align, float width) {
		return nnk_menu_begin_text(ctx.address(), layout.address(), memAddress(text), text.remaining(), align, width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_text(NkContext ctx, NkPanel layout, CharSequence text, int align, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_menu_begin_text(ctx.address(), layout.address(), memAddress(textEncoded), textEncodedLen, align, width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_begin_label ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param width  
	 */
	public static native int nnk_menu_begin_label(long ctx, long layout, long text, int align, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_label(NkContext ctx, NkPanel layout, ByteBuffer text, int align, float width) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_begin_label(ctx.address(), layout.address(), memAddress(text), align, width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_label(NkContext ctx, NkPanel layout, CharSequence text, int align, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_begin_label(ctx.address(), layout.address(), memAddress(textEncoded), align, width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_begin_image ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param img    
	 * @param width  
	 */
	public static native int nnk_menu_begin_image(long ctx, long layout, long text, long img, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param img    
	 * @param width  
	 */
	public static boolean nk_menu_begin_image(NkContext ctx, NkPanel layout, ByteBuffer text, NkImage img, float width) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_begin_image(ctx.address(), layout.address(), memAddress(text), img.address(), width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param img    
	 * @param width  
	 */
	public static boolean nk_menu_begin_image(NkContext ctx, NkPanel layout, CharSequence text, NkImage img, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_begin_image(ctx.address(), layout.address(), memAddress(textEncoded), img.address(), width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_begin_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param len    
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param img    
	 * @param width  
	 */
	public static native int nnk_menu_begin_image_text(long ctx, long layout, long text, int len, int align, long img, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param img    
	 * @param width  
	 */
	public static boolean nk_menu_begin_image_text(NkContext ctx, NkPanel layout, ByteBuffer text, int align, NkImage img, float width) {
		return nnk_menu_begin_image_text(ctx.address(), layout.address(), memAddress(text), text.remaining(), align, img.address(), width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param img    
	 * @param width  
	 */
	public static boolean nk_menu_begin_image_text(NkContext ctx, NkPanel layout, CharSequence text, int align, NkImage img, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_menu_begin_image_text(ctx.address(), layout.address(), memAddress(textEncoded), textEncodedLen, align, img.address(), width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_begin_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param img    
	 * @param width  
	 */
	public static native int nnk_menu_begin_image_label(long ctx, long layout, long text, int align, long img, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param img    
	 * @param width  
	 */
	public static boolean nk_menu_begin_image_label(NkContext ctx, NkPanel layout, ByteBuffer text, int align, NkImage img, float width) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_begin_image_label(ctx.address(), layout.address(), memAddress(text), align, img.address(), width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param img    
	 * @param width  
	 */
	public static boolean nk_menu_begin_image_label(NkContext ctx, NkPanel layout, CharSequence text, int align, NkImage img, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_begin_image_label(ctx.address(), layout.address(), memAddress(textEncoded), align, img.address(), width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_begin_symbol ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static native int nnk_menu_begin_symbol(long ctx, long layout, long text, int symbol, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_symbol(NkContext ctx, NkPanel layout, ByteBuffer text, int symbol, float width) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_begin_symbol(ctx.address(), layout.address(), memAddress(text), symbol, width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_symbol(NkContext ctx, NkPanel layout, CharSequence text, int symbol, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_begin_symbol(ctx.address(), layout.address(), memAddress(textEncoded), symbol, width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_begin_symbol_text ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param len    
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static native int nnk_menu_begin_symbol_text(long ctx, long layout, long text, int len, int align, int symbol, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_symbol_text(NkContext ctx, NkPanel layout, ByteBuffer text, int align, int symbol, float width) {
		return nnk_menu_begin_symbol_text(ctx.address(), layout.address(), memAddress(text), text.remaining(), align, symbol, width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_symbol_text(NkContext ctx, NkPanel layout, CharSequence text, int align, int symbol, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_menu_begin_symbol_text(ctx.address(), layout.address(), memAddress(textEncoded), textEncodedLen, align, symbol, width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_begin_symbol_label ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static native int nnk_menu_begin_symbol_label(long ctx, long layout, long text, int align, int symbol, float width);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_symbol_label(NkContext ctx, NkPanel layout, ByteBuffer text, int align, int symbol, float width) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_begin_symbol_label(ctx.address(), layout.address(), memAddress(text), align, symbol, width) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param layout 
	 * @param text   
	 * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param width  
	 */
	public static boolean nk_menu_begin_symbol_label(NkContext ctx, NkPanel layout, CharSequence text, int align, int symbol, float width) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_begin_symbol_label(ctx.address(), layout.address(), memAddress(textEncoded), align, symbol, width) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_item_text ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param len   
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_menu_item_text(long ctx, long text, int len, int align);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_text(NkContext ctx, ByteBuffer text, int align) {
		return nnk_menu_item_text(ctx.address(), memAddress(text), text.remaining(), align) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param text  
	 * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_text(NkContext ctx, CharSequence text, int align) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_menu_item_text(ctx.address(), memAddress(textEncoded), textEncodedLen, align) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_item_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_menu_item_label(long ctx, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_label(NkContext ctx, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_item_label(ctx.address(), memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_label(NkContext ctx, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_item_label(ctx.address(), memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_item_image_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_menu_item_image_label(long ctx, long img, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_image_label(NkContext ctx, NkImage img, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_item_image_label(ctx.address(), img.address(), memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_image_label(NkContext ctx, NkImage img, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_item_image_label(ctx.address(), img.address(), memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_item_image_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_menu_item_image_text(long ctx, long img, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_image_text(NkContext ctx, NkImage img, ByteBuffer text, int alignment) {
		return nnk_menu_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param img       
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_image_text(NkContext ctx, NkImage img, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_menu_item_image_text(ctx.address(), img.address(), memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_item_symbol_text ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param len       
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_menu_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_symbol_text(NkContext ctx, int symbol, ByteBuffer text, int alignment) {
		return nnk_menu_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_symbol_text(NkContext ctx, int symbol, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			return nnk_menu_item_symbol_text(ctx.address(), symbol, memAddress(textEncoded), textEncodedLen, alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_item_symbol_label ] ---

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static native int nnk_menu_item_symbol_label(long ctx, int symbol, long text, int alignment);

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_symbol_label(NkContext ctx, int symbol, ByteBuffer text, int alignment) {
		if ( CHECKS )
			checkNT1(text);
		return nnk_menu_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment) != 0;
	}

	/**
	 * 
	 *
	 * @param ctx       the nuklear context
	 * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE SYMBOL_CIRCLE}</td><td>{@link #NK_SYMBOL_CIRCLE_FILLED SYMBOL_CIRCLE_FILLED}</td></tr><tr><td>{@link #NK_SYMBOL_RECT SYMBOL_RECT}</td><td>{@link #NK_SYMBOL_RECT_FILLED SYMBOL_RECT_FILLED}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
	 * @param text      
	 * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
	 */
	public static boolean nk_menu_item_symbol_label(NkContext ctx, int symbol, CharSequence text, int alignment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text);
			return nnk_menu_item_symbol_label(ctx.address(), symbol, memAddress(textEncoded), alignment) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_menu_close ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_menu_close(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_menu_close(NkContext ctx) {
		nnk_menu_close(ctx.address());
	}

	// --- [ nk_menu_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_menu_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_menu_end(NkContext ctx) {
		nnk_menu_end(ctx.address());
	}

	// --- [ nk_convert ] ---

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param cmds     
	 * @param vertices 
	 * @param elements 
	 * @param config   
	 */
	public static native void nnk_convert(long ctx, long cmds, long vertices, long elements, long config);

	/**
	 * 
	 *
	 * @param ctx      the nuklear context
	 * @param cmds     
	 * @param vertices 
	 * @param elements 
	 * @param config   
	 */
	public static void nk_convert(NkContext ctx, NkBuffer cmds, NkBuffer vertices, NkBuffer elements, NkConvertConfig config) {
		nnk_convert(ctx.address(), cmds.address(), vertices.address(), elements.address(), config.address());
	}

	// --- [ nk_input_begin ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_input_begin(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_input_begin(NkContext ctx) {
		nnk_input_begin(ctx.address());
	}

	// --- [ nk_input_motion ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param x   
	 * @param y   
	 */
	public static native void nnk_input_motion(long ctx, int x, int y);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param x   
	 * @param y   
	 */
	public static void nk_input_motion(NkContext ctx, int x, int y) {
		nnk_input_motion(ctx.address(), x, y);
	}

	// --- [ nk_input_key ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param key  one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 * @param down 
	 */
	public static native void nnk_input_key(long ctx, int key, int down);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param key  one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 * @param down 
	 */
	public static void nk_input_key(NkContext ctx, int key, boolean down) {
		nnk_input_key(ctx.address(), key, down ? 1 : 0);
	}

	// --- [ nk_input_button ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param x    
	 * @param y    
	 * @param down 
	 */
	public static native void nnk_input_button(long ctx, int id, int x, int y, int down);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param x    
	 * @param y    
	 * @param down 
	 */
	public static void nk_input_button(NkContext ctx, int id, int x, int y, boolean down) {
		nnk_input_button(ctx.address(), id, x, y, down ? 1 : 0);
	}

	// --- [ nk_input_scroll ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param y   
	 */
	public static native void nnk_input_scroll(long ctx, float y);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param y   
	 */
	public static void nk_input_scroll(NkContext ctx, float y) {
		nnk_input_scroll(ctx.address(), y);
	}

	// --- [ nk_input_glyph ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param glyph 
	 */
	public static native void nnk_input_glyph(long ctx, long glyph);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param glyph 
	 */
	public static void nk_input_glyph(NkContext ctx, ByteBuffer glyph) {
		if ( CHECKS )
			checkBuffer(glyph, 4);
		nnk_input_glyph(ctx.address(), memAddress(glyph));
	}

	// --- [ nk_input_unicode ] ---

	/**
	 * 
	 *
	 * @param ctx     the nuklear context
	 * @param unicode 
	 */
	public static native void nnk_input_unicode(long ctx, int unicode);

	/**
	 * 
	 *
	 * @param ctx     the nuklear context
	 * @param unicode 
	 */
	public static void nk_input_unicode(NkContext ctx, int unicode) {
		nnk_input_unicode(ctx.address(), unicode);
	}

	// --- [ nk_input_end ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_input_end(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_input_end(NkContext ctx) {
		nnk_input_end(ctx.address());
	}

	// --- [ nk_style_default ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_style_default(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static void nk_style_default(NkContext ctx) {
		nnk_style_default(ctx.address());
	}

	// --- [ nk_style_from_table ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param table 
	 */
	public static native void nnk_style_from_table(long ctx, long table);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param table 
	 */
	public static void nk_style_from_table(NkContext ctx, NkColor table) {
		nnk_style_from_table(ctx.address(), table.address());
	}

	// --- [ nk_style_load_cursor ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param style  one of:<br><table><tr><td>{@link #NK_CURSOR_ARROW CURSOR_ARROW}</td><td>{@link #NK_CURSOR_TEXT CURSOR_TEXT}</td><td>{@link #NK_CURSOR_MOVE CURSOR_MOVE}</td><td>{@link #NK_CURSOR_RESIZE_VERTICAL CURSOR_RESIZE_VERTICAL}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_HORIZONTAL CURSOR_RESIZE_HORIZONTAL}</td><td>{@link #NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT}</td><td>{@link #NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT}</td><td>{@link #NK_CURSOR_COUNT CURSOR_COUNT}</td></tr></table>
	 * @param cursor 
	 */
	public static native void nnk_style_load_cursor(long ctx, int style, long cursor);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param style  one of:<br><table><tr><td>{@link #NK_CURSOR_ARROW CURSOR_ARROW}</td><td>{@link #NK_CURSOR_TEXT CURSOR_TEXT}</td><td>{@link #NK_CURSOR_MOVE CURSOR_MOVE}</td><td>{@link #NK_CURSOR_RESIZE_VERTICAL CURSOR_RESIZE_VERTICAL}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_HORIZONTAL CURSOR_RESIZE_HORIZONTAL}</td><td>{@link #NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT}</td><td>{@link #NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT}</td><td>{@link #NK_CURSOR_COUNT CURSOR_COUNT}</td></tr></table>
	 * @param cursor 
	 */
	public static void nk_style_load_cursor(NkContext ctx, int style, NkCursor cursor) {
		nnk_style_load_cursor(ctx.address(), style, cursor.address());
	}

	// --- [ nk_style_load_all_cursors ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param cursor 
	 */
	public static native void nnk_style_load_all_cursors(long ctx, long cursor);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param cursor 
	 */
	public static void nk_style_load_all_cursors(NkContext ctx, NkCursor.Buffer cursor) {
		if ( CHECKS )
			checkBuffer(cursor, NK_CURSOR_COUNT);
		nnk_style_load_all_cursors(ctx.address(), cursor.address());
	}

	// --- [ nk_style_color_name ] ---

	/**
	 * 
	 *
	 * @param c one of:<br><table><tr><td>{@link #NK_COLOR_TEXT COLOR_TEXT}</td><td>{@link #NK_COLOR_WINDOW COLOR_WINDOW}</td><td>{@link #NK_COLOR_HEADER COLOR_HEADER}</td><td>{@link #NK_COLOR_BORDER COLOR_BORDER}</td></tr><tr><td>{@link #NK_COLOR_BUTTON COLOR_BUTTON}</td><td>{@link #NK_COLOR_BUTTON_HOVER COLOR_BUTTON_HOVER}</td><td>{@link #NK_COLOR_BUTTON_ACTIVE COLOR_BUTTON_ACTIVE}</td><td>{@link #NK_COLOR_TOGGLE COLOR_TOGGLE}</td></tr><tr><td>{@link #NK_COLOR_TOGGLE_HOVER COLOR_TOGGLE_HOVER}</td><td>{@link #NK_COLOR_TOGGLE_CURSOR COLOR_TOGGLE_CURSOR}</td><td>{@link #NK_COLOR_SELECT COLOR_SELECT}</td><td>{@link #NK_COLOR_SELECT_ACTIVE COLOR_SELECT_ACTIVE}</td></tr><tr><td>{@link #NK_COLOR_SLIDER COLOR_SLIDER}</td><td>{@link #NK_COLOR_SLIDER_CURSOR COLOR_SLIDER_CURSOR}</td><td>{@link #NK_COLOR_SLIDER_CURSOR_HOVER COLOR_SLIDER_CURSOR_HOVER}</td><td>{@link #NK_COLOR_SLIDER_CURSOR_ACTIVE COLOR_SLIDER_CURSOR_ACTIVE}</td></tr><tr><td>{@link #NK_COLOR_PROPERTY COLOR_PROPERTY}</td><td>{@link #NK_COLOR_EDIT COLOR_EDIT}</td><td>{@link #NK_COLOR_EDIT_CURSOR COLOR_EDIT_CURSOR}</td><td>{@link #NK_COLOR_COMBO COLOR_COMBO}</td></tr><tr><td>{@link #NK_COLOR_CHART COLOR_CHART}</td><td>{@link #NK_COLOR_CHART_COLOR COLOR_CHART_COLOR}</td><td>{@link #NK_COLOR_CHART_COLOR_HIGHLIGHT COLOR_CHART_COLOR_HIGHLIGHT}</td><td>{@link #NK_COLOR_SCROLLBAR COLOR_SCROLLBAR}</td></tr><tr><td>{@link #NK_COLOR_SCROLLBAR_CURSOR COLOR_SCROLLBAR_CURSOR}</td><td>{@link #NK_COLOR_SCROLLBAR_CURSOR_HOVER COLOR_SCROLLBAR_CURSOR_HOVER}</td><td>{@link #NK_COLOR_SCROLLBAR_CURSOR_ACTIVE COLOR_SCROLLBAR_CURSOR_ACTIVE}</td><td>{@link #NK_COLOR_TAB_HEADER COLOR_TAB_HEADER}</td></tr><tr><td>{@link #NK_COLOR_COUNT COLOR_COUNT}</td></tr></table>
	 */
	public static native long nnk_style_color_name(int c);

	/**
	 * 
	 *
	 * @param c one of:<br><table><tr><td>{@link #NK_COLOR_TEXT COLOR_TEXT}</td><td>{@link #NK_COLOR_WINDOW COLOR_WINDOW}</td><td>{@link #NK_COLOR_HEADER COLOR_HEADER}</td><td>{@link #NK_COLOR_BORDER COLOR_BORDER}</td></tr><tr><td>{@link #NK_COLOR_BUTTON COLOR_BUTTON}</td><td>{@link #NK_COLOR_BUTTON_HOVER COLOR_BUTTON_HOVER}</td><td>{@link #NK_COLOR_BUTTON_ACTIVE COLOR_BUTTON_ACTIVE}</td><td>{@link #NK_COLOR_TOGGLE COLOR_TOGGLE}</td></tr><tr><td>{@link #NK_COLOR_TOGGLE_HOVER COLOR_TOGGLE_HOVER}</td><td>{@link #NK_COLOR_TOGGLE_CURSOR COLOR_TOGGLE_CURSOR}</td><td>{@link #NK_COLOR_SELECT COLOR_SELECT}</td><td>{@link #NK_COLOR_SELECT_ACTIVE COLOR_SELECT_ACTIVE}</td></tr><tr><td>{@link #NK_COLOR_SLIDER COLOR_SLIDER}</td><td>{@link #NK_COLOR_SLIDER_CURSOR COLOR_SLIDER_CURSOR}</td><td>{@link #NK_COLOR_SLIDER_CURSOR_HOVER COLOR_SLIDER_CURSOR_HOVER}</td><td>{@link #NK_COLOR_SLIDER_CURSOR_ACTIVE COLOR_SLIDER_CURSOR_ACTIVE}</td></tr><tr><td>{@link #NK_COLOR_PROPERTY COLOR_PROPERTY}</td><td>{@link #NK_COLOR_EDIT COLOR_EDIT}</td><td>{@link #NK_COLOR_EDIT_CURSOR COLOR_EDIT_CURSOR}</td><td>{@link #NK_COLOR_COMBO COLOR_COMBO}</td></tr><tr><td>{@link #NK_COLOR_CHART COLOR_CHART}</td><td>{@link #NK_COLOR_CHART_COLOR COLOR_CHART_COLOR}</td><td>{@link #NK_COLOR_CHART_COLOR_HIGHLIGHT COLOR_CHART_COLOR_HIGHLIGHT}</td><td>{@link #NK_COLOR_SCROLLBAR COLOR_SCROLLBAR}</td></tr><tr><td>{@link #NK_COLOR_SCROLLBAR_CURSOR COLOR_SCROLLBAR_CURSOR}</td><td>{@link #NK_COLOR_SCROLLBAR_CURSOR_HOVER COLOR_SCROLLBAR_CURSOR_HOVER}</td><td>{@link #NK_COLOR_SCROLLBAR_CURSOR_ACTIVE COLOR_SCROLLBAR_CURSOR_ACTIVE}</td><td>{@link #NK_COLOR_TAB_HEADER COLOR_TAB_HEADER}</td></tr><tr><td>{@link #NK_COLOR_COUNT COLOR_COUNT}</td></tr></table>
	 */
	public static String nk_style_color_name(int c) {
		long __result = nnk_style_color_name(c);
		return memUTF8(__result);
	}

	// --- [ nk_style_set_font ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param font 
	 */
	public static native void nnk_style_set_font(long ctx, long font);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param font 
	 */
	public static void nk_style_set_font(NkContext ctx, NkUserFont font) {
		nnk_style_set_font(ctx.address(), font.address());
	}

	// --- [ nk_style_set_cursor ] ---

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param style one of:<br><table><tr><td>{@link #NK_CURSOR_ARROW CURSOR_ARROW}</td><td>{@link #NK_CURSOR_TEXT CURSOR_TEXT}</td><td>{@link #NK_CURSOR_MOVE CURSOR_MOVE}</td><td>{@link #NK_CURSOR_RESIZE_VERTICAL CURSOR_RESIZE_VERTICAL}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_HORIZONTAL CURSOR_RESIZE_HORIZONTAL}</td><td>{@link #NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT}</td><td>{@link #NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT}</td><td>{@link #NK_CURSOR_COUNT CURSOR_COUNT}</td></tr></table>
	 */
	public static native int nnk_style_set_cursor(long ctx, int style);

	/**
	 * 
	 *
	 * @param ctx   the nuklear context
	 * @param style one of:<br><table><tr><td>{@link #NK_CURSOR_ARROW CURSOR_ARROW}</td><td>{@link #NK_CURSOR_TEXT CURSOR_TEXT}</td><td>{@link #NK_CURSOR_MOVE CURSOR_MOVE}</td><td>{@link #NK_CURSOR_RESIZE_VERTICAL CURSOR_RESIZE_VERTICAL}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_HORIZONTAL CURSOR_RESIZE_HORIZONTAL}</td><td>{@link #NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT}</td><td>{@link #NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT}</td><td>{@link #NK_CURSOR_COUNT CURSOR_COUNT}</td></tr></table>
	 */
	public static int nk_style_set_cursor(NkContext ctx, int style) {
		return nnk_style_set_cursor(ctx.address(), style);
	}

	// --- [ nk_widget_bounds ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_widget_bounds(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkRect nk_widget_bounds(NkContext ctx, NkRect __result) {
		nnk_widget_bounds(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_widget_position ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_widget_position(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkVec2 nk_widget_position(NkContext ctx, NkVec2 __result) {
		nnk_widget_position(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_widget_size ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native void nnk_widget_size(long ctx, long __result);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkVec2 nk_widget_size(NkContext ctx, NkVec2 __result) {
		nnk_widget_size(ctx.address(), __result.address());
		return __result;
	}

	// --- [ nk_widget_is_hovered ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native int nnk_widget_is_hovered(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static boolean nk_widget_is_hovered(NkContext ctx) {
		return nnk_widget_is_hovered(ctx.address()) != 0;
	}

	// --- [ nk_widget_is_mouse_clicked ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param btn 
	 */
	public static native int nnk_widget_is_mouse_clicked(long ctx, int btn);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param btn 
	 */
	public static boolean nk_widget_is_mouse_clicked(NkContext ctx, int btn) {
		return nnk_widget_is_mouse_clicked(ctx.address(), btn) != 0;
	}

	// --- [ nk_widget_has_mouse_click_down ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param btn  one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param down 
	 */
	public static native int nnk_widget_has_mouse_click_down(long ctx, int btn, int down);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param btn  one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param down 
	 */
	public static boolean nk_widget_has_mouse_click_down(NkContext ctx, int btn, boolean down) {
		return nnk_widget_has_mouse_click_down(ctx.address(), btn, down ? 1 : 0) != 0;
	}

	// --- [ nk_spacing ] ---

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param cols 
	 */
	public static native void nnk_spacing(long ctx, int cols);

	/**
	 * 
	 *
	 * @param ctx  the nuklear context
	 * @param cols 
	 */
	public static void nk_spacing(NkContext ctx, int cols) {
		nnk_spacing(ctx.address(), cols);
	}

	// --- [ nk_widget ] ---

	/**
	 * 
	 *
	 * @param bounds 
	 * @param ctx    the nuklear context
	 */
	public static native int nnk_widget(long bounds, long ctx);

	/**
	 * 
	 *
	 * @param bounds 
	 * @param ctx    the nuklear context
	 */
	public static int nk_widget(NkRect bounds, NkContext ctx) {
		return nnk_widget(bounds.address(), ctx.address());
	}

	// --- [ nk_widget_fitting ] ---

	/**
	 * 
	 *
	 * @param bounds       
	 * @param ctx          the nuklear context
	 * @param item_padding 
	 */
	public static native int nnk_widget_fitting(long bounds, long ctx, long item_padding);

	/**
	 * 
	 *
	 * @param bounds       
	 * @param ctx          the nuklear context
	 * @param item_padding 
	 */
	public static int nk_widget_fitting(NkRect bounds, NkContext ctx, NkVec2 item_padding) {
		return nnk_widget_fitting(bounds.address(), ctx.address(), item_padding.address());
	}

	// --- [ nk_rgb ] ---

	public static native void nnk_rgb(int r, int g, int b, long __result);

	public static NkColor nk_rgb(int r, int g, int b, NkColor __result) {
		nnk_rgb(r, g, b, __result.address());
		return __result;
	}

	// --- [ nk_rgb_iv ] ---

	public static native void nnk_rgb_iv(long rgb, long __result);

	public static NkColor nk_rgb_iv(IntBuffer rgb, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgb, 3);
		nnk_rgb_iv(memAddress(rgb), __result.address());
		return __result;
	}

	// --- [ nk_rgb_bv ] ---

	public static native void nnk_rgb_bv(long rgb, long __result);

	public static NkColor nk_rgb_bv(ByteBuffer rgb, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgb, 3);
		nnk_rgb_bv(memAddress(rgb), __result.address());
		return __result;
	}

	// --- [ nk_rgb_f ] ---

	public static native void nnk_rgb_f(float r, float g, float b, long __result);

	public static NkColor nk_rgb_f(float r, float g, float b, NkColor __result) {
		nnk_rgb_f(r, g, b, __result.address());
		return __result;
	}

	// --- [ nk_rgb_fv ] ---

	public static native void nnk_rgb_fv(long rgb, long __result);

	public static NkColor nk_rgb_fv(FloatBuffer rgb, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgb, 3);
		nnk_rgb_fv(memAddress(rgb), __result.address());
		return __result;
	}

	// --- [ nk_rgb_hex ] ---

	public static native void nnk_rgb_hex(long rgb, long __result);

	public static NkColor nk_rgb_hex(ByteBuffer rgb, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgb, 6);
		nnk_rgb_hex(memAddress(rgb), __result.address());
		return __result;
	}

	public static NkColor nk_rgb_hex(CharSequence rgb, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgb, 6);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer rgbEncoded = stack.ASCII(rgb);
			nnk_rgb_hex(memAddress(rgbEncoded), __result.address());
		return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_rgba ] ---

	public static native void nnk_rgba(int r, int g, int b, int a, long __result);

	public static NkColor nk_rgba(int r, int g, int b, int a, NkColor __result) {
		nnk_rgba(r, g, b, a, __result.address());
		return __result;
	}

	// --- [ nk_rgba_u32 ] ---

	public static native void nnk_rgba_u32(int in, long __result);

	public static NkColor nk_rgba_u32(int in, NkColor __result) {
		nnk_rgba_u32(in, __result.address());
		return __result;
	}

	// --- [ nk_rgba_iv ] ---

	public static native void nnk_rgba_iv(long rgba, long __result);

	public static NkColor nk_rgba_iv(IntBuffer rgba, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgba, 4);
		nnk_rgba_iv(memAddress(rgba), __result.address());
		return __result;
	}

	// --- [ nk_rgba_bv ] ---

	public static native void nnk_rgba_bv(long rgba, long __result);

	public static NkColor nk_rgba_bv(ByteBuffer rgba, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgba, 4);
		nnk_rgba_bv(memAddress(rgba), __result.address());
		return __result;
	}

	// --- [ nk_rgba_f ] ---

	public static native void nnk_rgba_f(float r, float g, float b, float a, long __result);

	public static NkColor nk_rgba_f(float r, float g, float b, float a, NkColor __result) {
		nnk_rgba_f(r, g, b, a, __result.address());
		return __result;
	}

	// --- [ nk_rgba_fv ] ---

	public static native void nnk_rgba_fv(long rgba, long __result);

	public static NkColor nk_rgba_fv(FloatBuffer rgba, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgba, 4);
		nnk_rgba_fv(memAddress(rgba), __result.address());
		return __result;
	}

	// --- [ nk_rgba_hex ] ---

	public static native void nnk_rgba_hex(long rgba, long __result);

	public static NkColor nk_rgba_hex(ByteBuffer rgba, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgba, 8);
		nnk_rgba_hex(memAddress(rgba), __result.address());
		return __result;
	}

	public static NkColor nk_rgba_hex(CharSequence rgba, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgba, 8);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer rgbaEncoded = stack.ASCII(rgba);
			nnk_rgba_hex(memAddress(rgbaEncoded), __result.address());
		return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_hsv ] ---

	public static native void nnk_hsv(int h, int s, int v, long __result);

	public static NkColor nk_hsv(int h, int s, int v, NkColor __result) {
		nnk_hsv(h, s, v, __result.address());
		return __result;
	}

	// --- [ nk_hsv_iv ] ---

	public static native void nnk_hsv_iv(long hsv, long __result);

	public static NkColor nk_hsv_iv(IntBuffer hsv, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsv, 3);
		nnk_hsv_iv(memAddress(hsv), __result.address());
		return __result;
	}

	// --- [ nk_hsv_bv ] ---

	public static native void nnk_hsv_bv(long hsv, long __result);

	public static NkColor nk_hsv_bv(ByteBuffer hsv, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsv, 3);
		nnk_hsv_bv(memAddress(hsv), __result.address());
		return __result;
	}

	// --- [ nk_hsv_f ] ---

	public static native void nnk_hsv_f(float h, float s, float v, long __result);

	public static NkColor nk_hsv_f(float h, float s, float v, NkColor __result) {
		nnk_hsv_f(h, s, v, __result.address());
		return __result;
	}

	// --- [ nk_hsv_fv ] ---

	public static native void nnk_hsv_fv(long hsv, long __result);

	public static NkColor nk_hsv_fv(FloatBuffer hsv, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsv, 3);
		nnk_hsv_fv(memAddress(hsv), __result.address());
		return __result;
	}

	// --- [ nk_hsva ] ---

	public static native void nnk_hsva(int h, int s, int v, int a, long __result);

	public static NkColor nk_hsva(int h, int s, int v, int a, NkColor __result) {
		nnk_hsva(h, s, v, a, __result.address());
		return __result;
	}

	// --- [ nk_hsva_iv ] ---

	public static native void nnk_hsva_iv(long hsva, long __result);

	public static NkColor nk_hsva_iv(IntBuffer hsva, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsva, 4);
		nnk_hsva_iv(memAddress(hsva), __result.address());
		return __result;
	}

	// --- [ nk_hsva_bv ] ---

	public static native void nnk_hsva_bv(long hsva, long __result);

	public static NkColor nk_hsva_bv(ByteBuffer hsva, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsva, 4);
		nnk_hsva_bv(memAddress(hsva), __result.address());
		return __result;
	}

	// --- [ nk_hsva_f ] ---

	public static native void nnk_hsva_f(float h, float s, float v, float a, long __result);

	public static NkColor nk_hsva_f(float h, float s, float v, float a, NkColor __result) {
		nnk_hsva_f(h, s, v, a, __result.address());
		return __result;
	}

	// --- [ nk_hsva_fv ] ---

	public static native void nnk_hsva_fv(long hsva, long __result);

	public static NkColor nk_hsva_fv(FloatBuffer hsva, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsva, 4);
		nnk_hsva_fv(memAddress(hsva), __result.address());
		return __result;
	}

	// --- [ nk_color_f ] ---

	public static native void nnk_color_f(long r, long g, long b, long a, long color);

	public static void nk_color_f(FloatBuffer r, FloatBuffer g, FloatBuffer b, FloatBuffer a, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(r, 1);
			checkBuffer(g, 1);
			checkBuffer(b, 1);
			checkBuffer(a, 1);
		}
		nnk_color_f(memAddress(r), memAddress(g), memAddress(b), memAddress(a), color.address());
	}

	// --- [ nk_color_fv ] ---

	public static native void nnk_color_fv(long rgba_out, long color);

	public static void nk_color_fv(FloatBuffer rgba_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(rgba_out, 4);
		nnk_color_fv(memAddress(rgba_out), color.address());
	}

	// --- [ nk_color_u32 ] ---

	public static native int nnk_color_u32(long color);

	public static int nk_color_u32(NkColor color) {
		return nnk_color_u32(color.address());
	}

	// --- [ nk_color_hex_rgba ] ---

	public static native void nnk_color_hex_rgba(long output, long color);

	public static void nk_color_hex_rgba(ByteBuffer output, NkColor color) {
		if ( CHECKS )
			checkBuffer(output, 8);
		nnk_color_hex_rgba(memAddress(output), color.address());
	}

	// --- [ nk_color_hex_rgb ] ---

	public static native void nnk_color_hex_rgb(long output, long color);

	public static void nk_color_hex_rgb(ByteBuffer output, NkColor color) {
		if ( CHECKS )
			checkBuffer(output, 6);
		nnk_color_hex_rgb(memAddress(output), color.address());
	}

	// --- [ nk_color_hsv_i ] ---

	public static native void nnk_color_hsv_i(long out_h, long out_s, long out_v, long color);

	public static void nk_color_hsv_i(IntBuffer out_h, IntBuffer out_s, IntBuffer out_v, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(out_h, 1);
			checkBuffer(out_s, 1);
			checkBuffer(out_v, 1);
		}
		nnk_color_hsv_i(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
	}

	// --- [ nk_color_hsv_b ] ---

	public static native void nnk_color_hsv_b(long out_h, long out_s, long out_v, long color);

	public static void nk_color_hsv_b(ByteBuffer out_h, ByteBuffer out_s, ByteBuffer out_v, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(out_h, 1);
			checkBuffer(out_s, 1);
			checkBuffer(out_v, 1);
		}
		nnk_color_hsv_b(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
	}

	// --- [ nk_color_hsv_iv ] ---

	public static native void nnk_color_hsv_iv(long hsv_out, long color);

	public static void nk_color_hsv_iv(IntBuffer hsv_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsv_out, 3);
		nnk_color_hsv_iv(memAddress(hsv_out), color.address());
	}

	// --- [ nk_color_hsv_bv ] ---

	public static native void nnk_color_hsv_bv(long hsv_out, long color);

	public static void nk_color_hsv_bv(ByteBuffer hsv_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsv_out, 3);
		nnk_color_hsv_bv(memAddress(hsv_out), color.address());
	}

	// --- [ nk_color_hsv_f ] ---

	public static native void nnk_color_hsv_f(long out_h, long out_s, long out_v, long color);

	public static void nk_color_hsv_f(FloatBuffer out_h, FloatBuffer out_s, FloatBuffer out_v, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(out_h, 1);
			checkBuffer(out_s, 1);
			checkBuffer(out_v, 1);
		}
		nnk_color_hsv_f(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
	}

	// --- [ nk_color_hsv_fv ] ---

	public static native void nnk_color_hsv_fv(long hsv_out, long color);

	public static void nk_color_hsv_fv(FloatBuffer hsv_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsv_out, 3);
		nnk_color_hsv_fv(memAddress(hsv_out), color.address());
	}

	// --- [ nk_color_hsva_i ] ---

	public static native void nnk_color_hsva_i(long h, long s, long v, long a, long color);

	public static void nk_color_hsva_i(IntBuffer h, IntBuffer s, IntBuffer v, IntBuffer a, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(h, 1);
			checkBuffer(s, 1);
			checkBuffer(v, 1);
			checkBuffer(a, 1);
		}
		nnk_color_hsva_i(memAddress(h), memAddress(s), memAddress(v), memAddress(a), color.address());
	}

	// --- [ nk_color_hsva_b ] ---

	public static native void nnk_color_hsva_b(long h, long s, long v, long a, long color);

	public static void nk_color_hsva_b(ByteBuffer h, ByteBuffer s, ByteBuffer v, ByteBuffer a, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(h, 1);
			checkBuffer(s, 1);
			checkBuffer(v, 1);
			checkBuffer(a, 1);
		}
		nnk_color_hsva_b(memAddress(h), memAddress(s), memAddress(v), memAddress(a), color.address());
	}

	// --- [ nk_color_hsva_iv ] ---

	public static native void nnk_color_hsva_iv(long hsva_out, long color);

	public static void nk_color_hsva_iv(IntBuffer hsva_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsva_out, 4);
		nnk_color_hsva_iv(memAddress(hsva_out), color.address());
	}

	// --- [ nk_color_hsva_bv ] ---

	public static native void nnk_color_hsva_bv(long hsva_out, long color);

	public static void nk_color_hsva_bv(ByteBuffer hsva_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsva_out, 4);
		nnk_color_hsva_bv(memAddress(hsva_out), color.address());
	}

	// --- [ nk_color_hsva_f ] ---

	public static native void nnk_color_hsva_f(long out_h, long out_s, long out_v, long out_a, long color);

	public static void nk_color_hsva_f(FloatBuffer out_h, FloatBuffer out_s, FloatBuffer out_v, FloatBuffer out_a, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(out_h, 1);
			checkBuffer(out_s, 1);
			checkBuffer(out_v, 1);
			checkBuffer(out_a, 1);
		}
		nnk_color_hsva_f(memAddress(out_h), memAddress(out_s), memAddress(out_v), memAddress(out_a), color.address());
	}

	// --- [ nk_color_hsva_fv ] ---

	public static native void nnk_color_hsva_fv(long hsva_out, long color);

	public static void nk_color_hsva_fv(FloatBuffer hsva_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsva_out, 4);
		nnk_color_hsva_fv(memAddress(hsva_out), color.address());
	}

	// --- [ nk_handle_ptr ] ---

	public static native void nnk_handle_ptr(long ptr, long __result);

	public static NkHandle nk_handle_ptr(long ptr, NkHandle __result) {
		if ( CHECKS )
			checkPointer(ptr);
		nnk_handle_ptr(ptr, __result.address());
		return __result;
	}

	// --- [ nk_handle_id ] ---

	public static native void nnk_handle_id(int id, long __result);

	public static NkHandle nk_handle_id(int id, NkHandle __result) {
		nnk_handle_id(id, __result.address());
		return __result;
	}

	// --- [ nk_image_ptr ] ---

	public static native void nnk_image_ptr(long ptr, long __result);

	public static NkImage nk_image_ptr(long ptr, NkImage __result) {
		if ( CHECKS )
			checkPointer(ptr);
		nnk_image_ptr(ptr, __result.address());
		return __result;
	}

	// --- [ nk_image_id ] ---

	public static native void nnk_image_id(int id, long __result);

	public static NkImage nk_image_id(int id, NkImage __result) {
		nnk_image_id(id, __result.address());
		return __result;
	}

	// --- [ nk_image_is_subimage ] ---

	public static native int nnk_image_is_subimage(long img);

	public static boolean nk_image_is_subimage(NkImage img) {
		return nnk_image_is_subimage(img.address()) != 0;
	}

	// --- [ nk_subimage_ptr ] ---

	public static native void nnk_subimage_ptr(long ptr, short w, short h, long sub_region, long __result);

	public static NkImage nk_subimage_ptr(long ptr, short w, short h, NkRect sub_region, NkImage __result) {
		if ( CHECKS )
			checkPointer(ptr);
		nnk_subimage_ptr(ptr, w, h, sub_region.address(), __result.address());
		return __result;
	}

	// --- [ nk_subimage_id ] ---

	public static native void nnk_subimage_id(int id, short w, short h, long sub_region, long __result);

	public static NkImage nk_subimage_id(int id, short w, short h, NkRect sub_region, NkImage __result) {
		nnk_subimage_id(id, w, h, sub_region.address(), __result.address());
		return __result;
	}

	// --- [ nk_murmur_hash ] ---

	public static native int nnk_murmur_hash(long key, int len, int seed);

	public static int nk_murmur_hash(ByteBuffer key, int seed) {
		return nnk_murmur_hash(memAddress(key), key.remaining(), seed);
	}

	// --- [ nk_triangle_from_direction ] ---

	/**
	 * 
	 *
	 * @param result    
	 * @param r         
	 * @param pad_x     
	 * @param pad_y     
	 * @param direction one of:<br><table><tr><td>{@link #NK_UP UP}</td><td>{@link #NK_RIGHT RIGHT}</td><td>{@link #NK_DOWN DOWN}</td><td>{@link #NK_LEFT LEFT}</td></tr></table>
	 */
	public static native void nnk_triangle_from_direction(long result, long r, float pad_x, float pad_y, int direction);

	/**
	 * 
	 *
	 * @param result    
	 * @param r         
	 * @param pad_x     
	 * @param pad_y     
	 * @param direction one of:<br><table><tr><td>{@link #NK_UP UP}</td><td>{@link #NK_RIGHT RIGHT}</td><td>{@link #NK_DOWN DOWN}</td><td>{@link #NK_LEFT LEFT}</td></tr></table>
	 */
	public static void nk_triangle_from_direction(NkVec2 result, NkRect r, float pad_x, float pad_y, int direction) {
		nnk_triangle_from_direction(result.address(), r.address(), pad_x, pad_y, direction);
	}

	// --- [ nk_vec2 ] ---

	public static native void nnk_vec2(float x, float y, long __result);

	public static NkVec2 nk_vec2(float x, float y, NkVec2 __result) {
		nnk_vec2(x, y, __result.address());
		return __result;
	}

	// --- [ nk_vec2i ] ---

	public static native void nnk_vec2i(int x, int y, long __result);

	public static NkVec2 nk_vec2i(int x, int y, NkVec2 __result) {
		nnk_vec2i(x, y, __result.address());
		return __result;
	}

	// --- [ nk_vec2v ] ---

	public static native void nnk_vec2v(long xy, long __result);

	public static NkVec2 nk_vec2v(FloatBuffer xy, NkVec2 __result) {
		if ( CHECKS )
			checkBuffer(xy, 2);
		nnk_vec2v(memAddress(xy), __result.address());
		return __result;
	}

	// --- [ nk_vec2iv ] ---

	public static native void nnk_vec2iv(long xy, long __result);

	public static NkVec2 nk_vec2iv(IntBuffer xy, NkVec2 __result) {
		if ( CHECKS )
			checkBuffer(xy, 2);
		nnk_vec2iv(memAddress(xy), __result.address());
		return __result;
	}

	// --- [ nk_get_null_rect ] ---

	public static native void nnk_get_null_rect(long __result);

	public static NkRect nk_get_null_rect(NkRect __result) {
		nnk_get_null_rect(__result.address());
		return __result;
	}

	// --- [ nk_rect ] ---

	public static native void nnk_rect(float x, float y, float w, float h, long __result);

	public static NkRect nk_rect(float x, float y, float w, float h, NkRect __result) {
		nnk_rect(x, y, w, h, __result.address());
		return __result;
	}

	// --- [ nk_recti ] ---

	public static native void nnk_recti(int x, int y, int w, int h, long __result);

	public static NkRect nk_recti(int x, int y, int w, int h, NkRect __result) {
		nnk_recti(x, y, w, h, __result.address());
		return __result;
	}

	// --- [ nk_recta ] ---

	public static native void nnk_recta(long pos, long size, long __result);

	public static NkRect nk_recta(NkVec2 pos, NkVec2 size, NkRect __result) {
		nnk_recta(pos.address(), size.address(), __result.address());
		return __result;
	}

	// --- [ nk_rectv ] ---

	public static native void nnk_rectv(long xywh, long __result);

	public static NkRect nk_rectv(FloatBuffer xywh, NkRect __result) {
		if ( CHECKS )
			checkBuffer(xywh, 4);
		nnk_rectv(memAddress(xywh), __result.address());
		return __result;
	}

	// --- [ nk_rectiv ] ---

	public static native void nnk_rectiv(long xywh, long __result);

	public static NkRect nk_rectiv(IntBuffer xywh, NkRect __result) {
		if ( CHECKS )
			checkBuffer(xywh, 4);
		nnk_rectiv(memAddress(xywh), __result.address());
		return __result;
	}

	// --- [ nk_rect_pos ] ---

	public static native void nnk_rect_pos(long r, long __result);

	public static NkVec2 nk_rect_pos(NkRect r, NkVec2 __result) {
		nnk_rect_pos(r.address(), __result.address());
		return __result;
	}

	// --- [ nk_rect_size ] ---

	public static native void nnk_rect_size(long r, long __result);

	public static NkVec2 nk_rect_size(NkRect r, NkVec2 __result) {
		nnk_rect_size(r.address(), __result.address());
		return __result;
	}

	// --- [ nk_strlen ] ---

	public static native int nnk_strlen(long str);

	public static int nk_strlen(ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_strlen(memAddress(str));
	}

	public static int nk_strlen(CharSequence str) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_strlen(memAddress(strEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_stricmp ] ---

	public static native int nnk_stricmp(long s1, long s2);

	public static int nk_stricmp(ByteBuffer s1, ByteBuffer s2) {
		if ( CHECKS ) {
			checkNT1(s1);
			checkNT1(s2);
		}
		return nnk_stricmp(memAddress(s1), memAddress(s2));
	}

	public static int nk_stricmp(CharSequence s1, CharSequence s2) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer s1Encoded = stack.UTF8(s1);
			ByteBuffer s2Encoded = stack.UTF8(s2);
			return nnk_stricmp(memAddress(s1Encoded), memAddress(s2Encoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_stricmpn ] ---

	public static native int nnk_stricmpn(long s1, long s2, int n);

	public static int nk_stricmpn(ByteBuffer s1, ByteBuffer s2, int n) {
		if ( CHECKS ) {
			checkNT1(s1);
			checkNT1(s2);
		}
		return nnk_stricmpn(memAddress(s1), memAddress(s2), n);
	}

	public static int nk_stricmpn(CharSequence s1, CharSequence s2, int n) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer s1Encoded = stack.UTF8(s1);
			ByteBuffer s2Encoded = stack.UTF8(s2);
			return nnk_stricmpn(memAddress(s1Encoded), memAddress(s2Encoded), n);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_strtof ] ---

	public static native int nnk_strtof(long number, long buffer);

	public static boolean nk_strtof(FloatBuffer number, ByteBuffer buffer) {
		if ( CHECKS ) {
			checkBuffer(number, 1);
			checkNT1(buffer);
		}
		return nnk_strtof(memAddress(number), memAddress(buffer)) != 0;
	}

	public static boolean nk_strtof(FloatBuffer number, CharSequence buffer) {
		if ( CHECKS )
			checkBuffer(number, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer bufferEncoded = stack.UTF8(buffer);
			return nnk_strtof(memAddress(number), memAddress(bufferEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_strfilter ] ---

	/**
	 * <ul>
	 * <li>c - matches any literal character c</li>
	 * <li>. - matches any single character</li>
	 * <li>^ - matches the beginning of the input string</li>
	 * <li>$ - matches the end of the input string</li>
	 * <li>* - matches zero or more occurrences of the previous character</li>
	 * </ul>
	 *
	 * @param str    
	 * @param regexp 
	 */
	public static native int nnk_strfilter(long str, long regexp);

	/**
	 * <ul>
	 * <li>c - matches any literal character c</li>
	 * <li>. - matches any single character</li>
	 * <li>^ - matches the beginning of the input string</li>
	 * <li>$ - matches the end of the input string</li>
	 * <li>* - matches zero or more occurrences of the previous character</li>
	 * </ul>
	 *
	 * @param str    
	 * @param regexp 
	 */
	public static boolean nk_strfilter(ByteBuffer str, ByteBuffer regexp) {
		if ( CHECKS ) {
			checkNT1(str);
			checkNT1(regexp);
		}
		return nnk_strfilter(memAddress(str), memAddress(regexp)) != 0;
	}

	/**
	 * <ul>
	 * <li>c - matches any literal character c</li>
	 * <li>. - matches any single character</li>
	 * <li>^ - matches the beginning of the input string</li>
	 * <li>$ - matches the end of the input string</li>
	 * <li>* - matches zero or more occurrences of the previous character</li>
	 * </ul>
	 *
	 * @param str    
	 * @param regexp 
	 */
	public static boolean nk_strfilter(CharSequence str, CharSequence regexp) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			ByteBuffer regexpEncoded = stack.UTF8(regexp);
			return nnk_strfilter(memAddress(strEncoded), memAddress(regexpEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_strmatch_fuzzy_string ] ---

	/**
	 * Returns true if each character in {@code pattern} is found sequentially within {@code str} if found then {@code out_score} is also set. Score value has no
	 * intrinsic meaning. Range varies with {@code pattern}. Can only compare scores with same search pattern.
	 *
	 * @param str       
	 * @param pattern   
	 * @param out_score 
	 */
	public static native int nnk_strmatch_fuzzy_string(long str, long pattern, long out_score);

	/**
	 * Returns true if each character in {@code pattern} is found sequentially within {@code str} if found then {@code out_score} is also set. Score value has no
	 * intrinsic meaning. Range varies with {@code pattern}. Can only compare scores with same search pattern.
	 *
	 * @param str       
	 * @param pattern   
	 * @param out_score 
	 */
	public static boolean nk_strmatch_fuzzy_string(ByteBuffer str, ByteBuffer pattern, IntBuffer out_score) {
		if ( CHECKS ) {
			checkNT1(str);
			checkNT1(pattern);
			checkBuffer(out_score, 1);
		}
		return nnk_strmatch_fuzzy_string(memAddress(str), memAddress(pattern), memAddress(out_score)) != 0;
	}

	/**
	 * Returns true if each character in {@code pattern} is found sequentially within {@code str} if found then {@code out_score} is also set. Score value has no
	 * intrinsic meaning. Range varies with {@code pattern}. Can only compare scores with same search pattern.
	 *
	 * @param str       
	 * @param pattern   
	 * @param out_score 
	 */
	public static boolean nk_strmatch_fuzzy_string(CharSequence str, CharSequence pattern, IntBuffer out_score) {
		if ( CHECKS )
			checkBuffer(out_score, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			ByteBuffer patternEncoded = stack.UTF8(pattern);
			return nnk_strmatch_fuzzy_string(memAddress(strEncoded), memAddress(patternEncoded), memAddress(out_score)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_strmatch_fuzzy_text ] ---

	public static native int nnk_strmatch_fuzzy_text(long txt, int txt_len, long pattern, long out_score);

	public static int nk_strmatch_fuzzy_text(ByteBuffer txt, ByteBuffer pattern, IntBuffer out_score) {
		if ( CHECKS ) {
			checkNT1(pattern);
			checkBuffer(out_score, 1);
		}
		return nnk_strmatch_fuzzy_text(memAddress(txt), txt.remaining(), memAddress(pattern), memAddress(out_score));
	}

	public static int nk_strmatch_fuzzy_text(CharSequence txt, CharSequence pattern, IntBuffer out_score) {
		if ( CHECKS )
			checkBuffer(out_score, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer txtEncoded = stack.UTF8(txt, false);
			int txtEncodedLen = txtEncoded.capacity();
			ByteBuffer patternEncoded = stack.UTF8(pattern);
			return nnk_strmatch_fuzzy_text(memAddress(txtEncoded), txtEncodedLen, memAddress(patternEncoded), memAddress(out_score));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_utf_decode ] ---

	public static native int nnk_utf_decode(long c, long u, int clen);

	public static int nk_utf_decode(ByteBuffer c, IntBuffer u) {
		if ( CHECKS )
			checkBuffer(u, 1);
		return nnk_utf_decode(memAddress(c), memAddress(u), c.remaining());
	}

	// --- [ nk_utf_encode ] ---

	public static native int nnk_utf_encode(int u, long c, int clen);

	public static int nk_utf_encode(int u, ByteBuffer c) {
		return nnk_utf_encode(u, memAddress(c), c.remaining());
	}

	// --- [ nk_utf_len ] ---

	public static native int nnk_utf_len(long str, int byte_len);

	public static int nk_utf_len(ByteBuffer str) {
		return nnk_utf_len(memAddress(str), str.remaining());
	}

	// --- [ nk_utf_at ] ---

	public static native long nnk_utf_at(long buffer, int length, int index, long unicode, long len);

	public static ByteBuffer nk_utf_at(ByteBuffer buffer, int index, IntBuffer unicode) {
		if ( CHECKS )
			checkBuffer(unicode, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer len = stack.callocInt(1);
			long __result = nnk_utf_at(memAddress(buffer), buffer.remaining(), index, memAddress(unicode), memAddress(len));
			return memByteBuffer(__result, len.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_buffer_init ] ---

	public static native void nnk_buffer_init(long buffer, long allocator, long size);

	public static void nk_buffer_init(NkBuffer buffer, NkAllocator allocator, long size) {
		nnk_buffer_init(buffer.address(), allocator.address(), size);
	}

	// --- [ nk_buffer_init_fixed ] ---

	public static native void nnk_buffer_init_fixed(long buffer, long memory, long size);

	public static void nk_buffer_init_fixed(NkBuffer buffer, ByteBuffer memory) {
		nnk_buffer_init_fixed(buffer.address(), memAddress(memory), (long)memory.remaining());
	}

	// --- [ nk_buffer_info ] ---

	public static native void nnk_buffer_info(long status, long buffer);

	public static void nk_buffer_info(NkMemoryStatus status, NkBuffer buffer) {
		nnk_buffer_info(status.address(), buffer.address());
	}

	// --- [ nk_buffer_push ] ---

	/**
	 * 
	 *
	 * @param buffer 
	 * @param type   one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table>
	 * @param memory 
	 * @param size   
	 * @param align  
	 */
	public static native void nnk_buffer_push(long buffer, int type, long memory, long size, long align);

	/**
	 * 
	 *
	 * @param buffer 
	 * @param type   one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table>
	 * @param memory 
	 * @param align  
	 */
	public static void nk_buffer_push(NkBuffer buffer, int type, ByteBuffer memory, long align) {
		nnk_buffer_push(buffer.address(), type, memAddress(memory), (long)memory.remaining(), align);
	}

	// --- [ nk_buffer_mark ] ---

	/**
	 * 
	 *
	 * @param buffer 
	 * @param type   one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table>
	 */
	public static native void nnk_buffer_mark(long buffer, int type);

	/**
	 * 
	 *
	 * @param buffer 
	 * @param type   one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table>
	 */
	public static void nk_buffer_mark(NkBuffer buffer, int type) {
		nnk_buffer_mark(buffer.address(), type);
	}

	// --- [ nk_buffer_reset ] ---

	/**
	 * 
	 *
	 * @param buffer 
	 * @param type   one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table>
	 */
	public static native void nnk_buffer_reset(long buffer, int type);

	/**
	 * 
	 *
	 * @param buffer 
	 * @param type   one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table>
	 */
	public static void nk_buffer_reset(NkBuffer buffer, int type) {
		nnk_buffer_reset(buffer.address(), type);
	}

	// --- [ nk_buffer_clear ] ---

	public static native void nnk_buffer_clear(long buffer);

	public static void nk_buffer_clear(NkBuffer buffer) {
		nnk_buffer_clear(buffer.address());
	}

	// --- [ nk_buffer_free ] ---

	public static native void nnk_buffer_free(long buffer);

	public static void nk_buffer_free(NkBuffer buffer) {
		nnk_buffer_free(buffer.address());
	}

	// --- [ nk_buffer_memory ] ---

	public static native long nnk_buffer_memory(long buffer);

	public static long nk_buffer_memory(NkBuffer buffer) {
		return nnk_buffer_memory(buffer.address());
	}

	// --- [ nk_buffer_memory_const ] ---

	public static native long nnk_buffer_memory_const(long buffer);

	public static long nk_buffer_memory_const(NkBuffer buffer) {
		return nnk_buffer_memory_const(buffer.address());
	}

	// --- [ nk_buffer_total ] ---

	public static native long nnk_buffer_total(long buffer);

	public static long nk_buffer_total(NkBuffer buffer) {
		return nnk_buffer_total(buffer.address());
	}

	// --- [ nk_str_init ] ---

	public static native void nnk_str_init(long str, long allocator, long size);

	public static void nk_str_init(NkStr str, NkAllocator allocator, long size) {
		nnk_str_init(str.address(), allocator.address(), size);
	}

	// --- [ nk_str_init_fixed ] ---

	public static native void nnk_str_init_fixed(long str, long memory, long size);

	public static void nk_str_init_fixed(NkStr str, ByteBuffer memory) {
		nnk_str_init_fixed(str.address(), memAddress(memory), (long)memory.remaining());
	}

	// --- [ nk_str_clear ] ---

	public static native void nnk_str_clear(long str);

	public static void nk_str_clear(NkStr str) {
		nnk_str_clear(str.address());
	}

	// --- [ nk_str_free ] ---

	public static native void nnk_str_free(long str);

	public static void nk_str_free(NkStr str) {
		nnk_str_free(str.address());
	}

	// --- [ nk_str_append_text_char ] ---

	public static native int nnk_str_append_text_char(long s, long str, int len);

	public static int nk_str_append_text_char(NkStr s, ByteBuffer str) {
		return nnk_str_append_text_char(s.address(), memAddress(str), str.remaining());
	}

	// --- [ nk_str_append_str_char ] ---

	public static native int nnk_str_append_str_char(long s, long str);

	public static int nk_str_append_str_char(NkStr s, ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_str_append_str_char(s.address(), memAddress(str));
	}

	// --- [ nk_str_append_text_utf8 ] ---

	public static native int nnk_str_append_text_utf8(long s, long str, int len);

	public static int nk_str_append_text_utf8(NkStr s, ByteBuffer str) {
		return nnk_str_append_text_utf8(s.address(), memAddress(str), str.remaining());
	}

	// --- [ nk_str_append_str_utf8 ] ---

	public static native int nnk_str_append_str_utf8(long s, long str);

	public static int nk_str_append_str_utf8(NkStr s, ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_str_append_str_utf8(s.address(), memAddress(str));
	}

	// --- [ nk_str_append_text_runes ] ---

	public static native int nnk_str_append_text_runes(long s, long runes, int len);

	public static int nk_str_append_text_runes(NkStr s, IntBuffer runes) {
		return nnk_str_append_text_runes(s.address(), memAddress(runes), runes.remaining());
	}

	// --- [ nk_str_append_str_runes ] ---

	public static native int nnk_str_append_str_runes(long s, long runes);

	public static int nk_str_append_str_runes(NkStr s, IntBuffer runes) {
		if ( CHECKS )
			checkNT(runes);
		return nnk_str_append_str_runes(s.address(), memAddress(runes));
	}

	// --- [ nk_str_insert_at_char ] ---

	public static native int nnk_str_insert_at_char(long s, int pos, long str, int len);

	public static int nk_str_insert_at_char(NkStr s, int pos, ByteBuffer str) {
		return nnk_str_insert_at_char(s.address(), pos, memAddress(str), str.remaining());
	}

	// --- [ nk_str_insert_at_rune ] ---

	public static native int nnk_str_insert_at_rune(long s, int pos, long str, int len);

	public static int nk_str_insert_at_rune(NkStr s, int pos, ByteBuffer str) {
		return nnk_str_insert_at_rune(s.address(), pos, memAddress(str), str.remaining());
	}

	// --- [ nk_str_insert_text_char ] ---

	public static native int nnk_str_insert_text_char(long s, int pos, long str, int len);

	public static int nk_str_insert_text_char(NkStr s, int pos, ByteBuffer str) {
		return nnk_str_insert_text_char(s.address(), pos, memAddress(str), str.remaining());
	}

	// --- [ nk_str_insert_str_char ] ---

	public static native int nnk_str_insert_str_char(long s, int pos, long str);

	public static int nk_str_insert_str_char(NkStr s, int pos, ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_str_insert_str_char(s.address(), pos, memAddress(str));
	}

	// --- [ nk_str_insert_text_utf8 ] ---

	public static native int nnk_str_insert_text_utf8(long s, int pos, long str, int len);

	public static int nk_str_insert_text_utf8(NkStr s, int pos, ByteBuffer str) {
		return nnk_str_insert_text_utf8(s.address(), pos, memAddress(str), str.remaining());
	}

	// --- [ nk_str_insert_str_utf8 ] ---

	public static native int nnk_str_insert_str_utf8(long s, int pos, long str);

	public static int nk_str_insert_str_utf8(NkStr s, int pos, ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		return nnk_str_insert_str_utf8(s.address(), pos, memAddress(str));
	}

	// --- [ nk_str_insert_text_runes ] ---

	public static native int nnk_str_insert_text_runes(long s, int pos, long runes, int len);

	public static int nk_str_insert_text_runes(NkStr s, int pos, IntBuffer runes) {
		return nnk_str_insert_text_runes(s.address(), pos, memAddress(runes), runes.remaining());
	}

	// --- [ nk_str_insert_str_runes ] ---

	public static native int nnk_str_insert_str_runes(long s, int pos, long runes);

	public static int nk_str_insert_str_runes(NkStr s, int pos, IntBuffer runes) {
		return nnk_str_insert_str_runes(s.address(), pos, memAddress(runes));
	}

	// --- [ nk_str_remove_chars ] ---

	public static native void nnk_str_remove_chars(long s, int len);

	public static void nk_str_remove_chars(NkStr s, int len) {
		nnk_str_remove_chars(s.address(), len);
	}

	// --- [ nk_str_remove_runes ] ---

	public static native void nnk_str_remove_runes(long str, int len);

	public static void nk_str_remove_runes(NkStr str, int len) {
		nnk_str_remove_runes(str.address(), len);
	}

	// --- [ nk_str_delete_chars ] ---

	public static native void nnk_str_delete_chars(long s, int pos, int len);

	public static void nk_str_delete_chars(NkStr s, int pos, int len) {
		nnk_str_delete_chars(s.address(), pos, len);
	}

	// --- [ nk_str_delete_runes ] ---

	public static native void nnk_str_delete_runes(long s, int pos, int len);

	public static void nk_str_delete_runes(NkStr s, int pos, int len) {
		nnk_str_delete_runes(s.address(), pos, len);
	}

	// --- [ nk_str_at_char ] ---

	public static native long nnk_str_at_char(long s, int pos);

	public static String nk_str_at_char(NkStr s, int pos) {
		long __result = nnk_str_at_char(s.address(), pos);
		return memUTF8(__result);
	}

	// --- [ nk_str_at_rune ] ---

	public static native long nnk_str_at_rune(long s, int pos, long unicode, long len);

	public static ByteBuffer nk_str_at_rune(NkStr s, int pos, IntBuffer unicode) {
		if ( CHECKS )
			checkBuffer(unicode, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer len = stack.callocInt(1);
		try {
			long __result = nnk_str_at_rune(s.address(), pos, memAddress(unicode), memAddress(len));
			return memByteBuffer(__result, len.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_str_rune_at ] ---

	public static native int nnk_str_rune_at(long s, int pos);

	public static int nk_str_rune_at(NkStr s, int pos) {
		return nnk_str_rune_at(s.address(), pos);
	}

	// --- [ nk_str_at_char_const ] ---

	public static native long nnk_str_at_char_const(long s, int pos);

	public static String nk_str_at_char_const(NkStr s, int pos) {
		long __result = nnk_str_at_char_const(s.address(), pos);
		return memUTF8(__result);
	}

	// --- [ nk_str_at_const ] ---

	public static native long nnk_str_at_const(long s, int pos, long unicode, long len);

	public static ByteBuffer nk_str_at_const(NkStr s, int pos, IntBuffer unicode) {
		if ( CHECKS )
			checkBuffer(unicode, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer len = stack.callocInt(1);
		try {
			long __result = nnk_str_at_const(s.address(), pos, memAddress(unicode), memAddress(len));
			return memByteBuffer(__result, len.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_str_get ] ---

	public static native long nnk_str_get(long s);

	public static String nk_str_get(NkStr s) {
		long __result = nnk_str_get(s.address());
		return memUTF8(__result);
	}

	// --- [ nk_str_get_const ] ---

	public static native long nnk_str_get_const(long s);

	public static String nk_str_get_const(NkStr s) {
		long __result = nnk_str_get_const(s.address());
		return memUTF8(__result);
	}

	// --- [ nk_str_len ] ---

	public static native int nnk_str_len(long s);

	public static int nk_str_len(NkStr s) {
		return nnk_str_len(s.address());
	}

	// --- [ nk_str_len_char ] ---

	public static native int nnk_str_len_char(long s);

	public static int nk_str_len_char(NkStr s) {
		return nnk_str_len_char(s.address());
	}

	// --- [ nk_filter_default ] ---

	public static native int nnk_filter_default(long edit, int unicode);

	public static boolean nk_filter_default(NkTextEdit edit, int unicode) {
		return nnk_filter_default(edit.address(), unicode) != 0;
	}

	// --- [ nk_filter_ascii ] ---

	public static native int nnk_filter_ascii(long edit, int unicode);

	public static boolean nk_filter_ascii(NkTextEdit edit, int unicode) {
		return nnk_filter_ascii(edit.address(), unicode) != 0;
	}

	// --- [ nk_filter_float ] ---

	public static native int nnk_filter_float(long edit, int unicode);

	public static boolean nk_filter_float(NkTextEdit edit, int unicode) {
		return nnk_filter_float(edit.address(), unicode) != 0;
	}

	// --- [ nk_filter_decimal ] ---

	public static native int nnk_filter_decimal(long edit, int unicode);

	public static boolean nk_filter_decimal(NkTextEdit edit, int unicode) {
		return nnk_filter_decimal(edit.address(), unicode) != 0;
	}

	// --- [ nk_filter_hex ] ---

	public static native int nnk_filter_hex(long edit, int unicode);

	public static boolean nk_filter_hex(NkTextEdit edit, int unicode) {
		return nnk_filter_hex(edit.address(), unicode) != 0;
	}

	// --- [ nk_filter_oct ] ---

	public static native int nnk_filter_oct(long edit, int unicode);

	public static boolean nk_filter_oct(NkTextEdit edit, int unicode) {
		return nnk_filter_oct(edit.address(), unicode) != 0;
	}

	// --- [ nk_filter_binary ] ---

	public static native int nnk_filter_binary(long edit, int unicode);

	public static boolean nk_filter_binary(NkTextEdit edit, int unicode) {
		return nnk_filter_binary(edit.address(), unicode) != 0;
	}

	// --- [ nk_textedit_init ] ---

	public static native void nnk_textedit_init(long box, long allocator, long size);

	public static void nk_textedit_init(NkTextEdit box, NkAllocator allocator, long size) {
		nnk_textedit_init(box.address(), allocator.address(), size);
	}

	// --- [ nk_textedit_init_fixed ] ---

	public static native void nnk_textedit_init_fixed(long box, long memory, long size);

	public static void nk_textedit_init_fixed(NkTextEdit box, ByteBuffer memory) {
		nnk_textedit_init_fixed(box.address(), memAddress(memory), (long)memory.remaining());
	}

	// --- [ nk_textedit_free ] ---

	public static native void nnk_textedit_free(long box);

	public static void nk_textedit_free(NkTextEdit box) {
		nnk_textedit_free(box.address());
	}

	// --- [ nk_textedit_text ] ---

	public static native void nnk_textedit_text(long box, long text, int total_len);

	public static void nk_textedit_text(NkTextEdit box, ByteBuffer text) {
		nnk_textedit_text(box.address(), memAddress(text), text.remaining());
	}

	public static void nk_textedit_text(NkTextEdit box, CharSequence text) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			nnk_textedit_text(box.address(), memAddress(textEncoded), textEncodedLen);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_textedit_delete ] ---

	public static native void nnk_textedit_delete(long box, int where, int len);

	public static void nk_textedit_delete(NkTextEdit box, int where, int len) {
		nnk_textedit_delete(box.address(), where, len);
	}

	// --- [ nk_textedit_delete_selection ] ---

	public static native void nnk_textedit_delete_selection(long box);

	public static void nk_textedit_delete_selection(NkTextEdit box) {
		nnk_textedit_delete_selection(box.address());
	}

	// --- [ nk_textedit_select_all ] ---

	public static native void nnk_textedit_select_all(long box);

	public static void nk_textedit_select_all(NkTextEdit box) {
		nnk_textedit_select_all(box.address());
	}

	// --- [ nk_textedit_cut ] ---

	public static native int nnk_textedit_cut(long box);

	public static boolean nk_textedit_cut(NkTextEdit box) {
		return nnk_textedit_cut(box.address()) != 0;
	}

	// --- [ nk_textedit_paste ] ---

	public static native int nnk_textedit_paste(long box, long ctext, int len);

	public static boolean nk_textedit_paste(NkTextEdit box, ByteBuffer ctext) {
		return nnk_textedit_paste(box.address(), memAddress(ctext), ctext.remaining()) != 0;
	}

	public static boolean nk_textedit_paste(NkTextEdit box, CharSequence ctext) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer ctextEncoded = stack.UTF8(ctext, false);
			int ctextEncodedLen = ctextEncoded.capacity();
			return nnk_textedit_paste(box.address(), memAddress(ctextEncoded), ctextEncodedLen) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_textedit_undo ] ---

	public static native void nnk_textedit_undo(long box);

	public static void nk_textedit_undo(NkTextEdit box) {
		nnk_textedit_undo(box.address());
	}

	// --- [ nk_textedit_redo ] ---

	public static native void nnk_textedit_redo(long box);

	public static void nk_textedit_redo(NkTextEdit box) {
		nnk_textedit_redo(box.address());
	}

	// --- [ nk_stroke_line ] ---

	public static native void nnk_stroke_line(long b, float x0, float y0, float x1, float y1, float line_thickness, long color);

	public static void nk_stroke_line(NkCommandBuffer b, float x0, float y0, float x1, float y1, float line_thickness, NkColor color) {
		nnk_stroke_line(b.address(), x0, y0, x1, y1, line_thickness, color.address());
	}

	// --- [ nk_stroke_curve ] ---

	public static native void nnk_stroke_curve(long b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, long color);

	public static void nk_stroke_curve(NkCommandBuffer b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, NkColor color) {
		nnk_stroke_curve(b.address(), ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, color.address());
	}

	// --- [ nk_stroke_rect ] ---

	public static native void nnk_stroke_rect(long b, long rect, float rounding, float line_thickness, long color);

	public static void nk_stroke_rect(NkCommandBuffer b, NkRect rect, float rounding, float line_thickness, NkColor color) {
		nnk_stroke_rect(b.address(), rect.address(), rounding, line_thickness, color.address());
	}

	// --- [ nk_stroke_circle ] ---

	public static native void nnk_stroke_circle(long b, long rect, float line_thickness, long color);

	public static void nk_stroke_circle(NkCommandBuffer b, NkRect rect, float line_thickness, NkColor color) {
		nnk_stroke_circle(b.address(), rect.address(), line_thickness, color.address());
	}

	// --- [ nk_stroke_arc ] ---

	public static native void nnk_stroke_arc(long b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, long color);

	public static void nk_stroke_arc(NkCommandBuffer b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, NkColor color) {
		nnk_stroke_arc(b.address(), cx, cy, radius, a_min, a_max, line_thickness, color.address());
	}

	// --- [ nk_stroke_triangle ] ---

	public static native void nnk_stroke_triangle(long b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, long color);

	public static void nk_stroke_triangle(NkCommandBuffer b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, NkColor color) {
		nnk_stroke_triangle(b.address(), x0, y0, x1, y1, x2, y2, line_thichness, color.address());
	}

	// --- [ nk_stroke_polyline ] ---

	public static native void nnk_stroke_polyline(long b, long points, int point_count, float line_thickness, long col);

	public static void nk_stroke_polyline(NkCommandBuffer b, FloatBuffer points, float line_thickness, NkColor col) {
		nnk_stroke_polyline(b.address(), memAddress(points), points.remaining(), line_thickness, col.address());
	}

	// --- [ nk_stroke_polygon ] ---

	public static native void nnk_stroke_polygon(long b, long points, int point_count, float line_thickness, long color);

	public static void nk_stroke_polygon(NkCommandBuffer b, FloatBuffer points, float line_thickness, NkColor color) {
		nnk_stroke_polygon(b.address(), memAddress(points), points.remaining(), line_thickness, color.address());
	}

	// --- [ nk_fill_rect ] ---

	public static native void nnk_fill_rect(long b, long rect, float rounding, long color);

	public static void nk_fill_rect(NkCommandBuffer b, NkRect rect, float rounding, NkColor color) {
		nnk_fill_rect(b.address(), rect.address(), rounding, color.address());
	}

	// --- [ nk_fill_rect_multi_color ] ---

	public static native void nnk_fill_rect_multi_color(long b, long rect, long left, long top, long right, long bottom);

	public static void nk_fill_rect_multi_color(NkCommandBuffer b, NkRect rect, NkColor left, NkColor top, NkColor right, NkColor bottom) {
		nnk_fill_rect_multi_color(b.address(), rect.address(), left.address(), top.address(), right.address(), bottom.address());
	}

	// --- [ nk_fill_circle ] ---

	public static native void nnk_fill_circle(long b, long rect, long color);

	public static void nk_fill_circle(NkCommandBuffer b, NkRect rect, NkColor color) {
		nnk_fill_circle(b.address(), rect.address(), color.address());
	}

	// --- [ nk_fill_arc ] ---

	public static native void nnk_fill_arc(long b, float cx, float cy, float radius, float a_min, float a_max, long color);

	public static void nk_fill_arc(NkCommandBuffer b, float cx, float cy, float radius, float a_min, float a_max, NkColor color) {
		nnk_fill_arc(b.address(), cx, cy, radius, a_min, a_max, color.address());
	}

	// --- [ nk_fill_triangle ] ---

	public static native void nnk_fill_triangle(long b, float x0, float y0, float x1, float y1, float x2, float y2, long color);

	public static void nk_fill_triangle(NkCommandBuffer b, float x0, float y0, float x1, float y1, float x2, float y2, NkColor color) {
		nnk_fill_triangle(b.address(), x0, y0, x1, y1, x2, y2, color.address());
	}

	// --- [ nk_fill_polygon ] ---

	public static native void nnk_fill_polygon(long b, long points, int point_count, long color);

	public static void nk_fill_polygon(NkCommandBuffer b, FloatBuffer points, NkColor color) {
		nnk_fill_polygon(b.address(), memAddress(points), points.remaining(), color.address());
	}

	// --- [ nk_push_scissor ] ---

	public static native void nnk_push_scissor(long b, long rect);

	public static void nk_push_scissor(NkCommandBuffer b, NkRect rect) {
		nnk_push_scissor(b.address(), rect.address());
	}

	// --- [ nk_draw_image ] ---

	public static native void nnk_draw_image(long b, long rect, long img);

	public static void nk_draw_image(NkCommandBuffer b, NkRect rect, NkImage img) {
		nnk_draw_image(b.address(), rect.address(), img.address());
	}

	// --- [ nk_draw_text ] ---

	public static native void nnk_draw_text(long b, long rect, long string, int length, long font, long bg, long fg);

	public static void nk_draw_text(NkCommandBuffer b, NkRect rect, ByteBuffer string, NkUserFont font, NkColor bg, NkColor fg) {
		nnk_draw_text(b.address(), rect.address(), memAddress(string), string.remaining(), font.address(), bg.address(), fg.address());
	}

	public static void nk_draw_text(NkCommandBuffer b, NkRect rect, CharSequence string, NkUserFont font, NkColor bg, NkColor fg) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string, false);
			int stringEncodedLen = stringEncoded.capacity();
			nnk_draw_text(b.address(), rect.address(), memAddress(stringEncoded), stringEncodedLen, font.address(), bg.address(), fg.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk__next ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param cmd 
	 */
	public static native long nnk__next(long ctx, long cmd);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 * @param cmd 
	 */
	public static NkCommand nk__next(NkContext ctx, NkCommand cmd) {
		long __result = nnk__next(ctx.address(), cmd.address());
		return NkCommand.create(__result);
	}

	// --- [ nk__begin ] ---

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static native long nnk__begin(long ctx);

	/**
	 * 
	 *
	 * @param ctx the nuklear context
	 */
	public static NkCommand nk__begin(NkContext ctx) {
		long __result = nnk__begin(ctx.address());
		return NkCommand.create(__result);
	}

	// --- [ nk_input_has_mouse_click ] ---

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static native int nnk_input_has_mouse_click(long i, int id);

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static boolean nk_input_has_mouse_click(NkInput i, int id) {
		return nnk_input_has_mouse_click(i.address(), id) != 0;
	}

	// --- [ nk_input_has_mouse_click_in_rect ] ---

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 */
	public static native int nnk_input_has_mouse_click_in_rect(long i, int id, long rect);

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 */
	public static boolean nk_input_has_mouse_click_in_rect(NkInput i, int id, NkRect rect) {
		return nnk_input_has_mouse_click_in_rect(i.address(), id, rect.address()) != 0;
	}

	// --- [ nk_input_has_mouse_click_down_in_rect ] ---

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 * @param down 
	 */
	public static native int nnk_input_has_mouse_click_down_in_rect(long i, int id, long rect, int down);

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 * @param down 
	 */
	public static boolean nk_input_has_mouse_click_down_in_rect(NkInput i, int id, NkRect rect, int down) {
		return nnk_input_has_mouse_click_down_in_rect(i.address(), id, rect.address(), down) != 0;
	}

	// --- [ nk_input_is_mouse_click_in_rect ] ---

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 */
	public static native int nnk_input_is_mouse_click_in_rect(long i, int id, long rect);

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 */
	public static boolean nk_input_is_mouse_click_in_rect(NkInput i, int id, NkRect rect) {
		return nnk_input_is_mouse_click_in_rect(i.address(), id, rect.address()) != 0;
	}

	// --- [ nk_input_is_mouse_click_down_in_rect ] ---

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param b    
	 * @param down 
	 */
	public static native int nnk_input_is_mouse_click_down_in_rect(long i, int id, long b, int down);

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param b    
	 * @param down 
	 */
	public static boolean nk_input_is_mouse_click_down_in_rect(NkInput i, int id, NkRect b, int down) {
		return nnk_input_is_mouse_click_down_in_rect(i.address(), id, b.address(), down) != 0;
	}

	// --- [ nk_input_any_mouse_click_in_rect ] ---

	public static native int nnk_input_any_mouse_click_in_rect(long i, long rect);

	public static boolean nk_input_any_mouse_click_in_rect(NkInput i, NkRect rect) {
		return nnk_input_any_mouse_click_in_rect(i.address(), rect.address()) != 0;
	}

	// --- [ nk_input_is_mouse_prev_hovering_rect ] ---

	public static native int nnk_input_is_mouse_prev_hovering_rect(long i, long rect);

	public static boolean nk_input_is_mouse_prev_hovering_rect(NkInput i, NkRect rect) {
		return nnk_input_is_mouse_prev_hovering_rect(i.address(), rect.address()) != 0;
	}

	// --- [ nk_input_is_mouse_hovering_rect ] ---

	public static native int nnk_input_is_mouse_hovering_rect(long i, long rect);

	public static boolean nk_input_is_mouse_hovering_rect(NkInput i, NkRect rect) {
		return nnk_input_is_mouse_hovering_rect(i.address(), rect.address()) != 0;
	}

	// --- [ nk_input_mouse_clicked ] ---

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 */
	public static native int nnk_input_mouse_clicked(long i, int id, long rect);

	/**
	 * 
	 *
	 * @param i    
	 * @param id   one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 * @param rect 
	 */
	public static boolean nk_input_mouse_clicked(NkInput i, int id, NkRect rect) {
		return nnk_input_mouse_clicked(i.address(), id, rect.address()) != 0;
	}

	// --- [ nk_input_is_mouse_down ] ---

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static native int nnk_input_is_mouse_down(long i, int id);

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static boolean nk_input_is_mouse_down(NkInput i, int id) {
		return nnk_input_is_mouse_down(i.address(), id) != 0;
	}

	// --- [ nk_input_is_mouse_pressed ] ---

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static native int nnk_input_is_mouse_pressed(long i, int id);

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static boolean nk_input_is_mouse_pressed(NkInput i, int id) {
		return nnk_input_is_mouse_pressed(i.address(), id) != 0;
	}

	// --- [ nk_input_is_mouse_released ] ---

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static native int nnk_input_is_mouse_released(long i, int id);

	/**
	 * 
	 *
	 * @param i  
	 * @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_MAX BUTTON_MAX}</td></tr></table>
	 */
	public static boolean nk_input_is_mouse_released(NkInput i, int id) {
		return nnk_input_is_mouse_released(i.address(), id) != 0;
	}

	// --- [ nk_input_is_key_pressed ] ---

	/**
	 * 
	 *
	 * @param i   
	 * @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 */
	public static native int nnk_input_is_key_pressed(long i, int key);

	/**
	 * 
	 *
	 * @param i   
	 * @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 */
	public static boolean nk_input_is_key_pressed(NkInput i, int key) {
		return nnk_input_is_key_pressed(i.address(), key) != 0;
	}

	// --- [ nk_input_is_key_released ] ---

	/**
	 * 
	 *
	 * @param i   
	 * @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 */
	public static native int nnk_input_is_key_released(long i, int key);

	/**
	 * 
	 *
	 * @param i   
	 * @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 */
	public static boolean nk_input_is_key_released(NkInput i, int key) {
		return nnk_input_is_key_released(i.address(), key) != 0;
	}

	// --- [ nk_input_is_key_down ] ---

	/**
	 * 
	 *
	 * @param i   
	 * @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 */
	public static native int nnk_input_is_key_down(long i, int key);

	/**
	 * 
	 *
	 * @param i   
	 * @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td><td>{@link #NK_KEY_MAX KEY_MAX}</td></tr></table>
	 */
	public static boolean nk_input_is_key_down(NkInput i, int key) {
		return nnk_input_is_key_down(i.address(), key) != 0;
	}

	// --- [ nk_draw_list_init ] ---

	public static native void nnk_draw_list_init(long list);

	public static void nk_draw_list_init(NkDrawList list) {
		nnk_draw_list_init(list.address());
	}

	// --- [ nk_draw_list_setup ] ---

	/**
	 * 
	 *
	 * @param list         
	 * @param global_alpha 
	 * @param line_AA      one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 * @param shape_AA     one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 * @param null_texture 
	 * @param cmds         
	 * @param vert         
	 * @param elem         
	 */
	public static native void nnk_draw_list_setup(long list, float global_alpha, int line_AA, int shape_AA, long null_texture, long cmds, long vert, long elem);

	/**
	 * 
	 *
	 * @param list         
	 * @param global_alpha 
	 * @param line_AA      one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 * @param shape_AA     one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 * @param null_texture 
	 * @param cmds         
	 * @param vert         
	 * @param elem         
	 */
	public static void nk_draw_list_setup(NkDrawList list, float global_alpha, int line_AA, int shape_AA, NkDrawNullTexture null_texture, NkBuffer cmds, NkBuffer vert, NkBuffer elem) {
		nnk_draw_list_setup(list.address(), global_alpha, line_AA, shape_AA, null_texture.address(), cmds.address(), vert.address(), elem.address());
	}

	// --- [ nk_draw_list_clear ] ---

	public static native void nnk_draw_list_clear(long list);

	public static void nk_draw_list_clear(NkDrawList list) {
		nnk_draw_list_clear(list.address());
	}

	// --- [ nk__draw_list_begin ] ---

	public static native long nnk__draw_list_begin(long list, long buffer);

	public static NkDrawCommand nk__draw_list_begin(NkDrawList list, NkBuffer buffer) {
		long __result = nnk__draw_list_begin(list.address(), buffer.address());
		return NkDrawCommand.create(__result);
	}

	// --- [ nk__draw_list_next ] ---

	public static native long nnk__draw_list_next(long cmd, long buffer, long list);

	public static NkDrawCommand nk__draw_list_next(NkDrawCommand cmd, NkBuffer buffer, NkDrawList list) {
		long __result = nnk__draw_list_next(cmd.address(), buffer.address(), list.address());
		return NkDrawCommand.create(__result);
	}

	// --- [ nk__draw_begin ] ---

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param buffer 
	 */
	public static native long nnk__draw_begin(long ctx, long buffer);

	/**
	 * 
	 *
	 * @param ctx    the nuklear context
	 * @param buffer 
	 */
	public static NkDrawCommand nk__draw_begin(NkContext ctx, NkBuffer buffer) {
		long __result = nnk__draw_begin(ctx.address(), buffer.address());
		return NkDrawCommand.create(__result);
	}

	// --- [ nk__draw_next ] ---

	/**
	 * 
	 *
	 * @param cmd    
	 * @param buffer 
	 * @param ctx    the nuklear context
	 */
	public static native long nnk__draw_next(long cmd, long buffer, long ctx);

	/**
	 * 
	 *
	 * @param cmd    
	 * @param buffer 
	 * @param ctx    the nuklear context
	 */
	public static NkDrawCommand nk__draw_next(NkDrawCommand cmd, NkBuffer buffer, NkContext ctx) {
		long __result = nnk__draw_next(cmd.address(), buffer.address(), ctx.address());
		return NkDrawCommand.create(__result);
	}

	// --- [ nk_draw_list_path_clear ] ---

	public static native void nnk_draw_list_path_clear(long list);

	public static void nk_draw_list_path_clear(NkDrawList list) {
		nnk_draw_list_path_clear(list.address());
	}

	// --- [ nk_draw_list_path_line_to ] ---

	public static native void nnk_draw_list_path_line_to(long list, long pos);

	public static void nk_draw_list_path_line_to(NkDrawList list, NkVec2 pos) {
		nnk_draw_list_path_line_to(list.address(), pos.address());
	}

	// --- [ nk_draw_list_path_arc_to_fast ] ---

	public static native void nnk_draw_list_path_arc_to_fast(long list, long center, float radius, int a_min, int a_max);

	public static void nk_draw_list_path_arc_to_fast(NkDrawList list, NkVec2 center, float radius, int a_min, int a_max) {
		nnk_draw_list_path_arc_to_fast(list.address(), center.address(), radius, a_min, a_max);
	}

	// --- [ nk_draw_list_path_arc_to ] ---

	public static native void nnk_draw_list_path_arc_to(long list, long center, float radius, float a_min, float a_max, int segments);

	public static void nk_draw_list_path_arc_to(NkDrawList list, NkVec2 center, float radius, float a_min, float a_max, int segments) {
		nnk_draw_list_path_arc_to(list.address(), center.address(), radius, a_min, a_max, segments);
	}

	// --- [ nk_draw_list_path_rect_to ] ---

	public static native void nnk_draw_list_path_rect_to(long list, long a, long b, float rounding);

	public static void nk_draw_list_path_rect_to(NkDrawList list, NkVec2 a, NkVec2 b, float rounding) {
		nnk_draw_list_path_rect_to(list.address(), a.address(), b.address(), rounding);
	}

	// --- [ nk_draw_list_path_curve_to ] ---

	public static native void nnk_draw_list_path_curve_to(long list, long p2, long p3, long p4, int num_segments);

	public static void nk_draw_list_path_curve_to(NkDrawList list, NkVec2 p2, NkVec2 p3, NkVec2 p4, int num_segments) {
		nnk_draw_list_path_curve_to(list.address(), p2.address(), p3.address(), p4.address(), num_segments);
	}

	// --- [ nk_draw_list_path_fill ] ---

	public static native void nnk_draw_list_path_fill(long list, long color);

	public static void nk_draw_list_path_fill(NkDrawList list, NkColor color) {
		nnk_draw_list_path_fill(list.address(), color.address());
	}

	// --- [ nk_draw_list_path_stroke ] ---

	/**
	 * 
	 *
	 * @param list      
	 * @param color     
	 * @param closed    one of:<br><table><tr><td>{@link #NK_STROKE_OPEN STROKE_OPEN}</td><td>{@link #NK_STROKE_CLOSED STROKE_CLOSED}</td></tr></table>
	 * @param thickness 
	 */
	public static native void nnk_draw_list_path_stroke(long list, long color, int closed, float thickness);

	/**
	 * 
	 *
	 * @param list      
	 * @param color     
	 * @param closed    one of:<br><table><tr><td>{@link #NK_STROKE_OPEN STROKE_OPEN}</td><td>{@link #NK_STROKE_CLOSED STROKE_CLOSED}</td></tr></table>
	 * @param thickness 
	 */
	public static void nk_draw_list_path_stroke(NkDrawList list, NkColor color, int closed, float thickness) {
		nnk_draw_list_path_stroke(list.address(), color.address(), closed, thickness);
	}

	// --- [ nk_draw_list_stroke_line ] ---

	public static native void nnk_draw_list_stroke_line(long list, long a, long b, long color, float thickness);

	public static void nk_draw_list_stroke_line(NkDrawList list, NkVec2 a, NkVec2 b, NkColor color, float thickness) {
		nnk_draw_list_stroke_line(list.address(), a.address(), b.address(), color.address(), thickness);
	}

	// --- [ nk_draw_list_stroke_rect ] ---

	public static native void nnk_draw_list_stroke_rect(long list, long rect, long color, float rounding, float thickness);

	public static void nk_draw_list_stroke_rect(NkDrawList list, NkRect rect, NkColor color, float rounding, float thickness) {
		nnk_draw_list_stroke_rect(list.address(), rect.address(), color.address(), rounding, thickness);
	}

	// --- [ nk_draw_list_stroke_triangle ] ---

	public static native void nnk_draw_list_stroke_triangle(long list, long a, long b, long c, long color, float thickness);

	public static void nk_draw_list_stroke_triangle(NkDrawList list, NkVec2 a, NkVec2 b, NkVec2 c, NkColor color, float thickness) {
		nnk_draw_list_stroke_triangle(list.address(), a.address(), b.address(), c.address(), color.address(), thickness);
	}

	// --- [ nk_draw_list_stroke_circle ] ---

	public static native void nnk_draw_list_stroke_circle(long list, long center, float radius, long color, int segs, float thickness);

	public static void nk_draw_list_stroke_circle(NkDrawList list, NkVec2 center, float radius, NkColor color, int segs, float thickness) {
		nnk_draw_list_stroke_circle(list.address(), center.address(), radius, color.address(), segs, thickness);
	}

	// --- [ nk_draw_list_stroke_curve ] ---

	public static native void nnk_draw_list_stroke_curve(long list, long p0, long cp0, long cp1, long p1, long color, int segments, float thickness);

	public static void nk_draw_list_stroke_curve(NkDrawList list, NkVec2 p0, NkVec2 cp0, NkVec2 cp1, NkVec2 p1, NkColor color, int segments, float thickness) {
		nnk_draw_list_stroke_curve(list.address(), p0.address(), cp0.address(), cp1.address(), p1.address(), color.address(), segments, thickness);
	}

	// --- [ nk_draw_list_stroke_poly_line ] ---

	/**
	 * 
	 *
	 * @param list      
	 * @param pnts      
	 * @param cnt       
	 * @param color     
	 * @param closed    one of:<br><table><tr><td>{@link #NK_STROKE_OPEN STROKE_OPEN}</td><td>{@link #NK_STROKE_CLOSED STROKE_CLOSED}</td></tr></table>
	 * @param thickness 
	 * @param aliasing  one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 */
	public static native void nnk_draw_list_stroke_poly_line(long list, long pnts, int cnt, long color, int closed, float thickness, int aliasing);

	/**
	 * 
	 *
	 * @param list      
	 * @param pnts      
	 * @param cnt       
	 * @param color     
	 * @param closed    one of:<br><table><tr><td>{@link #NK_STROKE_OPEN STROKE_OPEN}</td><td>{@link #NK_STROKE_CLOSED STROKE_CLOSED}</td></tr></table>
	 * @param thickness 
	 * @param aliasing  one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 */
	public static void nk_draw_list_stroke_poly_line(NkDrawList list, NkVec2 pnts, int cnt, NkColor color, int closed, float thickness, int aliasing) {
		nnk_draw_list_stroke_poly_line(list.address(), pnts.address(), cnt, color.address(), closed, thickness, aliasing);
	}

	// --- [ nk_draw_list_fill_rect ] ---

	public static native void nnk_draw_list_fill_rect(long list, long rect, long color, float rounding);

	public static void nk_draw_list_fill_rect(NkDrawList list, NkRect rect, NkColor color, float rounding) {
		nnk_draw_list_fill_rect(list.address(), rect.address(), color.address(), rounding);
	}

	// --- [ nk_draw_list_fill_rect_multi_color ] ---

	public static native void nnk_draw_list_fill_rect_multi_color(long list, long rect, long left, long top, long right, long bottom);

	public static void nk_draw_list_fill_rect_multi_color(NkDrawList list, NkRect rect, NkColor left, NkColor top, NkColor right, NkColor bottom) {
		nnk_draw_list_fill_rect_multi_color(list.address(), rect.address(), left.address(), top.address(), right.address(), bottom.address());
	}

	// --- [ nk_draw_list_fill_triangle ] ---

	public static native void nnk_draw_list_fill_triangle(long list, long a, long b, long c, long color);

	public static void nk_draw_list_fill_triangle(NkDrawList list, NkVec2 a, NkVec2 b, NkVec2 c, NkColor color) {
		nnk_draw_list_fill_triangle(list.address(), a.address(), b.address(), c.address(), color.address());
	}

	// --- [ nk_draw_list_fill_circle ] ---

	public static native void nnk_draw_list_fill_circle(long list, long center, float radius, long col, int segs);

	public static void nk_draw_list_fill_circle(NkDrawList list, NkVec2 center, float radius, NkColor col, int segs) {
		nnk_draw_list_fill_circle(list.address(), center.address(), radius, col.address(), segs);
	}

	// --- [ nk_draw_list_fill_poly_convex ] ---

	/**
	 * 
	 *
	 * @param list     
	 * @param points   
	 * @param count    
	 * @param color    
	 * @param aliasing one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 */
	public static native void nnk_draw_list_fill_poly_convex(long list, long points, int count, long color, int aliasing);

	/**
	 * 
	 *
	 * @param list     
	 * @param points   
	 * @param color    
	 * @param aliasing one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
	 */
	public static void nk_draw_list_fill_poly_convex(NkDrawList list, NkVec2.Buffer points, NkColor color, int aliasing) {
		nnk_draw_list_fill_poly_convex(list.address(), points.address(), points.remaining(), color.address(), aliasing);
	}

	// --- [ nk_draw_list_add_image ] ---

	public static native void nnk_draw_list_add_image(long list, long texture, long rect, long color);

	public static void nk_draw_list_add_image(NkDrawList list, NkImage texture, NkRect rect, NkColor color) {
		nnk_draw_list_add_image(list.address(), texture.address(), rect.address(), color.address());
	}

	// --- [ nk_draw_list_add_text ] ---

	public static native void nnk_draw_list_add_text(long list, long font, long rect, long text, int len, float font_height, long color);

	public static void nk_draw_list_add_text(NkDrawList list, NkUserFont font, NkRect rect, ByteBuffer text, float font_height, NkColor color) {
		nnk_draw_list_add_text(list.address(), font.address(), rect.address(), memAddress(text), text.remaining(), font_height, color.address());
	}

	public static void nk_draw_list_add_text(NkDrawList list, NkUserFont font, NkRect rect, CharSequence text, float font_height, NkColor color) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer textEncoded = stack.UTF8(text, false);
			int textEncodedLen = textEncoded.capacity();
			nnk_draw_list_add_text(list.address(), font.address(), rect.address(), memAddress(textEncoded), textEncodedLen, font_height, color.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nk_draw_list_push_userdata ] ---

	public static native void nnk_draw_list_push_userdata(long list, long userdata);

	public static void nk_draw_list_push_userdata(NkDrawList list, NkHandle userdata) {
		nnk_draw_list_push_userdata(list.address(), userdata.address());
	}

	// --- [ nk_style_item_image ] ---

	public static native void nnk_style_item_image(long img, long __result);

	public static NkStyleItem nk_style_item_image(NkImage img, NkStyleItem __result) {
		nnk_style_item_image(img.address(), __result.address());
		return __result;
	}

	// --- [ nk_style_item_color ] ---

	public static native void nnk_style_item_color(long color, long __result);

	public static NkStyleItem nk_style_item_color(NkColor color, NkStyleItem __result) {
		nnk_style_item_color(color.address(), __result.address());
		return __result;
	}

	// --- [ nk_style_item_hide ] ---

	public static native void nnk_style_item_hide(long __result);

	public static NkStyleItem nk_style_item_hide(NkStyleItem __result) {
		nnk_style_item_hide(__result.address());
		return __result;
	}

	/** Array version of: {@link #nk_layout_row layout_row} */
	public static native void nnk_layout_row(long ctx, int fmt, float height, int cols, float[] ratio);

	/** Array version of: {@link #nk_layout_row layout_row} */
	public static void nk_layout_row(NkContext ctx, int fmt, float height, int cols, float[] ratio) {
		nnk_layout_row(ctx.address(), fmt, height, cols, ratio);
	}

	/** Array version of: {@link #nk_checkbox_label checkbox_label} */
	public static native int nnk_checkbox_label(long ctx, long str, int[] active);

	/** Array version of: {@link #nk_checkbox_label checkbox_label} */
	public static boolean nk_checkbox_label(NkContext ctx, ByteBuffer str, int[] active) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(active, 1);
		}
		return nnk_checkbox_label(ctx.address(), memAddress(str), active) != 0;
	}

	/** Array version of: {@link #nk_checkbox_label checkbox_label} */
	public static boolean nk_checkbox_label(NkContext ctx, CharSequence str, int[] active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_checkbox_label(ctx.address(), memAddress(strEncoded), active) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_checkbox_text checkbox_text} */
	public static native int nnk_checkbox_text(long ctx, long str, int len, int[] active);

	/** Array version of: {@link #nk_checkbox_text checkbox_text} */
	public static boolean nk_checkbox_text(NkContext ctx, ByteBuffer str, int[] active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		return nnk_checkbox_text(ctx.address(), memAddress(str), str.remaining(), active) != 0;
	}

	/** Array version of: {@link #nk_checkbox_text checkbox_text} */
	public static boolean nk_checkbox_text(NkContext ctx, CharSequence str, int[] active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_checkbox_text(ctx.address(), memAddress(strEncoded), strEncodedLen, active) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_checkbox_flags_label checkbox_flags_label} */
	public static native int nnk_checkbox_flags_label(long ctx, long str, int[] flags, int value);

	/** Array version of: {@link #nk_checkbox_flags_label checkbox_flags_label} */
	public static boolean nk_checkbox_flags_label(NkContext ctx, ByteBuffer str, int[] flags, int value) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(flags, 1);
		}
		return nnk_checkbox_flags_label(ctx.address(), memAddress(str), flags, value) != 0;
	}

	/** Array version of: {@link #nk_checkbox_flags_label checkbox_flags_label} */
	public static boolean nk_checkbox_flags_label(NkContext ctx, CharSequence str, int[] flags, int value) {
		if ( CHECKS )
			checkBuffer(flags, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_checkbox_flags_label(ctx.address(), memAddress(strEncoded), flags, value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_checkbox_flags_text checkbox_flags_text} */
	public static native int nnk_checkbox_flags_text(long ctx, long str, int len, int[] flags, int value);

	/** Array version of: {@link #nk_checkbox_flags_text checkbox_flags_text} */
	public static boolean nk_checkbox_flags_text(NkContext ctx, ByteBuffer str, int[] flags, int value) {
		if ( CHECKS )
			checkBuffer(flags, 1);
		return nnk_checkbox_flags_text(ctx.address(), memAddress(str), str.remaining(), flags, value) != 0;
	}

	/** Array version of: {@link #nk_checkbox_flags_text checkbox_flags_text} */
	public static boolean nk_checkbox_flags_text(NkContext ctx, CharSequence str, int[] flags, int value) {
		if ( CHECKS )
			checkBuffer(flags, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_checkbox_flags_text(ctx.address(), memAddress(strEncoded), strEncodedLen, flags, value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_radio_label radio_label} */
	public static native int nnk_radio_label(long ctx, long str, int[] active);

	/** Array version of: {@link #nk_radio_label radio_label} */
	public static boolean nk_radio_label(NkContext ctx, ByteBuffer str, int[] active) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(active, 1);
		}
		return nnk_radio_label(ctx.address(), memAddress(str), active) != 0;
	}

	/** Array version of: {@link #nk_radio_label radio_label} */
	public static boolean nk_radio_label(NkContext ctx, CharSequence str, int[] active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_radio_label(ctx.address(), memAddress(strEncoded), active) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_radio_text radio_text} */
	public static native int nnk_radio_text(long ctx, long str, int len, int[] active);

	/** Array version of: {@link #nk_radio_text radio_text} */
	public static boolean nk_radio_text(NkContext ctx, ByteBuffer str, int[] active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		return nnk_radio_text(ctx.address(), memAddress(str), str.remaining(), active) != 0;
	}

	/** Array version of: {@link #nk_radio_text radio_text} */
	public static boolean nk_radio_text(NkContext ctx, CharSequence str, int[] active) {
		if ( CHECKS )
			checkBuffer(active, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_radio_text(ctx.address(), memAddress(strEncoded), strEncodedLen, active) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_selectable_label selectable_label} */
	public static native int nnk_selectable_label(long ctx, long str, int align, int[] value);

	/** Array version of: {@link #nk_selectable_label selectable_label} */
	public static boolean nk_selectable_label(NkContext ctx, ByteBuffer str, int align, int[] value) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(value, 1);
		}
		return nnk_selectable_label(ctx.address(), memAddress(str), align, value) != 0;
	}

	/** Array version of: {@link #nk_selectable_label selectable_label} */
	public static boolean nk_selectable_label(NkContext ctx, CharSequence str, int align, int[] value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_selectable_label(ctx.address(), memAddress(strEncoded), align, value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_selectable_text selectable_text} */
	public static native int nnk_selectable_text(long ctx, long str, int len, int align, int[] value);

	/** Array version of: {@link #nk_selectable_text selectable_text} */
	public static boolean nk_selectable_text(NkContext ctx, ByteBuffer str, int align, int[] value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return nnk_selectable_text(ctx.address(), memAddress(str), str.remaining(), align, value) != 0;
	}

	/** Array version of: {@link #nk_selectable_text selectable_text} */
	public static boolean nk_selectable_text(NkContext ctx, CharSequence str, int align, int[] value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_selectable_text(ctx.address(), memAddress(strEncoded), strEncodedLen, align, value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_selectable_image_label selectable_image_label} */
	public static native int nnk_selectable_image_label(long ctx, long img, long str, int align, int[] value);

	/** Array version of: {@link #nk_selectable_image_label selectable_image_label} */
	public static boolean nk_selectable_image_label(NkContext ctx, NkImage img, ByteBuffer str, int align, int[] value) {
		if ( CHECKS ) {
			checkNT1(str);
			checkBuffer(value, 1);
		}
		return nnk_selectable_image_label(ctx.address(), img == null ? NULL : img.address(), memAddress(str), align, value) != 0;
	}

	/** Array version of: {@link #nk_selectable_image_label selectable_image_label} */
	public static boolean nk_selectable_image_label(NkContext ctx, NkImage img, CharSequence str, int align, int[] value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			return nnk_selectable_image_label(ctx.address(), img == null ? NULL : img.address(), memAddress(strEncoded), align, value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_selectable_image_text selectable_image_text} */
	public static native int nnk_selectable_image_text(long ctx, long img, long str, int len, int align, int[] value);

	/** Array version of: {@link #nk_selectable_image_text selectable_image_text} */
	public static boolean nk_selectable_image_text(NkContext ctx, NkImage img, ByteBuffer str, int align, int[] value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return nnk_selectable_image_text(ctx.address(), img == null ? NULL : img.address(), memAddress(str), str.remaining(), align, value) != 0;
	}

	/** Array version of: {@link #nk_selectable_image_text selectable_image_text} */
	public static boolean nk_selectable_image_text(NkContext ctx, NkImage img, CharSequence str, int align, int[] value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str, false);
			int strEncodedLen = strEncoded.capacity();
			return nnk_selectable_image_text(ctx.address(), img == null ? NULL : img.address(), memAddress(strEncoded), strEncodedLen, align, value) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_slider_float slider_float} */
	public static native int nnk_slider_float(long ctx, float min, float[] val, float max, float step);

	/** Array version of: {@link #nk_slider_float slider_float} */
	public static int nk_slider_float(NkContext ctx, float min, float[] val, float max, float step) {
		return nnk_slider_float(ctx.address(), min, val, max, step);
	}

	/** Array version of: {@link #nk_slider_int slider_int} */
	public static native int nnk_slider_int(long ctx, int min, int[] val, int max, int step);

	/** Array version of: {@link #nk_slider_int slider_int} */
	public static int nk_slider_int(NkContext ctx, int min, int[] val, int max, int step) {
		return nnk_slider_int(ctx.address(), min, val, max, step);
	}

	/** Array version of: {@link #nk_property_float property_float} */
	public static native void nnk_property_float(long ctx, long name, float min, float[] val, float max, float step, float inc_per_pixel);

	/** Array version of: {@link #nk_property_float property_float} */
	public static void nk_property_float(NkContext ctx, ByteBuffer name, float min, float[] val, float max, float step, float inc_per_pixel) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(val, 1);
		}
		nnk_property_float(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
	}

	/** Array version of: {@link #nk_property_float property_float} */
	public static void nk_property_float(NkContext ctx, CharSequence name, float min, float[] val, float max, float step, float inc_per_pixel) {
		if ( CHECKS )
			checkBuffer(val, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_property_float(ctx.address(), memAddress(nameEncoded), min, val, max, step, inc_per_pixel);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_property_int property_int} */
	public static native void nnk_property_int(long ctx, long name, int min, int[] val, int max, int step, int inc_per_pixel);

	/** Array version of: {@link #nk_property_int property_int} */
	public static void nk_property_int(NkContext ctx, ByteBuffer name, int min, int[] val, int max, int step, int inc_per_pixel) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(val, 1);
		}
		nnk_property_int(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
	}

	/** Array version of: {@link #nk_property_int property_int} */
	public static void nk_property_int(NkContext ctx, CharSequence name, int min, int[] val, int max, int step, int inc_per_pixel) {
		if ( CHECKS )
			checkBuffer(val, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			nnk_property_int(ctx.address(), memAddress(nameEncoded), min, val, max, step, inc_per_pixel);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_edit_string edit_string} */
	public static native int nnk_edit_string(long ctx, int flags, long memory, int[] len, int max, long filter);

	/** Array version of: {@link #nk_edit_string edit_string} */
	public static int nk_edit_string(NkContext ctx, int flags, ByteBuffer memory, int[] len, int max, NkFilterCallbackI filter) {
		if ( CHECKS ) {
			checkNT1(memory);
			checkBuffer(len, 1);
		}
		return nnk_edit_string(ctx.address(), flags, memAddress(memory), len, max, filter == null ? NULL : filter.address());
	}

	/** Array version of: {@link #nk_edit_string edit_string} */
	public static int nk_edit_string(NkContext ctx, int flags, CharSequence memory, int[] len, int max, NkFilterCallbackI filter) {
		if ( CHECKS )
			checkBuffer(len, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer memoryEncoded = stack.UTF8(memory);
			return nnk_edit_string(ctx.address(), flags, memAddress(memoryEncoded), len, max, filter == null ? NULL : filter.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_plot plot} */
	public static native void nnk_plot(long ctx, int type, float[] values, int count, int offset);

	/** Array version of: {@link #nk_plot plot} */
	public static void nk_plot(NkContext ctx, int type, float[] values, int count, int offset) {
		if ( CHECKS )
			checkBuffer(values, offset + count);
		nnk_plot(ctx.address(), type, values, count, offset);
	}

	/** Array version of: {@link #nk_combobox combobox} */
	public static native void nnk_combobox(long ctx, long items, int count, int[] selected, int item_height);

	/** Array version of: {@link #nk_combobox combobox} */
	public static void nk_combobox(NkContext ctx, PointerBuffer items, int[] selected, int item_height) {
		if ( CHECKS )
			checkBuffer(selected, 1);
		nnk_combobox(ctx.address(), memAddress(items), items.remaining(), selected, item_height);
	}

	/** Array version of: {@link #nk_combobox_string combobox_string} */
	public static native void nnk_combobox_string(long ctx, long items_separated_by_zeros, int[] selected, int count, int item_height);

	/** Array version of: {@link #nk_combobox_string combobox_string} */
	public static void nk_combobox_string(NkContext ctx, ByteBuffer items_separated_by_zeros, int[] selected, int count, int item_height) {
		if ( CHECKS ) {
			checkNT1(items_separated_by_zeros);
			checkBuffer(selected, 1);
		}
		nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zeros), selected, count, item_height);
	}

	/** Array version of: {@link #nk_combobox_string combobox_string} */
	public static void nk_combobox_string(NkContext ctx, CharSequence items_separated_by_zeros, int[] selected, int count, int item_height) {
		if ( CHECKS )
			checkBuffer(selected, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer items_separated_by_zerosEncoded = stack.UTF8(items_separated_by_zeros);
			nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zerosEncoded), selected, count, item_height);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_combobox_separator combobox_separator} */
	public static native void nnk_combobox_separator(long ctx, long items_separated_by_separator, int separator, int[] selected, int count, int item_height);

	/** Array version of: {@link #nk_combobox_separator combobox_separator} */
	public static void nk_combobox_separator(NkContext ctx, ByteBuffer items_separated_by_separator, int separator, int[] selected, int count, int item_height) {
		if ( CHECKS ) {
			checkNT1(items_separated_by_separator);
			checkBuffer(selected, 1);
		}
		nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separator), separator, selected, count, item_height);
	}

	/** Array version of: {@link #nk_combobox_separator combobox_separator} */
	public static void nk_combobox_separator(NkContext ctx, CharSequence items_separated_by_separator, int separator, int[] selected, int count, int item_height) {
		if ( CHECKS )
			checkBuffer(selected, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer items_separated_by_separatorEncoded = stack.UTF8(items_separated_by_separator);
			nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separatorEncoded), separator, selected, count, item_height);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_combobox_callback combobox_callback} */
	public static native void nnk_combobox_callback(long ctx, long item_getter, long userdata, int[] selected, int count, int item_height);

	/** Array version of: {@link #nk_combobox_callback combobox_callback} */
	public static void nk_combobox_callback(NkContext ctx, NkItemGetterI item_getter, long userdata, int[] selected, int count, int item_height) {
		if ( CHECKS ) {
			checkPointer(userdata);
			checkBuffer(selected, 1);
		}
		nnk_combobox_callback(ctx.address(), item_getter.address(), userdata, selected, count, item_height);
	}

	/** Array version of: {@link #nk_rgb_iv rgb_iv} */
	public static native void nnk_rgb_iv(int[] rgb, long __result);

	/** Array version of: {@link #nk_rgb_iv rgb_iv} */
	public static NkColor nk_rgb_iv(int[] rgb, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgb, 3);
		nnk_rgb_iv(rgb, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_rgb_fv rgb_fv} */
	public static native void nnk_rgb_fv(float[] rgb, long __result);

	/** Array version of: {@link #nk_rgb_fv rgb_fv} */
	public static NkColor nk_rgb_fv(float[] rgb, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgb, 3);
		nnk_rgb_fv(rgb, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_rgba_iv rgba_iv} */
	public static native void nnk_rgba_iv(int[] rgba, long __result);

	/** Array version of: {@link #nk_rgba_iv rgba_iv} */
	public static NkColor nk_rgba_iv(int[] rgba, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgba, 4);
		nnk_rgba_iv(rgba, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_rgba_fv rgba_fv} */
	public static native void nnk_rgba_fv(float[] rgba, long __result);

	/** Array version of: {@link #nk_rgba_fv rgba_fv} */
	public static NkColor nk_rgba_fv(float[] rgba, NkColor __result) {
		if ( CHECKS )
			checkBuffer(rgba, 4);
		nnk_rgba_fv(rgba, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_hsv_iv hsv_iv} */
	public static native void nnk_hsv_iv(int[] hsv, long __result);

	/** Array version of: {@link #nk_hsv_iv hsv_iv} */
	public static NkColor nk_hsv_iv(int[] hsv, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsv, 3);
		nnk_hsv_iv(hsv, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_hsv_fv hsv_fv} */
	public static native void nnk_hsv_fv(float[] hsv, long __result);

	/** Array version of: {@link #nk_hsv_fv hsv_fv} */
	public static NkColor nk_hsv_fv(float[] hsv, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsv, 3);
		nnk_hsv_fv(hsv, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_hsva_iv hsva_iv} */
	public static native void nnk_hsva_iv(int[] hsva, long __result);

	/** Array version of: {@link #nk_hsva_iv hsva_iv} */
	public static NkColor nk_hsva_iv(int[] hsva, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsva, 4);
		nnk_hsva_iv(hsva, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_hsva_fv hsva_fv} */
	public static native void nnk_hsva_fv(float[] hsva, long __result);

	/** Array version of: {@link #nk_hsva_fv hsva_fv} */
	public static NkColor nk_hsva_fv(float[] hsva, NkColor __result) {
		if ( CHECKS )
			checkBuffer(hsva, 4);
		nnk_hsva_fv(hsva, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_color_f color_f} */
	public static native void nnk_color_f(float[] r, float[] g, float[] b, float[] a, long color);

	/** Array version of: {@link #nk_color_f color_f} */
	public static void nk_color_f(float[] r, float[] g, float[] b, float[] a, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(r, 1);
			checkBuffer(g, 1);
			checkBuffer(b, 1);
			checkBuffer(a, 1);
		}
		nnk_color_f(r, g, b, a, color.address());
	}

	/** Array version of: {@link #nk_color_fv color_fv} */
	public static native void nnk_color_fv(float[] rgba_out, long color);

	/** Array version of: {@link #nk_color_fv color_fv} */
	public static void nk_color_fv(float[] rgba_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(rgba_out, 4);
		nnk_color_fv(rgba_out, color.address());
	}

	/** Array version of: {@link #nk_color_hsv_i color_hsv_i} */
	public static native void nnk_color_hsv_i(int[] out_h, int[] out_s, int[] out_v, long color);

	/** Array version of: {@link #nk_color_hsv_i color_hsv_i} */
	public static void nk_color_hsv_i(int[] out_h, int[] out_s, int[] out_v, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(out_h, 1);
			checkBuffer(out_s, 1);
			checkBuffer(out_v, 1);
		}
		nnk_color_hsv_i(out_h, out_s, out_v, color.address());
	}

	/** Array version of: {@link #nk_color_hsv_iv color_hsv_iv} */
	public static native void nnk_color_hsv_iv(int[] hsv_out, long color);

	/** Array version of: {@link #nk_color_hsv_iv color_hsv_iv} */
	public static void nk_color_hsv_iv(int[] hsv_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsv_out, 3);
		nnk_color_hsv_iv(hsv_out, color.address());
	}

	/** Array version of: {@link #nk_color_hsv_f color_hsv_f} */
	public static native void nnk_color_hsv_f(float[] out_h, float[] out_s, float[] out_v, long color);

	/** Array version of: {@link #nk_color_hsv_f color_hsv_f} */
	public static void nk_color_hsv_f(float[] out_h, float[] out_s, float[] out_v, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(out_h, 1);
			checkBuffer(out_s, 1);
			checkBuffer(out_v, 1);
		}
		nnk_color_hsv_f(out_h, out_s, out_v, color.address());
	}

	/** Array version of: {@link #nk_color_hsv_fv color_hsv_fv} */
	public static native void nnk_color_hsv_fv(float[] hsv_out, long color);

	/** Array version of: {@link #nk_color_hsv_fv color_hsv_fv} */
	public static void nk_color_hsv_fv(float[] hsv_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsv_out, 3);
		nnk_color_hsv_fv(hsv_out, color.address());
	}

	/** Array version of: {@link #nk_color_hsva_i color_hsva_i} */
	public static native void nnk_color_hsva_i(int[] h, int[] s, int[] v, int[] a, long color);

	/** Array version of: {@link #nk_color_hsva_i color_hsva_i} */
	public static void nk_color_hsva_i(int[] h, int[] s, int[] v, int[] a, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(h, 1);
			checkBuffer(s, 1);
			checkBuffer(v, 1);
			checkBuffer(a, 1);
		}
		nnk_color_hsva_i(h, s, v, a, color.address());
	}

	/** Array version of: {@link #nk_color_hsva_iv color_hsva_iv} */
	public static native void nnk_color_hsva_iv(int[] hsva_out, long color);

	/** Array version of: {@link #nk_color_hsva_iv color_hsva_iv} */
	public static void nk_color_hsva_iv(int[] hsva_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsva_out, 4);
		nnk_color_hsva_iv(hsva_out, color.address());
	}

	/** Array version of: {@link #nk_color_hsva_f color_hsva_f} */
	public static native void nnk_color_hsva_f(float[] out_h, float[] out_s, float[] out_v, float[] out_a, long color);

	/** Array version of: {@link #nk_color_hsva_f color_hsva_f} */
	public static void nk_color_hsva_f(float[] out_h, float[] out_s, float[] out_v, float[] out_a, NkColor color) {
		if ( CHECKS ) {
			checkBuffer(out_h, 1);
			checkBuffer(out_s, 1);
			checkBuffer(out_v, 1);
			checkBuffer(out_a, 1);
		}
		nnk_color_hsva_f(out_h, out_s, out_v, out_a, color.address());
	}

	/** Array version of: {@link #nk_color_hsva_fv color_hsva_fv} */
	public static native void nnk_color_hsva_fv(float[] hsva_out, long color);

	/** Array version of: {@link #nk_color_hsva_fv color_hsva_fv} */
	public static void nk_color_hsva_fv(float[] hsva_out, NkColor color) {
		if ( CHECKS )
			checkBuffer(hsva_out, 4);
		nnk_color_hsva_fv(hsva_out, color.address());
	}

	/** Array version of: {@link #nk_vec2v vec2v} */
	public static native void nnk_vec2v(float[] xy, long __result);

	/** Array version of: {@link #nk_vec2v vec2v} */
	public static NkVec2 nk_vec2v(float[] xy, NkVec2 __result) {
		if ( CHECKS )
			checkBuffer(xy, 2);
		nnk_vec2v(xy, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_vec2iv vec2iv} */
	public static native void nnk_vec2iv(int[] xy, long __result);

	/** Array version of: {@link #nk_vec2iv vec2iv} */
	public static NkVec2 nk_vec2iv(int[] xy, NkVec2 __result) {
		if ( CHECKS )
			checkBuffer(xy, 2);
		nnk_vec2iv(xy, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_rectv rectv} */
	public static native void nnk_rectv(float[] xywh, long __result);

	/** Array version of: {@link #nk_rectv rectv} */
	public static NkRect nk_rectv(float[] xywh, NkRect __result) {
		if ( CHECKS )
			checkBuffer(xywh, 4);
		nnk_rectv(xywh, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_rectiv rectiv} */
	public static native void nnk_rectiv(int[] xywh, long __result);

	/** Array version of: {@link #nk_rectiv rectiv} */
	public static NkRect nk_rectiv(int[] xywh, NkRect __result) {
		if ( CHECKS )
			checkBuffer(xywh, 4);
		nnk_rectiv(xywh, __result.address());
		return __result;
	}

	/** Array version of: {@link #nk_strtof strtof} */
	public static native int nnk_strtof(float[] number, long buffer);

	/** Array version of: {@link #nk_strtof strtof} */
	public static boolean nk_strtof(float[] number, ByteBuffer buffer) {
		if ( CHECKS ) {
			checkBuffer(number, 1);
			checkNT1(buffer);
		}
		return nnk_strtof(number, memAddress(buffer)) != 0;
	}

	/** Array version of: {@link #nk_strtof strtof} */
	public static boolean nk_strtof(float[] number, CharSequence buffer) {
		if ( CHECKS )
			checkBuffer(number, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer bufferEncoded = stack.UTF8(buffer);
			return nnk_strtof(number, memAddress(bufferEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_strmatch_fuzzy_string strmatch_fuzzy_string} */
	public static native int nnk_strmatch_fuzzy_string(long str, long pattern, int[] out_score);

	/** Array version of: {@link #nk_strmatch_fuzzy_string strmatch_fuzzy_string} */
	public static boolean nk_strmatch_fuzzy_string(ByteBuffer str, ByteBuffer pattern, int[] out_score) {
		if ( CHECKS ) {
			checkNT1(str);
			checkNT1(pattern);
			checkBuffer(out_score, 1);
		}
		return nnk_strmatch_fuzzy_string(memAddress(str), memAddress(pattern), out_score) != 0;
	}

	/** Array version of: {@link #nk_strmatch_fuzzy_string strmatch_fuzzy_string} */
	public static boolean nk_strmatch_fuzzy_string(CharSequence str, CharSequence pattern, int[] out_score) {
		if ( CHECKS )
			checkBuffer(out_score, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer strEncoded = stack.UTF8(str);
			ByteBuffer patternEncoded = stack.UTF8(pattern);
			return nnk_strmatch_fuzzy_string(memAddress(strEncoded), memAddress(patternEncoded), out_score) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_strmatch_fuzzy_text strmatch_fuzzy_text} */
	public static native int nnk_strmatch_fuzzy_text(long txt, int txt_len, long pattern, int[] out_score);

	/** Array version of: {@link #nk_strmatch_fuzzy_text strmatch_fuzzy_text} */
	public static int nk_strmatch_fuzzy_text(ByteBuffer txt, ByteBuffer pattern, int[] out_score) {
		if ( CHECKS ) {
			checkNT1(pattern);
			checkBuffer(out_score, 1);
		}
		return nnk_strmatch_fuzzy_text(memAddress(txt), txt.remaining(), memAddress(pattern), out_score);
	}

	/** Array version of: {@link #nk_strmatch_fuzzy_text strmatch_fuzzy_text} */
	public static int nk_strmatch_fuzzy_text(CharSequence txt, CharSequence pattern, int[] out_score) {
		if ( CHECKS )
			checkBuffer(out_score, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer txtEncoded = stack.UTF8(txt, false);
			int txtEncodedLen = txtEncoded.capacity();
			ByteBuffer patternEncoded = stack.UTF8(pattern);
			return nnk_strmatch_fuzzy_text(memAddress(txtEncoded), txtEncodedLen, memAddress(patternEncoded), out_score);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nk_utf_decode utf_decode} */
	public static native int nnk_utf_decode(long c, int[] u, int clen);

	/** Array version of: {@link #nk_utf_decode utf_decode} */
	public static int nk_utf_decode(ByteBuffer c, int[] u) {
		if ( CHECKS )
			checkBuffer(u, 1);
		return nnk_utf_decode(memAddress(c), u, c.remaining());
	}

	/** Array version of: {@link #nk_str_append_text_runes str_append_text_runes} */
	public static native int nnk_str_append_text_runes(long s, int[] runes, int len);

	/** Array version of: {@link #nk_str_append_text_runes str_append_text_runes} */
	public static int nk_str_append_text_runes(NkStr s, int[] runes) {
		return nnk_str_append_text_runes(s.address(), runes, runes.length);
	}

	/** Array version of: {@link #nk_str_append_str_runes str_append_str_runes} */
	public static native int nnk_str_append_str_runes(long s, int[] runes);

	/** Array version of: {@link #nk_str_append_str_runes str_append_str_runes} */
	public static int nk_str_append_str_runes(NkStr s, int[] runes) {
		if ( CHECKS )
			checkNT(runes);
		return nnk_str_append_str_runes(s.address(), runes);
	}

	/** Array version of: {@link #nk_str_insert_text_runes str_insert_text_runes} */
	public static native int nnk_str_insert_text_runes(long s, int pos, int[] runes, int len);

	/** Array version of: {@link #nk_str_insert_text_runes str_insert_text_runes} */
	public static int nk_str_insert_text_runes(NkStr s, int pos, int[] runes) {
		return nnk_str_insert_text_runes(s.address(), pos, runes, runes.length);
	}

	/** Array version of: {@link #nk_str_insert_str_runes str_insert_str_runes} */
	public static native int nnk_str_insert_str_runes(long s, int pos, int[] runes);

	/** Array version of: {@link #nk_str_insert_str_runes str_insert_str_runes} */
	public static int nk_str_insert_str_runes(NkStr s, int pos, int[] runes) {
		return nnk_str_insert_str_runes(s.address(), pos, runes);
	}

	/** Array version of: {@link #nk_stroke_polyline stroke_polyline} */
	public static native void nnk_stroke_polyline(long b, float[] points, int point_count, float line_thickness, long col);

	/** Array version of: {@link #nk_stroke_polyline stroke_polyline} */
	public static void nk_stroke_polyline(NkCommandBuffer b, float[] points, float line_thickness, NkColor col) {
		nnk_stroke_polyline(b.address(), points, points.length, line_thickness, col.address());
	}

	/** Array version of: {@link #nk_stroke_polygon stroke_polygon} */
	public static native void nnk_stroke_polygon(long b, float[] points, int point_count, float line_thickness, long color);

	/** Array version of: {@link #nk_stroke_polygon stroke_polygon} */
	public static void nk_stroke_polygon(NkCommandBuffer b, float[] points, float line_thickness, NkColor color) {
		nnk_stroke_polygon(b.address(), points, points.length, line_thickness, color.address());
	}

	/** Array version of: {@link #nk_fill_polygon fill_polygon} */
	public static native void nnk_fill_polygon(long b, float[] points, int point_count, long color);

	/** Array version of: {@link #nk_fill_polygon fill_polygon} */
	public static void nk_fill_polygon(NkCommandBuffer b, float[] points, NkColor color) {
		nnk_fill_polygon(b.address(), points, points.length, color.address());
	}

}