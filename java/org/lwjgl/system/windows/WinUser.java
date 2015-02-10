/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to WinUser.h. */
public final class WinUser {

	/** Window Styles */
	public static final int
		WS_OVERLAPPED       = 0x0,
		WS_POPUP            = 0x80000000,
		WS_CHILD            = 0x40000000,
		WS_MINIMIZE         = 0x20000000,
		WS_VISIBLE          = 0x10000000,
		WS_DISABLED         = 0x8000000,
		WS_CLIPSIBLINGS     = 0x4000000,
		WS_CLIPCHILDREN     = 0x2000000,
		WS_MAXIMIZE         = 0x1000000,
		WS_CAPTION          = 0xC00000,
		WS_BORDER           = 0x800000,
		WS_DLGFRAME         = 0x400000,
		WS_VSCROLL          = 0x200000,
		WS_HSCROLL          = 0x100000,
		WS_SYSMENU          = 0x80000,
		WS_THICKFRAME       = 0x40000,
		WS_GROUP            = 0x20000,
		WS_TABSTOP          = 0x10000,
		WS_MINIMIZEBOX      = 0x20000,
		WS_MAXIMIZEBOX      = 0x10000,
		WS_OVERLAPPEDWINDOW = WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX,
		WS_POPUPWINDOW      = WS_POPUP | WS_BORDER | WS_SYSMENU,
		WS_CHILDWINDOW      = WS_CHILD,
		WS_TILED            = WS_OVERLAPPED,
		WS_ICONIC           = WS_MINIMIZE,
		WS_SIZEBOX          = WS_THICKFRAME,
		WS_TILEDWINDOW      = WS_OVERLAPPEDWINDOW;

	/** Windows messages. */
	public static final int
		WM_NULL                           = 0x0,
		WM_CREATE                         = 0x1,
		WM_DESTROY                        = 0x2,
		WM_MOVE                           = 0x3,
		WM_SIZE                           = 0x5,
		WM_ACTIVATE                       = 0x6,
		WM_SETFOCUS                       = 0x7,
		WM_KILLFOCUS                      = 0x8,
		WM_ENABLE                         = 0xA,
		WM_SETREDRAW                      = 0xB,
		WM_SETTEXT                        = 0xC,
		WM_GETTEXT                        = 0xD,
		WM_GETTEXTLENGTH                  = 0xE,
		WM_PAINT                          = 0xF,
		WM_CLOSE                          = 0x10,
		WM_QUERYENDSESSION                = 0x11,
		WM_QUERYOPEN                      = 0x13,
		WM_ENDSESSION                     = 0x16,
		WM_QUIT                           = 0x12,
		WM_ERASEBKGND                     = 0x14,
		WM_SYSCOLORCHANGE                 = 0x15,
		WM_SHOWWINDOW                     = 0x18,
		WM_WININICHANGE                   = 0x1A,
		WM_SETTINGCHANGE                  = WM_WININICHANGE,
		WM_DEVMODECHANGE                  = 0x1B,
		WM_ACTIVATEAPP                    = 0x1C,
		WM_FONTCHANGE                     = 0x1D,
		WM_TIMECHANGE                     = 0x1E,
		WM_CANCELMODE                     = 0x1F,
		WM_SETCURSOR                      = 0x20,
		WM_MOUSEACTIVATE                  = 0x21,
		WM_CHILDACTIVATE                  = 0x22,
		WM_QUEUESYNC                      = 0x23,
		WM_GETMINMAXINFO                  = 0x24,
		WM_PAINTICON                      = 0x26,
		WM_ICONERASEBKGND                 = 0x27,
		WM_NEXTDLGCTL                     = 0x28,
		WM_SPOOLERSTATUS                  = 0x2A,
		WM_DRAWITEM                       = 0x2B,
		WM_MEASUREITEM                    = 0x2C,
		WM_DELETEITEM                     = 0x2D,
		WM_VKEYTOITEM                     = 0x2E,
		WM_CHARTOITEM                     = 0x2F,
		WM_SETFONT                        = 0x30,
		WM_GETFONT                        = 0x31,
		WM_SETHOTKEY                      = 0x32,
		WM_GETHOTKEY                      = 0x33,
		WM_QUERYDRAGICON                  = 0x37,
		WM_COMPAREITEM                    = 0x39,
		WM_GETOBJECT                      = 0x3D,
		WM_COMPACTING                     = 0x41,
		WM_COMMNOTIFY                     = 0x44,
		WM_WINDOWPOSCHANGING              = 0x46,
		WM_WINDOWPOSCHANGED               = 0x47,
		WM_POWER                          = 0x48,
		WM_COPYDATA                       = 0x4A,
		WM_CANCELJOURNAL                  = 0x4B,
		WM_NOTIFY                         = 0x4E,
		WM_INPUTLANGCHANGEREQUEST         = 0x50,
		WM_INPUTLANGCHANGE                = 0x51,
		WM_TCARD                          = 0x52,
		WM_HELP                           = 0x53,
		WM_USERCHANGED                    = 0x54,
		WM_NOTIFYFORMAT                   = 0x55,
		WM_CONTEXTMENU                    = 0x7B,
		WM_STYLECHANGING                  = 0x7C,
		WM_STYLECHANGED                   = 0x7D,
		WM_DISPLAYCHANGE                  = 0x7E,
		WM_GETICON                        = 0x7F,
		WM_SETICON                        = 0x80,
		WM_NCCREATE                       = 0x81,
		WM_NCDESTROY                      = 0x82,
		WM_NCCALCSIZE                     = 0x83,
		WM_NCHITTEST                      = 0x84,
		WM_NCPAINT                        = 0x85,
		WM_NCACTIVATE                     = 0x86,
		WM_GETDLGCODE                     = 0x87,
		WM_SYNCPAINT                      = 0x88,
		WM_NCMOUSEMOVE                    = 0xA0,
		WM_NCLBUTTONDOWN                  = 0xA1,
		WM_NCLBUTTONUP                    = 0xA2,
		WM_NCLBUTTONDBLCLK                = 0xA3,
		WM_NCRBUTTONDOWN                  = 0xA4,
		WM_NCRBUTTONUP                    = 0xA5,
		WM_NCRBUTTONDBLCLK                = 0xA6,
		WM_NCMBUTTONDOWN                  = 0xA7,
		WM_NCMBUTTONUP                    = 0xA8,
		WM_NCMBUTTONDBLCLK                = 0xA9,
		WM_NCXBUTTONDOWN                  = 0xAB,
		WM_NCXBUTTONUP                    = 0xAC,
		WM_NCXBUTTONDBLCLK                = 0xAD,
		WM_INPUT_DEVICE_CHANGE            = 0xFE,
		WM_INPUT                          = 0xFF,
		WM_KEYFIRST                       = 0x100,
		WM_KEYDOWN                        = 0x100,
		WM_KEYUP                          = 0x101,
		WM_CHAR                           = 0x102,
		WM_DEADCHAR                       = 0x103,
		WM_SYSKEYDOWN                     = 0x104,
		WM_SYSKEYUP                       = 0x105,
		WM_SYSCHAR                        = 0x106,
		WM_SYSDEADCHAR                    = 0x107,
		WM_UNICHAR                        = 0x109,
		UNICODE_NOCHAR                    = 0xFFFF,
		WM_IME_STARTCOMPOSITION           = 0x10D,
		WM_IME_ENDCOMPOSITION             = 0x10E,
		WM_IME_COMPOSITION                = 0x10F,
		WM_IME_KEYLAST                    = 0x10F,
		WM_INITDIALOG                     = 0x110,
		WM_COMMAND                        = 0x111,
		WM_SYSCOMMAND                     = 0x112,
		WM_TIMER                          = 0x113,
		WM_HSCROLL                        = 0x114,
		WM_VSCROLL                        = 0x115,
		WM_INITMENU                       = 0x116,
		WM_INITMENUPOPUP                  = 0x117,
		WM_GESTURE                        = 0x119,
		WM_GESTURENOTIFY                  = 0x11A,
		WM_MENUSELECT                     = 0x11F,
		WM_MENUCHAR                       = 0x120,
		WM_ENTERIDLE                      = 0x121,
		WM_MENURBUTTONUP                  = 0x122,
		WM_MENUDRAG                       = 0x123,
		WM_MENUGETOBJECT                  = 0x124,
		WM_UNINITMENUPOPUP                = 0x125,
		WM_MENUCOMMAND                    = 0x126,
		WM_CHANGEUISTATE                  = 0x127,
		WM_UPDATEUISTATE                  = 0x128,
		WM_QUERYUISTATE                   = 0x129,
		WM_CTLCOLORMSGBOX                 = 0x132,
		WM_CTLCOLOREDIT                   = 0x133,
		WM_CTLCOLORLISTBOX                = 0x134,
		WM_CTLCOLORBTN                    = 0x135,
		WM_CTLCOLORDLG                    = 0x136,
		WM_CTLCOLORSCROLLBAR              = 0x137,
		WM_CTLCOLORSTATIC                 = 0x138,
		MN_GETHMENU                       = 0x1E1,
		WM_MOUSEFIRST                     = 0x200,
		WM_MOUSEMOVE                      = 0x200,
		WM_LBUTTONDOWN                    = 0x201,
		WM_LBUTTONUP                      = 0x202,
		WM_LBUTTONDBLCLK                  = 0x203,
		WM_RBUTTONDOWN                    = 0x204,
		WM_RBUTTONUP                      = 0x205,
		WM_RBUTTONDBLCLK                  = 0x206,
		WM_MBUTTONDOWN                    = 0x207,
		WM_MBUTTONUP                      = 0x208,
		WM_MBUTTONDBLCLK                  = 0x209,
		WM_MOUSEWHEEL                     = 0x20A,
		WM_XBUTTONDOWN                    = 0x20B,
		WM_XBUTTONUP                      = 0x20C,
		WM_XBUTTONDBLCLK                  = 0x20D,
		WM_MOUSEHWHEEL                    = 0x20E,
		WM_PARENTNOTIFY                   = 0x210,
		WM_ENTERMENULOOP                  = 0x211,
		WM_EXITMENULOOP                   = 0x212,
		WM_NEXTMENU                       = 0x213,
		WM_SIZING                         = 0x214,
		WM_CAPTURECHANGED                 = 0x215,
		WM_MOVING                         = 0x216,
		WM_POWERBROADCAST                 = 0x218,
		WM_DEVICECHANGE                   = 0x219,
		WM_MDICREATE                      = 0x220,
		WM_MDIDESTROY                     = 0x221,
		WM_MDIACTIVATE                    = 0x222,
		WM_MDIRESTORE                     = 0x223,
		WM_MDINEXT                        = 0x224,
		WM_MDIMAXIMIZE                    = 0x225,
		WM_MDITILE                        = 0x226,
		WM_MDICASCADE                     = 0x227,
		WM_MDIICONARRANGE                 = 0x228,
		WM_MDIGETACTIVE                   = 0x229,
		WM_MDISETMENU                     = 0x230,
		WM_ENTERSIZEMOVE                  = 0x231,
		WM_EXITSIZEMOVE                   = 0x232,
		WM_DROPFILES                      = 0x233,
		WM_MDIREFRESHMENU                 = 0x234,
		WM_TOUCH                          = 0x240,
		WM_IME_SETCONTEXT                 = 0x281,
		WM_IME_NOTIFY                     = 0x282,
		WM_IME_CONTROL                    = 0x283,
		WM_IME_COMPOSITIONFULL            = 0x284,
		WM_IME_SELECT                     = 0x285,
		WM_IME_CHAR                       = 0x286,
		WM_IME_REQUEST                    = 0x288,
		WM_IME_KEYDOWN                    = 0x290,
		WM_IME_KEYUP                      = 0x291,
		WM_MOUSEHOVER                     = 0x2A1,
		WM_MOUSELEAVE                     = 0x2A3,
		WM_NCMOUSEHOVER                   = 0x2A0,
		WM_NCMOUSELEAVE                   = 0x2A2,
		WM_WTSSESSION_CHANGE              = 0x2B1,
		WM_TABLET_FIRST                   = 0x2C0,
		WM_TABLET_LAST                    = 0x2DF,
		WM_CUT                            = 0x300,
		WM_COPY                           = 0x301,
		WM_PASTE                          = 0x302,
		WM_CLEAR                          = 0x303,
		WM_UNDO                           = 0x304,
		WM_RENDERFORMAT                   = 0x305,
		WM_RENDERALLFORMATS               = 0x306,
		WM_DESTROYCLIPBOARD               = 0x307,
		WM_DRAWCLIPBOARD                  = 0x308,
		WM_PAINTCLIPBOARD                 = 0x309,
		WM_VSCROLLCLIPBOARD               = 0x30A,
		WM_SIZECLIPBOARD                  = 0x30B,
		WM_ASKCBFORMATNAME                = 0x30C,
		WM_CHANGECBCHAIN                  = 0x30D,
		WM_HSCROLLCLIPBOARD               = 0x30E,
		WM_QUERYNEWPALETTE                = 0x30F,
		WM_PALETTEISCHANGING              = 0x310,
		WM_PALETTECHANGED                 = 0x311,
		WM_HOTKEY                         = 0x312,
		WM_PRINT                          = 0x317,
		WM_PRINTCLIENT                    = 0x318,
		WM_APPCOMMAND                     = 0x319,
		WM_THEMECHANGED                   = 0x31A,
		WM_CLIPBOARDUPDATE                = 0x31D,
		WM_DWMCOMPOSITIONCHANGED          = 0x31E,
		WM_DWMNCRENDERINGCHANGED          = 0x31F,
		WM_DWMCOLORIZATIONCOLORCHANGED    = 0x320,
		WM_DWMWINDOWMAXIMIZEDCHANGE       = 0x321,
		WM_DWMSENDICONICTHUMBNAIL         = 0x323,
		WM_DWMSENDICONICLIVEPREVIEWBITMAP = 0x326,
		WM_GETTITLEBARINFOEX              = 0x33F,
		WM_HANDHELDFIRST                  = 0x358,
		WM_HANDHELDLAST                   = 0x35F,
		WM_AFXFIRST                       = 0x360,
		WM_AFXLAST                        = 0x37F,
		WM_PENWINFIRST                    = 0x380,
		WM_PENWINLAST                     = 0x38F,
		WM_APP                            = 0x8000,
		WM_USER                           = 0x400;

