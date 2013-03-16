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

	/** WM_ACTIVATE message wParam values. */
	public static final int
		WA_ACTIVE      = 0x1,
		WA_CLICKACTIVE = 0x2,
		WA_INACTIVE    = 0x0;

	/** WM_SIZE message wParam values. */
	public static final int
		SIZE_RESTORED  = 0x0,
		SIZE_MINIMIZED = 0x1,
		SIZE_MAXIMIZED = 0x2,
		SIZE_MAXSHOW   = 0x3,
		SIZE_MAXHIDE   = 0x4;

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
	public static final int
		CW_USEDEFAULT = 0x80000000;

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

	/** Window field offsets for {@link #GetWindowLong}. */
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

	/** Class field offsets for {@link #GetClassLong}. */
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

	private WinUser() {}

	// --- [ RegisterClassEx ] ---

	/** JNI method for {@link #RegisterClassEx(ByteBuffer)} */
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

	/** JNI method for {@link #UnregisterClass(ByteBuffer, long)} */
	public static native int nUnregisterClass(long className, long instance);

	/**
	 * Unregisters a window class, freeing the memory required for the class.
	 *
	 * @param className a null-terminated string or a class atom. If {@code className} is a string, it specifies the window class name. This class name must have been
	 *                  registered by a previous call to the {@link #RegisterClass} or {@link #RegisterClassEx} function. System classes, such as dialog box controls,
	 *                  cannot be unregistered. If this parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClass} or
	 *                  {@link #RegisterClassEx} function. The atom must be in the low-order word of {@code className}; the high-order word must be zero.
	 * @param instance  a handle to the instance of the module that created the class
	 */
	public static int UnregisterClass(ByteBuffer className, long instance) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(className);
			checkPointer(instance);
		}
		return nUnregisterClass(memAddress(className), instance);
	}

	/** CharSequence version of: {@link #UnregisterClass(ByteBuffer, long)} */
	public static int UnregisterClass(CharSequence className, long instance) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		return nUnregisterClass(memAddress(memEncodeUTF16(className)), instance);
	}

	// --- [ GetClassInfoEx ] ---

	/** JNI method for {@link #GetClassInfoEx(long, ByteBuffer, ByteBuffer)} */
	public static native int nGetClassInfoEx(long instance, long className, long classEx);

	/**
	 * Retrieves information about a window class, including a handle to the small icon associated with the window class.
	 *
	 * @param instance  a handle to the instance of the application that created the class. To retrieve information about classes defined by the system (such as buttons
	 *                  or list boxes), set this parameter to NULL.
	 * @param className the class name. The name must be that of a preregistered class or a class registered by a previous call to the {@link #RegisterClass} or
	 *                  {@link #RegisterClassEx} function. Alternatively, this parameter can be a class atom created by a previous call to {@link #RegisterClass} or
	 *                  {@link #RegisterClassEx}. The atom must be in the low-order word of {@code className}; the high-order word must be zero.
	 * @param classEx   a {@link WNDCLASSEX} structure that receives the information about the class.
	 */
	public static int GetClassInfoEx(long instance, ByteBuffer className, ByteBuffer classEx) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(instance);
			checkNT2(className);
			checkBuffer(classEx, WNDCLASSEX.SIZEOF);
		}
		return nGetClassInfoEx(instance, memAddress(className), memAddress(classEx));
	}

	/** CharSequence version of: {@link #GetClassInfoEx(long, ByteBuffer, ByteBuffer)} */
	public static int GetClassInfoEx(long instance, CharSequence className, ByteBuffer classEx) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(instance);
			checkBuffer(classEx, WNDCLASSEX.SIZEOF);
		}
		return nGetClassInfoEx(instance, memAddress(memEncodeUTF16(className)), memAddress(classEx));
	}

	// --- [ GetClassLongPtr ] ---

	/** JNI method for {@link #GetClassLongPtr(long, int)} */
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

	/** JNI method for {@link #SetClassLongPtr(long, int, long)} */
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

	/** JNI method for {@link #LoadIcon(long, ByteBuffer)} */
	public static native long nLoadIcon(long instance, long iconName);

	/**
	 * Loads the specified icon resource from the executable (.exe) file associated with an application instance.
	 *
	 * @param instance a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be NULL when a standard icon is
	 *                 being loaded.
	 * @param iconName the name of the icon resource to be loaded
	 */
	public static long LoadIcon(long instance, ByteBuffer iconName) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(instance);
			checkNT2(iconName);
		}
		return nLoadIcon(instance, memAddress(iconName));
	}

	/** CharSequence version of: {@link #LoadIcon(long, ByteBuffer)} */
	public static long LoadIcon(long instance, CharSequence iconName) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		return nLoadIcon(instance, memAddress(memEncodeUTF16(iconName)));
	}

	// --- [ LoadCursor ] ---

	/** JNI method for {@link #LoadCursor(long, ByteBuffer)} */
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

	/** CharSequence version of: {@link #LoadCursor(long, ByteBuffer)} */
	public static long LoadCursor(long instance, CharSequence cursorName) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		return nLoadCursor(instance, memAddress(memEncodeUTF16(cursorName)));
	}

	// --- [ GetSystemMetrics ] ---

	/**
	 * Retrieves the specified system metric or system configuration setting.
	 *
	 * @param index the system metric or configuration setting to be retrieved
	 */
	public static native int GetSystemMetrics(int index);

	// --- [ CreateWindowEx ] ---

	/** JNI method for {@link #CreateWindowEx(int, ByteBuffer, ByteBuffer, int, int, int, int, int, long, long, long, long)} */
	public static native long nCreateWindowEx(int exStyle, long className, long windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param);

	/**
	 * Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.
	 *
	 * @param exStyle    the extended window style of the window being created
	 * @param className  a null-terminated string or a class atom created by a previous call to the {@link #RegisterClass} or {@link #RegisterClassEx} function.
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

	/** CharSequence version of: {@link #CreateWindowEx(int, ByteBuffer, ByteBuffer, int, int, int, int, int, long, long, long, long)} */
	public static long CreateWindowEx(int exStyle, CharSequence className, ByteBuffer windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		return nCreateWindowEx(exStyle, memAddress(memEncodeUTF16(className)), memAddress(windowName), style, x, y, width, height, parent, menu, instance, param);
	}

	/** CharSequence version of: {@link #CreateWindowEx(int, ByteBuffer, ByteBuffer, int, int, int, int, int, long, long, long, long)} */
	public static long CreateWindowEx(int exStyle, CharSequence className, CharSequence windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(instance);
		return nCreateWindowEx(exStyle, memAddress(memEncodeUTF16(className)), memAddress(memEncodeUTF16(windowName)), style, x, y, width, height, parent, menu, instance, param);
	}

	// --- [ DestroyWindow ] ---

	/** JNI method for {@link #DestroyWindow(long)} */
	public static native int nDestroyWindow(long window);

	/**
	 * Destroys the specified window. The function sends WM_DESTROY and WM_NCDESTROY messages to the window to deactivate it and remove the keyboard focus from
	 * it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
	 * clipboard viewer chain (if the window is at the top of the viewer chain).
	 * <p/>
	 * If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
	 * parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.
	 *
	 * @param window a handle to the window to be destroyed
	 */
	public static int DestroyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nDestroyWindow(window);
	}

	// --- [ ShowWindow ] ---

	/** JNI method for {@link #ShowWindow(long, int)} */
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

	/** JNI method for {@link #UpdateWindow(long)} */
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

	/** JNI method for {@link #SetWindowPos(long, long, int, int, int, int, int)} */
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

	// --- [ GetMessage ] ---

	/** JNI method for {@link #GetMessage(ByteBuffer, long, int, int)} */
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

	/** JNI method for {@link #PeekMessage(ByteBuffer, long, int, int, int)} */
	public static native int nPeekMessage(long msg, long window, int msgFilterMin, int msgFilterMax, int removeMsg);

	/**
	 * Dispatches incoming sent messages, checks the thread message queue for a posted message, and retrieves the message (if any exist).
	 *
	 * @param msg          an {@link MSG} structure that receives message information
	 * @param window       a handle to the window whose messages are to be retrieved. The window must belong to the current thread.
	 * @param msgFilterMin the value of the first message in the range of messages to be examined
	 * @param msgFilterMax the value of the last message in the range of messages to be examined
	 * @param removeMsg    specifies how messages are to be handled: One of. One of:<p/>{@link #PM_NOREMOVE}, {@link #PM_REMOVE}, {@link #PM_NOYIELD}
	 */
	public static int PeekMessage(ByteBuffer msg, long window, int msgFilterMin, int msgFilterMax, int removeMsg) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(msg, MSG.SIZEOF);
		return nPeekMessage(memAddress(msg), window, msgFilterMin, msgFilterMax, removeMsg);
	}

	// --- [ TranslateMessage ] ---

	/** JNI method for {@link #TranslateMessage(ByteBuffer)} */
	public static native int nTranslateMessage(long msg);

	/**
	 * Translates virtual-key messages into character messages. The character messages are posted to the calling thread's message queue, to be read the next
	 * time the thread calls the {@link #GetMessage} or @{link #PeekMessage} function.
	 *
	 * @param msg an {@link MSG} structure that contains message information retrieved from the calling thread's message queue by using the
	 *            {@link #GetMessage} or {@link #PeekMessage} function.
	 */
	public static int TranslateMessage(ByteBuffer msg) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(msg, MSG.SIZEOF);
		return nTranslateMessage(memAddress(msg));
	}

	// --- [ DispatchMessage ] ---

	/** JNI method for {@link #DispatchMessage(ByteBuffer)} */
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

	/** JNI method for {@link #DefWindowProc(long, int, long, long)} */
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

	/** JNI method for {@link #GetDC(long)} */
	public static native long nGetDC(long window);

	/**
	 * Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
	 * subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
	 *
	 * @param window a handle to the window whose DC is to be retrieved. If this value is NULL, {@code GetDC} retrieves the DC for the entire screen.
	 */
	public static long GetDC(long window) {
		return nGetDC(window);
	}

	// --- [ ReleaseDC ] ---

	/** JNI method for {@link #ReleaseDC(long, long)} */
	public static native int nReleaseDC(long window, long hdc);

	/**
	 * Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
	 * common and window DCs. It has no effect on class or private DCs.
	 *
	 * @param window a handle to the window whose DC is to be released
	 * @param hdc    a handle to the DC to be released
	 */
	public static int ReleaseDC(long window, long hdc) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkPointer(hdc);
		}
		return nReleaseDC(window, hdc);
	}

	// --- [ EnumDisplayDevices ] ---

	/** JNI method for {@link #EnumDisplayDevices(ByteBuffer, int, ByteBuffer, int)} */
	public static native int nEnumDisplayDevices(long device, int devNum, long displayDevice, int flags);

	/**
	 * Obtains information about the display devices in the current session.
	 *
	 * @param device        the device name. If NULL, function returns information for the display adapter(s) on the machine, based on {@code devNum}.
	 * @param devNum        an index value that specifies the display device of interest. The operating system identifies each display device in the current session with an
	 *                      index value. The index values are consecutive integers, starting at 0. If the current session has three display devices, for example, they are
	 *                      specified by the index values 0, 1, and 2.
	 * @param displayDevice a {@link DISPLAY_DEVICE} structure that receives information about the display device specified by {@code devNum}. Before calling
	 *                      {@code EnumDisplayDevices}, you must initialize the cb member of {@code DISPLAY_DEVICE} to the size, in bytes, of {@code DISPLAY_DEVICE}.
	 * @param flags         set this flag to EDD_GET_DEVICE_INTERFACE_NAME (0x00000001) to retrieve the device interface name for GUID_DEVINTERFACE_MONITOR, which is registered by the operating system on a per monitor basis
	 */
	public static int EnumDisplayDevices(ByteBuffer device, int devNum, ByteBuffer displayDevice, int flags) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(device);
			checkBuffer(displayDevice, DISPLAY_DEVICE.SIZEOF);
		}
		return nEnumDisplayDevices(memAddress(device), devNum, memAddress(displayDevice), flags);
	}

	/** CharSequence version of: {@link #EnumDisplayDevices(ByteBuffer, int, ByteBuffer, int)} */
	public static int EnumDisplayDevices(CharSequence device, int devNum, ByteBuffer displayDevice, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(displayDevice, DISPLAY_DEVICE.SIZEOF);
		return nEnumDisplayDevices(memAddress(memEncodeUTF16(device)), devNum, memAddress(displayDevice), flags);
	}

	// --- [ EnumDisplaySettings ] ---

	/** JNI method for {@link #EnumDisplaySettings(ByteBuffer, int, ByteBuffer)} */
	public static native int nEnumDisplaySettings(long deviceName, int modeNum, long devMode);

	/**
	 * Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes of a display device, make
	 * a series of calls to this function.
	 *
	 * @param deviceName a null-terminated string that specifies the display device about whose graphics mode the function will obtain information. This parameter is either
	 *                   NULL or a DISPLAY_DEVICE.DeviceName returned from {@link #EnumDisplayDevices}. A NULL value specifies the current display device on the computer on
	 *                   which the calling thread is running.
	 * @param modeNum    the type of information to be retrieved. This value can be a graphics mode index or one of:. One of:<p/>{@link #ENUM_CURRENT_SETTINGS}, {@link #ENUM_REGISTRY_SETTINGS}
	 * @param devMode    a {@link DEVMODE} structure into which the function stores information about the specified graphics mode
	 */
	public static int EnumDisplaySettings(ByteBuffer deviceName, int modeNum, ByteBuffer devMode) {
		if ( LWJGLUtil.CHECKS ) {
			if ( deviceName != null ) checkNT2(deviceName);
			checkBuffer(devMode, DEVMODE.SIZEOF);
		}
		return nEnumDisplaySettings(memAddressSafe(deviceName), modeNum, memAddress(devMode));
	}

	/** CharSequence version of: {@link #EnumDisplaySettings(ByteBuffer, int, ByteBuffer)} */
	public static int EnumDisplaySettings(CharSequence deviceName, int modeNum, ByteBuffer devMode) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(devMode, DEVMODE.SIZEOF);
		return nEnumDisplaySettings(memAddressSafe(memEncodeUTF16(deviceName)), modeNum, memAddress(devMode));
	}

	// --- [ EnumDisplaySettingsEx ] ---

	/** JNI method for {@link #EnumDisplaySettingsEx(ByteBuffer, int, ByteBuffer, int)} */
	public static native int nEnumDisplaySettingsEx(long deviceName, int modeNum, long devMode, int flags);

	/**
	 * Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
	 * make a series of calls to this function. This function differs from {@link #EnumDisplaySettings} in that there is a {@code flags} parameter.
	 *
	 * @param deviceName a null-terminated string that specifies the display device about which graphics mode the function will obtain information
	 * @param modeNum    the type of information to be retrieved. This value can be a graphics mode index or one of:. One of:<p/>{@link #ENUM_CURRENT_SETTINGS}, {@link #ENUM_REGISTRY_SETTINGS}
	 * @param devMode    a {@link DEVMODE} structure into which the function stores information about the specified graphics mode
	 * @param flags      One of:. One of:<p/>{@link #EDS_RAWMODE}, {@link #EDS_ROTATEDMODE}
	 */
	public static int EnumDisplaySettingsEx(ByteBuffer deviceName, int modeNum, ByteBuffer devMode, int flags) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(deviceName);
			checkBuffer(devMode, DEVMODE.SIZEOF);
		}
		return nEnumDisplaySettingsEx(memAddress(deviceName), modeNum, memAddress(devMode), flags);
	}

	/** CharSequence version of: {@link #EnumDisplaySettingsEx(ByteBuffer, int, ByteBuffer, int)} */
	public static int EnumDisplaySettingsEx(CharSequence deviceName, int modeNum, ByteBuffer devMode, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(devMode, DEVMODE.SIZEOF);
		return nEnumDisplaySettingsEx(memAddress(memEncodeUTF16(deviceName)), modeNum, memAddress(devMode), flags);
	}

	// --- [ ChangeDisplaySettings ] ---

	/** JNI method for {@link #ChangeDisplaySettings(ByteBuffer, int)} */
	public static native int nChangeDisplaySettings(long devMode, int flags);

	/**
	 * Changes the settings of the default display device to the specified graphics mode.
	 *
	 * @param devMode a {@link DEVMODE} structure that describes the new graphics mode. If {@code devMode} is NULL, all the values currently in the registry will be used
	 *                for the display setting. Passing NULL for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
	 *                default mode after a dynamic mode change.
	 * @param flags   indicates how the graphics mode should be changed
	 */
	public static int ChangeDisplaySettings(ByteBuffer devMode, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(devMode, DEVMODE.SIZEOF);
		return nChangeDisplaySettings(memAddress(devMode), flags);
	}

	// --- [ ChangeDisplaySettingsEx ] ---

	/** JNI method for {@link #ChangeDisplaySettingsEx(ByteBuffer, ByteBuffer, long, int, long)} */
	public static native int nChangeDisplaySettingsEx(long deviceName, long devMode, long window, int flags, long param);

	/**
	 * Changes the settings of the specified display device to the specified graphics mode.
	 *
	 * @param deviceName a null-terminated string that specifies the display device whose graphics mode will change
	 * @param devMode    a {@link DEVMODE} structure that describes the new graphics mode. If {@code devMode} is NULL, all the values currently in the registry will be used
	 *                   for the display setting. Passing NULL for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
	 *                   default mode after a dynamic mode change.
	 * @param window     reserved; must be NULL
	 * @param flags      indicates how the graphics mode should be changed
	 * @param param      if {@code flags} is {@link #CDS_VIDEOPARAMETERS}, {@code param} is a pointer to a {@link VIDEOPARAMETERS} structure. Otherwise {@code param} must be NULL.
	 */
	public static int ChangeDisplaySettingsEx(ByteBuffer deviceName, ByteBuffer devMode, long window, int flags, long param) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(deviceName);
			checkBuffer(devMode, DEVMODE.SIZEOF);
			checkPointer(window);
			checkPointer(param);
		}
		return nChangeDisplaySettingsEx(memAddress(deviceName), memAddress(devMode), window, flags, param);
	}

	/** CharSequence version of: {@link #ChangeDisplaySettingsEx(ByteBuffer, ByteBuffer, long, int, long)} */
	public static int ChangeDisplaySettingsEx(CharSequence deviceName, ByteBuffer devMode, long window, int flags, long param) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(devMode, DEVMODE.SIZEOF);
			checkPointer(window);
			checkPointer(param);
		}
		return nChangeDisplaySettingsEx(memAddress(memEncodeUTF16(deviceName)), memAddress(devMode), window, flags, param);
	}

}