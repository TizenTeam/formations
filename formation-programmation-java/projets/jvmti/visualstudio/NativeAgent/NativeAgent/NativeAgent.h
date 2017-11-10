// Le bloc ifdef suivant est la fa�on standard de cr�er des macros qui facilitent l'exportation 
// � partir d'une DLL. Tous les fichiers contenus dans cette DLL sont compil�s avec le symbole NATIVEAGENT_EXPORTS
// d�fini sur la ligne de commande. Ce symbole ne doit pas �tre d�fini pour un projet
// qui utilisent cette DLL. De cette mani�re, les autres projets dont les fichiers sources comprennent ce fichier consid�rent les fonctions 
// NATIVEAGENT_API comme �tant import�es � partir d'une DLL, tandis que cette DLL consid�re les symboles
// d�finis avec cette macro comme �tant export�s.
#ifdef NATIVEAGENT_EXPORTS
#define NATIVEAGENT_API __declspec(dllexport)
#else
#define NATIVEAGENT_API __declspec(dllimport)
#endif

// Cette classe est export�e de NativeAgent.dll
class NATIVEAGENT_API CNativeAgent {
public:
	CNativeAgent(void);
	// TODO: ajoutez ici vos m�thodes.
};

extern NATIVEAGENT_API int nNativeAgent;

NATIVEAGENT_API int fnNativeAgent(void);