	/** WM_ACTIVATE message {@code wParam} values. */
	public static final int
		WA_ACTIVE      = 0x1,
		WA_CLICKACTIVE = 0x2,
		WA_INACTIVE    = 0x0;

	/** WM_SIZE message {@code wParam} values. */
	public static final int
		SIZE_RESTORED  = 0x0,
		SIZE_MINIMIZED = 0x1,
		SIZE_MAXIMIZED = 0x2,
		SIZE_MAXSHOW   = 0x3,
		SIZE_MAXHIDE   = 0x4;

	/** WM_DEVICECHANGE message {@code wParam} params. */
	public static final int
		DBT_APPYBEGIN            = 0x0,
		DBT_APPYEND              = 0x1,
		DBT_DEVNODES_CHANGED     = 0x7,
		DBT_QUERYCHANGECONFIG    = 0x17,
		DBT_CONFIGCHANGED        = 0x18,
		DBT_CONFIGCHANGECANCELED = 0x19,
		DBT_MONITORCHANGE        = 0x1B;

	/** System menu command values. */
	public static final int
		SC_SIZE         = 0xF000,
		SC_MOVE         = 0xF010,
		SC_MINIMIZE     = 0xF020,
		SC_MAXIMIZE     = 0xF030,
		SC_NEXTWINDOW   = 0xF040,
		SC_PREVWINDOW   = 0xF050,
		SC_CLOSE        = 0xF060,
		SC_VSCROLL      = 0xF070,
		SC_HSCROLL      = 0xF080,
		SC_MOUSEMENU    = 0xF090,
		SC_KEYMENU      = 0xF100,
		SC_ARRANGE      = 0xF110,
		SC_RESTORE      = 0xF120,
		SC_TASKLIST     = 0xF130,
		SC_SCREENSAVE   = 0xF140,
		SC_HOTKEY       = 0xF150,
		SC_DEFAULT      = 0xF160,
		SC_MONITORPOWER = 0xF170,
		SC_CONTEXTHELP  = 0xF180,
		SC_SEPARATOR    = 0xF00F;

	/** {@link #GetSystemMetrics} codes. */
	public static final int
		SM_CXSCREEN                    = 0x0,
		SM_CYSCREEN                    = 0x1,
		SM_CXVSCROLL                   = 0x2,
		SM_CYHSCROLL                   = 0x3,
		SM_CYCAPTION                   = 0x4,
		SM_CXBORDER                    = 0x5,
		SM_CYBORDER                    = 0x6,
		SM_CXDLGFRAME                  = 0x7,
		SM_CYDLGFRAME                  = 0x8,
		SM_CYVTHUMB                    = 0x9,
		SM_CXHTHUMB                    = 0xA,
		SM_CXICON                      = 0xB,
		SM_CYICON                      = 0xC,
		SM_CXCURSOR                    = 0xD,
		SM_CYCURSOR                    = 0xE,
		SM_CYMENU                      = 0xF,
		SM_CXFULLSCREEN                = 0x10,
		SM_CYFULLSCREEN                = 0x11,
		SM_CYKANJIWINDOW               = 0x12,
		SM_MOUSEPRESENT                = 0x13,
		SM_CYVSCROLL                   = 0x14,
		SM_CXHSCROLL                   = 0x15,
		SM_DEBUG                       = 0x16,
		SM_SWAPBUTTON                  = 0x17,
		SM_RESERVED1                   = 0x18,
		SM_RESERVED2                   = 0x19,
		SM_RESERVED3                   = 0x1A,
		SM_RESERVED4                   = 0x1B,
		SM_CXMIN                       = 0x1C,
		SM_CYMIN                       = 0x1D,
		SM_CXSIZE                      = 0x1E,
		SM_CYSIZE                      = 0x1F,
		SM_CXFRAME                     = 0x20,
		SM_CYFRAME                     = 0x21,
		SM_CXMINTRACK                  = 0x22,
		SM_CYMINTRACK                  = 0x23,
		SM_CXDOUBLECLK                 = 0x24,
		SM_CYDOUBLECLK                 = 0x25,
		SM_CXICONSPACING               = 0x26,
		SM_CYICONSPACING               = 0x27,
		SM_MENUDROPALIGNMENT           = 0x28,
		SM_PENWINDOWS                  = 0x29,
		SM_DBCSENABLED                 = 0x2A,
		SM_CMOUSEBUTTONS               = 0x2B,
		SM_CXFIXEDFRAME                = SM_CXDLGFRAME,
		SM_CYFIXEDFRAME                = SM_CYDLGFRAME,
		SM_CXSIZEFRAME                 = SM_CXFRAME,
		SM_CYSIZEFRAME                 = SM_CYFRAME,
		SM_SECURE                      = 0x2C,
		SM_CXEDGE                      = 0x2D,
		SM_CYEDGE                      = 0x2E,
		SM_CXMINSPACING                = 0x2F,
		SM_CYMINSPACING                = 0x30,
		SM_CXSMICON                    = 0x31,
		SM_CYSMICON                    = 0x32,
		SM_CYSMCAPTION                 = 0x33,
		SM_CXSMSIZE                    = 0x34,
		SM_CYSMSIZE                    = 0x35,
		SM_CXMENUSIZE                  = 0x36,
		SM_CYMENUSIZE                  = 0x37,
		SM_ARRANGE                     = 0x38,
		SM_CXMINIMIZED                 = 0x39,
		SM_CYMINIMIZED                 = 0x3A,
		SM_CXMAXTRACK                  = 0x3B,
		SM_CYMAXTRACK                  = 0x3C,
		SM_CXMAXIMIZED                 = 0x3D,
		SM_CYMAXIMIZED                 = 0x3E,
		SM_NETWORK                     = 0x3F,
		SM_CLEANBOOT                   = 0x43,
		SM_CXDRAG                      = 0x44,
		SM_CYDRAG                      = 0x45,
		SM_SHOWSOUNDS                  = 0x46,
		SM_CXMENUCHECK                 = 0x47,
		SM_CYMENUCHECK                 = 0x48,
		SM_SLOWMACHINE                 = 0x49,
		SM_MIDEASTENABLED              = 0x4A,
		SM_MOUSEWHEELPRESENT           = 0x4B,
		SM_XVIRTUALSCREEN              = 0x4C,
		SM_YVIRTUALSCREEN              = 0x4D,
		SM_CXVIRTUALSCREEN             = 0x4E,
		SM_CYVIRTUALSCREEN             = 0x4F,
		SM_CMONITORS                   = 0x50,
		SM_SAMEDISPLAYFORMAT           = 0x51,
		SM_IMMENABLED                  = 0x52,
		SM_REMOTESESSION               = 0x1000,
		SM_SHUTTINGDOWN                = 0x2000,
		SM_REMOTECONTROL               = 0x2001,
		SM_CARETBLINKINGENABLED        = 0x2002,
		SM_CXFOCUSBORDER               = 0x53,
		SM_CYFOCUSBORDER               = 0x54,
		SM_TABLETPC                    = 0x56,
		SM_MEDIACENTER                 = 0x57,
		SM_STARTER                     = 0x58,
		SM_SERVERR2                    = 0x59,
		SM_MOUSEHORIZONTALWHEELPRESENT = 0x5B,
		SM_CXPADDEDBORDER              = 0x5C,
		SM_DIGITIZER                   = 0x5E,
		SM_MAXIMUMTOUCHES              = 0x5F;

	/** Extended Window Styles */
	public static final int
		WS_EX_DLGMODALFRAME    = 0x1,
		WS_EX_NOPARENTNOTIFY   = 0x4,
		WS_EX_TOPMOST          = 0x8,
		WS_EX_ACCEPTFILES      = 0x10,
		WS_EX_TRANSPARENT      = 0x20,
		WS_EX_MDICHILD         = 0x40,
		WS_EX_TOOLWINDOW       = 0x80,
		WS_EX_WINDOWEDGE       = 0x100,
		WS_EX_CLIENTEDGE       = 0x200,
		WS_EX_CONTEXTHELP      = 0x400,
		WS_EX_RIGHT            = 0x1000,
		WS_EX_LEFT             = 0x0,
		WS_EX_RTLREADING       = 0x2000,
		WS_EX_LTRREADING       = 0x0,
		WS_EX_LEFTSCROLLBAR    = 0x4000,
		WS_EX_RIGHTSCROLLBAR   = 0x0,
		WS_EX_CONTROLPARENT    = 0x10000,
		WS_EX_STATICEDGE       = 0x20000,
		WS_EX_APPWINDOW        = 0x40000,
		WS_EX_OVERLAPPEDWINDOW = WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE,
		WS_EX_PALETTEWINDOW    = WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST,
		WS_EX_LAYERED          = 0x80000,
		WS_EX_NOINHERITLAYOUT  = 0x100000,
		WS_EX_LAYOUTRTL        = 0x400000,
		WS_EX_COMPOSITED       = 0x2000000,
		WS_EX_NOACTIVATE       = 0x8000000;

	/** May be used in {@link #CreateWindowEx} for the x, y, width, height parameters. */
	public static final int CW_USEDEFAULT = 0x80000000;

	/** Key state masks for mouse messages. */
	public static final int
		MK_LBUTTON  = 0x1,
		MK_RBUTTON  = 0x2,
		MK_SHIFT    = 0x4,
		MK_CONTROL  = 0x8,
		MK_MBUTTON  = 0x10,
		MK_XBUTTON1 = 0x20,
		MK_XBUTTON2 = 0x40;

	/** Mouse position codes. */
	public static final int
		HTERROR       = 0xFFFFFFFE,
		HTTRANSPARENT = 0xFFFFFFFF,
		HTNOWHERE     = 0x0,
		HTCLIENT      = 0x1,
		HTCAPTION     = 0x2,
		HTSYSMENU     = 0x3,
		HTGROWBOX     = 0x4,
		HTSIZE        = HTGROWBOX,
		HTMENU        = 0x5,
		HTHSCROLL     = 0x6,
		HTVSCROLL     = 0x7,
		HTMINBUTTON   = 0x8,
		HTMAXBUTTON   = 0x9,
		HTLEFT        = 0xA,
		HTRIGHT       = 0xB,
		HTTOP         = 0xC,
		HTTOPLEFT     = 0xD,
		HTTOPRIGHT    = 0xE,
		HTBOTTOM      = 0xF,
		HTBOTTOMLEFT  = 0x10,
		HTBOTTOMRIGHT = 0x11,
		HTBORDER      = 0x12,
		HTREDUCE      = HTMINBUTTON,
		HTZOOM        = HTMAXBUTTON,
		HTSIZEFIRST   = HTLEFT,
		HTSIZELAST    = HTBOTTOMRIGHT,
		HTOBJECT      = 0x13,
		HTCLOSE       = 0x14,
		HTHELP        = 0x15;

	/** Class styles */
	public static final int
		CS_VREDRAW         = 0x1,
		CS_HREDRAW         = 0x2,
		CS_DBLCLKS         = 0x8,
		CS_OWNDC           = 0x20,
		CS_CLASSDC         = 0x40,
		CS_PARENTDC        = 0x80,
		CS_NOCLOSE         = 0x200,
		CS_SAVEBITS        = 0x800,
		CS_BYTEALIGNCLIENT = 0x1000,
		CS_BYTEALIGNWINDOW = 0x2000,
		CS_GLOBALCLASS     = 0x4000,
		CS_IME             = 0x10000,
		CS_DROPSHADOW      = 0x20000;

	/** Window field offsets for {@link #GetWindowLongPtr}. */
	public static final int
		GWL_WNDPROC    = 0xFFFFFFFC,
		GWL_HINSTANCE  = 0xFFFFFFFA,
		GWL_HWNDPARENT = 0xFFFFFFF8,
		GWL_STYLE      = 0xFFFFFFF0,
		GWL_EXSTYLE    = 0xFFFFFFEC,
		GWL_USERDATA   = 0xFFFFFFEB,
		GWL_ID         = 0xFFFFFFF4;

	/** {@link #ShowWindow} commands. */
	public static final int
		SW_HIDE            = 0x0,
		SW_SHOWNORMAL      = 0x1,
		SW_NORMAL          = 0x1,
		SW_SHOWMINIMIZED   = 0x2,
		SW_SHOWMAXIMIZED   = 0x3,
		SW_MAXIMIZE        = 0x3,
		SW_SHOWNOACTIVATE  = 0x4,
		SW_SHOW            = 0x5,
		SW_MINIMIZE        = 0x6,
		SW_SHOWMINNOACTIVE = 0x7,
		SW_SHOWNA          = 0x8,
		SW_RESTORE         = 0x9,
		SW_SHOWDEFAULT     = 0xA,
		SW_FORCEMINIMIZE   = 0xB,
		SW_MAX             = 0xB;

	/** Virtual window handles used by the {@link #SetWindowPos} insertAfter argument. */
	public static final long
		HWND_TOP       = 0x0L,
		HWND_BOTTOM    = 0x1L,
		HWND_TOPMOST   = 0xFFFFFFFFFFFFFFFFL,
		HWND_NOTOPMOST = 0xFFFFFFFFFFFFFFFEL;

	/** Window sizing and positiong flags used by the {@link #SetWindowPos} flags argument. */
	public static final int
		SWP_NOSIZE         = 0x1,
		SWP_NOMOVE         = 0x2,
		SWP_NOZORDER       = 0x4,
		SWP_NOREDRAW       = 0x8,
		SWP_NOACTIVATE     = 0x10,
		SWP_FRAMECHANGED   = 0x20,
		SWP_SHOWWINDOW     = 0x40,
		SWP_HIDEWINDOW     = 0x80,
		SWP_NOCOPYBITS     = 0x100,
		SWP_NOOWNERZORDER  = 0x200,
		SWP_NOSENDCHANGING = 0x400,
		SWP_DRAWFRAME      = SWP_FRAMECHANGED,
		SWP_NOREPOSITION   = SWP_NOOWNERZORDER,
		SWP_DEFERERASE     = 0x2000,
		SWP_ASYNCWINDOWPOS = 0x4000;

	/** Standard Icon IDs. Use with {@link #nLoadIcon(long, long)}. */
	public static final int
		IDI_APPLICATION = 0x7F00,
		IDI_HAND        = 0x7F01,
		IDI_QUESTION    = 0x7F02,
		IDI_EXCLAMATION = 0x7F03,
		IDI_ASTERISK    = 0x7F04,
		IDI_WINLOGO     = 0x7F05,
		IDI_SHIELD      = 0x7F06,
		IDI_WARNING     = IDI_EXCLAMATION,
		IDI_ERROR       = IDI_HAND,
		IDI_INFORMATION = IDI_ASTERISK;

	/** Standard Cursor IDs. Use with {@link #nLoadCursor(long, long)}. */
	public static final int
		IDC_ARROW       = 0x7F00,
		IDC_IBEAM       = 0x7F01,
		IDC_WAIT        = 0x7F02,
		IDC_CROSS       = 0x7F03,
		IDC_UPARROW     = 0x7F04,
		IDC_SIZE        = 0x7F80,
		IDC_ICON        = 0x7F81,
		IDC_SIZENWSE    = 0x7F82,
		IDC_SIZENESW    = 0x7F83,
		IDC_SIZEWE      = 0x7F84,
		IDC_SIZENS      = 0x7F85,
		IDC_SIZEALL     = 0x7F86,
		IDC_NO          = 0x7F88,
		IDC_HAND        = 0x7F89,
		IDC_APPSTARTING = 0x7F8A,
		IDC_HELP        = 0x7F8B;

	/** Class field offsets for {@link #GetClassLongPtr}. */
	public static final int
		GCL_MENUNAME      = 0xFFFFFFF8,
		GCL_HBRBACKGROUND = 0xFFFFFFF6,
		GCL_HCURSOR       = 0xFFFFFFF4,
		GCL_HICON         = 0xFFFFFFF2,
		GCL_HMODULE       = 0xFFFFFFF0,
		GCL_CBWNDEXTRA    = 0xFFFFFFEE,
		GCL_CBCLSEXTRA    = 0xFFFFFFEC,
		GCL_WNDPROC       = 0xFFFFFFE8,
		GCL_STYLE         = 0xFFFFFFE6,
		GCW_ATOM          = 0xFFFFFFE0,
		GCL_HICONSM       = 0xFFFFFFDE;

	/** Queue status flags for {@link #GetQueueStatus} and {@link #MsgWaitForMultipleObjects} */
	public static final int
		QS_KEY            = 0x1,
		QS_MOUSEMOVE      = 0x2,
		QS_MOUSEBUTTON    = 0x4,
		QS_POSTMESSAGE    = 0x8,
		QS_TIMER          = 0x10,
		QS_PAINT          = 0x20,
		QS_SENDMESSAGE    = 0x40,
		QS_HOTKEY         = 0x80,
		QS_ALLPOSTMESSAGE = 0x100,
		QS_RAWINPUT       = 0x400,
		QS_MOUSE          = QS_MOUSEMOVE | QS_MOUSEBUTTON,
		QS_INPUT          = QS_MOUSE | QS_KEY,
		QS_ALLEVENTS      = QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY,
		QS_ALLINPUT       = QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY | QS_SENDMESSAGE;

	/** Remove message flags for {@link #PeekMessage}. */
	public static final int
		PM_NOREMOVE       = 0x0,
		PM_REMOVE         = 0x1,
		PM_NOYIELD        = 0x2,
		PM_QS_INPUT       = QS_INPUT << 16,
		PM_QS_POSTMESSAGE = (QS_POSTMESSAGE | QS_HOTKEY | QS_TIMER) << 16,
		PM_QS_PAINT       = QS_PAINT << 16,
		PM_QS_SENDMESSAGE = QS_SENDMESSAGE << 16;

	/** EnumDisplaySettings mode. */
	public static final int
		ENUM_CURRENT_SETTINGS  = -1,
		ENUM_REGISTRY_SETTINGS = -2;

	/** Flags for {@link #ChangeDisplaySettings}. */
	public static final int
		CDS_UPDATEREGISTRY       = 0x1,
		CDS_TEST                 = 0x2,
		CDS_FULLSCREEN           = 0x4,
		CDS_GLOBAL               = 0x8,
		CDS_SET_PRIMARY          = 0x10,
		CDS_VIDEOPARAMETERS      = 0x20,
		CDS_ENABLE_UNSAFE_MODES  = 0x100,
		CDS_DISABLE_UNSAFE_MODES = 0x200,
		CDS_RESET                = 0x40000000,
		CDS_RESET_EX             = 0x20000000,
		CDS_NORESET              = 0x10000000;

	/** Return values for {@link #ChangeDisplaySettings}. */
	public static final int
		DISP_CHANGE_SUCCESSFUL  = 0x0,
		DISP_CHANGE_RESTART     = 0x1,
		DISP_CHANGE_FAILED      = 0xFFFFFFFF,
		DISP_CHANGE_BADMODE     = 0xFFFFFFFE,
		DISP_CHANGE_NOTUPDATED  = 0xFFFFFFFD,
		DISP_CHANGE_BADFLAGS    = 0xFFFFFFFC,
		DISP_CHANGE_BADPARAM    = 0xFFFFFFFB,
		DISP_CHANGE_BADDUALVIEW = 0xFFFFFFFA;

	/** Device state flags. */
	public static final int
		DISPLAY_DEVICE_ATTACHED_TO_DESKTOP = 0x1,
		DISPLAY_DEVICE_MULTI_DRIVER        = 0x2,
		DISPLAY_DEVICE_PRIMARY_DEVICE      = 0x4,
		DISPLAY_DEVICE_MIRRORING_DRIVER    = 0x8,
		DISPLAY_DEVICE_VGA_COMPATIBLE      = 0x10,
		DISPLAY_DEVICE_REMOVABLE           = 0x20,
		DISPLAY_DEVICE_MODESPRUNED         = 0x8000000,
		DISPLAY_DEVICE_REMOTE              = 0x4000000,
		DISPLAY_DEVICE_DISCONNECT          = 0x2000000,
		DISPLAY_DEVICE_TS_COMPATIBLE       = 0x200000,
		DISPLAY_DEVICE_UNSAFE_MODES_ON     = 0x80000,
		DISPLAY_DEVICE_ACTIVE              = 0x1,
		DISPLAY_DEVICE_ATTACHED            = 0x2;

	/** Flags for {@link #EnumDisplaySettingsEx}. */
	public static final int
		EDS_RAWMODE     = 0x2,
		EDS_ROTATEDMODE = 0x4;

	/** {@link #SystemParametersInfo} parameters. */
	public static final int
		SPI_GETBEEP                      = 0x1,
		SPI_SETBEEP                      = 0x2,
		SPI_GETMOUSE                     = 0x3,
		SPI_SETMOUSE                     = 0x4,
		SPI_GETBORDER                    = 0x5,
		SPI_SETBORDER                    = 0x6,
		SPI_GETKEYBOARDSPEED             = 0xA,
		SPI_SETKEYBOARDSPEED             = 0xB,
		SPI_LANGDRIVER                   = 0xC,
		SPI_ICONHORIZONTALSPACING        = 0xD,
		SPI_GETSCREENSAVETIMEOUT         = 0xE,
		SPI_SETSCREENSAVETIMEOUT         = 0xF,
		SPI_GETSCREENSAVEACTIVE          = 0x10,
		SPI_SETSCREENSAVEACTIVE          = 0x11,
		SPI_GETGRIDGRANULARITY           = 0x12,
		SPI_SETGRIDGRANULARITY           = 0x13,
		SPI_SETDESKWALLPAPER             = 0x14,
		SPI_SETDESKPATTERN               = 0x15,
		SPI_GETKEYBOARDDELAY             = 0x16,
		SPI_SETKEYBOARDDELAY             = 0x17,
		SPI_ICONVERTICALSPACING          = 0x18,
		SPI_GETICONTITLEWRAP             = 0x19,
		SPI_SETICONTITLEWRAP             = 0x1A,
		SPI_GETMENUDROPALIGNMENT         = 0x1B,
		SPI_SETMENUDROPALIGNMENT         = 0x1C,
		SPI_SETDOUBLECLKWIDTH            = 0x1D,
		SPI_SETDOUBLECLKHEIGHT           = 0x1E,
		SPI_GETICONTITLELOGFONT          = 0x1F,
		SPI_SETDOUBLECLICKTIME           = 0x20,
		SPI_SETMOUSEBUTTONSWAP           = 0x21,
		SPI_SETICONTITLELOGFONT          = 0x22,
		SPI_GETFASTTASKSWITCH            = 0x23,
		SPI_SETFASTTASKSWITCH            = 0x24,
		SPI_SETDRAGFULLWINDOWS           = 0x25,
		SPI_GETDRAGFULLWINDOWS           = 0x26,
		SPI_GETNONCLIENTMETRICS          = 0x29,
		SPI_SETNONCLIENTMETRICS          = 0x2A,
		SPI_GETMINIMIZEDMETRICS          = 0x2B,
		SPI_SETMINIMIZEDMETRICS          = 0x2C,
		SPI_GETICONMETRICS               = 0x2D,
		SPI_SETICONMETRICS               = 0x2E,
		SPI_SETWORKAREA                  = 0x2F,
		SPI_GETWORKAREA                  = 0x30,
		SPI_SETPENWINDOWS                = 0x31,
		SPI_GETHIGHCONTRAST              = 0x42,
		SPI_SETHIGHCONTRAST              = 0x43,
		SPI_GETKEYBOARDPREF              = 0x44,
		SPI_SETKEYBOARDPREF              = 0x45,
		SPI_GETSCREENREADER              = 0x46,
		SPI_SETSCREENREADER              = 0x47,
		SPI_GETANIMATION                 = 0x48,
		SPI_SETANIMATION                 = 0x49,
		SPI_GETFONTSMOOTHING             = 0x4A,
		SPI_SETFONTSMOOTHING             = 0x4B,
		SPI_SETDRAGWIDTH                 = 0x4C,
		SPI_SETDRAGHEIGHT                = 0x4D,
		SPI_SETHANDHELD                  = 0x4E,
		SPI_GETLOWPOWERTIMEOUT           = 0x4F,
		SPI_GETPOWEROFFTIMEOUT           = 0x50,
		SPI_SETLOWPOWERTIMEOUT           = 0x51,
		SPI_SETPOWEROFFTIMEOUT           = 0x52,
		SPI_GETLOWPOWERACTIVE            = 0x53,
		SPI_GETPOWEROFFACTIVE            = 0x54,
		SPI_SETLOWPOWERACTIVE            = 0x55,
		SPI_SETPOWEROFFACTIVE            = 0x56,
		SPI_SETCURSORS                   = 0x57,
		SPI_SETICONS                     = 0x58,
		SPI_GETDEFAULTINPUTLANG          = 0x59,
		SPI_SETDEFAULTINPUTLANG          = 0x5A,
		SPI_SETLANGTOGGLE                = 0x5B,
		SPI_GETWINDOWSEXTENSION          = 0x5C,
		SPI_SETMOUSETRAILS               = 0x5D,
		SPI_GETMOUSETRAILS               = 0x5E,
		SPI_SETSCREENSAVERRUNNING        = 0x61,
		SPI_SCREENSAVERRUNNING           = SPI_SETSCREENSAVERRUNNING,
		SPI_GETFILTERKEYS                = 0x32,
		SPI_SETFILTERKEYS                = 0x33,
		SPI_GETTOGGLEKEYS                = 0x34,
		SPI_SETTOGGLEKEYS                = 0x35,
		SPI_GETMOUSEKEYS                 = 0x36,
		SPI_SETMOUSEKEYS                 = 0x37,
		SPI_GETSHOWSOUNDS                = 0x38,
		SPI_SETSHOWSOUNDS                = 0x39,
		SPI_GETSTICKYKEYS                = 0x3A,
		SPI_SETSTICKYKEYS                = 0x3B,
		SPI_GETACCESSTIMEOUT             = 0x3C,
		SPI_SETACCESSTIMEOUT             = 0x3D,
		SPI_GETSERIALKEYS                = 0x3E,
		SPI_SETSERIALKEYS                = 0x3F,
		SPI_GETSOUNDSENTRY               = 0x40,
		SPI_SETSOUNDSENTRY               = 0x41,
		SPI_GETSNAPTODEFBUTTON           = 0x5F,
		SPI_SETSNAPTODEFBUTTON           = 0x60,
		SPI_GETMOUSEHOVERWIDTH           = 0x62,
		SPI_SETMOUSEHOVERWIDTH           = 0x63,
		SPI_GETMOUSEHOVERHEIGHT          = 0x64,
		SPI_SETMOUSEHOVERHEIGHT          = 0x65,
		SPI_GETMOUSEHOVERTIME            = 0x66,
		SPI_SETMOUSEHOVERTIME            = 0x67,
		SPI_GETWHEELSCROLLLINES          = 0x68,
		SPI_SETWHEELSCROLLLINES          = 0x69,
		SPI_GETMENUSHOWDELAY             = 0x6A,
		SPI_SETMENUSHOWDELAY             = 0x6B,
		SPI_GETWHEELSCROLLCHARS          = 0x6C,
		SPI_SETWHEELSCROLLCHARS          = 0x6D,
		SPI_GETSHOWIMEUI                 = 0x6E,
		SPI_SETSHOWIMEUI                 = 0x6F,
		SPI_GETMOUSESPEED                = 0x70,
		SPI_SETMOUSESPEED                = 0x71,
		SPI_GETSCREENSAVERRUNNING        = 0x72,
		SPI_GETDESKWALLPAPER             = 0x73,
		SPI_GETAUDIODESCRIPTION          = 0x74,
		SPI_SETAUDIODESCRIPTION          = 0x75,
		SPI_GETSCREENSAVESECURE          = 0x76,
		SPI_SETSCREENSAVESECURE          = 0x77,
		SPI_GETHUNGAPPTIMEOUT            = 0x78,
		SPI_SETHUNGAPPTIMEOUT            = 0x79,
		SPI_GETWAITTOKILLTIMEOUT         = 0x7A,
		SPI_SETWAITTOKILLTIMEOUT         = 0x7B,
		SPI_GETWAITTOKILLSERVICETIMEOUT  = 0x7C,
		SPI_SETWAITTOKILLSERVICETIMEOUT  = 0x7D,
		SPI_GETMOUSEDOCKTHRESHOLD        = 0x7E,
		SPI_SETMOUSEDOCKTHRESHOLD        = 0x7F,
		SPI_GETPENDOCKTHRESHOLD          = 0x80,
		SPI_SETPENDOCKTHRESHOLD          = 0x81,
		SPI_GETWINARRANGING              = 0x82,
		SPI_SETWINARRANGING              = 0x83,
		SPI_GETMOUSEDRAGOUTTHRESHOLD     = 0x84,
		SPI_SETMOUSEDRAGOUTTHRESHOLD     = 0x85,
		SPI_GETPENDRAGOUTTHRESHOLD       = 0x86,
		SPI_SETPENDRAGOUTTHRESHOLD       = 0x87,
		SPI_GETMOUSESIDEMOVETHRESHOLD    = 0x88,
		SPI_SETMOUSESIDEMOVETHRESHOLD    = 0x89,
		SPI_GETPENSIDEMOVETHRESHOLD      = 0x8A,
		SPI_SETPENSIDEMOVETHRESHOLD      = 0x8B,
		SPI_GETDRAGFROMMAXIMIZE          = 0x8C,
		SPI_SETDRAGFROMMAXIMIZE          = 0x8D,
		SPI_GETSNAPSIZING                = 0x8E,
		SPI_SETSNAPSIZING                = 0x8F,
		SPI_GETDOCKMOVING                = 0x90,
		SPI_SETDOCKMOVING                = 0x91,
		SPI_GETTOUCHPREDICTIONPARAMETERS = 0x9C,
		SPI_SETTOUCHPREDICTIONPARAMETERS = 0x9D,
		MAX_LOGICALDPIOVERRIDE           = 0x2,
		MIN_LOGICALDPIOVERRIDE           = 0xFFFFFFFE,
		SPI_GETLOGICALDPIOVERRIDE        = 0x9E,
		SPI_SETLOGICALDPIOVERRIDE        = 0x9F,
		SPI_GETMOUSECORNERCLIPLENGTH     = 0xA0,
		SPI_SETMOUSECORNERCLIPLENGTH     = 0xA1,
		SPI_GETMENURECT                  = 0xA2,
		SPI_SETMENURECT                  = 0xA3,
		SPI_GETACTIVEWINDOWTRACKING      = 0x1000,
		SPI_SETACTIVEWINDOWTRACKING      = 0x1001,
		SPI_GETMENUANIMATION             = 0x1002,
		SPI_SETMENUANIMATION             = 0x1003,
		SPI_GETCOMBOBOXANIMATION         = 0x1004,
		SPI_SETCOMBOBOXANIMATION         = 0x1005,
		SPI_GETLISTBOXSMOOTHSCROLLING    = 0x1006,
		SPI_SETLISTBOXSMOOTHSCROLLING    = 0x1007,
		SPI_GETGRADIENTCAPTIONS          = 0x1008,
		SPI_SETGRADIENTCAPTIONS          = 0x1009,
		SPI_GETKEYBOARDCUES              = 0x100A,
		SPI_SETKEYBOARDCUES              = 0x100B,
		SPI_GETMENUUNDERLINES            = SPI_GETKEYBOARDCUES,
		SPI_SETMENUUNDERLINES            = SPI_SETKEYBOARDCUES,
		SPI_GETACTIVEWNDTRKZORDER        = 0x100C,
		SPI_SETACTIVEWNDTRKZORDER        = 0x100D,
		SPI_GETHOTTRACKING               = 0x100E,
		SPI_SETHOTTRACKING               = 0x100F,
		SPI_GETMENUFADE                  = 0x1012,
		SPI_SETMENUFADE                  = 0x1013,
		SPI_GETSELECTIONFADE             = 0x1014,
		SPI_SETSELECTIONFADE             = 0x1015,
		SPI_GETTOOLTIPANIMATION          = 0x1016,
		SPI_SETTOOLTIPANIMATION          = 0x1017,
		SPI_GETTOOLTIPFADE               = 0x1018,
		SPI_SETTOOLTIPFADE               = 0x1019,
		SPI_GETCURSORSHADOW              = 0x101A,
		SPI_SETCURSORSHADOW              = 0x101B,
		SPI_GETMOUSESONAR                = 0x101C,
		SPI_SETMOUSESONAR                = 0x101D,
		SPI_GETMOUSECLICKLOCK            = 0x101E,
		SPI_SETMOUSECLICKLOCK            = 0x101F,
		SPI_GETMOUSEVANISH               = 0x1020,
		SPI_SETMOUSEVANISH               = 0x1021,
		SPI_GETFLATMENU                  = 0x1022,
		SPI_SETFLATMENU                  = 0x1023,
		SPI_GETDROPSHADOW                = 0x1024,
		SPI_SETDROPSHADOW                = 0x1025,
		SPI_GETBLOCKSENDINPUTRESETS      = 0x1026,
		SPI_SETBLOCKSENDINPUTRESETS      = 0x1027,
		SPI_GETUIEFFECTS                 = 0x103E,
		SPI_SETUIEFFECTS                 = 0x103F,
		SPI_GETDISABLEOVERLAPPEDCONTENT  = 0x1040,
		SPI_SETDISABLEOVERLAPPEDCONTENT  = 0x1041,
		SPI_GETCLIENTAREAANIMATION       = 0x1042,
		SPI_SETCLIENTAREAANIMATION       = 0x1043,
		SPI_GETCLEARTYPE                 = 0x1048,
		SPI_SETCLEARTYPE                 = 0x1049,
		SPI_GETSPEECHRECOGNITION         = 0x104A,
		SPI_SETSPEECHRECOGNITION         = 0x104B,
		SPI_GETCARETBROWSING             = 0x104C,
		SPI_SETCARETBROWSING             = 0x104D,
		SPI_GETTHREADLOCALINPUTSETTINGS  = 0x104E,
		SPI_SETTHREADLOCALINPUTSETTINGS  = 0x104F,
		SPI_GETSYSTEMLANGUAGEBAR         = 0x1050,
		SPI_SETSYSTEMLANGUAGEBAR         = 0x1051,
		SPI_GETFOREGROUNDLOCKTIMEOUT     = 0x2000,
		SPI_SETFOREGROUNDLOCKTIMEOUT     = 0x2001,
		SPI_GETACTIVEWNDTRKTIMEOUT       = 0x2002,
		SPI_SETACTIVEWNDTRKTIMEOUT       = 0x2003,
		SPI_GETFOREGROUNDFLASHCOUNT      = 0x2004,
		SPI_SETFOREGROUNDFLASHCOUNT      = 0x2005,
		SPI_GETCARETWIDTH                = 0x2006,
		SPI_SETCARETWIDTH                = 0x2007,
		SPI_GETMOUSECLICKLOCKTIME        = 0x2008,
		SPI_SETMOUSECLICKLOCKTIME        = 0x2009,
		SPI_GETFONTSMOOTHINGTYPE         = 0x200A,
		SPI_SETFONTSMOOTHINGTYPE         = 0x200B,
		SPI_GETFONTSMOOTHINGCONTRAST     = 0x200C,
		SPI_SETFONTSMOOTHINGCONTRAST     = 0x200D,
		SPI_GETFOCUSBORDERWIDTH          = 0x200E,
		SPI_SETFOCUSBORDERWIDTH          = 0x200F,
		SPI_GETFOCUSBORDERHEIGHT         = 0x2010,
		SPI_SETFOCUSBORDERHEIGHT         = 0x2011,
		SPI_GETFONTSMOOTHINGORIENTATION  = 0x2012,
		SPI_SETFONTSMOOTHINGORIENTATION  = 0x2013,
		SPI_GETMINIMUMHITRADIUS          = 0x2014,
		SPI_SETMINIMUMHITRADIUS          = 0x2015,
		SPI_GETMESSAGEDURATION           = 0x2016,
		SPI_SETMESSAGEDURATION           = 0x2017,
		SPI_GETCONTACTVISUALIZATION      = 0x2018,
		SPI_SETCONTACTVISUALIZATION      = 0x2019,
		SPI_GETGESTUREVISUALIZATION      = 0x201A,
		SPI_SETGESTUREVISUALIZATION      = 0x201B;

	/** {@link #SystemParametersInfo} flags. */
	public static final int
		SPIF_UPDATEINIFILE    = 0x1,
		SPIF_SENDWININICHANGE = 0x2,
		SPIF_SENDCHANGE       = SPIF_SENDWININICHANGE;

	/** Virtual Keys. */
	public static final int
		VK_LBUTTON             = 0x1,
		VK_RBUTTON             = 0x2,
		VK_CANCEL              = 0x3,
		VK_MBUTTON             = 0x4,
		VK_XBUTTON1            = 0x5,
		VK_XBUTTON2            = 0x6,
		VK_BACK                = 0x8,
		VK_TAB                 = 0x9,
		VK_CLEAR               = 0xC,
		VK_RETURN              = 0xD,
		VK_SHIFT               = 0x10,
		VK_CONTROL             = 0x11,
		VK_MENU                = 0x12,
		VK_PAUSE               = 0x13,
		VK_CAPITAL             = 0x14,
		VK_KANA                = 0x15,
		VK_HANGEUL             = 0x15,
		VK_HANGUL              = 0x15,
		VK_JUNJA               = 0x17,
		VK_FINAL               = 0x18,
		VK_HANJA               = 0x19,
		VK_KANJI               = 0x19,
		VK_ESCAPE              = 0x1B,
		VK_CONVERT             = 0x1C,
		VK_NONCONVERT          = 0x1D,
		VK_ACCEPT              = 0x1E,
		VK_MODECHANGE          = 0x1F,
		VK_SPACE               = 0x20,
		VK_PRIOR               = 0x21,
		VK_NEXT                = 0x22,
		VK_END                 = 0x23,
		VK_HOME                = 0x24,
		VK_LEFT                = 0x25,
		VK_UP                  = 0x26,
		VK_RIGHT               = 0x27,
		VK_DOWN                = 0x28,
		VK_SELECT              = 0x29,
		VK_PRINT               = 0x2A,
		VK_EXECUTE             = 0x2B,
		VK_SNAPSHOT            = 0x2C,
		VK_INSERT              = 0x2D,
		VK_DELETE              = 0x2E,
		VK_HELP                = 0x2F,
		VK_LWIN                = 0x5B,
		VK_RWIN                = 0x5C,
		VK_APPS                = 0x5D,
		VK_SLEEP               = 0x5F,
		VK_NUMPAD0             = 0x60,
		VK_NUMPAD1             = 0x61,
		VK_NUMPAD2             = 0x62,
		VK_NUMPAD3             = 0x63,
		VK_NUMPAD4             = 0x64,
		VK_NUMPAD5             = 0x65,
		VK_NUMPAD6             = 0x66,
		VK_NUMPAD7             = 0x67,
		VK_NUMPAD8             = 0x68,
		VK_NUMPAD9             = 0x69,
		VK_MULTIPLY            = 0x6A,
		VK_ADD                 = 0x6B,
		VK_SEPARATOR           = 0x6C,
		VK_SUBTRACT            = 0x6D,
		VK_DECIMAL             = 0x6E,
		VK_DIVIDE              = 0x6F,
		VK_F1                  = 0x70,
		VK_F2                  = 0x71,
		VK_F3                  = 0x72,
		VK_F4                  = 0x73,
		VK_F5                  = 0x74,
		VK_F6                  = 0x75,
		VK_F7                  = 0x76,
		VK_F8                  = 0x77,
		VK_F9                  = 0x78,
		VK_F10                 = 0x79,
		VK_F11                 = 0x7A,
		VK_F12                 = 0x7B,
		VK_F13                 = 0x7C,
		VK_F14                 = 0x7D,
		VK_F15                 = 0x7E,
		VK_F16                 = 0x7F,
		VK_F17                 = 0x80,
		VK_F18                 = 0x81,
		VK_F19                 = 0x82,
		VK_F20                 = 0x83,
		VK_F21                 = 0x84,
		VK_F22                 = 0x85,
		VK_F23                 = 0x86,
		VK_F24                 = 0x87,
		VK_NUMLOCK             = 0x90,
		VK_SCROLL              = 0x91,
		VK_OEM_NEC_EQUAL       = 0x92,
		VK_OEM_FJ_JISHO        = 0x92,
		VK_OEM_FJ_MASSHOU      = 0x93,
		VK_OEM_FJ_TOUROKU      = 0x94,
		VK_OEM_FJ_LOYA         = 0x95,
		VK_OEM_FJ_ROYA         = 0x96,
		VK_LSHIFT              = 0xA0,
		VK_RSHIFT              = 0xA1,
		VK_LCONTROL            = 0xA2,
		VK_RCONTROL            = 0xA3,
		VK_LMENU               = 0xA4,
		VK_RMENU               = 0xA5,
		VK_BROWSER_BACK        = 0xA6,
		VK_BROWSER_FORWARD     = 0xA7,
		VK_BROWSER_REFRESH     = 0xA8,
		VK_BROWSER_STOP        = 0xA9,
		VK_BROWSER_SEARCH      = 0xAA,
		VK_BROWSER_FAVORITES   = 0xAB,
		VK_BROWSER_HOME        = 0xAC,
		VK_VOLUME_MUTE         = 0xAD,
		VK_VOLUME_DOWN         = 0xAE,
		VK_VOLUME_UP           = 0xAF,
		VK_MEDIA_NEXT_TRACK    = 0xB0,
		VK_MEDIA_PREV_TRACK    = 0xB1,
		VK_MEDIA_STOP          = 0xB2,
		VK_MEDIA_PLAY_PAUSE    = 0xB3,
		VK_LAUNCH_MAIL         = 0xB4,
		VK_LAUNCH_MEDIA_SELECT = 0xB5,
		VK_LAUNCH_APP1         = 0xB6,
		VK_LAUNCH_APP2         = 0xB7,
		VK_OEM_1               = 0xBA,
		VK_OEM_PLUS            = 0xBB,
		VK_OEM_COMMA           = 0xBC,
		VK_OEM_MINUS           = 0xBD,
		VK_OEM_PERIOD          = 0xBE,
		VK_OEM_2               = 0xBF,
		VK_OEM_3               = 0xC0,
		VK_OEM_4               = 0xDB,
		VK_OEM_5               = 0xDC,
		VK_OEM_6               = 0xDD,
		VK_OEM_7               = 0xDE,
		VK_OEM_8               = 0xDF,
		VK_OEM_AX              = 0xE1,
		VK_OEM_102             = 0xE2,
		VK_ICO_HELP            = 0xE3,
		VK_ICO_00              = 0xE4,
		VK_PROCESSKEY          = 0xE5,
		VK_ICO_CLEAR           = 0xE6,
		VK_PACKET              = 0xE7,
		VK_OEM_RESET           = 0xE9,
		VK_OEM_JUMP            = 0xEA,
		VK_OEM_PA1             = 0xEB,
		VK_OEM_PA2             = 0xEC,
		VK_OEM_PA3             = 0xED,
		VK_OEM_WSCTRL          = 0xEE,
		VK_OEM_CUSEL           = 0xEF,
		VK_OEM_ATTN            = 0xF0,
		VK_OEM_FINISH          = 0xF1,
		VK_OEM_COPY            = 0xF2,
		VK_OEM_AUTO            = 0xF3,
		VK_OEM_ENLW            = 0xF4,
		VK_OEM_BACKTAB         = 0xF5,
		VK_ATTN                = 0xF6,
		VK_CRSEL               = 0xF7,
		VK_EXSEL               = 0xF8,
		VK_EREOF               = 0xF9,
		VK_PLAY                = 0xFA,
		VK_ZOOM                = 0xFB,
		VK_NONAME              = 0xFC,
		VK_PA1                 = 0xFD,
		VK_OEM_CLEAR           = 0xFE;

	/** XButton values. */
	public static final int
		XBUTTON1 = 0x1,
		XBUTTON2 = 0x2;

	/** Value for rolling one detent. */
	public static final int WHEEL_DELTA = 0x78;

	/** {@link TRACKMOUSEEVENT} flags. */
	public static final int
		TME_HOVER     = 0x1,
		TME_LEAVE     = 0x2,
		TME_NONCLIENT = 0x10,
		TME_QUERY     = 0x40000000,
		TME_CANCEL    = 0x80000000;

	/** Predefined Clipboard formats. */
	public static final int
		CF_TEXT         = 0x1,
		CF_BITMAP       = 0x2,
		CF_METAFILEPICT = 0x3,
		CF_SYLK         = 0x4,
		CF_DIF          = 0x5,
		CF_TIFF         = 0x6,
		CF_OEMTEXT      = 0x7,
		CF_DIB          = 0x8,
		CF_PALETTE      = 0x9,
		CF_PENDATA      = 0xA,
		CF_RIFF         = 0xB,
		CF_WAVE         = 0xC,
		CF_UNICODETEXT  = 0xD,
		CF_ENHMETAFILE  = 0xE,
		CF_HDROP        = 0xF,
		CF_LOCALE       = 0x10,
		CF_DIBV5        = 0x11,
		CF_MAX          = 0x12;

	static { LWJGLUtil.initialize(); }

	private WinUser() {}

	// --- [ RegisterClassEx ] ---

	/** JNI method for {@link #RegisterClassEx} */
	@JavadocExclude
	public static native short nRegisterClassEx(long wndClassEx);

	/**
	 * Registers a window class for subsequent use in calls to the {@link #CreateWindowEx} function.
	 *
	 * @param wndClassEx a {@link WNDCLASSEX} structure. You must fill the structure with the appropriate class attributes before passing it to the function.
	 */
	public static short RegisterClassEx(ByteBuffer wndClassEx) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(wndClassEx, WNDCLASSEX.SIZEOF);
		return nRegisterClassEx(memAddress(wndClassEx));
	}

	// --- [ UnregisterClass ] ---

	/** JNI method for {@link #UnregisterClass} */
	@JavadocExclude
	public static native int nUnregisterClass(long className, long instance);

	/**
	 * Unregisters a window class, freeing the memory required for the class.
	 *
	 * @param className a null-terminated string or a class atom. If {@code className} is a string, it specifies the window class name. This class name must have been
	 *                  registered by a previous call to the {@link #RegisterClassEx} function. System classes, such as dialog box controls, cannot be unregistered. If this
	 *                  parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClassEx} function. The atom must be in the low-order
	 *                  word of {@code className}; the high-order word must be zero.
	 * @param instance  a handle to the instance of the module that created the class
	 */
	public static int UnregisterClass(ByteBuffer className, long instance) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(className);
			checkPointer(instance);
		}
		return nUnregisterClass(memAddress(className), instance);
	}

	/** CharSequence version of: {@link #UnregisterClass} */
	public static int UnregisterClass(CharSequence className, long instance) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		APIBuffer __buffer = apiBuffer();
		int classNameEncoded = __buffer.stringParamUTF16(className, true);
		return nUnregisterClass(__buffer.address(classNameEncoded), instance);
	}

	// --- [ GetClassInfoEx ] ---

	/** JNI method for {@link #GetClassInfoEx} */
	@JavadocExclude
	public static native int nGetClassInfoEx(long instance, long className, long classEx);

	/**
	 * Retrieves information about a window class, including a handle to the small icon associated with the window class.
	 *
	 * @param instance  a handle to the instance of the application that created the class. To retrieve information about classes defined by the system (such as buttons or
	 *                  list boxes), set this parameter to {@code NULL}.
	 * @param className the class name. The name must be that of a preregistered class or a class registered by a previous call to the {@link #RegisterClassEx} function.
	 *                  Alternatively, this parameter can be a class atom created by a previous call to {@link #RegisterClassEx}. The atom must be in the low-order word of
	 *                  {@code className}; the high-order word must be zero.
	 * @param classEx   a {@link WNDCLASSEX} structure that receives the information about the class.
	 */
	public static int GetClassInfoEx(long instance, ByteBuffer className, ByteBuffer classEx) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(className);
			checkBuffer(classEx, WNDCLASSEX.SIZEOF);
		}
		return nGetClassInfoEx(instance, memAddress(className), memAddress(classEx));
	}

	/** CharSequence version of: {@link #GetClassInfoEx} */
	public static int GetClassInfoEx(long instance, CharSequence className, ByteBuffer classEx) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(classEx, WNDCLASSEX.SIZEOF);
		APIBuffer __buffer = apiBuffer();
		int classNameEncoded = __buffer.stringParamUTF16(className, true);
		return nGetClassInfoEx(instance, __buffer.address(classNameEncoded), memAddress(classEx));
	}

	// --- [ GetClassLongPtr ] ---

	/** JNI method for {@link #GetClassLongPtr} */
	@JavadocExclude
	public static native long nGetClassLongPtr(long window, int index);

	/**
	 * Retrieves the specified value from the WNDCLASSEX structure associated with the specified window.
	 *
	 * @param window a handle to the window and, indirectly, the class to which the window belongs
	 * @param index  the value to be retrieved
	 */
	public static long GetClassLongPtr(long window, int index) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nGetClassLongPtr(window, index);
	}

	// --- [ SetClassLongPtr ] ---

	/** JNI method for {@link #SetClassLongPtr} */
	@JavadocExclude
	public static native long nSetClassLongPtr(long window, int index, long newLong);

	/**
	 * Replaces the specified value at the specified offset into the extra class memory or the WNDCLASSEX structure for the class to which the specified window
	 * belongs.
	 *
	 * @param window  a handle to the window and, indirectly, the class to which the window belongs
	 * @param index   the value to be replaced
	 * @param newLong the replacement value
	 */
	public static long SetClassLongPtr(long window, int index, long newLong) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nSetClassLongPtr(window, index, newLong);
	}

	// --- [ LoadIcon ] ---

	/** JNI method for {@link #LoadIcon} */
	@JavadocExclude
	public static native long nLoadIcon(long instance, long iconName);

	/**
	 * Loads the specified icon resource from the executable (.exe) file associated with an application instance.
	 *
	 * @param instance a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be {@code NULL} when a standard icon is
	 *                 being loaded.
	 * @param iconName the name of the icon resource to be loaded
	 */
	public static long LoadIcon(long instance, ByteBuffer iconName) {
		if ( LWJGLUtil.CHECKS )
			checkNT2(iconName);
		return nLoadIcon(instance, memAddress(iconName));
	}

	/** CharSequence version of: {@link #LoadIcon} */
	public static long LoadIcon(long instance, CharSequence iconName) {
		APIBuffer __buffer = apiBuffer();
		int iconNameEncoded = __buffer.stringParamUTF16(iconName, true);
		return nLoadIcon(instance, __buffer.address(iconNameEncoded));
	}

	// --- [ LoadCursor ] ---

	/** JNI method for {@link #LoadCursor} */
	@JavadocExclude
	public static native long nLoadCursor(long instance, long cursorName);

	/**
	 * Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.
	 *
	 * @param instance   a handle to an instance of the module whose executable file contains the cursor to be loaded.
	 * @param cursorName the name of the cursor resource to be loaded
	 */
	public static long LoadCursor(long instance, ByteBuffer cursorName) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(instance);
			checkNT2(cursorName);
		}
		return nLoadCursor(instance, memAddress(cursorName));
	}

	/** CharSequence version of: {@link #LoadCursor} */
	public static long LoadCursor(long instance, CharSequence cursorName) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		APIBuffer __buffer = apiBuffer();
		int cursorNameEncoded = __buffer.stringParamUTF16(cursorName, true);
		return nLoadCursor(instance, __buffer.address(cursorNameEncoded));
	}

	// --- [ GetSystemMetrics ] ---

	/**
	 * Retrieves the specified system metric or system configuration setting.
	 *
	 * @param index the system metric or configuration setting to be retrieved
	 */
	public static native int GetSystemMetrics(int index);

	// --- [ CreateWindowEx ] ---

	/** JNI method for {@link #CreateWindowEx} */
	@JavadocExclude
	public static native long nCreateWindowEx(int exStyle, long className, long windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param);

	/**
	 * Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.
	 *
	 * @param exStyle    the extended window style of the window being created
	 * @param className  a null-terminated string or a class atom created by a previous call to the {@link #RegisterClassEx} function.
	 * @param windowName the window name. If the window style specifies a title bar, the window title pointed to by {@code windowName} is displayed in the title bar.
	 * @param style      the style of the window being created
	 * @param x          the initial horizontal position of the window
	 * @param y          the initial vertical position of the window
	 * @param width      the width, in device units, of the window
	 * @param height     the height, in device units, of the window
	 * @param parent     a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle.
	 * @param menu       a handle to a menu, or specifies a child-window identifier, depending on the window style
	 * @param instance   a handle to the instance of the module to be associated with the window
	 * @param param      a value to be passed to the window through the {@link CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param of the WM_CREATE message.
	 */
	public static long CreateWindowEx(int exStyle, ByteBuffer className, ByteBuffer windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(className);
			checkNT2(windowName);
			checkPointer(instance);
		}
		return nCreateWindowEx(exStyle, memAddress(className), memAddress(windowName), style, x, y, width, height, parent, menu, instance, param);
	}

	/** CharSequence version of: {@link #CreateWindowEx} */
	public static long CreateWindowEx(int exStyle, CharSequence className, CharSequence windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		APIBuffer __buffer = apiBuffer();
		int classNameEncoded = __buffer.stringParamUTF16(className, true);
		int windowNameEncoded = __buffer.stringParamUTF16(windowName, true);
		return nCreateWindowEx(exStyle, __buffer.address(classNameEncoded), __buffer.address(windowNameEncoded), style, x, y, width, height, parent, menu, instance, param);
	}

	// --- [ DestroyWindow ] ---

	/** JNI method for {@link #DestroyWindow} */
	@JavadocExclude
	public static native int nDestroyWindow(long window);

	/**
	 * Destroys the specified window. The function sends WM_DESTROY and WM_NCDESTROY messages to the window to deactivate it and remove the keyboard focus from
	 * it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
	 * clipboard viewer chain (if the window is at the top of the viewer chain).
	 * 
	 * <p>If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
	 * parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.</p>
	 *
	 * @param window a handle to the window to be destroyed
	 */
	public static int DestroyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nDestroyWindow(window);
	}

	// --- [ ShowWindow ] ---

	/** JNI method for {@link #ShowWindow} */
	@JavadocExclude
	public static native int nShowWindow(long window, int cmdShow);

	/**
	 * Sets the specified window's show state.
	 *
	 * @param window  a handle to the window
	 * @param cmdShow controls how the window is to be shown
	 */
	public static int ShowWindow(long window, int cmdShow) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nShowWindow(window, cmdShow);
	}

	// --- [ UpdateWindow ] ---

	/** JNI method for {@link #UpdateWindow} */
	@JavadocExclude
	public static native int nUpdateWindow(long window);

	/**
	 * Updates the client area of the specified window by sending a WM_PAINT message to the window if the window's update region is not empty. The function
	 * sends a WM_PAINT message directly to the window procedure of the specified window, bypassing the application queue. If the update region is empty, no
	 * message is sent.
	 *
	 * @param window handle to the window to be updated
	 */
	public static int UpdateWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nUpdateWindow(window);
	}

	// --- [ SetWindowPos ] ---

	/** JNI method for {@link #SetWindowPos} */
	@JavadocExclude
	public static native int nSetWindowPos(long window, long insertAfter, int x, int y, int width, int height, int flags);

	/**
	 * Changes the size, position, and Z order of a child, pop-up, or top-level window. These windows are ordered according to their appearance on the screen.
	 * The topmost window receives the highest rank and is the first window in the Z order.
	 *
	 * @param window      a handle to the window
	 * @param insertAfter a handle to the window to precede the positioned window in the Z order
	 * @param x           the new position of the left side of the window, in client coordinates
	 * @param y           the new position of the top of the window, in client coordinates
	 * @param width       the new width of the window, in pixels
	 * @param height      the new height of the window, in pixels
	 * @param flags       the window sizing and positioning flags
	 */
	public static int SetWindowPos(long window, long insertAfter, int x, int y, int width, int height, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nSetWindowPos(window, insertAfter, x, y, width, height, flags);
	}

	// --- [ SetWindowText ] ---

	/** JNI method for {@link #SetWindowText} */
	@JavadocExclude
	public static native int nSetWindowText(long window, long string);

	/**
	 * Changes the text of the specified window's title bar (if it has one). If the specified window is a control, the text of the control is changed. However,
	 * {@code SetWindowText} cannot change the text of a control in another application.
	 *
	 * @param window a handle to the window or control whose text is to be changed
	 * @param string the new title or control text
	 */
	public static int SetWindowText(long window, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkNT2(string);
		}
		return nSetWindowText(window, memAddress(string));
	}

	/** CharSequence version of: {@link #SetWindowText} */
	public static int SetWindowText(long window, CharSequence string) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF16(string, true);
		return nSetWindowText(window, __buffer.address(stringEncoded));
	}

	// --- [ GetMessage ] ---

	/** JNI method for {@link #GetMessage} */
	@JavadocExclude
	public static native int nGetMessage(long msg, long window, int msgFilterMin, int msgFilterMax);

	/**
	 * Retrieves a message from the calling thread's message queue. The function dispatches incoming sent messages until a posted message is available for
	 * retrieval. Unlike GetMessage, the {@link #PeekMessage} function does not wait for a message to be posted before returning.
	 *
	 * @param msg          an {@link MSG} structure that receives message information from the thread's message queue
	 * @param window       a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 * @param msgFilterMin the integer value of the lowest message value to be retrieved
	 * @param msgFilterMax the integer value of the highest message value to be retrieved
	 */
	public static int GetMessage(ByteBuffer msg, long window, int msgFilterMin, int msgFilterMax) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(msg, MSG.SIZEOF);
		return nGetMessage(memAddress(msg), window, msgFilterMin, msgFilterMax);
	}

	// --- [ PeekMessage ] ---

	/** JNI method for {@link #PeekMessage} */
	@JavadocExclude
	public static native int nPeekMessage(long msg, long window, int msgFilterMin, int msgFilterMax, int removeMsg);

	/**
	 * Dispatches incoming sent messages, checks the thread message queue for a posted message, and retrieves the message (if any exist).
	 *
	 * @param msg          an {@link MSG} structure that receives message information
	 * @param window       a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 * @param msgFilterMin the value of the first message in the range of messages to be examined
	 * @param msgFilterMax the value of the last message in the range of messages to be examined
	 * @param removeMsg    specifies how messages are to be handled. One of:<br>{@link #PM_NOREMOVE}, {@link #PM_REMOVE}, {@link #PM_NOYIELD}
	 */
	public static int PeekMessage(ByteBuffer msg, long window, int msgFilterMin, int msgFilterMax, int removeMsg) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(msg, MSG.SIZEOF);
		return nPeekMessage(memAddress(msg), window, msgFilterMin, msgFilterMax, removeMsg);
	}

	// --- [ TranslateMessage ] ---

	/** JNI method for {@link #TranslateMessage} */
	@JavadocExclude
	public static native int nTranslateMessage(long msg);

	/**
	 * Translates virtual-key messages into character messages. The character messages are posted to the calling thread's message queue, to be read the next
	 * time the thread calls the {@link #GetMessage} or {@link #PeekMessage} function.
	 *
	 * @param msg an {@link MSG} structure that contains message information retrieved from the calling thread's message queue by using the
	 *            {@link #GetMessage} or {@link #PeekMessage} function.
	 */
	public static int TranslateMessage(ByteBuffer msg) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(msg, MSG.SIZEOF);
		return nTranslateMessage(memAddress(msg));
	}

	// --- [ WaitMessage ] ---

	/**
	 * Yields control to other threads when a thread has no other messages in its message queue. The WaitMessage function suspends the thread and does not
	 * return until a new message is placed in the thread's message queue.
	 */
	public static native int WaitMessage();

	// --- [ DispatchMessage ] ---

	/** JNI method for {@link #DispatchMessage} */
	@JavadocExclude
	public static native long nDispatchMessage(long msg);

	/**
	 * Dispatches a message to a window procedure. It is typically used to dispatch a message retrieved by the {@link #GetMessage} function.
	 *
	 * @param msg a structure that contains the message
	 */
	public static long DispatchMessage(ByteBuffer msg) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(msg, MSG.SIZEOF);
		return nDispatchMessage(memAddress(msg));
	}

	// --- [ GetQueueStatus ] ---

	/**
	 * Retrieves the type of messages found in the calling thread's message queue.
	 *
	 * @param flags the types of messages for which to check
	 */
	public static native int GetQueueStatus(int flags);

	// --- [ GetMessageTime ] ---

	/**
	 * Retrieves the message time for the last message retrieved by the GetMessage function. The time is a long integer that specifies the elapsed time, in
	 * milliseconds, from the time the system was started to the time the message was created (that is, placed in the thread's message queue).
	 */
	public static native int GetMessageTime();

	// --- [ DefWindowProc ] ---

	/** JNI method for {@link #DefWindowProc} */
	@JavadocExclude
	public static native long nDefWindowProc(long window, int msg, long wParam, long lParam);

	/**
	 * Calls the default window procedure to provide default processing for any window messages that an application does not process. This function ensures
	 * that every message is processed. DefWindowProc is called with the same parameters received by the window procedure.
	 *
	 * @param window a handle to the window that received the message
	 * @param msg    the message
	 * @param wParam additional message information. The content of this parameter depends on the value of the {@code msg} parameter.
	 * @param lParam additional message information. The content of this parameter depends on the value of the {@code msg} parameter.
	 */
	public static long DefWindowProc(long window, int msg, long wParam, long lParam) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nDefWindowProc(window, msg, wParam, lParam);
	}

	// --- [ GetDC ] ---

	/**
	 * Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
	 * subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
	 *
	 * @param window a handle to the window whose DC is to be retrieved. If this value is {@code NULL}, {@code GetDC} retrieves the DC for the entire screen.
	 */
	public static native long GetDC(long window);

	// --- [ ReleaseDC ] ---

	/** JNI method for {@link #ReleaseDC} */
	@JavadocExclude
	public static native int nReleaseDC(long window, long hdc);

	/**
	 * Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
	 * common and window DCs. It has no effect on class or private DCs.
	 *
	 * @param window a handle to the window whose DC is to be released
	 * @param hdc    a handle to the DC to be released
	 */
	public static int ReleaseDC(long window, long hdc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nReleaseDC(window, hdc);
	}

	// --- [ EnumDisplayDevices ] ---

	/** JNI method for {@link #EnumDisplayDevices} */
	@JavadocExclude
	public static native int nEnumDisplayDevices(long device, int devNum, long displayDevice, int flags);

	/**
	 * Obtains information about the display devices in the current session.
	 *
	 * @param device        the device name. If {@code NULL}, function returns information for the display adapter(s) on the machine, based on {@code devNum}.
	 * @param devNum        an index value that specifies the display device of interest. The operating system identifies each display device in the current session with an
	 *                      index value. The index values are consecutive integers, starting at 0. If the current session has three display devices, for example, they are
	 *                      specified by the index values 0, 1, and 2.
	 * @param displayDevice a {@link DISPLAY_DEVICE} structure that receives information about the display device specified by {@code devNum}. Before calling
	 *                      {@code EnumDisplayDevices}, you must initialize the cb member of {@code DISPLAY_DEVICE} to the size, in bytes, of {@code DISPLAY_DEVICE}.
	 * @param flags         set this flag to EDD_GET_DEVICE_INTERFACE_NAME (0x00000001) to retrieve the device interface name for GUID_DEVINTERFACE_MONITOR, which is registered by the operating system on a per monitor basis
	 */
	public static int EnumDisplayDevices(ByteBuffer device, int devNum, ByteBuffer displayDevice, int flags) {
		if ( LWJGLUtil.CHECKS ) {
			if ( device != null ) checkNT2(device);
			checkBuffer(displayDevice, DISPLAY_DEVICE.SIZEOF);
		}
		return nEnumDisplayDevices(memAddressSafe(device), devNum, memAddress(displayDevice), flags);
	}

	/** CharSequence version of: {@link #EnumDisplayDevices} */
	public static int EnumDisplayDevices(CharSequence device, int devNum, ByteBuffer displayDevice, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(displayDevice, DISPLAY_DEVICE.SIZEOF);
		APIBuffer __buffer = apiBuffer();
		int deviceEncoded = __buffer.stringParamUTF16(device, true);
		return nEnumDisplayDevices(__buffer.addressSafe(device, deviceEncoded), devNum, memAddress(displayDevice), flags);
	}

	// --- [ EnumDisplaySettings ] ---

	/** JNI method for {@link #EnumDisplaySettings} */
	@JavadocExclude
	public static native int nEnumDisplaySettings(long deviceName, int modeNum, long devMode);

	/**
	 * Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes of a display device, make
	 * a series of calls to this function.
	 *
	 * @param deviceName a null-terminated string that specifies the display device about whose graphics mode the function will obtain information. This parameter is either
	 *                   {@code NULL} or a DISPLAY_DEVICE.DeviceName returned from {@link #EnumDisplayDevices}. A {@code NULL} value specifies the current display device on the computer on
	 *                   which the calling thread is running.
	 * @param modeNum    the type of information to be retrieved. This value can be a graphics mode index or one of:<br>{@link #ENUM_CURRENT_SETTINGS}, {@link #ENUM_REGISTRY_SETTINGS}
	 * @param devMode    a {@link DEVMODE} structure into which the function stores information about the specified graphics mode
	 */
	public static int EnumDisplaySettings(ByteBuffer deviceName, int modeNum, ByteBuffer devMode) {
		if ( LWJGLUtil.CHECKS ) {
			if ( deviceName != null ) checkNT2(deviceName);
			checkBuffer(devMode, DEVMODE.SIZEOF);
		}
		return nEnumDisplaySettings(memAddressSafe(deviceName), modeNum, memAddress(devMode));
	}

	/** CharSequence version of: {@link #EnumDisplaySettings} */
	public static int EnumDisplaySettings(CharSequence deviceName, int modeNum, ByteBuffer devMode) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(devMode, DEVMODE.SIZEOF);
		APIBuffer __buffer = apiBuffer();
		int deviceNameEncoded = __buffer.stringParamUTF16(deviceName, true);
		return nEnumDisplaySettings(__buffer.addressSafe(deviceName, deviceNameEncoded), modeNum, memAddress(devMode));
	}

	// --- [ EnumDisplaySettingsEx ] ---

	/** JNI method for {@link #EnumDisplaySettingsEx} */
	@JavadocExclude
	public static native int nEnumDisplaySettingsEx(long deviceName, int modeNum, long devMode, int flags);

	/**
	 * Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
	 * make a series of calls to this function. This function differs from {@link #EnumDisplaySettings} in that there is a {@code flags} parameter.
	 *
	 * @param deviceName a null-terminated string that specifies the display device about which graphics mode the function will obtain information
	 * @param modeNum    the type of information to be retrieved. This value can be a graphics mode index or one of:<br>{@link #ENUM_CURRENT_SETTINGS}, {@link #ENUM_REGISTRY_SETTINGS}
	 * @param devMode    a {@link DEVMODE} structure into which the function stores information about the specified graphics mode
	 * @param flags      one of:<br>{@link #EDS_RAWMODE}, {@link #EDS_ROTATEDMODE}
	 */
	public static int EnumDisplaySettingsEx(ByteBuffer deviceName, int modeNum, ByteBuffer devMode, int flags) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(deviceName);
			checkBuffer(devMode, DEVMODE.SIZEOF);
		}
		return nEnumDisplaySettingsEx(memAddress(deviceName), modeNum, memAddress(devMode), flags);
	}

	/** CharSequence version of: {@link #EnumDisplaySettingsEx} */
	public static int EnumDisplaySettingsEx(CharSequence deviceName, int modeNum, ByteBuffer devMode, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(devMode, DEVMODE.SIZEOF);
		APIBuffer __buffer = apiBuffer();
		int deviceNameEncoded = __buffer.stringParamUTF16(deviceName, true);
		return nEnumDisplaySettingsEx(__buffer.address(deviceNameEncoded), modeNum, memAddress(devMode), flags);
	}

	// --- [ ChangeDisplaySettings ] ---

	/** JNI method for {@link #ChangeDisplaySettings} */
	@JavadocExclude
	public static native int nChangeDisplaySettings(long devMode, int flags);

	/**
	 * Changes the settings of the default display device to the specified graphics mode.
	 *
	 * @param devMode a {@link DEVMODE} structure that describes the new graphics mode. If {@code devMode} is {@code NULL}, all the values currently in the registry will be used
	 *                for the display setting. Passing {@code NULL} for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
	 *                default mode after a dynamic mode change.
	 * @param flags   indicates how the graphics mode should be changed
	 */
	public static int ChangeDisplaySettings(ByteBuffer devMode, int flags) {
		if ( LWJGLUtil.CHECKS )
			if ( devMode != null ) checkBuffer(devMode, DEVMODE.SIZEOF);
		return nChangeDisplaySettings(memAddressSafe(devMode), flags);
	}

	// --- [ ChangeDisplaySettingsEx ] ---

	/** JNI method for {@link #ChangeDisplaySettingsEx} */
	@JavadocExclude
	public static native int nChangeDisplaySettingsEx(long deviceName, long devMode, long window, int flags, long param);

	/**
	 * Changes the settings of the specified display device to the specified graphics mode.
	 *
	 * @param deviceName a null-terminated string that specifies the display device whose graphics mode will change
	 * @param devMode    a {@link DEVMODE} structure that describes the new graphics mode. If {@code devMode} is {@code NULL}, all the values currently in the registry will be used
	 *                   for the display setting. Passing {@code NULL} for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
	 *                   default mode after a dynamic mode change.
	 * @param window     reserved; must be {@code NULL}
	 * @param flags      indicates how the graphics mode should be changed
	 * @param param      if {@code flags} is {@link #CDS_VIDEOPARAMETERS}, {@code param} is a pointer to a {@link VIDEOPARAMETERS} structure. Otherwise {@code param} must be {@code NULL}.
	 */
	public static int ChangeDisplaySettingsEx(ByteBuffer deviceName, ByteBuffer devMode, long window, int flags, long param) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(deviceName);
			if ( devMode != null ) checkBuffer(devMode, DEVMODE.SIZEOF);
		}
		return nChangeDisplaySettingsEx(memAddress(deviceName), memAddressSafe(devMode), window, flags, param);
	}

	/** CharSequence version of: {@link #ChangeDisplaySettingsEx} */
	public static int ChangeDisplaySettingsEx(CharSequence deviceName, ByteBuffer devMode, long window, int flags, long param) {
		if ( LWJGLUtil.CHECKS )
			if ( devMode != null ) checkBuffer(devMode, DEVMODE.SIZEOF);
		APIBuffer __buffer = apiBuffer();
		int deviceNameEncoded = __buffer.stringParamUTF16(deviceName, true);
		return nChangeDisplaySettingsEx(__buffer.address(deviceNameEncoded), memAddressSafe(devMode), window, flags, param);
	}

	// --- [ SystemParametersInfo ] ---

	/**
	 * Retrieves or sets the value of one of the system-wide parameters. This function can also update the user profile while setting a parameter.
	 *
	 * @param uiAction the system-wide parameter to be retrieved or set
	 * @param uiParam  a parameter whose usage and format depends on the system parameter being queried or set. If not otherwise indicated, you must specify zero for this
	 *                 parameter.
	 * @param pvParam  a parameter whose usage and format depends on the system parameter being queried or set. If not otherwise indicated, you must specify {@code NULL} for this
	 *                 parameter.
	 * @param fWinIni  if a system parameter is being set, specifies whether the user profile is to be updated, and if so, whether the {@link #WM_SETTINGCHANGE} message is
	 *                 to be broadcast to all top-level windows to notify them of the change.
	 *                 
	 *                 <p>This parameter can be zero if you do not want to update the user profile or broadcast the {@link #WM_SETTINGCHANGE} message.</p>
	 */
	public static native int SystemParametersInfo(int uiAction, int uiParam, long pvParam, int fWinIni);

	// --- [ AdjustWindowRectEx ] ---

	/** JNI method for {@link #AdjustWindowRectEx} */
	@JavadocExclude
	public static native int nAdjustWindowRectEx(long rect, int style, int menu, int exStyle);

	/**
	 * Calculates the required size of the window rectangle, based on the desired size of the client rectangle. The window rectangle can then be passed to the
	 * {@link #CreateWindowEx} function to create a window whose client area is the desired size.
	 *
	 * @param rect    a pointer to a {@link RECT} structure that contains the coordinates of the top-left and bottom-right corners of the desired client area. When the
	 *                function returns, the structure contains the coordinates of the top-left and bottom-right corners of the window to accommodate the desired client
	 *                area.
	 * @param style   the window style of the window whose required size is to be calculated. Note that you cannot specify the {@link #WS_OVERLAPPED} style.
	 * @param menu    indicates whether the window has a menu
	 * @param exStyle the extended window style of the window whose required size is to be calculated
	 */
	public static int AdjustWindowRectEx(ByteBuffer rect, int style, int menu, int exStyle) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(rect, RECT.SIZEOF);
		return nAdjustWindowRectEx(memAddress(rect), style, menu, exStyle);
	}

	// --- [ GetCursorPos ] ---

	/** JNI method for {@link #GetCursorPos} */
	@JavadocExclude
	public static native int nGetCursorPos(long point);

	/**
	 * Retrieves the position of the mouse cursor, in screen coordinates.
	 *
	 * @param point a pointer to a {@link POINT} structure that receives the screen coordinates of the cursor
	 */
	public static int GetCursorPos(ByteBuffer point) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(point, POINT.SIZEOF);
		return nGetCursorPos(memAddress(point));
	}

	// --- [ ScreenToClient ] ---

	/** JNI method for {@link #ScreenToClient} */
	@JavadocExclude
	public static native int nScreenToClient(long hWnd, long point);

	/**
	 * Converts the screen coordinates of a specified point on the screen to client-area coordinates.
	 *
	 * @param hWnd  a handle to the window whose client area will be used for the conversion
	 * @param point a pointer to a {@link POINT} structure that specifies the screen coordinates to be converted
	 */
	public static int ScreenToClient(long hWnd, ByteBuffer point) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hWnd);
			checkBuffer(point, POINT.SIZEOF);
		}
		return nScreenToClient(hWnd, memAddress(point));
	}

	// --- [ ClientToScreen ] ---

	/** JNI method for {@link #ClientToScreen} */
	@JavadocExclude
	public static native int nClientToScreen(long hWnd, long point);

	/**
	 * Converts the client-area coordinates of a specified point to screen coordinates.
	 *
	 * @param hWnd  a handle to the window whose client area will be used for the conversion
	 * @param point a pointer to a {@link POINT} structure that contains the client coordinates to be converted. The new screen coordinates are copied into this
	 *              structure if the function succeeds.
	 */
	public static int ClientToScreen(long hWnd, ByteBuffer point) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hWnd);
			checkBuffer(point, POINT.SIZEOF);
		}
		return nClientToScreen(hWnd, memAddress(point));
	}

	// --- [ GetClientRect ] ---

	/** JNI method for {@link #GetClientRect} */
	@JavadocExclude
	public static native int nGetClientRect(long hWnd, long rect);

	/**
	 * Retrieves the coordinates of a window's client area. The client coordinates specify the upper-left and lower-right corners of the client area. Because
	 * client coordinates are relative to the upper-left corner of a window's client area, the coordinates of the upper-left corner are (0,0).
	 *
	 * @param hWnd a handle to the window whose client coordinates are to be retrieved.
	 * @param rect a pointer to a {@link RECT} structure that receives the client coordinates. The left and top members are zero. The right and bottom members contain
	 *             the width and height of the window.
	 */
	public static int GetClientRect(long hWnd, ByteBuffer rect) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hWnd);
			checkBuffer(rect, RECT.SIZEOF);
		}
		return nGetClientRect(hWnd, memAddress(rect));
	}

	// --- [ WindowFromPoint ] ---

	/** JNI method for {@link #WindowFromPoint} */
	@JavadocExclude
	public static native long nWindowFromPoint(long point);

	/**
	 * Retrieves a handle to the window that contains the specified point.
	 *
	 * @param point the point to be checked
	 */
	public static long WindowFromPoint(ByteBuffer point) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(point, POINT.SIZEOF);
		return nWindowFromPoint(memAddress(point));
	}

	// --- [ BringWindowToTop ] ---

	/** JNI method for {@link #BringWindowToTop} */
	@JavadocExclude
	public static native int nBringWindowToTop(long hWnd);

	/**
	 * Brings the specified window to the top of the Z order. If the window is a top-level window, it is activated. If the window is a child window, the
	 * top-level parent window associated with the child window is activated.
	 *
	 * @param hWnd a handle to the window to bring to the top of the Z order
	 */
	public static int BringWindowToTop(long hWnd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hWnd);
		return nBringWindowToTop(hWnd);
	}

	// --- [ SetForegroundWindow ] ---

	/** JNI method for {@link #SetForegroundWindow} */
	@JavadocExclude
	public static native int nSetForegroundWindow(long hWnd);

	/**
	 * Brings the thread that created the specified window into the foreground and activates the window. Keyboard input is directed to the window, and various
	 * visual cues are changed for the user. The system assigns a slightly higher priority to the thread that created the foreground window than it does to
	 * other threads.
	 *
	 * @param hWnd a handle to the window that should be activated and brought to the foreground
	 */
	public static int SetForegroundWindow(long hWnd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hWnd);
		return nSetForegroundWindow(hWnd);
	}

	// --- [ SetFocus ] ---

	/**
	 * Sets the keyboard focus to the specified window. The window must be attached to the calling thread's message queue.
	 *
	 * @param hWnd a handle to the window that will receive the keyboard input. If this parameter is {@code NULL}, keystrokes are ignored.
	 *
	 * @return the handle to the window that previously had the keyboard focus. If the {@code hWnd} parameter is invalid or the window is not attached to the calling
	 *         thread's message queue, the return value is {@code NULL}.
	 */
	public static native long SetFocus(long hWnd);

	// --- [ SetWindowLongPtr ] ---

	/** JNI method for {@link #SetWindowLongPtr} */
	@JavadocExclude
	public static native long nSetWindowLongPtr(long hWnd, int index, long newLong);

	/**
	 * Changes an attribute of the specified window. The function also sets a value at the specified offset in the extra window memory.
	 *
	 * @param hWnd    a handle to the window and, indirectly, the class to which the window belongs
	 * @param index   the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
	 *                of an integer. To set any other value, specify one of:<br>{@link #GWL_WNDPROC}, {@link #GWL_HINSTANCE}, {@link #GWL_HWNDPARENT}, {@link #GWL_STYLE}, {@link #GWL_EXSTYLE}, {@link #GWL_USERDATA}, {@link #GWL_ID}
	 * @param newLong the replacement value
	 *
	 * @return the previous value at the given {@code index}
	 */
	public static long SetWindowLongPtr(long hWnd, int index, long newLong) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hWnd);
		return nSetWindowLongPtr(hWnd, index, newLong);
	}

	// --- [ GetWindowLongPtr ] ---

	/** JNI method for {@link #GetWindowLongPtr} */
	@JavadocExclude
	public static native long nGetWindowLongPtr(long hWnd, int index);

	/**
	 * Retrieves information about the specified window. The function also retrieves the value at a specified offset into the extra window memory.
	 *
	 * @param hWnd  a handle to the window and, indirectly, the class to which the window belongs
	 * @param index the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
	 *              of an integer. To set any other value, specify one of:<br>{@link #GWL_WNDPROC}, {@link #GWL_HINSTANCE}, {@link #GWL_HWNDPARENT}, {@link #GWL_STYLE}, {@link #GWL_EXSTYLE}, {@link #GWL_USERDATA}, {@link #GWL_ID}
	 */
	public static long GetWindowLongPtr(long hWnd, int index) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hWnd);
		return nGetWindowLongPtr(hWnd, index);
	}

	// --- [ GetAsyncKeyState ] ---

	/**
	 * Determines whether a key is up or down at the time the function is called, and whether the key was pressed after a previous call to {@code GetAsyncKeyState}.
	 *
	 * @param key the virtual-key code
	 */
	public static native short GetAsyncKeyState(int key);

	// --- [ SetCursorPos ] ---

	/**
	 * Moves the cursor to the specified screen coordinates. If the new coordinates are not within the screen rectangle set by the most recent {@link #ClipCursor}
	 * function call, the system automatically adjusts the coordinates so that the cursor stays within the rectangle.
	 *
	 * @param X the new x-coordinate of the cursor, in screen coordinates.
	 * @param Y the new y-coordinate of the cursor, in screen coordinates.
	 */
	public static native int SetCursorPos(int X, int Y);

	// --- [ SetCapture ] ---

	/** JNI method for {@link #SetCapture} */
	@JavadocExclude
	public static native long nSetCapture(long hWnd);

	/**
	 * Sets the mouse capture to the specified window belonging to the current thread. {@code SetCapture} captures mouse input either when the mouse is over
	 * the capturing window, or when the mouse button was pressed while the mouse was over the capturing window and the button is still down. Only one window
	 * at a time can capture the mouse.
	 * 
	 * <p>If the mouse cursor is over a window created by another thread, the system will direct mouse input to the specified window only if a mouse button is
	 * down.</p>
	 *
	 * @param hWnd a handle to the window in the current thread that is to capture the mouse
	 *
	 * @return a handle to the window that had previously captured the mouse. If there is no such window, the return value is {@code NULL}.
	 */
	public static long SetCapture(long hWnd) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hWnd);
		return nSetCapture(hWnd);
	}

	// --- [ ReleaseCapture ] ---

	/**
	 * Releases the mouse capture from a window in the current thread and restores normal mouse input processing. A window that has captured the mouse receives
	 * all mouse input, regardless of the position of the cursor, except when a mouse button is clicked while the cursor hot spot is in the window of another
	 * thread.
	 */
	public static native int ReleaseCapture();

	// --- [ ClipCursor ] ---

	/** JNI method for {@link #ClipCursor} */
	@JavadocExclude
	public static native int nClipCursor(long rect);

	/**
	 * "Confines the cursor to a rectangular area on the screen. If a subsequent cursor position (set by the {@code SetCursorPos} function or the mouse) lies
	 * outside the rectangle, the system automatically adjusts the position to keep the cursor inside the rectangular area.
	 *
	 * @param rect a pointer to the structure that contains the screen coordinates of the upper-left and lower-right corners of the confining rectangle. If this
	 *             parameter is {@code NULL}, the cursor is free to move anywhere on the screen.
	 */
	public static int ClipCursor(ByteBuffer rect) {
		if ( LWJGLUtil.CHECKS )
			if ( rect != null ) checkBuffer(rect, RECT.SIZEOF);
		return nClipCursor(memAddressSafe(rect));
	}

	// --- [ ShowCursor ] ---

	/**
	 * Displays or hides the cursor.
	 * 
	 * <p>This function sets an internal display counter that determines whether the cursor should be displayed. The cursor is displayed only if the display count
	 * is greater than or equal to 0. If a mouse is installed, the initial display count is 0. If no mouse is installed, the display count is –1.</p>
	 *
	 * @param show If {@code show} is {@link WinBase#TRUE}, the display count is incremented by one. If {@code show} is {@link WinBase#FALSE}, the display count is
	 *             decremented by one.
	 */
	public static native int ShowCursor(int show);

	// --- [ SetCursor ] ---

	/**
	 * Sets the cursor shape.
	 * 
	 * <p>The cursor is set only if the new cursor is different from the previous cursor; otherwise, the function returns immediately.</p>
	 * 
	 * <p>The cursor is a shared resource. A window should set the cursor shape only when the cursor is in its client area or when the window is capturing mouse
	 * input. In systems without a mouse, the window should restore the previous cursor before the cursor leaves the client area or before it relinquishes
	 * control to another window.</p>
	 * 
	 * <p>If your application must set the cursor while it is in a window, make sure the class cursor for the specified window's class is set to {@code NULL}. If the
	 * class cursor is not NULL, the system restores the class cursor each time the mouse is moved.</p>
	 * 
	 * <p>The cursor is not shown on the screen if the internal cursor display count is less than zero. This occurs if the application uses the {@link #ShowCursor}
	 * function to hide the cursor more times than to show the cursor.</p>
	 *
	 * @param hCursor a handle to the cursor. The cursor must have been created by the {@link #CreateCursor} function or loaded by the {@link #LoadCursor} or
	 *                {@link #LoadImage} function. If this parameter is {@code NULL}, the cursor is removed from the screen.
	 *
	 * @return the handle to the previous cursor, if there was one
	 */
	public static native long SetCursor(long hCursor);

	// --- [ MapVirtualKey ] ---

	/**
	 * Translates (maps) a virtual-key code into a scan code or character value, or translates a scan code into a virtual-key code.
	 *
	 * @param code    the virtual key code or scan code for a key. How this value is interpreted depends on the value of the {@code mapType} parameter.
	 * @param mapType the translation to be performed. The value of this parameter depends on the value of the {@code code} parameter.
	 */
	public static native int MapVirtualKey(int code, int mapType);

	// --- [ TrackMouseEvent ] ---

	/** JNI method for {@link #TrackMouseEvent} */
	@JavadocExclude
	public static native int nTrackMouseEvent(long eventTrack);

	/**
	 * Posts messages when the mouse pointer leaves a window or hovers over a window for a specified amount of time.
	 *
	 * @param eventTrack a pointer to a {@code TRACKMOUSEEVENT} structure that contains tracking information.
	 */
	public static int TrackMouseEvent(ByteBuffer eventTrack) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(eventTrack, TRACKMOUSEEVENT.SIZEOF);
		return nTrackMouseEvent(memAddress(eventTrack));
	}

	// --- [ GetForegroundWindow ] ---

	/**
	 * Retrieves a handle to the foreground window (the window with which the user is currently working). The system assigns a slightly higher priority to the
	 * thread that creates the foreground window than it does to other threads.
	 */
	public static native long GetForegroundWindow();

	// --- [ OpenClipboard ] ---

	/**
	 * Opens the clipboard for examination and prevents other applications from modifying the clipboard content.
	 *
	 * @param hWndNewOwner a handle to the window to be associated with the open clipboard. If this parameter is {@code NULL}, the open clipboard is associated with the current task.
	 */
	public static native int OpenClipboard(long hWndNewOwner);

	// --- [ EmptyClipboard ] ---

	/**
	 * Empties the clipboard and frees handles to data in the clipboard. The function then assigns ownership of the clipboard to the window that currently has
	 * the clipboard open.
	 */
	public static native int EmptyClipboard();

	// --- [ SetClipboardData ] ---

	/** JNI method for {@link #SetClipboardData} */
	@JavadocExclude
	public static native long nSetClipboardData(int format, long hMem);

	/**
	 * Places data on the clipboard in a specified clipboard format. The window must be the current clipboard owner, and the application must have called the
	 * {@link #OpenClipboard} function. (When responding to the {@link #WM_RENDERFORMAT} and {@link #WM_RENDERALLFORMATS} messages, the clipboard owner must
	 * not call {@link #OpenClipboard} before calling {@link #SetClipboardData}.)
	 *
	 * @param format the clipboard format. This parameter can be a registered format or any of the standard clipboard formats.
	 * @param hMem   a handle to the data in the specified format. This parameter can be {@code NULL}, indicating that the window provides data in the specified clipboard
	 *               format (renders the format) upon request. If a window delays rendering, it must process the {@link #WM_RENDERFORMAT} and {@link #WM_RENDERALLFORMATS}
	 *               messages.
	 *               
	 *               <p>If {@code SetClipboardData} succeeds, the system owns the object identified by the {@code hMem} parameter. The application may not write to or free
	 *               the data once ownership has been transferred to the system, but it can lock and read from the data until the {@link #CloseClipboard} function is
	 *               called. (The memory must be unlocked before the {@link #Clipboard} is closed.) If the {@code hMem} parameter identifies a memory object, the object
	 *               must have been allocated using the function with the {@link #GMEM_MOVEABLE} flag.</p>
	 *
	 * @return the handle to the data if the function succeeds. If the function fails, the return value is {@code NULL}.
	 */
	public static long SetClipboardData(int format, long hMem) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hMem);
		return nSetClipboardData(format, hMem);
	}

	// --- [ IsClipboardFormatAvailable ] ---

	/**
	 * Determines whether the clipboard contains data in the specified format.
	 *
	 * @param format a standard or registered clipboard format
	 */
	public static native int IsClipboardFormatAvailable(int format);

	// --- [ GetClipboardData ] ---

	/**
	 * Retrieves data from the clipboard in a specified format. The clipboard must have been opened previously.
	 *
	 * @param format a clipboard format
	 *
	 * @return the handle to a clipboard object in the specified format if the function succeeds. If the function fails, the return value is {@code NULL}.
	 */
	public static native long GetClipboardData(int format);

	// --- [ CloseClipboard ] ---

	/** Closes the clipboard. */
	public static native int CloseClipboard();

     /**
	 * Creates a {@link WindowProc} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link WindowProc} instance
	 */
	public static WindowProc WindowProc(final WindowProc.SAM sam) {
		return new WindowProc() {
			@Override
			public long invoke(long hwnd, int uMsg, long wParam, long lParam) {
				return sam.invoke(hwnd, uMsg, wParam, lParam);
			}
		};
	}

}